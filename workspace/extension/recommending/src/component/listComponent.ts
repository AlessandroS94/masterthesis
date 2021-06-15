'use strict';

import { toArray, toString } from "lodash";
import { Lib } from "../model/lib";
import { reccomendListUI } from "../utils/uiComponent";

export function getWebviewContent(libRac: any[], libPom: Lib) {
  
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
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
        -->
</body>

</html>
  `;
}

/* function deserializer(libPom: any):any{
  const pretag='<li class="list-group-item">';
  const posttag='</>';
  let result ='';
  libPom.lib?.forEach((element: any) => {
    result = result + pretag + element + posttag;
    //console.log(element);
  });
return result;
} */

function deserializerRac(libRac: any):any{
  const pretag='<li class="list-group-item">';
  const posttag='&nbsp;&nbsp; <button class="btn btn-primary btn-sm" type="submit"> ADD </button> </li>';
  let result ='';
  libRac.forEach((element: any) => {
    result = result + pretag + element + posttag;
    //console.log(element);
  });
return result;
}


