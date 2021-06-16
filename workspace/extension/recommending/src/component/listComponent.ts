'use strict';

import { toArray, toString } from "lodash";
import { Lib } from "../model/lib";
import { LocalStorage } from "../storage/LocalStorage";
import { reccomendListUI } from "../utils/uiComponent";
import * as vscode from 'vscode';

export function getWebviewContent(libRac: any[]) {
  
  return ` 
  <!doctype html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

  <title>Hello, world!</title>
</head>

<body>
<img src="https://media.giphy.com/media/JIX9t2j0ZTN9S/giphy.gif" width="300" />
    <h1 id="lines-of-code-counter">0</h1>
  <br>
  <nav class="navbar navbar-dark bg-dark">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">&nbsp;Library Pom Racommand <span class="sr-only"></span></a>
      </li>
    </ul>
  </nav>
  <br>

  <div class="card">
    <div class="card-body">
      <h5 class="card-title">Library Racommand</h5>
      <div class="card-body">
        <h5 class="card-title">Library</h5>
        <ul class="list-group list-group-flush">
          `+ deserializerRac(libRac) + `
        </ul>
      </div>
    </div>
  </div>
  <hr>
  <div class="d-grid gap-2">
    <button class="btn btn-primary" type="button">COMPLETE ADDING </button>
  </div>
  <hr>
  <br>
  <!-- Optional JavaScript; choose one of the two! -->

  <!-- Option 1: Bootstrap Bundle with Popper -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
    crossorigin="anonymous"></script>

  <!-- Option 2: Separate Popper and Bootstrap JS -->
  <!--
        <script type="text/javascript" src="vscodeTest.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
        -->
        <script>
        (function() {
            const vscode = acquireVsCodeApi();
            const counter = document.getElementById('lines-of-code-counter');

            let count = 0;
            setInterval(() => {
                counter.textContent = count++;

                // Alert the extension when our cat introduces a bug
                if (Math.random() < 0.001 * count) {
                    vscode.postMessage({
                        command: 'alert',
                        text: '🐛  on line ' + count
                    })
                }
            }, 100);
        }())
    </script>
</body>

</html>
  `;
}

function deserializerRac(libRac: any):any{
  const pretag='<li class="list-group-item">';
  let result ='';
  libRac.forEach((element: any) => {
    const posttag='&nbsp;&nbsp; <button class="btn btn-primary btn-sm" id="'+element+'" value=type="button"> ADD </button> </li>';
    result = result + pretag + element + posttag;
    //console.log(element);
  });
return result;
}