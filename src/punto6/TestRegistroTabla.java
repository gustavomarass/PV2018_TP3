/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6;

import punto6.RegistroTabla;
import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class TestRegistroTabla {

  
    public void menu() {
          System.out.println("____________________PUNTO 6 -MARAS GUSTAVO__________________________");
      
        RegistroTabla miTabla = new RegistroTabla();
        boolean salir = false;
        int opcion;
        Scanner opcionTeclado = new Scanner(System.in);
        while (!salir) {
            System.out.println("--------------TABLA RECTANGULO-----------");
            System.out.println("..............1. mostrar tabla precargada");
            System.out.println("..............2. borrar objeto ");
            System.out.println("..............3. Salir");
            System.out.print("Escribe una de las opciones:: ");

            opcion = opcionTeclado.nextInt();
            switch (opcion) {

                case 1:
                    miTabla.mostrarRegistros();
                    break;
                case 2:
                    miTabla.eliminarRectangulo();
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
