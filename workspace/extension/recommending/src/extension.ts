// The module 'vscode' contains the VS Code extensibility API
// Import the module and reference it with the alias vscode in your code below
// Import the library for the extension
import * as vscode from 'vscode';
import {callSinglePom} from './service/recommendService';
import {multipleDependenciesFinder} from './utils/multipleDependenciesFinder';
import {reccomendListUI} from './utils/recomendListUI';
import {Lib} from './model/lib';
// import { callRecommendUrlService } from './service/recommendUrlService';
import {PortionCode} from './model/portionCode';
import {urlListUI} from './utils/urlListUI';

// this method is called when your extension is activated
// your extension is activated the very first time the command is executed
export async function activate(context: vscode.ExtensionContext) {

    // This line of code will only be executed once when your extension is activated
    //Start the extension
    console.log('"Recommending" is now active!');

    // The command has been defined in the package.json file
    // Now provide the implementation of the command with registerCommand
    // The commandId parameter must match the command field in package.json
    let disposable = vscode.commands.registerCommand('recommending.start', () => {
        // The code you place here will be executed every time your command is executed
        // Display a message box to the user
        vscode.window.showInformationMessage('Racommend started all functionality!');

    });
    context.subscriptions.push(disposable);


    /********************************************************************************************************************************
     *********************************************************************************************************************************
     *                                           START URL RECOMMEND
     *********************************************************************************************************************************
     *********************************************************************************************************************************/

        // this code runs whenever your click 'Create Gist' from the context menu in your browser.
    let urlRecommend = vscode.commands.registerCommand(
        'recommending.getUrlRecommend',
        () => {
            procedureUrlRecommend();
        }
        );
    //Subscribe the command
    context.subscriptions.push(urlRecommend);
    /********************************************************************************************************************************
     *********************************************************************************************************************************
     *                                           FINISH URL RECOMMEND
     *********************************************************************************************************************************
     *********************************************************************************************************************************/


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
 *                                           START POM RECOMMEND
 *********************************************************************************************************************************
 *********************************************************************************************************************************/

// This function find the pom on the VSCode Workspace
// and parse the pom
function procedureRecommend(context: vscode.ExtensionContext) {
    // create the object of the parsed POM
    const libPom = new Lib(multipleDependenciesFinder());

    // Recive and view the racommend data
    let getRecommend = async (libPom: any) => {
        // Data of the racommend call
        try {
            let raccomand = await callSinglePom(libPom);
            //console.log(a?.data.score);
            // @ts-ignore
            const libRac = raccomand?.data.score;
            // open the page to select the recommend lib
            reccomendListUI(libRac, context);
            //printDependency(storageManager.getValue('recommendLib'));
        } catch (error) {
            vscode.window.showInformationMessage('Connection Error');
        }
    };
    //storageManager.setValue('recomend_lib',[]);
    getRecommend(libPom);
}

/********************************************************************************************************************************
 *********************************************************************************************************************************
 *                                           FININSH POM RECOMMEND
 *********************************************************************************************************************************
 *********************************************************************************************************************************/


/********************************************************************************************************************************
 *********************************************************************************************************************************
 *                                           START URL RECOMMEND
 *********************************************************************************************************************************
 *********************************************************************************************************************************/
async function procedureUrlRecommend() {
    const editor = vscode.window.activeTextEditor;
    if (editor) {
        const text = editor.document.getText(editor.selection);
        //const portionCode = new PortionCode(text);
        /* let getUrlRecommend = async (portionCode: any) => {
            // Data of the racommend call
            let raccomand = await callRecommendUrlService(portionCode);
            const urlRecommend = raccomand;

        }; */
        //storageManager.setValue('recomend_lib',[]);
        //getUrlRecommend(portionCode);
        console.log(text);
        const urlList = ['https://getbootstrap.com/docs/5.0/components/card/', 'https://getbootstrap.com/docs/5.0/components/card/'];
        urlListUI(urlList);
    } else {
        vscode.window.showInformationMessage('You did not select anything');
    }
}

/********************************************************************************************************************************
 *********************************************************************************************************************************
 *                                           FINISH URL RECOMMEND
 *********************************************************************************************************************************
 *********************************************************************************************************************************/

