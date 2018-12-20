/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controlador.departamento;

import ec.edu.espe.modelo.dao.DepartamentoDAO;
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
@WebServlet(name = "DepartamentoConst", urlPatterns = {"/DepartamentoConst"})
public class DepartamentoConst extends HttpServlet {

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
            out.println("<title>Servlet DepartamentoConst</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DepartamentoConst at " + request.getContextPath() + "</h1>");
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
        
        request.getSession().setAttribute("departamentos", DepartamentoDAO.getInstance().obtenerDepartamento());
        request.getRequestDispatcher("personal/departamento.jsp").forward(request, response);
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
        String descripcion= request.getParameter("txtDescripcion");
        IdRandomicoString ramd= new IdRandomicoString();
          ramd.agregarId(descripcion);
          ramd.generarCodigo();
          ramd.revertirCodigo();
         String codigo=ramd.getCodigo();
        try{

            if(!codigo.equals("")&&!descripcion.equals(""))
             {
             DepartamentoDAO.getInstance().registrarDepartamento(codigo,descripcion);
           
             }
                
        }catch(NumberFormatException e){}
        request.getSession().setAttribute("departamentos", DepartamentoDAO.getInstance().obtenerDepartamento());
        request.getRequestDispatcher("personal/departamento.jsp").forward(request, response);
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
