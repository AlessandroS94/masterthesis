// The module 'vscode' contains the VS Code extensibility API
// Import the module and reference it with the alias vscode in your code below
// Import the library for the extension
import * as vscode from 'vscode';
import { OpenDialogOptions, Uri, window } from "vscode";
import * as fs from "fs-extra";
import { LocalStorage } from './storage/LocalStorage';
import { callSinglePom } from './service/request';
import {multiplePomFinder} from './utils/pomFinder';
import { reccomendListUI } from './utils/uiComponent';
import { Lib } from './model/lib';
import { AxiosResponse } from 'axios';
import { toString } from 'lodash';
// this method is called when your extension is activated
// your extension is activated the very first time the command is executed
export async function activate(context: vscode.ExtensionContext) {

	// This line of code will only be executed once when your extension is activated
	//Start the extension
	console.log('"Recommending" is now active!');
	
	// Start the local storage for this workspace
	let storageManager = new LocalStorage(context.globalState);

	// The command has been defined in the package.json file
	// Now provide the implementation of the command with registerCommand
	// The commandId parameter must match the command field in package.json
	let disposable = vscode.commands.registerCommand('recommending.start', () => {
		// The code you place here will be executed every time your command is executed

		// Display a message box to the user
		vscode.window.showInformationMessage('Hello World from recommending!');

	});

	// This command activate the raccomand system for more pom
	let pomGetter = vscode.commands.registerCommand('Getting.pom', () => {
		procedureRecommend(context,storageManager);
	})

	//Subscribe the command
	context.subscriptions.push(disposable);
	context.subscriptions.push(pomGetter);

}

// this method is called when your extension is deactivated
export function deactivate() { }




// This function find the pom on the VSCode Workspace
// and parse the pom 
function procedureRecommend(context: vscode.ExtensionContext, storageManager: LocalStorage) {	
	let cachedData: void | AxiosResponse<any> | null = null;
	// create the object of the parsed POM 
	const libPom = new Lib(multiplePomFinder());
	
	// Recive and view the racommend data
	let getRecommend = async (libPom:any) => {
		// Data of the racommend call
		var a = await callSinglePom(libPom);
		//console.log(a?.data.score);
		let libRac =  a?.data.score;
		reccomendListUI(libRac, libPom);
	};
	getRecommend(libPom);
		
}

