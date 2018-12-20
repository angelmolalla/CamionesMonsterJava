/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo.dao;

import ec.edu.espe.modelo1.XeopcOpcion;
import ec.edu.espe.modelo1.XeperPerfil;
import ec.edu.espe.modelo1.XesisSistem;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Marcelo
 */
public class PerfilDAO {
     private static  PerfilDAO instance;
     
        private  PerfilDAO () {}

    public static  PerfilDAO getInstance() {
        if(instance==null) instance = new  PerfilDAO();
        return instance;
    }
    
      public List<XeperPerfil> obtenerPerfil(){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        Query q= entitymanager.createQuery("SELECT x FROM XeperPerfil x");
        List<XeperPerfil> result= q.getResultList();
        entitymanager.close();
        emfactory.close();
        return result;
    }
      
      
       public void registrarPerfil (String codigo, String descripcion, String observacion){ 
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
       
        XeperPerfil perfil=new XeperPerfil(codigo, descripcion,observacion);
        entitymanager.getTransaction().begin();
        entitymanager.persist(perfil);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
       
          public void editarPerfil(String codigo, String descripcion,String observacion){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        XeperPerfil perfil = entitymanager.find(XeperPerfil.class,codigo);
        perfil.setXeperDesc(descripcion);
        perfil.setXeperObser(observacion);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
     
         public void eliminarPerfil(String codigo){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
       XeperPerfil perfil = entitymanager.find(XeperPerfil.class,codigo);
        entitymanager.remove(perfil);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
    
          
      
}
