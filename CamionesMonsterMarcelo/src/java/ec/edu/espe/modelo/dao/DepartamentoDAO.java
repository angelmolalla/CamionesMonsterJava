package ec.edu.espe.modelo.dao;

import ec.edu.espe.modelo1.PedepDepart;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo
 */
public class DepartamentoDAO {
    private static DepartamentoDAO instance;

    private DepartamentoDAO() {}

    public static DepartamentoDAO getInstance() {
        if(instance==null) instance = new DepartamentoDAO();
        return instance;
    }
     
    
     public List<PedepDepart> obtenerDepartamento(){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        Query q= entitymanager.createQuery("SELECT p FROM PedepDepart p");
        List<PedepDepart> result= q.getResultList();
        entitymanager.close();
        emfactory.close();
        return result;
    } 
     
      public void registrarDepartamento (String codigo, String descripcion){        
        PedepDepart departamento=new PedepDepart(codigo, descripcion);
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        entitymanager.persist(departamento);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
     
     
       public void editarDepartamento(String codigo, String descripcion){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        PedepDepart departamento = entitymanager.find(PedepDepart.class,codigo);
        departamento.setPedepDesc(descripcion);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
     
         public void eliminarDepartamento(String codigo){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
         PedepDepart departamento = entitymanager.find(PedepDepart.class,codigo);
        entitymanager.remove(departamento);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
    
}
