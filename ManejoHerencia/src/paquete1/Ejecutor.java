/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escoja una opción\n"
                + "1)Prestamo de automóvil\n"
                + "2)Prestamo educativo");
        System.out.print("> ");
        int n = sc.nextInt();

        if (n > 2 || n < 1) {
            System.out.println("Error, número fuera de serie");
        } else {

            sc.nextLine();
            System.out.println("Ingrese su nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese su apellido:");
            String apellido = sc.nextLine();
            System.out.println("Ingrese su usuario:");
            String usuario = sc.nextLine();
            System.out.println("Ingrese cúantos meses desea "
                    + "el prestamo: ");
            int tiempo = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese su ciudad: ");
            String c = sc.nextLine();

            Persona pe = new Persona(nombre, apellido, usuario);
            
            switch (n) {
                case 1:

                    System.out.println("Ingrese el modelo: ");
                    String modelo = sc.nextLine();
                    System.out.println("Ingrese la marca: ");
                    String marca = sc.nextLine();
                    System.out.println("Ingrese el valor del auto: ");
                    double valor = sc.nextDouble();

                    PrestamoAutomovil pr = new PrestamoAutomovil(tiempo, c,
                            modelo, marca, pe, valor);
                    
                    System.out.println(pr);
                    break;
                case 2:
                    System.out.println("Ingrese su nivel de estudio: ");
                    String level = sc.nextLine();
                    System.out.println("Ingrese el nombre de la institución: ");
                    String nIns = sc.nextLine();
                    System.out.println("Ingrese las siglas: ");
                    String sig = sc.nextLine();
                    System.out.println("Ingrese el valor de la carrera: ");
                    double valor1 = sc.nextDouble();
                    
                    InstitucionEducativa ins = new InstitucionEducativa(nIns, sig);
                    
                    PrestamoEducativo pd = new PrestamoEducativo(pe, tiempo, c,
                            ins, valor1);
                    
                    System.out.println(pd);
                    break;
                    
            }
            
        }
    }
}
