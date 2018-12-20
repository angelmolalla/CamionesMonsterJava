/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controlador.login;

import ec.edu.espe.modelo.dao.LoginDAO;
import ec.edu.espe.modelo.dao.PerfilDAO;
import ec.edu.espe.modelo.dao.Usuario;
import ec.edu.espe.modelo.dao.UsuarioDAO;
import ec.edu.espe.modelo1.XeusuUsua;
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
@WebServlet(name = "LoginMod", urlPatterns = {"/LoginMod"})
public class LoginMod extends HttpServlet {

    String pass = "";

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
            out.println("<title>Servlet LoginMod</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginMod at " + request.getContextPath() + "</h1>");
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
        XeusuUsua usu = Usuario.getUsaurioString();
        String codigoVeri = request.getParameter("txtContraVeri");
        pass = codigoVeri;
        this.hashCode();
        if (pass.equals(usu.getXeusuPass())) {
            String contraNueva = request.getParameter("txtContra");
            String contraVerificacion = request.getParameter("txtContra1");
            if (contraNueva.equals(contraVerificacion)) {
                LoginDAO.getInstance().modificarClave(usu.getPeempCodigo(), contraNueva);
            } else {
                request.getRequestDispatcher("seguridades/cambiar_clave_error.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("seguridades/cambiar_clave_error.jsp").forward(request, response);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + pass.hashCode();
        pass = Integer.toString(hash);
        return hash;
    }

}
