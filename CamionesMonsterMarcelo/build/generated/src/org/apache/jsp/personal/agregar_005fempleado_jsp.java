package org.apache.jsp.personal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ec.edu.espe.modelo1.PecarCargo;
import ec.edu.espe.modelo1.PedepDepart;
import java.util.ArrayList;

public final class agregar_005fempleado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_p_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_p_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <title>Agregar Empleado</title>\n");
      out.write("        <link rel=stylesheet href=https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css>\n");
      out.write("        <script src=https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js></script>\n");
      out.write("        <script src=https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.js></script>\n");
      out.write("        <style>\n");
      out.write("            body {font-family: Arial;}\n");
      out.write("\n");
      out.write("            /* Style the tab */\n");
      out.write("            .tab {\n");
      out.write("                overflow: hidden;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Style the buttons inside the tab */\n");
      out.write("            .tab button {\n");
      out.write("                background-color: inherit;\n");
      out.write("                float: left;\n");
      out.write("                border: none;\n");
      out.write("                outline: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                transition: 0.3s;\n");
      out.write("                font-size: 17px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Change background color of buttons on hover */\n");
      out.write("            .tab button:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Create an active/current tablink class */\n");
      out.write("            .tab button.active {\n");
      out.write("                background-color: #ccc;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Style the tab content */\n");
      out.write("            .tabcontent {\n");
      out.write("                display: none;\n");
      out.write("                padding: 6px 12px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-top: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <style type=text/css>\n");
      out.write("            .wrapper{\n");
      out.write("                width: 650px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("            .page-header h2{\n");
      out.write("                margin-top: 0;                \n");
      out.write("            }\n");
      out.write("            table tr td:last-child a{\n");
      out.write("                margin-right: 15px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script type=text/javascript>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('[data-toggle=tooltip]').tooltip();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            function agregarDepartamento()\n");
      out.write("            {\n");
      out.write("                var v1 = document.getElementById(\"cmbCargo\");\n");
      out.write("                var valor1 = v1.options[v1.selectedIndex].value;\n");
      out.write("                var text1 = v1.options[v1.selectedIndex].text;\n");
      out.write("              var v1;\n");
      out.write("              var i=0;\n");
      out.write("            \n");
      out.write("              document.getElementById(\"cmbCargoDepartamento\").options.length=0;\n");
      out.write("            ");
      if (_jspx_meth_p_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li ><a href=\"Camiones.html\">Camiones</a></li>\n");
      out.write("                <li><a href=\"Finanzas.html\">Finanzas</a></li>\n");
      out.write("                <li><a href=\"Mudanzas.html\">Mudanzas</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"Personal.html\">Personal</a></li>\n");
      out.write("                <li><a href=\"Seguridad.html\">Seguridad</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"/CamionesMonster2/index.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Salir</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                    <form action=\"/CamionesMonsterMarcelo/AgregarEmpleadoConst\" method=\"post\">\n");
      out.write("                        <div class=\"page-header\">\n");
      out.write("                            <h2>Agregar Empleado</h2>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"tab\">\n");
      out.write("\n");
      out.write("                            <a class=\"btn tablinks\" href='javascript:;' onclick=\"openCity(event, 'Personal')\" role=\"button\">Datos Personales</a>\n");
      out.write("\n");
      out.write("                            <a class=\"btn tablinks\" href='javascript:;' onclick=\"openCity(event, 'PersonalesEmpresa')\" role=\"button\">Datos Personales de la Empresa</a>\n");
      out.write("\n");
      out.write("                            <a class=\"btn tablinks\" href='javascript:;' onclick=\"openCity(event, 'Empresa')\" role=\"button\">Datos Empresa</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div id=\"Personal\" class=\"tabcontent\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Nombre</label>\n");
      out.write("                                <input type=\"text\" name=\"txtNombre\" class=\"form-control\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Apellidos</label>\n");
      out.write("                                <input type=\"text\" name=\"txtApellido\" class=\"form-control\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Cédula</label>\n");
      out.write("                                <input type=\"text\" name=\"txtCedula\" class=\"form-control\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Passaporte</label>\n");
      out.write("                                <input type=\"text\" name=\"txtPassaporte\" class=\"form-control\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Sexo</label>\n");
      out.write("                                 <SELECT id=\"cmbSexo\" NAME=\"cmbSexo\" SIZE=1 class=\"form-control\"> \n");
      out.write("                                    ");
      if (_jspx_meth_p_forEach_1(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                                </SELECT> \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Estado Civil</label>\n");
      out.write("                                 <SELECT id=\"cmbEstadoCivil\" NAME=\"cmbEstadoCivil\" SIZE=1 class=\"form-control\"> \n");
      out.write("                                    ");
      if (_jspx_meth_p_forEach_2(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                                </SELECT> \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Fecha  de Nacimiento</label>\n");
      out.write("                                <input type=\"date\" name=\"txtDateNacimiento\" class=\"form-control\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Teléfono </label>\n");
      out.write("                                <input type=\"text\" name=\"txtTelfono\" class=\"form-control\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Correo </label>\n");
      out.write("                                <input type=\"text\" name=\"txtCorreo\" class=\"form-control\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Dirección</label>\n");
      out.write("                                <input type=\"text\" name=\"txtDire\" class=\"form-control\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"PersonalesEmpresa\" class=\"tabcontent\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>RUC del Empleado</label>\n");
      out.write("                                <input type=\"text\" name=\"txtRuc\" class=\"form-control\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                            </div> \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Discapacidad</label>\n");
      out.write("                                <input type=\"text\" name=\"txtDiscapacidad\" class=\"form-control\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Cargas Familiares</label>\n");
      out.write("                                <input type=\"text\" name=\"txtCargas\" class=\"form-control\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Fecha  de Ingreso del Empleado</label>\n");
      out.write("                                <input type=\"date\" name=\"txtDateIngreso\" class=\"form-control\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                            </div> \n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div id=\"Empresa\" class=\"tabcontent\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Código Cargo</label>\n");
      out.write("                                <SELECT id=\"cmbCargo\" NAME=\"cmbCargo\" SIZE=1 class=\"form-control\" onchange='agregarDepartamento();'> \n");
      out.write("                                    ");
      if (_jspx_meth_p_forEach_3(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                                </SELECT> \n");
      out.write("                            </div> \n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Código Departamento</label>\n");
      out.write("                                <SELECT id=\"cmbCargoDepartamento\" NAME=\"cmbCargoDepartamento\" SIZE=1 class=\"form-control\"> \n");
      out.write("                                </SELECT> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <script>\n");
      out.write("                            function openCity(evt, cityName) {\n");
      out.write("                                var i, tabcontent, tablinks;\n");
      out.write("                                tabcontent = document.getElementsByClassName(\"tabcontent\");\n");
      out.write("                                for (i = 0; i < tabcontent.length; i++) {\n");
      out.write("                                    tabcontent[i].style.display = \"none\";\n");
      out.write("                                }\n");
      out.write("                                tablinks = document.getElementsByClassName(\"tablinks\");\n");
      out.write("                                for (i = 0; i < tablinks.length; i++) {\n");
      out.write("                                    tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\n");
      out.write("                                }\n");
      out.write("                                document.getElementById(cityName).style.display = \"block\";\n");
      out.write("                                evt.currentTarget.className += \" active\";\n");
      out.write("                            }\n");
      out.write("                        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-primary\" value=\"Agregar\">\n");
      out.write("                        <a href=\"/CamionesMonsterMarcelo/DepartamentoConst\" class=\"btn btn-default\">Cancelar</a>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html> ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_p_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_p_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_p_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_p_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_p_forEach_0.setParent(null);
    _jspx_th_p_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cargos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_p_forEach_0.setVar("x");
    int[] _jspx_push_body_count_p_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_p_forEach_0 = _jspx_th_p_forEach_0.doStartTag();
      if (_jspx_eval_p_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("              if(valor1==\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.pecarCargoPK.pecarCodigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\") \n");
          out.write("              {\n");
          out.write("                   document.getElementById(\"cmbCargoDepartamento\").options[i]=new Option(\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.pedepDepart.pedepDesc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\",\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.pecarCargoPK.pedepCodigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\");\n");
          out.write("              }\n");
          out.write("               \n");
          out.write("                i++;\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_p_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_p_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_p_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_p_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_p_forEach_0.doFinally();
      _jspx_tagPool_p_forEach_var_items.reuse(_jspx_th_p_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_p_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_p_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_p_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_p_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_p_forEach_1.setParent(null);
    _jspx_th_p_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sexo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_p_forEach_1.setVar("x");
    int[] _jspx_push_body_count_p_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_p_forEach_1 = _jspx_th_p_forEach_1.doStartTag();
      if (_jspx_eval_p_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option value=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.pesexCodigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.pesexDesc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_p_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_p_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_p_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_p_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_p_forEach_1.doFinally();
      _jspx_tagPool_p_forEach_var_items.reuse(_jspx_th_p_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_p_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_p_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_p_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_p_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_p_forEach_2.setParent(null);
    _jspx_th_p_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estadosCiviles}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_p_forEach_2.setVar("x");
    int[] _jspx_push_body_count_p_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_p_forEach_2 = _jspx_th_p_forEach_2.doStartTag();
      if (_jspx_eval_p_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option value=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.peescCodigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.peescDesc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_p_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_p_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_p_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_p_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_p_forEach_2.doFinally();
      _jspx_tagPool_p_forEach_var_items.reuse(_jspx_th_p_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_p_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_p_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_p_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_p_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_p_forEach_3.setParent(null);
    _jspx_th_p_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cargos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_p_forEach_3.setVar("x");
    int[] _jspx_push_body_count_p_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_p_forEach_3 = _jspx_th_p_forEach_3.doStartTag();
      if (_jspx_eval_p_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option value=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.pecarCargoPK.pecarCodigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.pecarDesc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_p_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_p_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_p_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_p_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_p_forEach_3.doFinally();
      _jspx_tagPool_p_forEach_var_items.reuse(_jspx_th_p_forEach_3);
    }
    return false;
  }
}
