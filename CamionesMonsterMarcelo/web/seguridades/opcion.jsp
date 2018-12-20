<%-- 
    Document   : departamento
    Created on : 27-nov-2018, 1:03:45
    Author     : Marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ec.edu.espe.modelo1.XeopcOpcion"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang=es>
    <head>
        <meta charset=UTF-8>
        <title>Opción</title>
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
                    <li class="active"><a href="Seguridad.html">Seguridad</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/CR_WB_Project/UserServlet"><span class="glyphicon glyphicon-log-out"></span> Salir</a></li>
                </ul>
            </div>
        </nav>
        <div class=wrapper>
            <div class=container-fluid>
                <div class=row>
                    <div class=col-md-12>
                        <div class=page-header clearfix>
                           <p class=pull-left><h2 >Detalles de las Opciones</h2></p>
                           
                            
                        </div>
                        <form>
                            <table class='table table-bordered table-striped'>
                                <thead>
                                    <tr>
                                        <th>Código de Opciones</th>
                                        <th>Código de Sistema</th>
                                        <th>Descripción</th>                    
                                        <th>Acciones</th>                                 
                                    </tr>
                                </thead>   

                                <p:forEach items="${opciones}" var="x">
                                    
                                        <tr>      
                                            <td>  ${x.xeopcCodigo}</td>
                                            <td>  ${x.xesisCodigo.xesisCodigo} </td>    
                                            <td>   ${x.xeopcDesc} </td>              
                                            <td>                                      
                                                  <a href='/CamionesMonsterMarcelo/seguridades/editar_opcion.jsp?id=${x.xeopcCodigo}&idSistema=${x.xesisCodigo.xesisCodigo}' title='Modificar la opcion' 
                                                   data-toggle='tooltip'><span class='glyphicon glyphicon-pencil'></span></a>
                                                <a href='/CamionesMonsterMarcelo/OpcionMod?id=${x.xeopcCodigo}' onclick="return confirm('Seguro que deseas eliminar el item?');" title='Borrar' 
                                                   data-toggle='tooltip'><span class='glyphicon glyphicon-trash'></span></a>
                                            </td>
                                        </tr>
                                    
                                </p:forEach>   
                              
                            </table>    
                            <tr>
                                <p>  
                                  <a href='/CamionesMonsterMarcelo/seguridades/agregar_opcion.jsp?size=${opciones.size()}'  
                                                   class="btn btn-primary" >Agregar Opción</a>  
        
                                </p>
                                
                            </tr>                  

                        </form>
                    </div>
                </div>        
            </div>
        </div>
    </body>
</html>