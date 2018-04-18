/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_03.test;

import java.util.Scanner;
import punto_03.dominio.Triangulo;

/**
 *
 * @author Diego
 */
public class testtriangulo {
    public static void main(String[] args) {
        Triangulo unTriangulo = new Triangulo();
        Scanner sc = new Scanner(System.in);
        unTriangulo.setLadoA(sc.nextDouble());
        unTriangulo.setLadoB(sc.nextDouble());
        unTriangulo.setLadoC(sc.nextDouble());
    if (unTriangulo.VerificarEntradas()){
        System.out.println("valores ingresados validos para triangulo rectangulo");
        System.out.println("el perimetro es:"+unTriangulo.obtenerPerimetroRectangulo());
    }else
            System.out.println("datos no validos para rectangulo");
    }
    
}
