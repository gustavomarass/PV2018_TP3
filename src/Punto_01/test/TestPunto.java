
package Punto_01.test;

import java.util.Scanner;
import Punto_01.dominio.Punto;

public class TestPunto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("DISTANCIA ENTRE DOS PUNTOS:");
        System.out.println("unPunto(X1,Y1)");
        System.out.println("ingrese X1: ");
        double p1=teclado.nextDouble();
        System.out.println("ingrese Y1: ");
        double p2=teclado.nextDouble();
        System.out.println("otroPunto(X2,Y2)");
        System.out.println("ingrese X2: ");
        double p3=teclado.nextDouble();
        System.out.println("ingrese Y2: ");
        double p4=teclado.nextDouble();
        Punto punto1 = new Punto(p1, p2);
        Punto punto2 = new Punto(p3, p4);
        System.out.println("distacia: "+punto1.CalcularDistancia(punto2));
    }
    
}
