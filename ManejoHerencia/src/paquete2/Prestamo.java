/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Persona;
/**
 *
 * @author reroes
 */
public class Prestamo {
    
    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudad;
    
    public Prestamo(Persona bene, int tiempo, String ciu){
        beneficiario = bene;
        tiempoPrestamo = tiempo;
        ciudad = ciu;
    }
    
    public void establecerBeneficiario(Persona c){
        beneficiario = c;
    }
    public void establecerTiempoPrestamo(int c){
        tiempoPrestamo = c;
    }
    public void establecerCiudad(String c){
        ciudad = c;
    }
    public Persona obtenerBeneficiario(){
        return beneficiario;
    }
    public int obtenerTiempoPrestamo(){
        return tiempoPrestamo;
    }
    public String obtenerCiudad(){
        return ciudad;
    }
}
