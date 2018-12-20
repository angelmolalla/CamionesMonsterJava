/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controlador.empleado;

import ec.edu.espe.modelo.dao.CargoDAO;
import ec.edu.espe.modelo.dao.EmpleadoDAO;
import ec.edu.espe.util.IdRandomicoString;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marcelo
 */
@WebServlet(name = "EmpleadoMod", urlPatterns = {"/EmpleadoMod"})
public class EmpleadoMod extends HttpServlet {

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
            out.println("<title>Servlet EmpleadoMod</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EmpleadoMod at " + request.getContextPath() + "</h1>");
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
        String id = request.getParameter("id");
        EmpleadoDAO.getInstance().eliminarEmpleado(id);
        
        request.getSession().setAttribute("empleados", EmpleadoDAO.getInstance().obtenerEmpleado());
        request.getRequestDispatcher("personal/empleado.jsp").forward(request, response);
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
        String codigoEmpleado = request.getParameter("txtIdEmpleado");
        String sexo = request.getParameter("cmbSexo");
        String estadoCivil = request.getParameter("cmbEstadoCivil");
        String cargo = request.getParameter("cmbCargo");
        String cargoDepartamento = request.getParameter("cmbCargoDepartamento");
        String nombre = request.getParameter("txtNombre");
        String apellido = request.getParameter("txtApellido");
        String cedula = request.getParameter("txtCedula");
        String passaporte = request.getParameter("txtPassaporte");
        String rucEmpleado = request.getParameter("txtRuc");
        String fechaNacimiento = request.getParameter("txtDateNacimiento");
        String fechaIngreso = request.getParameter("txtDateIngreso");
        String fechaSalida = request.getParameter("txtDateSalida");
        String discapacidad = request.getParameter("txtDiscapacidad");
        String cargasFamiliares = request.getParameter("txtCargas");
        String telefono = request.getParameter("txtTelfono");
        String email = request.getParameter("txtCorreo");
        String direccion = request.getParameter("txtDire");
        short cargas;
        try {
            if (isNumeric(cargasFamiliares) == true) {
                cargas = Short.parseShort(cargasFamiliares);

            } else {
                cargas = 0;
            }

            if (sexo != null && estadoCivil != null && cargo != null && cargoDepartamento != null && nombre != null && apellido != null && cedula != null) {

                Date dateNacimiento= convertiFecha(fechaNacimiento);
                Date dateIngreso= convertiFecha(fechaIngreso);    
                Date dateSalida = convertiFecha(fechaSalida);    

                DateFormat formatter = new SimpleDateFormat("dd-mm-yy");

                EmpleadoDAO.getInstance().editarEmpleado(codigoEmpleado, sexo, estadoCivil, cargo, cargoDepartamento, nombre, apellido, cedula, passaporte, rucEmpleado, dateNacimiento, dateIngreso, dateSalida, discapacidad, cargas, telefono, email, direccion);

            } else {

            }
        } catch (NumberFormatException e) {
                request.getSession().setAttribute("empleados", EmpleadoDAO.getInstance().obtenerEmpleado());
        request.getRequestDispatcher("personal/empleado.jsp").forward(request, response);
        }
            request.getSession().setAttribute("empleados", EmpleadoDAO.getInstance().obtenerEmpleado());
        request.getRequestDispatcher("personal/empleado.jsp").forward(request, response);
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

    private boolean isNumeric(String cargasFamiliares) {
        try {
            Short.parseShort(cargasFamiliares);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    private Date convertiFecha(String fechaActual) {
        Date dateN;
        DateFormat formatter = new SimpleDateFormat("dd-mm-yy");
        try {
            dateN = formatter.parse(fechaActual);
        } catch (ParseException ex) {
            dateN = null; 
        }
        return  dateN;
    }
}
