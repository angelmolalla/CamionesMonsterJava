/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo.dao;

import ec.edu.espe.modelo1.PeempEmplea;
import ec.edu.espe.modelo1.XeestEstado;
import ec.edu.espe.modelo1.XeperPerfil;
import ec.edu.espe.modelo1.XeusuUsua;
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
public class UsuarioDAO {

    private static UsuarioDAO instance;

    private UsuarioDAO() {
    }

    public static UsuarioDAO getInstance() {
        if (instance == null) {
            instance = new UsuarioDAO();
        }
        return instance;
    }

    public List<XeusuUsua> obtenerUsuario() {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query q = entitymanager.createQuery("SELECT x FROM XeusuUsua x WHERE x.xeestCodigo.xeestCodigo != "+"'I'");
        List<XeusuUsua> result = q.getResultList();
        entitymanager.close();
        emfactory.close();
        return result;
    }
    
    public XeusuUsua regresarUsuario(String codigo)
    {
       EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        XeusuUsua usuario = entitymanager.find(XeusuUsua.class, codigo);

        entitymanager.getTransaction().begin();
        entitymanager.persist(usuario);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
        return usuario;
    }

    public void registrarUsuario(String codigoEmpleado, String codigoEstado, String password, String firma, Date creacion, Date cambio) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        PeempEmplea empleado = entitymanager.find(PeempEmplea.class, codigoEmpleado);
        XeestEstado estado = entitymanager.find(XeestEstado.class, codigoEstado);
        XeusuUsua usuario = new XeusuUsua(codigoEmpleado, empleado, estado, password, firma, creacion, cambio);
        usuario.hashCode();
        entitymanager.getTransaction().begin();
        entitymanager.persist(usuario);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }

public void editarUsuario(String codigoEmpleado, String codigoEstado, String password, String firma, Date cambio) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        XeusuUsua usuario = entitymanager.find(XeusuUsua.class, codigoEmpleado);

        PeempEmplea empleado = entitymanager.find(PeempEmplea.class, codigoEmpleado);
        XeestEstado estado = entitymanager.find(XeestEstado.class, codigoEstado);
        usuario.setPeempEmplea(empleado);
        usuario.setXeestCodigo(estado);
        usuario.setXeusuPass(password);
        usuario.setXeusuPfirm(firma);
       
        usuario.setXeusuFeucam(cambio);
        usuario.hashCode();
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
    
    public void eliminarUsuario(String codigo)
    {
         EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
      XeusuUsua usuario = entitymanager.find(XeusuUsua.class,codigo);
         XeestEstado estado = entitymanager.find(XeestEstado.class, "I");
         usuario.setXeestCodigo(estado);
         
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }

}
