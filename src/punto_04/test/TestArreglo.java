/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_04.test;

import java.util.Scanner;
import punto_04.dominio.Arreglo;

/**
 *
 * @author Diego
 */
public class TestArreglo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Arreglo miArreglo = new Arreglo();
        System.out.println("ingrese 10 valores para el arreglo");
        System.out.println("valor 1: ");
        int v1 = teclado.nextInt();
        System.out.println("valor 2: ");
        int v2 = teclado.nextInt();
        System.out.println("valor 3: ");
        int v3 = teclado.nextInt();
        System.out.println("valor 4: ");
        int v4 = teclado.nextInt();
        System.out.println("valor 5: ");
        int v5 = teclado.nextInt();
        System.out.println("valor 6: ");
        int v6 = teclado.nextInt();
        System.out.println("valor 7: ");
        int v7 = teclado.nextInt();
        
        System.out.println("valor 8: ");
        int v8 = teclado.nextInt();
        System.out.println("valor 9: ");
        int v9 = teclado.nextInt();
        System.out.println("valor 10: ");
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
        
        System.out.print("arreglo: ");
        miArreglo.mostrarArreglo();
        System.out.println("mayor es: "+miArreglo.mostrarMayor());
        System.out.println("menor es: "+miArreglo.mostrarMenor());
        System.out.println("promedio: "+miArreglo.calcularPromedio());
    }
}
