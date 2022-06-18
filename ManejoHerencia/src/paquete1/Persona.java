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
public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected String username;
    
    public Persona(String nom, String ape, String user){
        nombre = nom;
        apellido = ape;
        username = user;
    }
    public void establecerNombre(String c){
        nombre = c;
    }
    public void establecerApellido(String c){
        apellido = c;
    }
    public void establecerUsername(String c){
        username = c;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public String obtenerUsername(){
        return username;
    }
    @Override
    public String toString(){
      String cadena = String.format(" Nombre: %s\n"
              + " Apellido: %s\n"
              + " Username: %s", 
              nombre, apellido, username);
      return cadena;
    }
}
