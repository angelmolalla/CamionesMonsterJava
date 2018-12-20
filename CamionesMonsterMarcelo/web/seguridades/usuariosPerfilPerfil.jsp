<%-- 
    Document   : opcionesPerfil
    Created on : 13-dic-2018, 11:16:16
    Author     : Marcelo
--%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="ec.edu.espe.modelo1.XeperPerfil"%>
<%@page import="ec.edu.espe.modelo1.XeuxpUsxper"%>
<%@page import="ec.edu.espe.modelo1.XeusuUsua"%>
<%@page import="java.util.ArrayList"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=es>
    <head>
        <meta charset=UTF-8>
        <meta name="description" lang="en" content="jQuery multiselect plugin with two sides. The user can select one or more items and send them to the other side." />
        <meta name="keywords" lang="en" content="jQuery multiselect plugin" />

        <base href="http://crlcu.github.io/multiselect/" />
        <title>Usuario por Perfil</title>
        <link rel="icon" type="image/x-icon" href="https://github.com/favicon.ico" />
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" />
        <link rel="stylesheet" href="lib/google-code-prettify/prettify.css" />
        <link rel="stylesheet" href="css/style.css" />
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
        <script>
            $(document).ready(function () {
                $('[data-toggle=tooltip]').tooltip();
            });

            var listaPerfil = document.getElementById("listaUsuariosPerfil").value;
            var listaUsuarios = document.getElementById("listaUsuarios").value;
            function CambiarPerfil()
            {

                var v1 = document.getElementById("cmbPerfil");
                var valor1 = v1.options[v1.selectedIndex].value;
                var text1 = v1.options[v1.selectedIndex].text;
                var v1;
                var i = 0;
                var j = 0;
                alert(valor1);
                document.getElementById("cmbFalta").options.length = 0;
                document.getElementById("cmbAgregar").options.length = 0;


            <p:forEach items="${usuario}" var="u">

                if ("${usuarioPerfil.size()}" == 0)
                {
                    document.getElementById("cmbFalta").options[i] = new Option("${u.xeusuPfirm}", "${u.peempCodigo}");
                } else
                {

                <p:forEach items="${usuarioPerfil}" var="x">

                    if ("${u.peempCodigo}" != "${x.xeusuUsua.peempCodigo}")
                    {

                        document.getElementById("cmbFalta").options[i] = new Option("${u.xeusuPfirm}", "${u.peempCodigo}");

                    }
                </p:forEach>
                }

                i++;

            </p:forEach>
            }
            
            function CambiarUsuario()
            {
                listaUsuarios = listaPerfil;
                document.getElementsByName("Usuarios").value = listaUsuarios;
            }
        </script>
        <script type=text/javascript>
            $(document).ready(function () {
                $('[data-toggle=tooltip]').tooltip();
            });
        </script>
        <script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script type="text/javascript" src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/prettify/r298/prettify.min.js"></script>
        <script type="text/javascript" src="dist/js/multiselect.min.js"></script>
        <script>
            (function (i, s, o, g, r, a, m) {
                i['GoogleAnalyticsObject'] = r;
                i[r] = i[r] || function () {
                    (i[r].q = i[r].q || []).push(arguments)
                }, i[r].l = 1 * new Date();
                a = s.createElement(o),
                        m = s.getElementsByTagName(o)[0];
                a.async = 1;
                a.src = g;
                m.parentNode.insertBefore(a, m)
            })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');

            ga('create', 'UA-39934286-1', 'github.com');
            ga('send', 'pageview');
        </script>

        <script type="text/javascript">
            $(document).ready(function () {
                // make code pretty
                window.prettyPrint && prettyPrint();

                $('#keepRenderingSort').multiselect({
                    keepRenderingSort: true
                });
            });
        </script>

    </head>
    <body background="CamionesMonster.jpg">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <ul class="nav navbar-nav">
                    <li ><a href="Camiones.html">Camiones</a></li>
                    <li><a href="Finanzas.html">Finanzas</a></li>
                    <li><a href="Mudanzas.html">Mudanzas</a></li>
                    <li><a href="Personal.html">Personal</a></li>
                    <li class="active"><a href="Seguridad.html">Seguridad</a></li>
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
                        <div class="page-header">
                            <h2>Usuarios Por Perfil</h2>
                        </div>
                        <form action="/CamionesMonsterMarcelo/CargoConst" method="post">           

                            <div class="form-group">
                                <label>Codigo Perfil</label>
                                <SELECT id="cmbPerfil" NAME="cmbPerfil" SIZE=1 class="form-control" onchange='CambiarPerfil()'> 
                                    <p:forEach items="${perfiles}" var="x">
                                        <option value=${x.xeperCodigo}>${x.xeperDesc}</option>
                                    </p:forEach>  
                                </SELECT> 

                            </div>

                            <div class="form-group">
                                <label>Código Departamento</label>


                                <div class="row">
                                    <div class="col-xs-5">
                                        <select name="from[]" id="cmbFalta" class="form-control" size="8" multiple="multiple">
                                            <option value="1" data-position="1">Item 1</option>
                                            <option value="2" data-position="2">Item 5</option>
                                            <option value="2" data-position="3">Item 2</option>
                                            <option value="2" data-position="4">Item 4</option>
                                            <option value="3" data-position="5">Item 3</option>
                                        </select>
                                    </div>

                                    <div class="col-xs-2">
                                        <button type="button" id="keepRenderingSort_rightAll" class="btn btn-block"><i class="glyphicon glyphicon-forward"></i></button>
                                        <button type="button" id="keepRenderingSort_rightSelected" class="btn btn-block"><i class="glyphicon glyphicon-chevron-right"></i></button>
                                        <button type="button" id="keepRenderingSort_leftSelected" class="btn btn-block"><i class="glyphicon glyphicon-chevron-left"></i></button>
                                        <button type="button" id="keepRenderingSort_leftAll" class="btn btn-block"><i class="glyphicon glyphicon-backward"></i></button>
                                    </div>

                                    <div class="col-xs-5">
                                        <select name="to[]" id="cmbAgregar" class="form-control" size="8" multiple="multiple"></select>
                                    </div>
                                </div>

                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

