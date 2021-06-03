// The module 'vscode' contains the VS Code extensibility API
// Import the module and reference it with the alias vscode in your code below
import * as vscode from 'vscode';
import { KeyObject } from 'crypto';
import axios from 'axios';
// this method is called when your extension is activated
// your extension is activated the very first time the command is executed
export async function activate(context: vscode.ExtensionContext) {

	// Use the console to output diagnostic information (console.log) and errors (console.error)
	// This line of code will only be executed once when your extension is activated
	console.log('Congratulations, your extension "recommending" is now active!');

	// The command has been defined in the package.json file
	// Now provide the implementation of the command with registerCommand
	// The commandId parameter must match the command field in package.json
	let disposable = vscode.commands.registerCommand('recommending.start', () => {
		// The code you place here will be executed every time your command is executed

		// Display a message box to the user
		vscode.window.showInformationMessage('Hello World from recommending!');

	});

	// The command has been defined in the package.json file
	// Now provide the implementation of the command with registerCommand
	// The commandId parameter must match the command field in package.json
	let catView = vscode.commands.registerCommand('catCoding.start', () => {
		// Create and show panel
		const panel = vscode.window.createWebviewPanel(
		  'catCoding',
		  'Cat Coding',
		  vscode.ViewColumn.One,
		  {}
		);
  
		// And set its HTML content
		panel.webview.html = getWebviewContent();
	  });

	  let dsiAutoComplete = vscode.languages.registerCompletionItemProvider('python',{
		provideCompletionItems(document: vscode.TextDocument, position: vscode.Position){
			console.log(document.getText() + " -  " + position.character)
			return [new vscode.CompletionItem("udemy",vscode.CompletionItemKind.Class)];
		}
	});

	let y = vscode.languages.registerHoverProvider('javascript', {
		provideHover(document, position, token) {
		return {
		contents: ['Hover Content']
		};
		}
	   });
	context.subscriptions.push(disposable);
	context.subscriptions.push(catView);
	context.subscriptions.push(dsiAutoComplete);
	context.subscriptions.push(y);
	//Contant update of raccomandation
	/* while (true){
		axios.get("http://127.0.0.1:5000/json")
		.then(function (result) {
				let dsiAutoComplete = vscode.languages.registerCompletionItemProvider('typescript',{
					provideCompletionItems(document: vscode.TextDocument, position: vscode.Position){

						return [new vscode.CompletionItem(result.data.recommending,vscode.CompletionItemKind.Class)];
					}
				});
				
				//context.subscriptions.pop();
				context.subscriptions.push(disposable);
				context.subscriptions.push(catView);
				context.subscriptions.push(dsiAutoComplete);
			});	
		await delay(30000);
		console.log("New call");
	} */

	//function for time
	function delay(ms: number) {
		return new Promise( resolve => setTimeout(resolve, ms) );
	}

    //function show content webView
	function getWebviewContent() {
		return `<!DOCTYPE html>
	  <html lang="en">
	  <head>
		  <meta charset="UTF-8">
		  <meta name="viewport" content="width=device-width, initial-scale=1.0">
		  <title>Cat Coding</title>
	  </head>
	  <body>
		  <img src="https://media.giphy.com/media/JIX9t2j0ZTN9S/giphy.gif" width="300" />
	  </body>
	  </html>`;
	  }
	
	
}

// this method is called when your extension is deactivated
export function deactivate() {}


