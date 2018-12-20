/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo.dao;


import ec.edu.espe.modelo1.PeescEstciv;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Marcelo
 */
public class EstadoCivilDAO {
 private static EstadoCivilDAO instance;

    private EstadoCivilDAO() {}

    public static EstadoCivilDAO getInstance() {
        if(instance==null) instance = new EstadoCivilDAO();
        return instance;
    }
    
     public List<PeescEstciv> obtenerEstadoCivil(){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        Query q= entitymanager.createQuery("SELECT p FROM PeescEstciv p");
           List<PeescEstciv> result= q.getResultList();
        entitymanager.close();
        emfactory.close();
        return result;
    } 
    
}
