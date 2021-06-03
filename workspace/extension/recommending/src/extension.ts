// The module 'vscode' contains the VS Code extensibility API
// Import the module and reference it with the alias vscode in your code below
import * as vscode from 'vscode';
import { OpenDialogOptions, Uri, window } from "vscode";
import * as fs from "fs-extra";
import { Progress } from "vscode";
import { KeyObject } from 'crypto';
import axios from 'axios';
import { Settings } from "./Settings";
// this method is called when your extension is activated
// your extension is activated the very first time the command is executed
export async function activate(context: vscode.ExtensionContext) {

	// Use the console to output diagnostic information (console.log) and errors (console.error)
	// This line of code will only be executed once when your extension is activated
	//Start the extension
	console.log('"Recommending" is now active!');

	// The command has been defined in the package.json file
	// Now provide the implementation of the command with registerCommand
	// The commandId parameter must match the command field in package.json
	let disposable = vscode.commands.registerCommand('recommending.start', () => {
		// The code you place here will be executed every time your command is executed

		// Display a message box to the user
		vscode.window.showInformationMessage('Hello World from recommending!');

	});

	let pomGetter = vscode.commands.registerCommand('Getting.pom',()=>{
		getPom(context);
	})

	
	context.subscriptions.push(disposable);
	context.subscriptions.push(pomGetter);
	
}
// this method is called when your extension is deactivated
export function deactivate() {}

function getPom(context: vscode.ExtensionContext){
	const value = 'pom.xml';
	//find file 
	vscode.workspace.findFiles('pom.xml').then(files =>{
		files.forEach(file => {
			//open file 
			vscode.window.showTextDocument(file);
			//send content file 
			vscode.workspace.openTextDocument(file).then(event=>{
				console.log(event.getText());
				axios.post("http://127.0.0.1:5000/Pom",{filePom :event.getText()})
  				.then(function (response) {
    				// handle success
    				console.log(response.data.operation);
  				})
  				.catch(function (error) {
    				// handle error
    				console.log(error);
  				})
  				.then(function () {
    				// always executed
  				});
			})
		});
	});
}

