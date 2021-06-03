/******/ (() => { // webpackBootstrap
/******/ 	"use strict";
/******/ 	var __webpack_modules__ = ([
/* 0 */
/***/ (function(__unused_webpack_module, exports, __webpack_require__) {


var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", ({ value: true }));
exports.deactivate = exports.activate = void 0;
// The module 'vscode' contains the VS Code extensibility API
// Import the module and reference it with the alias vscode in your code below
const vscode = __webpack_require__(1);
// this method is called when your extension is activated
// your extension is activated the very first time the command is executed
function activate(context) {
    return __awaiter(this, void 0, void 0, function* () {
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
            const panel = vscode.window.createWebviewPanel('catCoding', 'Cat Coding', vscode.ViewColumn.One, {});
            // And set its HTML content
            panel.webview.html = getWebviewContent();
        });
        let dsiAutoComplete = vscode.languages.registerCompletionItemProvider('python', {
            provideCompletionItems(document, position) {
                console.log(document.getText() + " -  " + position.character);
                return [new vscode.CompletionItem("udemy", vscode.CompletionItemKind.Class)];
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
        function delay(ms) {
            return new Promise(resolve => setTimeout(resolve, ms));
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
    });
}
exports.activate = activate;
// this method is called when your extension is deactivated
function deactivate() { }
exports.deactivate = deactivate;


/***/ }),
/* 1 */
/***/ ((module) => {

module.exports = require("vscode");;

/***/ })
/******/ 	]);
/************************************************************************/
/******/ 	// The module cache
/******/ 	var __webpack_module_cache__ = {};
/******/ 	
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/ 		// Check if module is in cache
/******/ 		var cachedModule = __webpack_module_cache__[moduleId];
/******/ 		if (cachedModule !== undefined) {
/******/ 			return cachedModule.exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = __webpack_module_cache__[moduleId] = {
/******/ 			// no module.id needed
/******/ 			// no module.loaded needed
/******/ 			exports: {}
/******/ 		};
/******/ 	
/******/ 		// Execute the module function
/******/ 		__webpack_modules__[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/ 	
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/ 	
/************************************************************************/
/******/ 	
/******/ 	// startup
/******/ 	// Load entry module and return exports
/******/ 	// This entry module is referenced by other modules so it can't be inlined
/******/ 	var __webpack_exports__ = __webpack_require__(0);
/******/ 	module.exports = __webpack_exports__;
/******/ 	
/******/ })()
;
//# sourceMappingURL=extension.js.map