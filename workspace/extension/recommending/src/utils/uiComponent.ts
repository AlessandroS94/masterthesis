import * as vscode from 'vscode';
import { getWebviewContent } from '../component/listComponent';
import { Lib } from '../model/lib';
import { LocalStorage } from '../storage/LocalStorage';
import { writeFile } from 'fs';

export function reccomendListUI(libRac: any[],context: vscode.ExtensionContext) {

    const panel = vscode.window.createWebviewPanel(
        'Rac',
        'Racommander',
        vscode.ViewColumn.One,
        {
            enableScripts: true
        }
    );

    // And set its HTML content
    panel.webview.html = getWebviewContent(libRac);

    //recive the message by webview script
    panel.webview.onDidReceiveMessage(
      message => {
        switch (message.command) {
          case 'alert':
            
            vscode.window.showInformationMessage(message.text[0]);
            
            return;
        }
      },
      undefined,
      context.subscriptions
    );
}



