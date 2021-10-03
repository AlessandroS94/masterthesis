import * as vscode from 'vscode';
import { getWebviewContent } from '../component/listComponent';
import { addDependencyHandler } from '../utils/pomAddingLibrary';

export function reccomendListUI(libRac: any[ ], context: vscode.ExtensionContext){
  
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
}
