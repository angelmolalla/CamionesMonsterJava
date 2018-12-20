/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo.dao;

import ec.edu.espe.modelo1.XeusuUsua;

/**
 *
 * @author Marcelo
 */
public class Usuario {
   static XeusuUsua usaurioString;

    
    
    private static Usuario instance;

    public static XeusuUsua getUsaurioString() {
        return usaurioString;
    }

  

    private Usuario() {
    }

    public static Usuario getInstance(XeusuUsua usuario) {
        if (instance == null) {

           usaurioString=usuario;
            instance = new Usuario();
        }
        return instance;
    } 
    
}
