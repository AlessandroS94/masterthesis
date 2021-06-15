import * as vscode from 'vscode';
import {getWebviewContent} from '../component/listComponent';
import { Lib } from '../model/lib';

export function reccomendListUI(libRac: any[], libPom: Lib) {

    const panel = vscode.window.createWebviewPanel(
        'Rac',
        'Racommander',
        vscode.ViewColumn.One,
        {}
    );

    // And set its HTML content
    panel.webview.html = getWebviewContent(libRac,libPom);
}
