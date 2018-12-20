/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo.dao;

import ec.edu.espe.modelo1.XeperPerfil;
import ec.edu.espe.modelo1.XeusuUsua;
import ec.edu.espe.modelo1.XeuxpUsxper;
import ec.edu.espe.modelo1.XeuxpUsxperPK;
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
public class UsuarioPerfilDAO {

    private static UsuarioPerfilDAO instance;

    private UsuarioPerfilDAO() {
    }

    public static UsuarioPerfilDAO getInstance() {
        if (instance == null) {
            instance = new UsuarioPerfilDAO();
        }
        return instance;
    }

    public List<XeuxpUsxper> obtenerPerfilUsuario() {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query q = entitymanager.createQuery("SELECT x FROM XeuxpUsxper x");
        List<XeuxpUsxper> result = q.getResultList();
        entitymanager.close();
        emfactory.close();
        return result;
    }

    public void Agregar(String[] derecha, String perfil) {
        String[]aa= derecha;
        java.util.Date fechaActual = new Date();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        List<XeuxpUsxper> list = obtenerPerfilUsuario();
        if (derecha==null) {
            
            Iterator<XeuxpUsxper> itr = list.iterator();
            while (itr.hasNext()) 
            {
            XeuxpUsxper obj = itr.next();
                 if (obj.getXeperPerfil().getXeperCodigo().equals(perfil)) 
                 {
                     XeuxpUsxperPK sup1 = new XeuxpUsxperPK( obj.getXeusuUsua().getPeempCodigo(),obj.getXeperPerfil().getXeperCodigo());
                     
               XeuxpUsxper obj2 = entitymanager.find(XeuxpUsxper.class,sup1);
                    entitymanager.remove(obj2);
                }
            }
        } else {
            if(list.size()==0)
            {
            
                for (String usuario : derecha) 
                {
                      XeuxpUsxperPK sup1 = new XeuxpUsxperPK( usuario,perfil);                
                        XeuxpUsxper perfilUsuario = new XeuxpUsxper(sup1, fechaActual, fechaActual);
                           entitymanager.persist(perfilUsuario);
                }
            }
            else
            {
             Iterator<XeuxpUsxper> itr = list.iterator();
            while (itr.hasNext()){
                XeuxpUsxper obj = itr.next();
                for (String usuario : derecha) {
                    if (!usuario.equals(obj.getXeusuUsua().getPeempCodigo())) {
                        XeuxpUsxperPK sup1 = new XeuxpUsxperPK( usuario,perfil);
                      
                        XeuxpUsxper perfilUsuario = new XeuxpUsxper(sup1, fechaActual, fechaActual);
                          XeusuUsua usuario1 = entitymanager.find(XeusuUsua.class,usuario);
                          perfilUsuario.setXeusuUsua(usuario1);
                          XeperPerfil perfi= entitymanager.find(XeperPerfil.class,perfil);
                          perfilUsuario.setXeperPerfil(perfi);
                          
                         entitymanager.persist(perfilUsuario);
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
