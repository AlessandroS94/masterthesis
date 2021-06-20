/********************************************************************************************************************************
*********************************************************************************************************************************
*                                           START URL RECOMMEND
*********************************************************************************************************************************
*********************************************************************************************************************************/

'use strict';

import { toString } from "lodash";

export function getWebviewContent(urlRecommend: any) {
  
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

  <title>Link Racommended</title>
</head>

<body>
  <nav class="navbar navbar-dark bg-dark">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">&nbsp;Link Racommanded <span class="sr-only"></span></a>
      </li>
    </ul>
  </nav>
  <br>

  <div class="card">
    <div class="card-body">
      <h5 class="card-title">Link Racommand</h5>
      <div class="card-body">
        <ul class="list-group list-group-flush">
          `+ deserializerRac(urlRecommend) + `
        </ul>
      </div>
    </div>
  </div>
  <hr>
  <hr>
  <br>
  <!-- Option 1: Bootstrap Bundle with Popper -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
    crossorigin="anonymous"></script>
  <!-- Script fot VsCode Comunication -->
</body>

</html>
  `;
}

function deserializerRac(urlRecommend: any):any{
  let result = '';
  
  urlRecommend.forEach((element: any) => {
    console.log(element);
    const posttag='&nbsp;&nbsp;'+
    '<li class="list-group-item"><a href="'+toString(element)+'">'+toString(element)+'</a></li>';
    result = result + posttag;
    //console.log(element);
  });
return result;
}

/********************************************************************************************************************************
*********************************************************************************************************************************
*                                           FINISH URL RECOMMEND
*********************************************************************************************************************************
*********************************************************************************************************************************/