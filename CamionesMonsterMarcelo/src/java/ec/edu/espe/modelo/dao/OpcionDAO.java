/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo.dao;

import ec.edu.espe.modelo1.PedepDepart;
import ec.edu.espe.modelo1.XeopcOpcion;
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
public class OpcionDAO {
     private static  OpcionDAO  instance;

    private  OpcionDAO () {}

    public static  OpcionDAO  getInstance() {
        if(instance==null) instance = new  OpcionDAO();
        return instance;
    }
    
     public List<XeopcOpcion> obtenerOpcion(){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        Query q= entitymanager.createQuery("SELECT x FROM XeopcOpcion x");
        List<XeopcOpcion> result= q.getResultList();
        entitymanager.close();
        emfactory.close();
        return result;
    }
     
       public void registrarOpcion (String codigo, String descripcion, String codigoSistema){ 
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
         XesisSistem Sistema = entitymanager.find(XesisSistem.class,codigoSistema);
        XeopcOpcion opcion=new XeopcOpcion(codigo, descripcion,Sistema);
        entitymanager.getTransaction().begin();
        entitymanager.persist(opcion);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
       
       
       public void editarOpcion(String codigo, String descripcion,String codigoSistema){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
         XesisSistem Sistema = entitymanager.find(XesisSistem.class,codigoSistema);
          XeopcOpcion opcion = entitymanager.find(XeopcOpcion.class,codigo);
        opcion.setXesisCodigo(Sistema);
        opcion.setXeopcDesc(descripcion);
        
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
       
       
    public void eliminarOpcion(String codigo){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        XeopcOpcion opcion = entitymanager.find(XeopcOpcion.class,codigo);
        entitymanager.remove(opcion);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
    
}
