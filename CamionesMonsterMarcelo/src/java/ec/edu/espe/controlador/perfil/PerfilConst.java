/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controlador.perfil;

import ec.edu.espe.modelo.dao.CargoDAO;
import ec.edu.espe.modelo.dao.PerfilDAO;
import ec.edu.espe.util.IdRandomicoString;
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
@WebServlet(name = "PerfilConst", urlPatterns = {"/PerfilConst"})
public class PerfilConst extends HttpServlet {

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
            out.println("<title>Servlet PerfilConst</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PerfilConst at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("seguridades/perfil.jsp").forward(request, response);
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
      String codigo="";
        String descripcion= request.getParameter("txtDescripcion");
         String observacion= request.getParameter("txtObservacion");
        IdRandomicoString ramd= new IdRandomicoString();
          ramd.agregarId(descripcion);
          ramd.generarCodigo();
          ramd.revertirCodigo();
        codigo=ramd.getCodigo();
     
        try{
             if(!codigo.equals("")&&!descripcion.equals("")&&!observacion.equals(""))
                PerfilDAO.getInstance().registrarPerfil(codigo, descripcion, observacion);
        }catch(NumberFormatException e){}
        request.getSession().setAttribute("perfiles",PerfilDAO.getInstance().obtenerPerfil());
        request.getRequestDispatcher("seguridades/perfil.jsp").forward(request, response);
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
