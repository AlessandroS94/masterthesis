// @ts-ignore
import vscode from "vscode";
import {getArtifacts, IArtifactMetadata} from "../service/artifactService";


export async function  showQuickPickDependencyUI(dependency:any) {
    const selectedDoc = await vscode.window.showQuickPick<vscode.QuickPickItem & { value: IArtifactMetadata }>(
        getArtifacts(dependency.trim().split(/[-,. :]/)).then(artifacts => artifacts.map(artifact => ({
            value: artifact,
            label: `$(package) ${artifact.a}`,
            description: artifact.g
        }))),
        {placeHolder: "Select a dependency ..."}
    ).then((selected: { value: any; }) => {
        return selected ? selected.value : undefined;
    });
    return selectedDoc;
}
