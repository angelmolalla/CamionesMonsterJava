/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo.dao;

import ec.edu.espe.modelo1.PecarCargo;
import ec.edu.espe.modelo1.XeestEstado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Marcelo
 */
public class EstadoSeguridadesDAO {
        private static EstadoSeguridadesDAO instance;

    private EstadoSeguridadesDAO() {}

    public static EstadoSeguridadesDAO getInstance() {
        if(instance==null) instance = new EstadoSeguridadesDAO();
        return instance;
    } 
    
    
     public List<XeestEstado> obtenerEstado(){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("CamionesMonsterMarceloPU");
        EntityManager entitymanager= emfactory.createEntityManager();
       
        Query q= entitymanager.createQuery("SELECT x FROM XeestEstado x");

        List<XeestEstado> result= q.getResultList();
        entitymanager.close();
        emfactory.close();
        return result;
    } 
}
