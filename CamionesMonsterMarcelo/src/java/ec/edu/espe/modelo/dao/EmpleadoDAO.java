/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo.dao;

import ec.edu.espe.modelo1.MeviaViaje;
import ec.edu.espe.modelo1.PecarCargo;
import ec.edu.espe.modelo1.PecarCargoPK;
import ec.edu.espe.modelo1.PeempEmplea;
import ec.edu.espe.modelo1.PeescEstciv;
import ec.edu.espe.modelo1.PesexSexo;
import ec.edu.espe.modelo1.XeopcOpcion;
import ec.edu.espe.modelo1.XeusuUsua;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Marcelo
 */
public class EmpleadoDAO {

    private static EmpleadoDAO instance;

    private EmpleadoDAO() {
    }

    public static EmpleadoDAO getInstance() {
        if (instance == null) {
            instance = new EmpleadoDAO();
        }
        return instance;
    }

    public List<PeempEmplea> obtenerEmpleado() {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query q = entitymanager.createQuery("SELECT p FROM PeempEmplea p WHERE p.peempEstado != 0");
        List<PeempEmplea> result = q.getResultList();
        entitymanager.close();
        emfactory.close();
        return result;
    }

    public List<PeempEmplea> obtenerEmpleadoList() {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query q = entitymanager.createQuery("SELECT p FROM PeempEmplea p WHERE p.peempEstado != 0");
        Query q1 = entitymanager.createQuery("SELECT x FROM XeusuUsua x WHERE x.xeestCodigo.xeestCodigo != " + "'I'");
        List<XeusuUsua> resultUsuario = q1.getResultList();
        List<PeempEmplea> resultEmpleado = q.getResultList();
        
        List<PeempEmplea> resultEmpleadoFinal = new ArrayList<PeempEmplea>();

        int verificacion = 0;
        for (int i = 0; i < resultEmpleado.size(); i++) {
            verificacion = 0;
            for (int j = 0; j < resultUsuario.size(); j++) {
                if (resultUsuario.get(j).getPeempCodigo().equals(resultEmpleado.get(i).getPeempCodigo())) {
                    verificacion = 1;
                }
            }

            if (verificacion == 0) {
                resultEmpleadoFinal.add(resultEmpleado.get(i));
            }
        }
        entitymanager.close();
        emfactory.close();
        return resultEmpleadoFinal;
    }

    public void registrarEmpleado(String codigoEmpleado, String codigoSexo, String codigoestadoCivil, String codigoCargo, String codigoDepartamento, String nombre, String apellido, String cedula, String pasaporte, String ruc, Date fechaNacimiento, Date fechaIngreso, String discapacidad, short cargas, String telefono, String correo, String direccion) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        PecarCargoPK id = new PecarCargoPK(codigoCargo, codigoDepartamento);
        PecarCargo cargo = entitymanager.find(PecarCargo.class, id);
        PesexSexo sexo = entitymanager.find(PesexSexo.class, codigoSexo);
        PeescEstciv estadoCivil = entitymanager.find(PeescEstciv.class, codigoestadoCivil);

        PeempEmplea empleado = new PeempEmplea(codigoEmpleado, sexo, estadoCivil, cargo, nombre, apellido, cedula, pasaporte, ruc, fechaNacimiento, fechaIngreso, discapacidad, cargas, telefono, correo, direccion);
        empleado.setPeempEstado(1);
        entitymanager.persist(empleado);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }

    public void editarEmpleado(String codigoEmpleado, String codigoSexo, String codigoestadoCivil, String codigoCargo, String codigoDepartamento, String nombre, String apellido, String cedula, String pasaporte, String ruc, Date fechaNacimiento, Date fechaIngreso, Date fechaSalida, String discapacidad, short cargas, String telefono, String correo, String direccion) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        PecarCargoPK id = new PecarCargoPK(codigoCargo, codigoDepartamento);

        PecarCargo cargo = entitymanager.find(PecarCargo.class, id);
        PesexSexo sexo = entitymanager.find(PesexSexo.class, codigoSexo);
        PeescEstciv estadoCivil = entitymanager.find(PeescEstciv.class, codigoestadoCivil);

        PeempEmplea empleado = entitymanager.find(PeempEmplea.class, codigoEmpleado);

        empleado.setPesexCodigo(sexo);
        empleado.setPeescCodigo(estadoCivil);
        empleado.setPecarCargo(cargo);
        empleado.setPeempNombre(nombre);
        empleado.setPeempApelli(apellido);
        empleado.setPeempCedula(cedula);
        empleado.setPeempPaspr(pasaporte);
        empleado.setPeempRuc(ruc);
        if (fechaNacimiento != null) {
            empleado.setPeempFenac(fechaNacimiento);
        }
        if (fechaIngreso != null) {
            empleado.setPeempFeing(fechaIngreso);
        }
        if (fechaSalida != null) {
            empleado.setPeempFesal(fechaSalida);
        }

        empleado.setPeempDiscap(discapacidad);
        empleado.setPeempCarfam(cargas);
        empleado.setPeempTelef(telefono);
        empleado.setPeempEmail(correo);
        empleado.setPeempDirec(direccion);

        entitymanager.persist(empleado);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }

    public void eliminarEmpleado(String codigoEmpleado) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        PeempEmplea empleado = entitymanager.find(PeempEmplea.class, codigoEmpleado);
        empleado.setPeempEstado(0);

        entitymanager.persist(empleado);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
}
