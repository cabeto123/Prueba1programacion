/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba.pkg1.progra;

import java.util.Scanner;

/**
 *
 * @author carlosmoncada
 */
public class Prueba1Progra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        int contopc = 0, opcion = 0;
        System.out.println("1. Repetir mi nombre");
        System.out.println("2) Submenu de mensaje");
        System.out.println("3) Salir");
        System.out.println("Opcion: ");
        opcion = entrada.nextInt();
        contopc++;
        while (opcion < 1 || opcion > 3) {
            System.out.println("Opcion invalida: ");
            System.out.println("Digite su opcion: ");
            opcion = entrada.nextInt();
        }
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    String nombre = "";
                    System.out.println("Escogio repetir mi nombre: ");
                    System.out.println("Digite su nombre: ");
                    nombre = entrada.nextLine();
                    nombre = entrada.nextLine();//por el error de el nextInt()
                    System.out.println("Digite cuantas veces quiere que se repita");
                    int repeticion = entrada.nextInt();
                    while (repeticion < 0) {
                        System.out.println("Digito un dato incorrecto");
                        System.out.println("Digite cuantas veces quiere que se repita");
                        repeticion = entrada.nextInt();
                    }//verificacion si el numero es negativo
                    for (int i = 1; i <= repeticion; i++) {
                        System.out.println("Hola mi nombre es " + nombre + " y miren mi prueba");
                    }
                    System.out.println("1. Repetir mi nombre");
                    System.out.println("2) Submenu de mensaje");
                    System.out.println("3) Salir");
                    System.out.println("Opcion: ");
                    opcion = entrada.nextInt();
                    contopc++;
                    while (opcion < 1 || opcion > 3) {
                        System.out.println("Opcion invalida: ");
                        System.out.println("Digite su opcion: ");
                        opcion = entrada.nextInt();
                    }

                    break;

                case 2:
                    System.out.println("Bienvenido a el segundo ejercicio");
                    System.out.println("1)Bienvenida");
                    System.out.println("2)Despedida");
                    System.out.println("3)Salir");
                    System.out.println("Opcion: ");
                    int opcionejer2 = entrada.nextInt();
                    while (opcionejer2 != 3) {
                        switch (opcionejer2) {
                            case 1:
                                System.out.println("Hola que onda ");
                                System.out.println("1)Bienvenida");
                                System.out.println("2)Despedida");
                                System.out.println("3)Salir");
                                System.out.println("Opcion: ");
                                opcionejer2 = entrada.nextInt();

                                while (opcionejer2 < 1 || opcionejer2 > 3) {
                                    System.out.println("Opcion invalida: ");
                                    System.out.println("Digite su opcion: ");
                                    opcionejer2 = entrada.nextInt();

                                }
                                break;
                            case 2:
                                System.out.println("Hasta luego gracias por usar mi programa");
                                System.out.println("1)Bienvenida");
                                System.out.println("2)Despedida");
                                System.out.println("3)Salir");
                                System.out.println("Opcion: ");
                                opcionejer2 = entrada.nextInt();

                                while (opcionejer2 < 1 || opcionejer2 > 3) {
                                    System.out.println("Opcion invalida: ");
                                    System.out.println("Digite su opcion: ");
                                    opcionejer2 = entrada.nextInt();

                                }

                        }//fin del switch del ejercicio 2
                    }//fin del while ejercicio 2
                    System.out.println("1. Repetir mi nombre");
                    System.out.println("2) Submenu de mensaje");
                    System.out.println("3) Salir");
                    System.out.println("Opcion: ");
                    opcion = entrada.nextInt();
                    contopc++;
                    while (opcion < 1 || opcion > 3) {
                        System.out.println("Opcion invalida: ");
                        System.out.println("Digite su opcion: ");
                        opcion = entrada.nextInt();
                    }
                    break;
                    
                case 3:System.out.println("Adios");
                       System.out.println("Esta es la cantidad de veces que se repitio el menu: "+contopc);
                       opcion=4;
            }//fin del switch
            

        }//fin del while grande
        ;  
    }
    
}
