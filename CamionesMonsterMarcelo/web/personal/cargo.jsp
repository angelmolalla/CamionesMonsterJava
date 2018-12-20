<%-- 
    Document   : departamento
    Created on : 27-nov-2018, 1:03:45
    Author     : Marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ec.edu.espe.modelo1.PecarCargo"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang=es>
    <head>
        <meta charset=UTF-8>
        <title>Cargo</title>
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
                    <li class="active"><a href="Personal.html">Personal</a></li>
                    <li><a href="Seguridad.html">Seguridad</a></li>
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
                           <p class=pull-left><h2 >Detalles del Cargo</h2></p>
                           
                            
                        </div>
                        <form>
                            <table class='table table-bordered table-striped'>
                                <thead>
                                    <tr>
                                        <th>Código del Cargo</th>
                                        <th>Código del Departamento</th>
                                        <th>Descripción</th>                    
                                        <th>Acciones</th>                                 
                                    </tr>
                                </thead>   

                                <p:forEach items="${cargos}" var="x">
                                    
                                        <tr>      
                                            <td>  ${x.pecarCargoPK.pecarCodigo}</td>
                                            <td>  ${x.pecarCargoPK.pedepCodigo} </td>    
                                            <td>   ${x.pecarDesc} </td>              
                                            <td>                                      
                                                  <a href='/CamionesMonsterMarcelo/personal/editar_cargo.jsp?id=${x.pecarCargoPK.pecarCodigo}&idDepartamento=${x.pecarCargoPK.pedepCodigo}' title='Modificar el Cargo' 
                                                   data-toggle='tooltip'><span class='glyphicon glyphicon-pencil'></span></a>
                                                <a href='/CamionesMonsterMarcelo/CargoMod?txtId=${x.pecarCargoPK.pecarCodigo}&txtIdDepartamento=${x.pecarCargoPK.pedepCodigo}' onclick="return confirm('Seguro que deseas eliminar el item?');" title='Borrar' 
                                                   data-toggle='tooltip'><span class='glyphicon glyphicon-trash'></span></a>
                                            </td>
                                        </tr>
                                    
                                </p:forEach>   
                              
                            </table>    
                            <tr>
                                <td><input type="submit" class="btn btn-primary" value="Agregar"  formaction="/CamionesMonsterMarcelo/personal/agregar_cargo.jsp"></td>
                                <script>var pfHeaderImgUrl = '';var pfHeaderTagline = '';var pfdisableClickToDel = 0;var pfHideImages = 0;var pfImageDisplayStyle = 'right';var pfDisablePDF = 0;var pfDisableEmail = 0;var pfDisablePrint = 0;var pfCustomCSS = '';var pfBtVersion='2';(function(){var js,pf;pf=document.createElement('script');pf.type='text/javascript';pf.src='//cdn.printfriendly.com/printfriendly.js';document.getElementsByTagName('head')[0].appendChild(pf)})();</script><a href="https://www.printfriendly.com" style="color:#6D9F00;text-decoration:none;" class="printfriendly" onclick="window.print();return false;" title="Printer Friendly and PDF"><img style="border:none;-webkit-box-shadow:none;box-shadow:none;" src="pdf.jpg" alt="Generar Reporte"/></a>
                                
                            </tr>                  

                        </form>
                    </div>
                </div>        
            </div>
        </div>
    </body>
</html>