/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;
import paquete1.Persona;
import paquete2.Prestamo;
/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo{
 
    private String tipoAuto;
    private String marca;
    private Persona garante1;
    private double valorAuto;
    private double valorMensual;
    
    public PrestamoAutomovil( int tiempo, String ciu,
            String tipo, String mark, Persona gara, double valor){
        super(gara, tiempo, ciu);
       tipoAuto = tipo;
       marca = mark;
       garante1 = gara;
       valorAuto = valor;
        
    }
    public void establecerTipoAuto(String c){
        tipoAuto = c;
    }
    public void establecerMarca(String c){
        marca = c;
    }
    public void establecerGarante1(Persona c){
        garante1 = c;
    }
    public void establecerValorAuto(double c){
        valorAuto = c;
    }
    public void calcularValorMensual(){
        valorMensual = valorAuto/tiempoPrestamo;
    }
    
    @Override
    public void establecerCiudad(String c){
        ciudad = c.toLowerCase();
    }
    public String obtenerTipoAuto(){
        return tipoAuto;
    }
    public String obtenerMarca(){
        return marca;
    }
    public Persona obtenerGarante1(){
        return garante1;
    }
    public double obtenerValorAuto(){
        return valorAuto;
    }
    public double obtenerValorMensual(){
        return valorMensual;
    }
    
    @Override
    public String toString(){
      String cadena = String.format("\nDATOS GENERALES\n"
              + "Modelo: %s\n"
              + "Marca: %s\n"
              + "GARANTE\n"
              + "%s\n"
              + "Valor del auto: %.2f\n"
              + "Valor mensual: %.2f\n",
              tipoAuto, marca, garante1, valorAuto,
              obtenerValorMensual());
      return cadena;
    }
}
