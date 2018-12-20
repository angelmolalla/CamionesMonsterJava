<%-- 
    Document   : departamento
    Created on : 27-nov-2018, 1:03:45
    Author     : Marcelo
--%>

<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="ec.edu.espe.modelo1.PecarCargo"%>
<%@page import="ec.edu.espe.modelo1.PedepDepart"%>
<%@page import="java.util.ArrayList"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Empleado</title>
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
                var i = 0;

                document.getElementById("cmbCargoDepartamento").options.length = 0;
            <p:forEach items="${cargos}" var="x">
                if (valor1 == "${x.pecarCargoPK.pecarCodigo}")
                {
                    document.getElementById("cmbCargoDepartamento").options[i] = new Option("${x.pedepDepart.pedepDesc}", "${x.pecarCargoPK.pedepCodigo}");
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


        <div class="container-large">
            <div class="row">
                <div class="col-md-12">

                    <form action="/CamionesMonsterMarcelo/AgregarEmpleadoConst" method="post">
                        <div class="page-header">
                            <h2>Detalle Empleado</h2>
                        </div>

                        <div class="tab">

                            <a class="btn tablinks" href='javascript:;' onclick="openCity(event, 'Personal')" role="button">Datos Principales del Personal</a>

                            <a class="btn tablinks" href='javascript:;' onclick="openCity(event, 'Secundarios')" role="button">Datos Secundarios del Personal</a>

                            <a class="btn tablinks" href='javascript:;' onclick="openCity(event, 'Empresa')" role="button">Datos Empresariales del Personal</a>

                            <a class="btn tablinks" href='javascript:;' onclick="openCity(event, 'OtrosDatos')" role="button">Otros Datos del Personal</a>
                        </div>



                        <div id="Personal" class="tabcontent">
                            <table class='table table-bordered table-striped'>
                                <thead>
                                    <tr>
                                        <th>Código</th>
                                        <th>Cargo</th>
                                        <th>Departamento</th>
                                        <th>Nombre</th>                    
                                        <th>Apellido</th>  
                                        <th>Cédula</th>  
                                        <th>Acciones</th>
                                    </tr>
                                </thead>   

                                <p:forEach items="${empleados}" var="x">

                                    <tr>      
                                        <td>  ${x.peempCodigo}  </td>
                                        <td>   ${x.pecarCargo.pecarDesc} </td>       
                                        <td>   ${x.pecarCargo.pedepDepart.pedepDesc} </td>
                                        <td>   ${x.peempNombre} </td>  
                                        <td>   ${x.peempApelli} </td>  
                                        <td>   ${x.peempCedula} </td> 
                                        <td>                                      
                                       <a href='/CamionesMonsterMarcelo/EditarEmpleadoConst?id=${x.peempCodigo}&idCargo=${x.pecarCargo.pecarCargoPK.pecarCodigo}$idDepartamento=${x.pecarCargo.pecarCargoPK.pedepCodigo}' title='Modificar Departamento' 
                                               data-toggle='tooltip'><span class='glyphicon glyphicon-pencil'></span></a>                                    
                                            <a href='/CamionesMonsterMarcelo/EmpleadoMod?id=${x.peempCodigo}' onclick="return confirm('Seguro que deseas eliminar el item?');" title='Borrar' 
                                               data-toggle='tooltip'><span class='glyphicon glyphicon-trash'></span></a>
                                        </td>
                                    </tr>
                                </p:forEach>   

                            </table>
                        </div>
                        <div id="Secundarios" class="tabcontent">
                            <table class='table table-bordered table-striped'>
                                <thead>
                                    <tr>
                                        <th>Código</th>
                                        <th>Cargo</th>
                                        <th>Departamento</th>
                                        <th>Sexo</th>
                                        <th>Estado Civil</th>
                                        <th>Pasaporte</th>
                                        <th>Discapacidad</th>
                                        <th>Fecha de Nacimiento</th> 
                                        <th>Acciones</th>
                                    </tr>
                                </thead>   

                                <p:forEach items="${empleados}" var="x">

                                    <tr>      
                                        <td>  ${x.peempCodigo}  </td>
                                        <td>   ${x.pecarCargo.pecarDesc} </td>       
                                        <td>   ${x.pecarCargo.pedepDepart.pedepDesc} </td>  

                                        <td>  ${x.pesexCodigo.pesexDesc}  </td>
                                        <td>  ${x.peescCodigo.peescDesc}  </td>
                                        <td>  ${x.peempPaspr}  </td>
                                        <td>  ${x.peempDiscap}  </td>
                                        
                                        <td>  ${x.peempFenac.toString()}  </td>
                                        <td>                                      
                                            <a href='/CamionesMonsterMarcelo/EditarEmpleadoConst?id=${x.peempCodigo}&idCargo=${x.pecarCargo.pecarCargoPK.pecarCodigo}$idDepartamento=${x.pecarCargo.pecarCargoPK.pedepCodigo}' title='Modificar Departamento' 
                                               data-toggle='tooltip'><span class='glyphicon glyphicon-pencil'></span></a>                                    
                                            <a href='/CamionesMonsterMarcelo/EmpleadoMod?id=${x.peempCodigo}' onclick="return confirm('Seguro que deseas eliminar el item?');" title='Borrar' 
                                               data-toggle='tooltip'><span class='glyphicon glyphicon-trash'></span></a>
                                        </td>
                                    </tr>
                                </p:forEach>   

                            </table>
                        </div>


                        <div id="Empresa" class="tabcontent">
                            <table class='table table-bordered table-striped'>
                                <thead>
                                    <tr>
                                        <th>Código</th>
                                        <th>Cargo</th>
                                        <th>Departamento</th>
                                        <th>RUC</th>
                                        <th>Fecha de Ingreso</th>
                                        <th>Fecha de Salida</th>
                                        <th>Acciones</th>
                                    </tr>
                                </thead>   

                                <p:forEach items="${empleados}" var="x">

                                    <tr>      
                                        <td>  ${x.peempCodigo}  </td>
                                        <td>   ${x.pecarCargo.pecarDesc} </td>       
                                        <td>   ${x.pecarCargo.pedepDepart.pedepDesc} </td>  

                                        <td>  ${x.peempRuc}  </td>     
                                        <td>  ${x.peempFeing.toString()}  </td>     
                                        <td>  ${x.peempFesal.toString()}  </td>     
                                        <td>                                      
                                             <a href='/CamionesMonsterMarcelo/EditarEmpleadoConst?id=${x.peempCodigo}&idCargo=${x.pecarCargo.pecarCargoPK.pecarCodigo}$idDepartamento=${x.pecarCargo.pecarCargoPK.pedepCodigo}' title='Modificar Departamento' 
                                               data-toggle='tooltip'><span class='glyphicon glyphicon-pencil'></span></a>                                    
                                            <a href='/CamionesMonsterMarcelo/EmpleadoMod?id=${x.peempCodigo}' onclick="return confirm('Seguro que deseas eliminar el item?');" title='Borrar' 
                                               data-toggle='tooltip'><span class='glyphicon glyphicon-trash'></span></a>
                                        </td>
                                    </tr>
                                </p:forEach>   

                            </table>
                        </div>
                        <div id="OtrosDatos" class="tabcontent">
                            <table class='table table-bordered table-striped'>
                                <thead>
                                    <tr>
                                        <th>Código</th>
                                        <th>Cargo</th>
                                        <th>Departamento</th>
                                        <th>Cargas Familiares</th>
                                        <th>Teléfono</th>
                                        <th>Correo</th>
                                        <th>Dirección</th>
                                    </tr>
                                </thead>   

                                <p:forEach items="${empleados}" var="x">

                                    <tr>      
                                        <td>  ${x.peempCodigo}  </td>
                                        <td>   ${x.pecarCargo.pecarDesc} </td>       
                                        <td>   ${x.pecarCargo.pedepDepart.pedepDesc} </td>  

                                        <td>  ${x.peempCarfam}  </td>  
                                        <td>  ${x.peempTelef}  </td>  
                                        <td>  ${x.peempEmail}  </td>  
                                        <td>  ${x.peempDirec}  </td>  
                                        <td>                                      
                                          <a href='/CamionesMonsterMarcelo/EditarEmpleadoConst?id=${x.peempCodigo}&idCargo=${x.pecarCargo.pecarCargoPK.pecarCodigo}$idDepartamento=${x.pecarCargo.pecarCargoPK.pedepCodigo}' title='Modificar Departamento' 
                                               data-toggle='tooltip'><span class='glyphicon glyphicon-pencil'></span></a>                                    
                                            <a href='/CamionesMonsterMarcelo/EmpleadoMod?id=${x.peempCodigo}' onclick="return confirm('Seguro que deseas eliminar el item?');" title='Borrar' 
                                               data-toggle='tooltip'><span class='glyphicon glyphicon-trash'></span></a>
                                        </td>
                                    </tr>
                                </p:forEach>   

                            </table>
                        </div>
                        <script>
                            function openCity(evt, cityName) {
                                var i, tabcontent, tablinks;
                                tabcontent = document.getElementsByClassName("tabcontent");
                                for (i = 0; i < tabcontent.length; i++) {
                                    tabcontent[i].style.display = "none";
                                }
                                tablinks = document.getElementsByClassName("tablinks");
                                for (i = 0; i < tablinks.length; i++) {
                                    tablinks[i].className = tablinks[i].className.replace(" active", "");
                                }
                                document.getElementById(cityName).style.display = "block";
                                evt.currentTarget.className += " active";
                            }
                        </script>


                        <input type="submit" class="btn btn-primary" value="Agregar">
                        <a href="/CamionesMonsterMarcelo/DepartamentoConst" class="btn btn-default">Cancelar</a>
                    </form>

                </div>

            </div>
        </div>
    </body>
</html> 