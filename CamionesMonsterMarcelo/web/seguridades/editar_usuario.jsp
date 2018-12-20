<%-- 
    Document   : editar_departamento
    Created on : 27-nov-2018, 3:49:11
    Author     : Marcelo
--%>

<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="ec.edu.espe.modelo1.PeempEmplea"%>
<%@page import="ec.edu.espe.modelo1.XeestEstado"%>
<%@page import="java.util.ArrayList"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=es>
    <head>
        <meta charset=UTF-8>
        <title>Editar Usuario</title>
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
    <body background="CamionesMonster.jpg">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <ul class="nav navbar-nav">
                    <li ><a href="Camiones.html">Camiones</a></li>
                    <li><a href="Finanzas.html">Finanzas</a></li>
                    <li><a href="Mudanzas.html">Mudanzas</a></li>
                    <li><a href="Personal.html">Personal</a></li>
                    <li  class="active"><a href="Seguridad.html">Seguridad</a></li>
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
                            <h2>Editar Usuario</h2>
                        </div>
                        <form action="/CamionesMonsterMarcelo/UsuarioMod" method="post">           
                           
                                <div class="form-group">
                                <label>Código Empleado</label>
                                <input type="text" name="txtCodigoEmpleado" class="form-control" value="<%=request.getParameter("id") %>">
                                <span class="help-block"></span>
                            </div>
                            
                             <div class="form-group">
                                <label>Código Estado Civil</label>
                                <SELECT id="cmbEstadoCivil" NAME="cmbCodigoEstadoCivil" SIZE=1 class="form-control"> 
                                    <p:forEach items="${civil}" var="x">
                                        <option value=${x.xeestCodigo}>${x.xeestDesc}</option>
                                    </p:forEach>  
                                </SELECT> 
                            </div>
                            <div class="form-group">
                                <label>Contraseña</label>
                                <input type="password" name="txtContra" class="form-control">
                                <span class="help-block"></span>
                            </div>

                            <div class="form-group">
                                <label>Pie Firma</label>
                                <input type="text" name="txtPie" class="form-control">
                                <span class="help-block"></span>
                            </div>



                            <input type="submit" class="btn btn-primary" value="Agregar">
                            <a href="/CamionesMonsterMarcelo/UsuarioConst" class="btn btn-default">Cancelar</a>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
