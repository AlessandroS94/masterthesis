const canvas = document.getElementById('vscodeTestCanvas');

function saveAsPng() {
  // Call back to the extension context to save the image to the workspace folder.
  const vscode = acquireVsCodeApi();
  vscode.postMessage({
    command: 'saveAsPng',
    text: canvas.toDataURL()
  });
}

const saveAsPngButton = document.getElementById('saveAsPngButton');
saveAsPngButton.addEventListener('click', saveAsPng);