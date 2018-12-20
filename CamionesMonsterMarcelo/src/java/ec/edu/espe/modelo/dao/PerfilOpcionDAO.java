/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo.dao;

import ec.edu.espe.modelo1.XeopcOpcion;
import ec.edu.espe.modelo1.XeopeOpeper;
import ec.edu.espe.modelo1.XeopeOpeperPK;
import ec.edu.espe.modelo1.XeperPerfil;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Marcelo
 */
public class PerfilOpcionDAO {
    private static PerfilOpcionDAO instance;

    private PerfilOpcionDAO() {
    }

    public static PerfilOpcionDAO getInstance() {
        if (instance == null) {
            instance = new PerfilOpcionDAO();
        }
        return instance;
    }

    public List<XeopeOpeper> obtenerPerfilOpcion() {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query q = entitymanager.createQuery("SELECT x FROM XeopeOpeper x WHERE x.xeopeEstado='1'");
        List<XeopeOpeper> result = q.getResultList();
        entitymanager.close();
        emfactory.close();
        return result;
    }

    public void Agregar(String[] derecha, String perfil) {
        java.util.Date fechaActual = new Date();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        List<XeopeOpeper> list = obtenerPerfilOpcion();
        if (derecha==null) {
            Iterator<XeopeOpeper> itr = list.iterator();
            while (itr.hasNext()) 
            {
            XeopeOpeper obj = itr.next();
                 if (obj.getXeperPerfil().getXeperCodigo().equals(perfil)) 
                 {
                    XeopeOpeperPK sup1 = new XeopeOpeperPK( obj.getXeperPerfil().getXeperCodigo(),obj.getXeopcOpcion().getXeopcCodigo());
                    XeopeOpeper obj2 = entitymanager.find(XeopeOpeper.class,sup1);
                    entitymanager.remove(obj2);
                }
            }
        } else {
            if(list.size()==0)
            {
            
                for (String opcion : derecha) 
                {
                      XeopeOpeperPK sup1 = new XeopeOpeperPK( perfil,opcion);                
                        XeopeOpeper opcionPerfil = new XeopeOpeper(sup1, fechaActual, "1");
                           entitymanager.persist(opcionPerfil);
                }
            }
            else
            {
             Iterator<XeopeOpeper> itr = list.iterator();
            while (itr.hasNext()){
                XeopeOpeper obj = itr.next();
                for (String opcion : derecha) {
                    if (!opcion.equals(obj.getXeopcOpcion().getXeopcCodigo())) {
                        XeopeOpeperPK sup1 = new XeopeOpeperPK( perfil,opcion);
                      
                        XeopeOpeper opcionPerfil = new XeopeOpeper(sup1, fechaActual, "1");
                          XeopcOpcion opcion1 = entitymanager.find(XeopcOpcion.class,opcion);
                          opcionPerfil.setXeopcOpcion(opcion1);
                          XeperPerfil perfi= entitymanager.find(XeperPerfil.class,perfil);
                          opcionPerfil.setXeperPerfil(perfi);
                          
                         entitymanager.persist(opcionPerfil);
                    }
                }
            }
            }
           
        }
        entitymanager.getTransaction().commit();
                entitymanager.close();
                emfactory.close();
    }
}
