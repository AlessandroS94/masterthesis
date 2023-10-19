import * as vscode from 'vscode';

export function showMessage(message:any){
    vscode.window.showInformationMessage(message);
  }