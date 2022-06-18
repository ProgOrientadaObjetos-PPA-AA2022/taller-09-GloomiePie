/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete1.InstitucionEducativa;
import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(Persona bene, int tiempo, String ciu,
            InstitucionEducativa centro, double vCarrera) {
        super(bene, tiempo, ciu);
        centroEducativo = centro;
        valorCarrera = vCarrera;
    }

    public void establecerNivelEstudio(String c) {
        nivelEstudio = c;
    }

    public void establecerCentroEducativo(InstitucionEducativa c) {
        centroEducativo = c;
    }

    public void establecerValorCarrera(double c) {
        valorCarrera = c;
    }

    public void calcularValorMensual() {
        valorMensual = (valorCarrera / tiempoPrestamo)
                - 0.10 * (valorCarrera / tiempoPrestamo);
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenervalormensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nDATOS GENERALES\n"
                + "Nivel de estudio: %s\n"
                + "CENTRO EDUCATIVO\n"
                + "%s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual: %.2f\n",
                nivelEstudio, centroEducativo, valorCarrera, valorMensual);
        return cadena;
    }
}
