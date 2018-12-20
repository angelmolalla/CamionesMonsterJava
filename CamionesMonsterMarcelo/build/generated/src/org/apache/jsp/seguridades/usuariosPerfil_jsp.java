package org.apache.jsp.seguridades;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ec.edu.espe.modelo1.XeperPerfil;
import ec.edu.espe.modelo1.XeuxpUsxper;
import ec.edu.espe.modelo1.XeusuUsua;
import java.util.ArrayList;

public final class usuariosPerfil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=es>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=UTF-8>\n");
      out.write("        <meta name=\"description\" lang=\"en\" content=\"jQuery multiselect plugin with two sides. The user can select one or more items and send them to the other side.\" />\n");
      out.write("        <meta name=\"keywords\" lang=\"en\" content=\"jQuery multiselect plugin\" />\n");
      out.write("\n");
      out.write("        <base href=\"http://crlcu.github.io/multiselect/\" />\n");
      out.write("        <title>Usuario por Perfil</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"https://github.com/favicon.ico\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"lib/google-code-prettify/prettify.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" />\n");
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
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('[data-toggle=tooltip]').tooltip();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            var listaPerfil = document.getElementById(\"listaUsuariosPerfil\").value;\n");
      out.write("            var listaUsuarios = document.getElementById(\"listaUsuarios\").value;\n");
      out.write("            function CambiarPerfil()\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                var v1 = document.getElementById(\"cmbPerfil\");\n");
      out.write("                var valor1 = v1.options[v1.selectedIndex].value;\n");
      out.write("                var text1 = v1.options[v1.selectedIndex].text;\n");
      out.write("\n");
      out.write("                var v1;\n");
      out.write("                var i = 0;\n");
      out.write("                var j = 0;\n");
      out.write("                var veri=0;\n");
      out.write(" \n");
      out.write("                document.getElementById(\"keepRenderingSort\").options.length = 0;//izquierda\n");
      out.write("                document.getElementById(\"keepRenderingSort_to\").options.length = 0;//derecha\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_p_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                i = 0;\n");
      out.write("            ");
      if (_jspx_meth_p_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function CambiarUsuario()\n");
      out.write("            {\n");
      out.write("                listaUsuarios = listaPerfil;\n");
      out.write("                document.getElementsByName(\"Usuarios\").value = listaUsuarios;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script type=text/javascript>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('[data-toggle=tooltip]').tooltip();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\" src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"//cdnjs.cloudflare.com/ajax/libs/prettify/r298/prettify.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"dist/js/multiselect.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            (function (i, s, o, g, r, a, m) {\n");
      out.write("                i['GoogleAnalyticsObject'] = r;\n");
      out.write("                i[r] = i[r] || function () {\n");
      out.write("                    (i[r].q = i[r].q || []).push(arguments)\n");
      out.write("                }, i[r].l = 1 * new Date();\n");
      out.write("                a = s.createElement(o),\n");
      out.write("                        m = s.getElementsByTagName(o)[0];\n");
      out.write("                a.async = 1;\n");
      out.write("                a.src = g;\n");
      out.write("                m.parentNode.insertBefore(a, m)\n");
      out.write("            })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');\n");
      out.write("\n");
      out.write("            ga('create', 'UA-39934286-1', 'github.com');\n");
      out.write("            ga('send', 'pageview');\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                // make code pretty\n");
      out.write("                window.prettyPrint && prettyPrint();\n");
      out.write("\n");
      out.write("                $('#keepRenderingSort').multiselect({\n");
      out.write("                    keepRenderingSort: true\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body background=\"CamionesMonster.jpg\">\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li ><a href=\"Camiones.html\">Camiones</a></li>\n");
      out.write("                    <li><a href=\"Finanzas.html\">Finanzas</a></li>\n");
      out.write("                    <li><a href=\"Mudanzas.html\">Mudanzas</a></li>\n");
      out.write("                    <li><a href=\"Personal.html\">Personal</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"Seguridad.html\">Seguridad</a></li>\n");
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
      out.write("                            <h2>Usuarios Por Perfil</h2>\n");
      out.write("                        </div>\n");
      out.write("                        <form action=\"http://localhost:48823/CamionesMonsterMarcelo/UsuarioPerfilConst\" method=\"post\">           \n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Codigo Perfil</label>\n");
      out.write("                                <SELECT id=\"cmbPerfil\" NAME=\"cmbPerfil\" SIZE=1 class=\"form-control\" onchange='CambiarPerfil()'> \n");
      out.write("                                    ");
      if (_jspx_meth_p_forEach_3(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                                </SELECT> \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Código Departamento</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-5\">\n");
      out.write("                                        <select name=\"from[]\" id=\"keepRenderingSort\" class=\"form-control\" size=\"8\" multiple=\"multiple\">\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-xs-2\">\n");
      out.write("                                        <button type=\"button\" id=\"keepRenderingSort_rightAll\" class=\"btn btn-block\"><i class=\"glyphicon glyphicon-forward\"></i></button>\n");
      out.write("                                        <button type=\"button\" id=\"keepRenderingSort_rightSelected\" class=\"btn btn-block\"><i class=\"glyphicon glyphicon-chevron-right\"></i></button>\n");
      out.write("                                        <button type=\"button\" id=\"keepRenderingSort_leftSelected\" class=\"btn btn-block\"><i class=\"glyphicon glyphicon-chevron-left\"></i></button>\n");
      out.write("                                        <button type=\"button\" id=\"keepRenderingSort_leftAll\" class=\"btn btn-block\"><i class=\"glyphicon glyphicon-backward\"></i></button>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-xs-5\">\n");
      out.write("                                        <select name=\"to[]\"  id=\"keepRenderingSort_to\" class=\"form-control\" size=\"8\" multiple=\"multiple\"></select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-primary\" value=\"Agregar Perfil Opción\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_p_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_p_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_p_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_p_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_p_forEach_0.setParent(null);
    _jspx_th_p_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_p_forEach_0.setVar("u");
    int[] _jspx_push_body_count_p_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_p_forEach_0 = _jspx_th_p_forEach_0.doStartTag();
      if (_jspx_eval_p_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                   veri=0;\n");
          out.write("               if (\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioPerfil.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" == 0)\n");
          out.write("                {\n");
          out.write("                   document.getElementById(\"keepRenderingSort\").options[i] = new Option(\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.xeusuPfirm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\", \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.peempCodigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\");\n");
          out.write("                    i++;\n");
          out.write("                } else\n");
          out.write("                {\n");
          out.write("\n");
          out.write("                ");
          if (_jspx_meth_p_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_p_forEach_0, _jspx_page_context, _jspx_push_body_count_p_forEach_0))
            return true;
          out.write("\n");
          out.write("                    \n");
          out.write("                     if(veri==0)\n");
          out.write("                    {\n");
          out.write("                      document.getElementById(\"keepRenderingSort\").options[i] = new Option(\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.xeusuPfirm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\", \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.peempCodigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\");\n");
          out.write("                        i++;  \n");
          out.write("                        \n");
          out.write("                    }\n");
          out.write("                }\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
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

  private boolean _jspx_meth_p_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_p_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_p_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_p_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_p_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_p_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_p_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_p_forEach_0);
    _jspx_th_p_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioPerfil}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_p_forEach_1.setVar("x");
    int[] _jspx_push_body_count_p_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_p_forEach_1 = _jspx_th_p_forEach_1.doStartTag();
      if (_jspx_eval_p_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                   if (\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.peempCodigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" == \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.xeusuUsua.peempCodigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\")\n");
          out.write("                    {\n");
          out.write("                        veri=1;\n");
          out.write("                    }\n");
          out.write("                   \n");
          out.write("                ");
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
    _jspx_th_p_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioPerfil}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_p_forEach_2.setVar("x");
    int[] _jspx_push_body_count_p_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_p_forEach_2 = _jspx_th_p_forEach_2.doStartTag();
      if (_jspx_eval_p_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                if (\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.xeperPerfil.xeperCodigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" == valor1)\n");
          out.write("                {\n");
          out.write("\n");
          out.write("                    document.getElementById(\"keepRenderingSort_to\").options[i] = new Option(\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.xeusuUsua.xeusuPfirm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\", \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.xeusuUsua.peempCodigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\");\n");
          out.write("                    i++;\n");
          out.write("                }\n");
          out.write("\n");
          out.write("            ");
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
    _jspx_th_p_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfiles}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_p_forEach_3.setVar("x");
    int[] _jspx_push_body_count_p_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_p_forEach_3 = _jspx_th_p_forEach_3.doStartTag();
      if (_jspx_eval_p_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option value=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.xeperCodigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.xeperDesc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
