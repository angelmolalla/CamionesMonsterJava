package org.apache.jsp.seguridades;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ec.edu.espe.modelo1.PeempEmplea;
import java.util.ArrayList;

public final class cambiar_005fclave_005ferror_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write(">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=es>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=UTF-8>\n");
      out.write("        <title>Agregar Usuario</title>\n");
      out.write("        <link rel=stylesheet href=https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css>\n");
      out.write("        <script src=https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js></script>\n");
      out.write("        <script src=https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.js></script>\n");
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
      out.write("            \n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"CamionesMonster.jpg\">\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li ><a href=\"Camiones.html\">Camiones</a></li>\n");
      out.write("                    <li><a href=\"Finanzas.html\">Finanzas</a></li>\n");
      out.write("                    <li><a href=\"Mudanzas.html\">Mudanzas</a></li>\n");
      out.write("                    <li><a href=\"Personal.html\">Personal</a></li>\n");
      out.write("                    <li  class=\"active\"><a href=\"Seguridad.html\">Seguridad</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"/CamionesMonster2/index.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Salir</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"page-header\">\n");
      out.write("                            <h2>Cambiar Clave de Usuario</h2>\n");
      out.write("                        </div>\n");
      out.write("                          <form action=\"/CamionesMonsterMarcelo/LoginMod\" method=\"post\">\n");
      out.write("                              <div class=\"alert alert-danger fade in\">                            \n");
      out.write("                            \n");
      out.write("                            <p>Error en los Datos Ingresados</p>\n");
      out.write("                        </div> \n");
      out.write("                              \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Contraseña Anterior</label>\n");
      out.write("                                <input type=\"password\" name=\"txtContraVeri\" id=\"txtContraVeri\" class=\"form-control\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                        \n");
      out.write("\n");
      out.write("                       \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Contraseña Nueva</label>\n");
      out.write("                                <input type=\"password\" name=\"txtContra\" class=\"form-control\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Reingresar Contraseña Nueva</label>\n");
      out.write("                                <input type=\"password\" name=\"txtContra1\" class=\"form-control\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                            </div>\n");
      out.write("                         \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-primary\" value=\"Cambiar\">\n");
      out.write("                            <a href=\"/CamionesMonsterMarcelo/DepartamentoConst\" class=\"btn btn-default\">Cancelar</a>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
