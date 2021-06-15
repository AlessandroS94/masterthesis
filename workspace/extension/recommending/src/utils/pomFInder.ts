import * as vscode from 'vscode';
var pomParser = require("pom-parser");

export function multiplePomFinder(): String[] {
    var response: String[] = [];
    vscode.workspace.findFiles('**/pom.xml').then(files => {

        files.forEach(file => {
            //open file 
            // The required options, including the filePath.
            // Other parsing options from https://github.com/Leonidas-from-XIV/node-xml2js#options
            var opts = { filePath: file.fsPath }; // The path to a pom file

            // Parse the pom based on a path
            pomParser.parse(opts, function (err: string, pomResponse: { pomXml: string; pomObject: any; }) {
                if (err) {
                    console.log("ERROR: " + err);
                    process.exit(1);
                }

                // The original pom xml that was loaded is provided.
                //console.log("XML: " + pomResponse.pomXml);
                // The parsed pom pbject.
                //var result = JSON.stringify(pomResponse.pomObject.project.dependencies.dependency);

                pomResponse.pomObject.project.dependencies.dependency.forEach((key: any) => {
                    const library = (key.groupid);
                    response.push(library);
                });
                //storageManager.setValue(""+counter,response);
                //View the pom parsed	
            });
        });
    });
    return response;
}