import * as vscode from 'vscode';
import { getWebviewContent } from '../component/listComponent';
import { Lib } from '../model/lib';
import { LocalStorage } from '../storage/LocalStorage';
import { writeFile } from 'fs';

export function reccomendListUI(libRac: any[], context: vscode.ExtensionContext,storageManager:LocalStorage){
  
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
        case 'send':
          
          //recommend.store(message.text)[0];
          storageManager.setValue('recommendLib',message.text);
          vscode.window.showInformationMessage(message.text[0]); 

      }
    },
    undefined,
    context.subscriptions
  );
  
}