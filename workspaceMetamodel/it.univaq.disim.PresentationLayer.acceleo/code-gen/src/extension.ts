// The module 'vscode' contains the VS Code extensibility API
// Import the module and reference it with the alias vscode in your code below
// Import the library for the extension
import * as vscode from 'vscode';
	import { reccomendListUI } from './ui/recomendListUI';
    import { urlListUI } from './ui/urlListUI';
import { showMessage } from './ui/showMessage';
import { forEach, replace, ReplaceFunction } from 'lodash';
// this method is called when your extension is activated
// your extension is activated the very first time the command is executed
export async function activate(context: vscode.ExtensionContext) {

    // This line of code will only be executed once when your extension is activated
    //Start the extension
    console.log('"Recommending" is now active!');


    //Activation entry
    showMessage("For access to all command use shortcut cmd+shift+P or ctrl+P and the menu");
    procedureRecommendList(context);


    /********************************************************************************************************************************
     *********************************************************************************************************************************
     *                                           START POM RECOMMEND
     *********************************************************************************************************************************
     *********************************************************************************************************************************/

    // This command activate the raccomand system for more pom
    let pomGetter = vscode.commands.registerCommand('recommending.gettingPom', () => {
        procedureRecommend(context);
    });
    //Subscribe the command
    context.subscriptions.push(pomGetter);
    /********************************************************************************************************************************
     *********************************************************************************************************************************
     *                                           FINISH POM RECOMMEND
     *********************************************************************************************************************************
     *********************************************************************************************************************************/

}
// this method is called when your extension is deactivated
export function deactivate() {
}
/********************************************************************************************************************************
 *********************************************************************************************************************************
 *                                           START POM RECOMMEND LIST
 *********************************************************************************************************************************
 *********************************************************************************************************************************/

// This function find the pom on the VSCode Workspace
// and parse the pom
function procedureRecommendList(context: vscode.ExtensionContext) {
    // create the object of the parsed POM
    const libPom = new Lib(multipleDependenciesFinder());

    // Recive and view the racommend data
    let getRecommend = async (libPom: any) => {
        // Data of the racommend call
        try {
            let raccomand = await callSinglePom(libPom);
            // @ts-ignore
            const libRac = raccomand?.data.score;
            // open the page to select the recommend lib
            reccomendListUI(libRac, context);

        } catch (error) {
            vscode.window.showInformationMessage('Connection Error');
        }
    };
    //storageManager.setValue('recomend_lib',[ ]);
    getRecommend(libPom);
}

/********************************************************************************************************************************
 *********************************************************************************************************************************
 *                                           FININSH POM RECOMMEND
 *********************************************************************************************************************************
 *********************************************************************************************************************************/

