/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo.dao;

import ec.edu.espe.modelo1.PecarCargo;
import ec.edu.espe.modelo1.PesexSexo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Marcelo
 */
public class SexoDAO {
       private static SexoDAO instance;

    private SexoDAO() {}

    public static SexoDAO getInstance() {
        if(instance==null) instance = new SexoDAO();
        return instance;
    }
    
    
        public List<PesexSexo> obtenerSexo(){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
        Query q= entitymanager.createQuery("SELECT p FROM PesexSexo p");
           List<PesexSexo> result= q.getResultList();
        entitymanager.close();
        emfactory.close();
        return result;
    } 
}
