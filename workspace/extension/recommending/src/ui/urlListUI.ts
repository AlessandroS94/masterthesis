/********************************************************************************************************************************
*********************************************************************************************************************************
*                                           START URL RECOMMEND
*********************************************************************************************************************************
*********************************************************************************************************************************/
import * as vscode from 'vscode';
import { getWebviewContent } from '../component/listUrlComponent';

export function urlListUI(urlList: any){
  
  const panel = vscode.window.createWebviewPanel(
    'Rac',
    'Racommander URL',
    vscode.ViewColumn.One,
    {
      enableScripts: true
    }
  );

  // And set its HTML content
  panel.webview.html = getWebviewContent(urlList);
  
}
/********************************************************************************************************************************
*********************************************************************************************************************************
*                                           START URL RECOMMEND
*********************************************************************************************************************************
*********************************************************************************************************************************/