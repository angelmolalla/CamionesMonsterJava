/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo.dao;

import ec.edu.espe.modelo1.PecarCargo;
import ec.edu.espe.modelo1.PecarCargoPK;
import ec.edu.espe.modelo1.PedepDepart;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Marcelo
 */
public class CargoDAO {
      private static CargoDAO instance;

    private CargoDAO() {}

    public static CargoDAO getInstance() {
        if(instance==null) instance = new CargoDAO();
        return instance;
    }
    
    
       public List<PecarCargo> obtenerCargo(){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
       
        Query q= entitymanager.createQuery("SELECT p FROM PecarCargo p");

       
        List<PecarCargo> result= q.getResultList();
        entitymanager.close();
        emfactory.close();
        return result;
    } 
       
         public void registrarCargo(String codigo,String departamento, String descripcion){        
       PecarCargoPK id= new PecarCargoPK(codigo,departamento);    
        PecarCargo cargo = new PecarCargo(id,descripcion);
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        entitymanager.getTransaction().begin(); 
        entitymanager.persist(cargo);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
         
            public void editarCargo(String codigo,String departamento, String descripcion){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
         PecarCargoPK id= new PecarCargoPK(codigo,departamento);    
        if(!codigo.equals("")||!departamento.equals("")){
            PecarCargo cargo = entitymanager.find(PecarCargo.class,id);
            cargo.setPecarDesc(descripcion);
        }
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
            
       public void eliminarCargo(String codigo,String departamento){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
         PecarCargoPK id= new PecarCargoPK(codigo,departamento);    
         PecarCargo cargo = entitymanager.find(PecarCargo.class,id);
         entitymanager.remove(cargo);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
}
