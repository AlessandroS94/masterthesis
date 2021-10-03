'use strict';

export function getWebviewContent(libRac: any[ ]) {
  
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

  <title>Library</title>
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
        <form name="LibRacommand">
          `+ deserializerRac(libRac) + `
        </form>
      </div>
    </div>
  </div>
  
  
  <!-- Option 1: Bootstrap Bundle with Popper -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
    crossorigin="anonymous"></script>
  <!-- Script fot VsCode Comunication -->
</body>

</html>
  `;
}

function deserializerRac(libRac: any):any{
  let result = '';
  libRac.forEach((element: any) => {
    const posttag='&nbsp;&nbsp;'+
    '<div class="form-check">'+
    '<label class="form-check-label" for="flexCheckChecked">'+element+
    '</label></div>';
    result = result + posttag;
    //console.log(element);
  });
return result;
}

'use strict';

export function getWebviewContent(libRac: any[ ]) {
  
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

  <title>Library</title>
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
        <form name="LibRacommand">
          `+ deserializerRac(libRac) + `
        </form>
      </div>
    </div>
  </div>
  
  
  <!-- Option 1: Bootstrap Bundle with Popper -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
    crossorigin="anonymous"></script>
  <!-- Script fot VsCode Comunication -->
</body>

</html>
  `;
}

function deserializerRac(libRac: any):any{
  let result = '';
  libRac.forEach((element: any) => {
    const posttag='&nbsp;&nbsp;'+
    '<div class="form-check">'+
    '<label class="form-check-label" for="flexCheckChecked">'+element+
    '</label></div>';
    result = result + posttag;
    //console.log(element);
  });
return result;
}

'use strict';

export function getWebviewContent(libRac: any[ ]) {
  
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

  <title>Library</title>
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
        <form name="LibRacommand">
          `+ deserializerRac(libRac) + `
        </form>
      </div>
    </div>
  </div>
  
  
  <!-- Option 1: Bootstrap Bundle with Popper -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
    crossorigin="anonymous"></script>
  <!-- Script fot VsCode Comunication -->
</body>

</html>
  `;
}

function deserializerRac(libRac: any):any{
  let result = '';
  libRac.forEach((element: any) => {
    const posttag='&nbsp;&nbsp;'+
    '<div class="form-check">'+
    '<label class="form-check-label" for="flexCheckChecked">'+element+
    '</label></div>';
    result = result + posttag;
    //console.log(element);
  });
return result;
}

'use strict';

export function getWebviewContent(libRac: any[ ]) {
  
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

  <title>Library</title>
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
        <form name="LibRacommand">
          `+ deserializerRac(libRac) + `
        </form>
      </div>
    </div>
  </div>
  
  
  <!-- Option 1: Bootstrap Bundle with Popper -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
    crossorigin="anonymous"></script>
  <!-- Script fot VsCode Comunication -->
</body>

</html>
  `;
}

function deserializerRac(libRac: any):any{
  let result = '';
  libRac.forEach((element: any) => {
    const posttag='&nbsp;&nbsp;'+
    '<div class="form-check">'+
    '<label class="form-check-label" for="flexCheckChecked">'+element+
    '</label></div>';
    result = result + posttag;
    //console.log(element);
  });
return result;
}
