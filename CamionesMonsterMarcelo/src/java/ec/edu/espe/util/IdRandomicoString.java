/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.util;

import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class IdRandomicoString {
    String codigo=" ";
    ArrayList<String> ListaCodigo = new ArrayList<String>();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<String> getListaCodigo() {
        return ListaCodigo;
    }

    public void setListaCodigo(ArrayList<String> ListaCodigo) {
        this.ListaCodigo = ListaCodigo;
    }

   
    public void generarCodigo() {
        //ciclo de los id cada id se separa con "_"
        for (int i = 0; i < ListaCodigo.size(); i++) {
            String[] list = ListaCodigo.get(i).split(" ");
        //ciclo de separa cada palabra 
            for (int j = 0; j < list.length; j++) {
                if (list[j] != null) {
                    char[] cadena = list[j].toCharArray();
                    if (cadena.length > 0) {
                        //ciclo de separar cada letra
                        for (int m = 0; m < cadena.length; m++) {
                            char a = cadena[m];
                            String cadena1 = Character.toString(a);
                            if ((Character.isUpperCase(a))||(Character.isDigit(a))) {
                                agregarLetra(cadena1);
                            }
                        }
                    }

                }

            }
            if ((ListaCodigo.size() != 1) && (i != ListaCodigo.size() - 1)) {
                if (i % 2 == 0) {
                    agregarLetra("_");
                }
            }

        }

    }
    public void agregarId(String cad)
    {
    ListaCodigo.add(cad);
    }
    
    public void agregarLetra(String cadena)
    {
        
        for (int i = 0; i < codigo.length(); i++) {
        cadena += codigo.charAt(i) + (((i+1)%3 == 0) ? " " : "");   
        }
        this.setCodigo(cadena);
    }
    
    public void revertirCodigo()
    {
   this.setCodigo(codigo.replace(" ",""));
    StringBuilder builder=new StringBuilder(codigo);
    String CodigoInvertido=builder.reverse().toString();
    
        this.setCodigo( CodigoInvertido);
    }
    
    }
    

