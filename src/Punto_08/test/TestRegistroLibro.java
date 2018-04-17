/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto_08.test;

import Punto_08.dominio.Autor;
import Punto_08.dominio.Libro;
import Punto_08.dominio.RegistroLibro;
import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class TestRegistroLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RegistroLibro miTabla = new RegistroLibro();
        boolean salir = false;
        int opcion;
        Scanner opcionTeclado = new Scanner(System.in);
        System.out.println("08_ Regitro de Libros");
        while (!salir) {

            System.out.println("---------MENU-----------");
            System.out.println("1. Cargar Libro");
            System.out.println("2. Salir");
            System.out.println("-------------------------");
            System.out.print("Escribe una de las opciones: ");

            opcion = opcionTeclado.nextInt();
            switch (opcion) {

                case 1:
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("ingrese ISBN: ");
                    int is = teclado.nextInt();
                    System.out.println("ingrese TITULO: ");
                    String titu = teclado.next();
                    System.out.println("ingrese nombre AUTOR: ");
                    String nomb = teclado.next();
                    System.out.println("ingrese apellido AUTOR: ");
                    String app = teclado.next();
                    System.out.println("ingrese PRECIO: ");
                    double pre = teclado.nextDouble();
                    Autor miautor=new Autor(nomb, app);
                    Libro nuevoLibro = new Libro(is, titu, miautor, pre);
                    miTabla.guardarLibro(nuevoLibro);
                    miTabla.mostrarLibros();
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("opcion entre 1 y 2");
            }
        }
    }

}
