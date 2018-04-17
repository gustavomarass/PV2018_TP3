/*
 */
package Punto_01.test;

import java.util.Scanner;
import Punto_01.dominio.Punto;

public class TestPunto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("01_ Calcular DISTANCIA ENTRE DOS PUNTOS");
        System.out.println("P1(x1,y1)-> Ingrese x1:");
        double p1=teclado.nextDouble();
        System.out.println("P1(x1,y1)-> Ingrese y1:");
        double p2=teclado.nextDouble();
        System.out.println("P2(x2,y2)-> Ingrese x2:");
        double p3=teclado.nextDouble();
        System.out.println("P2(x2,y2)-> Ingrese y2:");
        double p4=teclado.nextDouble();
        Punto punto1 = new Punto(p1, p2);
        Punto punto2 = new Punto(p3, p4);
        System.out.println("DISTANCIA entre P1("+punto1.getX()+","+punto1.getY()+") y P2("
                +punto2.getX()+","+punto2.getY()+") es: "+punto1.CalcularDistancia(punto2));
    }
    
}
