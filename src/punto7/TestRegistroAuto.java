
package punto7;

import punto7.RegistroAuto;
import java.util.Scanner;

/** * @author Brandan Gonzalo */
public class TestRegistroAuto {

  
    public void menu() {
        RegistroAuto miTabla = new RegistroAuto();
        boolean salir = false;
        int opcion;
        Scanner opcionTeclado = new Scanner(System.in);
        while (!salir) {
            System.out.println("________________________________________________________________________"); 
            System.out.println(".........PUNTO 7 -Brandan Gonzalo.......................................");
            System.out.println(".........REGISTRO AUTO..................................................");
            System.out.println("1. mostrar autos precargada");
            System.out.println("2. modificar objeto ");
            System.out.println("3. Salir");
            System.out.println("________________________________________________________________________"); 
            System.out.print("Ingrese OPCION::");

            opcion = opcionTeclado.nextInt();
            switch (opcion) {

                case 1:
                    miTabla.mostrarAutos();
                    break;
                case 2:
                    miTabla.modificarAuto();
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
