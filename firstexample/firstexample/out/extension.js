"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.deactivate = exports.activate = void 0;
// The module 'vscode' contains the VS Code extensibility API
// Import the module and reference it with the alias vscode in your code below
const vscode = require("vscode");
//import * as extCommands from './extCommands';
// this method is called when your extension is activated
// your extension is activated the very first time the command is executed
function activate(context) {
    // Use the console to output diagnostic information (console.log) and errors (console.error)
    // This line of code will only be executed once when your extension is activated
    console.log('Congratulations, your extension "firstexample" is now active!');
    // The command has been defined in the package.json file
    // Now provide the implementation of the command with registerCommand
    // The commandId parameter must match the command field in package.json
    let disposable = vscode.commands.registerCommand('firstexample.helloWorld', () => {
        // The code you place here will be executed every time your command is executed
        // Display a message box to the user
        vscode.window.showInformationMessage('Hello World from firstexample!');
    });
    let dispCom = vscode.commands.registerCommand('firstexample.dispCmd', () => {
        // The code you place here will be executed every time your command is executed
        // Display a message box to the user
        vscode.window.showInformationMessage('WOW');
    });
    let infoText = vscode.commands.registerCommand('firstexample.infoText', () => {
        if (vscode.window.activeTextEditor != null) {
            console.log('File Name:' + vscode.window.activeTextEditor.document.fileName);
            console.log('Content File: ' + vscode.window.activeTextEditor.document.getText());
        }
        else {
            console.log('Please open any file');
        }
    });
    context.subscriptions.push(disposable);
    context.subscriptions.push(dispCom);
    context.subscriptions.push(infoText);
}
exports.activate = activate;
// this method is called when your extension is deactivated
function deactivate() { }
exports.deactivate = deactivate;
//# sourceMappingURL=extension.js.map