/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo.dao;

import ec.edu.espe.modelo1.PecarCargo;
import ec.edu.espe.modelo1.PecarCargoPK;
import ec.edu.espe.modelo1.PeempEmplea;
import ec.edu.espe.modelo1.XeestEstado;
import ec.edu.espe.modelo1.XeusuUsua;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Marcelo
 */
public class LoginDAO {

    private static LoginDAO instance;

    private LoginDAO() {
    }

    public static LoginDAO getInstance() {
        if (instance == null) {
            instance = new LoginDAO();
        }
        return instance;
    }

    public boolean consultarId(String empleado) {
        boolean veri = false;
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query q = entitymanager.createQuery("SELECT x FROM XeusuUsua x WHERE x.xeestCodigo.xeestCodigo != " + "'I'");
        List<XeusuUsua> result = q.getResultList();
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).getPeempCodigo().equals(empleado)) {
                veri = true;
                break;
            }
        }
        entitymanager.close();
        emfactory.close();
        return veri;
    }

    public XeusuUsua consultarLogin(String codigoEmpleado) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        XeusuUsua usuario = new XeusuUsua();
        usuario = entitymanager.find(XeusuUsua.class, codigoEmpleado);
        // usuario.hashCode();
        return usuario;
    }

    public void modificarClave(String codigo, String clave) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        XeusuUsua usuario = entitymanager.find(XeusuUsua.class, codigo);

        usuario.setXeusuPass(clave);
        usuario.hashCode();

        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();

    }

}
