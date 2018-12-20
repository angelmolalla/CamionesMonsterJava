<%-- 
    Document   : editar_departamento
    Created on : 27-nov-2018, 3:49:11
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

        <title>Agregar Empleado</title>
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

                    <form action="/CamionesMonsterMarcelo/AgregarEmpleadoConst" method="post">
                        <div class="page-header">
                            <h2>Agregar Empleado</h2>
                        </div>

                        <div class="tab">

                            <a class="btn tablinks" href='javascript:;' onclick="openCity(event, 'Personal')" role="button">Datos Personales</a>

                            <a class="btn tablinks" href='javascript:;' onclick="openCity(event, 'PersonalesEmpresa')" role="button">Datos Personales de la Empresa</a>

                            <a class="btn tablinks" href='javascript:;' onclick="openCity(event, 'Empresa')" role="button">Datos Empresa</a>
                        </div>



                        <div id="Personal" class="tabcontent">
                            <div class="form-group">
                                <label>Nombre</label>
                                <input type="text" name="txtNombre" class="form-control">
                                <span class="help-block"></span>
                            </div>
                            <div class="form-group">
                                <label>Apellidos</label>
                                <input type="text" name="txtApellido" class="form-control">
                                <span class="help-block"></span>
                            </div>
                            <div class="form-group">
                                <label>Cédula</label>
                                <input type="text" name="txtCedula" class="form-control">
                                <span class="help-block"></span>
                            </div>

                            <div class="form-group">
                                <label>Passaporte</label>
                                <input type="text" name="txtPassaporte" class="form-control">
                                <span class="help-block"></span>
                            </div>
                            <div class="form-group">
                                <label>Sexo</label>
                                 <SELECT id="cmbSexo" NAME="cmbSexo" SIZE=1 class="form-control"> 
                                    <p:forEach items="${sexo}" var="x">
                                        <option value=${x.pesexCodigo}>${x.pesexDesc}</option>
                                    </p:forEach>  
                                </SELECT> 
                                
                            </div>
                            <div class="form-group">
                                <label>Estado Civil</label>
                                 <SELECT id="cmbEstadoCivil" NAME="cmbEstadoCivil" SIZE=1 class="form-control"> 
                                    <p:forEach items="${estadosCiviles}" var="x">
                                        <option value=${x.peescCodigo}>${x.peescDesc}</option>
                                    </p:forEach>  
                                </SELECT> 
                            </div>


                            <div class="form-group">
                                <label>Fecha  de Nacimiento</label>
                                <input type="date" name="txtDateNacimiento" class="form-control">
                                <span class="help-block"></span>
                            </div>

                            <div class="form-group">
                                <label>Teléfono </label>
                                <input type="text" name="txtTelfono" class="form-control">
                                <span class="help-block"></span>
                            </div>
                            <div class="form-group">
                                <label>Correo </label>
                                <input type="text" name="txtCorreo" class="form-control">
                                <span class="help-block"></span>
                            </div>

                            <div class="form-group">
                                <label>Dirección</label>
                                <input type="text" name="txtDire" class="form-control">
                                <span class="help-block"></span>
                            </div>
                        </div>

                        <div id="PersonalesEmpresa" class="tabcontent">

                            <div class="form-group">
                                <label>RUC del Empleado</label>
                                <input type="text" name="txtRuc" class="form-control">
                                <span class="help-block"></span>
                            </div> 
                            <div class="form-group">
                                <label>Discapacidad</label>
                                <input type="text" name="txtDiscapacidad" class="form-control">
                                <span class="help-block"></span>
                            </div>
                            <div class="form-group">
                                <label>Cargas Familiares</label>
                                <input type="text" name="txtCargas" class="form-control">
                                <span class="help-block"></span>
                            </div>
                            <div class="form-group">
                                <label>Fecha  de Ingreso del Empleado</label>
                                <input type="date" name="txtDateIngreso" class="form-control">
                                <span class="help-block"></span>
                            </div> 
                        
                        </div>


                        <div id="Empresa" class="tabcontent">
                            <div class="form-group">
                                <label>Código Cargo</label>
                                <SELECT id="cmbCargo" NAME="cmbCargo" SIZE=1 class="form-control" onchange='agregarDepartamento();'> 
                                    <p:forEach items="${cargos}" var="x">
                                        <option value=${x.pecarCargoPK.pecarCodigo}>${x.pecarDesc}</option>
                                    </p:forEach>  
                                </SELECT> 
                            </div> 
                            
                            <div class="form-group">
                                <label>Código Departamento</label>
                                <SELECT id="cmbCargoDepartamento" NAME="cmbCargoDepartamento" SIZE=1 class="form-control"> 
                                </SELECT> 
                            </div>
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
    </div>
</body>
</html> 