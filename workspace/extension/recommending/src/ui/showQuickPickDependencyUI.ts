// @ts-ignore
import * as vscode from "vscode";
import {getArtifacts, IArtifactMetadata} from "../service/artifactService";


export async function  showQuickPickDependencyUI(dependency:any) {
    let selectedDoc: any;
    selectedDoc = vscode.window.showQuickPick<vscode.QuickPickItem & { value: IArtifactMetadata }>(
        getArtifacts(dependency.trim().split(/[-,. :]/)).then(artifacts => artifacts.map(artifact => ({
            value: artifact,
            label: `$(package) ${artifact.a}`,
            description: artifact.g
        }))),
        {placeHolder: "Select a dependency ..."}
    ).then(selected => {
        return selected ? selected.value : undefined;
    });
    return selectedDoc;
}
