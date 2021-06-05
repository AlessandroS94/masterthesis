// The module 'vscode' contains the VS Code extensibility API
// Import the module and reference it with the alias vscode in your code below
import * as vscode from 'vscode';
import { OpenDialogOptions, Uri, window } from "vscode";
import * as fs from "fs-extra";
import axios from 'axios';

var pomParser = require("pom-parser");

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

	vscode.workspace.findFiles('pom.xml').then(files =>{
		files.forEach(file => {
			//open file 
			
	var pomParser = require("pom-parser");
	// The required options, including the filePath.
	// Other parsing options from https://github.com/Leonidas-from-XIV/node-xml2js#options
	var opts = {
  filePath: file.fsPath // The path to a pom file
	};
	// Parse the pom based on a path
	pomParser.parse(opts, function(err: string, pomResponse: { pomXml: string; pomObject: any; }) {
  	if (err) {
    	console.log("ERROR: " + err);
    	process.exit(1);
  	}
	
  	// The original pom xml that was loaded is provided.
  	//console.log("XML: " + pomResponse.pomXml);
  	// The parsed pom pbject.
	var result = JSON.stringify(pomResponse.pomObject.project.dependencies.dependency);
	var response: String[] = [];
	pomResponse.pomObject.project.dependencies.dependency.forEach((key: any) => {
		const library = (key.groupid);
		response.push(library);
	  })
	console.log(JSON.stringify({lib: response}));
	axios.post("http://192.168.1.103:5000/recommend", {lib: response})
  				.then(function (response) {
    				// handle success
    				console.log(response);
  				})
  				.catch(function (error) {
    				// handle error
    				console.log(error);
  				})
  				.then(function () {
    				// always executed
  				});
  	//console.log("OBJECT: " + result);
});
		})});
}

