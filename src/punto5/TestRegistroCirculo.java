/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

import punto5.Circulo;
import punto5.RegistroCirculo;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gustavo maras
 */
public class TestRegistroCirculo {

  
    public void menu() {
          System.out.println("_____________________PUNTO 5 -MARAS GUSTAVO__________________________________________");
      
        RegistroCirculo nuevoRegistro = new RegistroCirculo();
        boolean salir = false;
        int opcion;
        Scanner opcionTeclado = new Scanner(System.in);
        while (!salir) {System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("----------REGISTRO DE CIRCULOS----");
            System.out.println("..........1. Agregar Circulo");
            System.out.println("..........2. Mostrar ");
            System.out.println("..........3. Salir");
            System.out.print("Escribe una de las opciones:: ");
          System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
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
   System.out.println("____________________________________________________________________________");
      
    }

    // TODO code application logic here
}

