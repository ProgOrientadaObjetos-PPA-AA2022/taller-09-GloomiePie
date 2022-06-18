/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Usuario
 */
public class InstitucionEducativa {
    
    private String nombre;
    private String siglas;
    
    public InstitucionEducativa(String nom, String s){
        nombre = nom;
        siglas = s;
    }
    
     public void establecerNombre(String c){
        nombre = c;
    }
     public void establecerSiglas(String c){
         siglas = c;
     }
      public String obtenerNombre(){
        return nombre;
    }
      public String obtenerSiglas(){
          return siglas;
    }
    @Override
    public String toString(){
      String cadena = String.format(" Nombre de la institución: %s\n"
              + " Siglas: %s", nombre, siglas);  
      return cadena;
    }
}
