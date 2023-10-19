/********************************************************************************************************************************
*********************************************************************************************************************************
*                                           START POM RECOMMEND
*********************************************************************************************************************************
*********************************************************************************************************************************/
import * as fse from "fs-extra";
import * as vscode from "vscode";
import { window } from "vscode";
import { ElementNode, getNodesByTag, XmlTagName } from "./lexerUtils";
import {showQuickPickDependencyUI } from '../ui/showQuickPickDependencyUI'
import { getArtifacts, IArtifactMetadata } from "../service/artifactService";
//import { selectProjectIfNecessary } from "../utils/uiUtils";

export async function addDependencyHandler(options: any, dependencies: any[]): Promise<void> {
    let pomPath = '';
    if (options) {
        // for nodes from Maven explorer
        pomPath = options.filePath;
    }

    if (!options && !options.projectBasePath) {
        vscode.window.showInformationMessage('POM not found!');
        return;
    }
    
    for (const dependency of dependencies) {
        //vscode.window.showInformationMessage('' + dependency);
        const selectedDoc = await showQuickPickDependencyUI(dependency);
        if (!selectedDoc) {
            continue;
        }
        await addDependency(pomPath, selectedDoc.g, selectedDoc.a, selectedDoc.latestVersion);

    }
}

async function addDependency(pomPath: string, gid: string, aid: string, version: string): Promise<void> {
    // Find out <dependencies> node and insert content.
    const contentBuf: Buffer = await fse.readFile(pomPath);
    const projectNodes: ElementNode[] = getNodesByTag(contentBuf.toString(), XmlTagName.Project);
    if (projectNodes === undefined || projectNodes.length !== 1) {
        throw console.log("Only support POM file with single <project> node.");
    }

    const projectNode: ElementNode = projectNodes[0];
    const dependenciesNode: ElementNode | undefined = projectNode.children && projectNode.children.find(node => node.tag === XmlTagName.Dependencies);
    if (dependenciesNode !== undefined) {
        await insertDependency(pomPath, dependenciesNode, gid, aid, version);
    } else {
        await insertDependency(pomPath, projectNode, gid, aid, version);

    }
}

async function insertDependency(pomPath: string, targetNode: ElementNode, gid: string, aid: string, version: string): Promise<void> {
    if (targetNode.contentStart === undefined || targetNode.contentEnd === undefined) {
        throw console.log("Invalid target XML node to insert dependency.");
    }
    const currentDocument: vscode.TextDocument = await vscode.workspace.openTextDocument(pomPath);
    const textEditor: vscode.TextEditor = await vscode.window.showTextDocument(currentDocument,undefined,true);
    const baseIndent: string = getIndentation(currentDocument, targetNode.contentEnd);
    const options: vscode.TextEditorOptions = textEditor.options;
    const indent: string = options.insertSpaces ? " ".repeat(<number>options.tabSize) : "\t";
    const eol: string = currentDocument.eol === vscode.EndOfLine.LF ? "\n" : "\r\n";
    let insertPosition: vscode.Position;
    let targetText: string;
    if (targetNode.tag === XmlTagName.Dependencies) {
        insertPosition = currentDocument.positionAt(targetNode.contentStart);
        targetText = constructDependencyNode(gid, aid, version, baseIndent, indent, eol);
    } else if (targetNode.tag === XmlTagName.Project) {
        insertPosition = currentDocument.positionAt(targetNode.contentEnd);
        targetText = constructDependenciesNode(gid, aid, version, baseIndent, indent, eol);
    } else {
        return;
    }

    const edit: vscode.WorkspaceEdit = new vscode.WorkspaceEdit();
    edit.insert(currentDocument.uri, insertPosition, targetText);
    await vscode.workspace.applyEdit(edit);
    const endingPosition: vscode.Position = currentDocument.positionAt(currentDocument.offsetAt(insertPosition) + targetText.length);
    textEditor.revealRange(new vscode.Range(insertPosition, endingPosition));
}

function constructDependencyNode(gid: string, aid: string, version: string, baseIndent: string, indent: string, eol: string): string {
    return [
        eol,
        "<dependency>",
        `${indent}<groupId>${gid}</groupId>`,
        `${indent}<artifactId>${aid}</artifactId>`,
        `${indent}<version>${version}</version>`,
        `</dependency>${eol}`
    ].join(`${eol}${baseIndent}${indent}`);
}

function constructDependenciesNode(gid: string, aid: string, version: string, baseIndent: string, indent: string, eol: string): string {
    return [
        eol,
        "<dependencies>",
        `${indent}<dependency>`,
        `${indent}${indent}<groupId>${gid}</groupId>`,
        `${indent}${indent}<artifactId>${aid}</artifactId>`,
        `${indent}${indent}<version>${version}</version>`,
        `${indent}</dependency>`,
        `</dependencies>${eol}`
    ].join(`${eol}${baseIndent}${indent}`);
}

function getIndentation(document: vscode.TextDocument, offset: number): string {
    const closingTagPosition: vscode.Position = document.positionAt(offset);
    return document.getText(new vscode.Range(
        new vscode.Position(closingTagPosition.line, 0),
        closingTagPosition
    ));
}
/********************************************************************************************************************************
*********************************************************************************************************************************
*                                           FINISH POM RECOMMEND
*********************************************************************************************************************************
*********************************************************************************************************************************/
