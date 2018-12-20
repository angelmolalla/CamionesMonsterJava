<%-- 
    Document   : error
    Created on : 15-dic-2018, 23:48:39
    Author     : Marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Error</title>
        <link rel=stylesheet href=https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css>
        <script src=https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js></script>
        <script src=https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.js></script>
        <style>
            body {font-family: Arial;}

            /* Style the tab */
            .tab {
                overflow: hidden;
                border: 1px solid #ccc;
                background-color: #f1f1f1;
            }

            /* Style the buttons inside the tab */
            .tab button {
                background-color: inherit;
                float: left;
                border: none;
                outline: none;
                cursor: pointer;
                padding: 14px 16px;
                transition: 0.3s;
                font-size: 17px;
            }

            /* Change background color of buttons on hover */
            .tab button:hover {
                background-color: #ddd;
            }

            /* Create an active/current tablink class */
            .tab button.active {
                background-color: #ccc;
            }

            /* Style the tab content */
            .tabcontent {
                display: none;
                padding: 6px 12px;
                border: 1px solid #ccc;
                border-top: none;
            }
        </style>

        <style type=text/css>
            .wrapper{
                width: 650px;
                margin: 0 auto;
            }
            .page-header h2{
                margin-top: 0;                
            }
            table tr td:last-child a{
                margin-right: 15px;
            }
        </style>
        <script type=text/javascript>
            $(document).ready(function () {
                $('[data-toggle=tooltip]').tooltip();
            });

            function agregarDepartamento()
            {
                var v1 = document.getElementById("cmbCargo");
                var valor1 = v1.options[v1.selectedIndex].value;
                var text1 = v1.options[v1.selectedIndex].text;
              var v1;
              var i=0;
            
              document.getElementById("cmbCargoDepartamento").options.length=0;
            <p:forEach items="${cargos}" var="x">
              if(valor1=="${x.pecarCargoPK.pecarCodigo}") 
              {
                   document.getElementById("cmbCargoDepartamento").options[i]=new Option("${x.pedepDepart.pedepDesc}","${x.pecarCargoPK.pedepCodigo}");
              }
               
                i++;
            </p:forEach>
               
            }
        </script>
    </head>
<body>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <ul class="nav navbar-nav">
                <li ><a href="Camiones.html">Camiones</a></li>
                <li><a href="Finanzas.html">Finanzas</a></li>
                <li><a href="Mudanzas.html">Mudanzas</a></li>
                <li class="active"><a href="Personal.html">Personal</a></li>
                <li><a href="Seguridad.html">Seguridad</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/CamionesMonster2/index.jsp"><span class="glyphicon glyphicon-log-out"></span> Salir</a></li>
            </ul>
        </div>
    </nav>

    <div class="wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">

                    <div class="alert alert-danger fade in">                            
                        <input type="hidden" name="article_id" value="${article_id}"/>
                        <p>Error en los Datos Ingresados</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html> 