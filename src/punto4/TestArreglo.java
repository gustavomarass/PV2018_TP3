
package punto4;

import punto4.Arreglo;
import java.util.Scanner;

/**
 *
 * @author gustavo maras
 */
public class TestArreglo {

  
    public  void menu() {
          System.out.println("__________________PUNTO 4 -MARAS GUSTAVO_________________________________");
      
        Scanner teclado = new Scanner(System.in);
        Arreglo miArreglo = new Arreglo();
        System.out.println("ingrese 10 valores para el arreglo");
        System.out.print("valor 1: ");
        int v1 = teclado.nextInt();
        System.out.print("valor 2: ");
        int v2 = teclado.nextInt();
        System.out.print("valor 3: ");
        int v3 = teclado.nextInt();
        System.out.print("valor 4: ");
        int v4 = teclado.nextInt();
        System.out.print("valor 5: ");
        int v5 = teclado.nextInt();
        System.out.print("valor 6: ");
        int v6 = teclado.nextInt();
        System.out.print("valor 7: ");
        int v7 = teclado.nextInt();
        
        System.out.print("valor 8: ");
        int v8 = teclado.nextInt();
        System.out.print("valor 9: ");
        int v9 = teclado.nextInt();
        System.out.print("valor 10: ");
        int v10 = teclado.nextInt();
        
        miArreglo.cargarArreglo(v1);
        miArreglo.cargarArreglo(v2);
        miArreglo.cargarArreglo(v3);
        miArreglo.cargarArreglo(v4);
        miArreglo.cargarArreglo(v5);
        miArreglo.cargarArreglo(v6);
        miArreglo.cargarArreglo(v7);
        miArreglo.cargarArreglo(v8);
        miArreglo.cargarArreglo(v9);
        miArreglo.cargarArreglo(v10);
        
        System.out.print("............ARREGLO............ ");
        miArreglo.mostrarArreglo();
        System.out.println("........Mayor es: "+miArreglo.mostrarMayor());
        System.out.println("........Menor es: "+miArreglo.mostrarMenor());
        System.out.println("........Promedio: "+miArreglo.calcularPromedio());
          System.out.println("____________________________________________________________________________");
      
    }
    
}
