/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto_05.test;

import Punto_05.dominio.RegistroCirculo;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class TestRegistroCirculo {
    public static void main(String[] args) {
        RegistroCirculo nuevoRegistro = new RegistroCirculo();
        boolean salir = false;
        int opcion;
        Scanner opcionTeclado = new Scanner(System.in);
        while (!salir) {
            System.out.println("---REGISTRO DE CIRCULOS----");
            System.out.println("1. agregar Circulo");
            System.out.println("2. mostrar ");
            System.out.println("3. Salir");
            System.out.println("Escribe una de las opciones");

            opcion = opcionTeclado.nextInt();
            switch (opcion) {

                case 1:
                    nuevoRegistro.cargarRegistro();
                    break;
                case 2:
                    nuevoRegistro.mostrarRegistros();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("opcion entre 1 y 3");
            }

        }
    }
}
