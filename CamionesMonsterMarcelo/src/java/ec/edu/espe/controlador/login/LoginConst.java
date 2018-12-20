/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controlador.login;

import ec.edu.espe.modelo.dao.CargoDAO;
import ec.edu.espe.modelo.dao.LoginDAO;
import ec.edu.espe.modelo.dao.Usuario;
import ec.edu.espe.modelo.dao.UsuarioDAO;
import ec.edu.espe.modelo1.XeusuUsua;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Marcelo
 */
@WebServlet(name = "LoginConst", urlPatterns = {"/LoginConst"})
public class LoginConst extends HttpServlet {
    String pass="";

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
            out.println("<title>Servlet LoginConst</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginConst at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
         String username = request.getParameter("usrname");
        String password = request.getParameter("pswd");
        pass=password;
        this.hashCode();
         XeusuUsua usuario=LoginDAO.getInstance().consultarLogin(username);
            
        if (usuario.equals(null)) {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/indexError.jsp");
            PrintWriter out = response.getWriter();
            rd.include(request, response);
            return;
        } 
        else if(usuario.getXeusuPass().equals(pass))
        {
             HttpSession oldSession = request.getSession(false);
            if (oldSession != null) {
                oldSession.invalidate();
            }
            //generate a new session
            HttpSession newSession = request.getSession(true);

            //setting session to expiry in 5 mins
            newSession.setMaxInactiveInterval(5*60);

            Cookie message = new Cookie("message", "Welcome");
            response.addCookie(message);
            response.sendRedirect("Personal.jsp");
            
             Usuario.getInstance(UsuarioDAO.getInstance().regresarUsuario(username));
            return;
        }
        
        else{
          
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/indexError.jsp");
            PrintWriter out = response.getWriter();
            rd.include(request, response);
            return;
        }
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

    @Override
    public int hashCode() {
        int hash = 1;
       hash = hash * 31 + pass.hashCode();
        pass=Integer.toString(hash);
        return hash;
    }
    
}
