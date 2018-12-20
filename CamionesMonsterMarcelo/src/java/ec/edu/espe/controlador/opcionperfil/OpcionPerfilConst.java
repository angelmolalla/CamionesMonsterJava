/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controlador.opcionperfil;

import ec.edu.espe.modelo.dao.OpcionDAO;
import ec.edu.espe.modelo.dao.PerfilDAO;
import ec.edu.espe.modelo.dao.PerfilOpcionDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marcelo
 */
@WebServlet(name = "OpcionPerfilConst", urlPatterns = {"/OpcionPerfilConst"})
public class OpcionPerfilConst extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OpcionPerfilConst</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet OpcionPerfilConst at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getSession().setAttribute("perfiles",PerfilDAO.getInstance().obtenerPerfil());
        request.getSession().setAttribute("opcion",OpcionDAO.getInstance().obtenerOpcion());
        request.getSession().setAttribute("opcionPerfil",PerfilOpcionDAO.getInstance().obtenerPerfilOpcion());  
        request.getRequestDispatcher("seguridades/opcionPerfil.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String perfil = request.getParameter("cmbPerfil");
        String[] izquierda  = request.getParameterValues("from[]");
        String[]  derecha= request.getParameterValues("to[]");
        PerfilOpcionDAO.getInstance().Agregar(derecha, perfil);
         
        request.getSession().setAttribute("perfiles",PerfilDAO.getInstance().obtenerPerfil());
        request.getSession().setAttribute("opcion",OpcionDAO.getInstance().obtenerOpcion());
        request.getSession().setAttribute("opcionPerfil",PerfilOpcionDAO.getInstance().obtenerPerfilOpcion());  
        request.getRequestDispatcher("seguridades/opcionPerfil.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
