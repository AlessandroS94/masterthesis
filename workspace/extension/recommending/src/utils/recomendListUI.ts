/********************************************************************************************************************************
*********************************************************************************************************************************
*                                           START POM RECOMMEND
*********************************************************************************************************************************
*********************************************************************************************************************************/

import * as vscode from 'vscode';
import { getWebviewContent } from '../component/listComponent';
import { addDependencyHandler } from './pomAddingLibrary';

export function reccomendListUI(libRac: any[], context: vscode.ExtensionContext){
  
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
          //storageManager.setValue('recommendLib',message.text);
          vscode.workspace.findFiles('**/pom.xml').then(files=>{
              var opts = { filePath: files[0].fsPath};
              addDependencyHandler(opts,message.text); 
              
          });
      }
    },
    undefined,
    context.subscriptions
  );  
}
/********************************************************************************************************************************
*********************************************************************************************************************************
*                                           START POM RECOMMEND
*********************************************************************************************************************************
*********************************************************************************************************************************/