
package punto1;

import java.util.Scanner;
import punto1.Punto;
 //diego Velazquez
public class TestPunto {
    public void menu() {
          System.out.println("___________________PUNTO 1____________________________________________________");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Diego Velazquez -DISTANCIA ENTRE DOS PUNTOS:");
        System.out.println("Punto(X1,Y1)");
        System.out.print("ingrese X1: ");
        double p1=teclado.nextDouble();
        System.out.print("ingrese Y1: ");
        double p2=teclado.nextDouble();
        System.out.println("Punto(X2,Y2)");
        System.out.print("ingrese X2: ");
        double p3=teclado.nextDouble();
        System.out.print("ingrese Y2: ");
        double p4=teclado.nextDouble();
        Punto punto1 = new Punto(p1, p2);
        Punto punto2 = new Punto(p3, p4);
        System.out.println("Distacia: "+punto1.CalcularDistancia(punto2));
      System.out.println("____________________________________________________________________________");
      
    }
    
}
