package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=UTF-8>\n");
      out.write("        <title>Login</title>\n");
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
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <div class=\"container\" style=\"margin-top:40px\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-6 col-md-4 col-md-offset-4\">\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <strong > Iniciar Sesión para Continuar</strong>\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <form role=\"form\" action=\"LoginConst\" method=\"POST\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"center-block\">\n");
      out.write("                                        <img class=\"center-block\" src=\"https://web.nubox.com/Login/Content/img/nbx-avatar_login.svg\"  width=\"100\" height=\"100\"alt=\"\">\n");
      out.write("                                    <h1> </h1>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-12 col-md-10  col-md-offset-1 \">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\">\n");
      out.write("                                                    <i class=\"glyphicon glyphicon-user\"></i>\n");
      out.write("                                                </span> \n");
      out.write("                                                <input class=\"form-control\" placeholder=\"Usuario\" name=\"usrname\" type=\"text\" autofocus>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\">\n");
      out.write("                                                    <i class=\"glyphicon glyphicon-lock\"></i>\n");
      out.write("                                                </span>\n");
      out.write("                                                <input class=\"form-control\" placeholder=\"Clave\" name=\"pswd\" type=\"password\" value=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"submit\" class=\"btn btn-lg btn-primary btn-block\" value=\"Entrar\">\n");
      out.write("                                        </div>\n");
      out.write("                                    \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </fieldset>\n");
      out.write("                        </form>\n");
      out.write("                    </div>                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</html>\n");
      out.write("\n");
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
