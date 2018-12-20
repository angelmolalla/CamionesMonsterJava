<%-- 
    Document   : personal
    Created on : 27-nov-2018, 18:46:56
    Author     : Marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang=es>
    <head>
        <meta charset=UTF-8>
        <title>Personal</title>
        <link rel=stylesheet href=https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css>
        <script src=https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js></script>
        <script src=https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.js></script>
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
        </script>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <ul class="nav navbar-nav">
                    <li ><a href="Camiones.jsp">Mudanza</a></li>
                    <li><a href="Finanzas.jsp">Finanzas</a></li>
                    <li><a href="Mudanzas.jsp">Mudanzas</a></li>
                    <li class="active"><a href="Personal.jsp">Personal</a></li>
                    <li><a href="Seguridad.html">Seguridad</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/CamionesMonster2/index.jsp"><span class="glyphicon glyphicon-log-out"></span> Salir</a></li>
                </ul>
            </div>
        </nav>

        <br><br>

        <div class="container-fluid">
           <div class="col-md-4">
                <a class="btn btn-block  btn-success" data-toggle="modal"  href="/CamionesMonsterMarcelo/CargoConst">
                    <i class="fa fa-user" id="icone_grande"></i> <br><br>
                    <span class="texto_grande"><i class="fa fa-times-circle-o"></i> Cargo</span></a>
            </div>

            <div class="col-md-4">
                <a class="btn btn-block  btn-danger" data-toggle="modal"  href="/CamionesMonsterMarcelo/EmpleadoConst">
                    <i class="fa fa-user" id="icone_grande"></i> <br><br>
                    <span class="texto_grande"><i class="fa fa-times-circle-o"></i> Empleado</span></a>
            </div>

            <div class="col-md-4">
                <a class="btn btn-block btn-primary" data-toggle="modal"  href="/CamionesMonsterMarcelo/DepartamentoConst">
                    <i class="fa fa-user" id="icone_grande"></i> <br><br>
                    <span class="texto_grande"><i class="fa fa-times-circle-o"></i> Departamento</span></a>
            </div>

        </div>
        <br><br>
       



    </body>

