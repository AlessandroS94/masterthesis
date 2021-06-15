import * as vscode from 'vscode';
import {getWebviewContent} from '../component/listComponent';

export function reccomendListUI(library: String[], recommend: String[]) {
    const panel = vscode.window.createWebviewPanel(
        'Rac',
        'Racommander',
        vscode.ViewColumn.One,
        {}
    );

    // And set its HTML content
    panel.webview.html = getWebviewContent(library,recommend);
}
