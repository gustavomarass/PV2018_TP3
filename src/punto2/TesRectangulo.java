
package punto2;

import punto2.Punto;
import punto2.Rectangulo;
import java.util.Scanner;

 //diego Velazquez
public class TesRectangulo {

    public void menu() {
        Scanner teclado = new Scanner(System.in);
        Rectangulo miRectanulo = new Rectangulo();
        Punto miPunto = new Punto();
        System.out.println("________________________PUNTO 2__________________________________________________");
        System.out.println("-----Diego Velazquez- CALCULAR POSICION-----");
        System.out.print("P1(x1,y1)-> ingrese x1: ");
        double x1 = teclado.nextDouble();
        System.out.print("P1(x1,y1)-> ingrese y1: ");
        double y1 = teclado.nextDouble();
        miPunto.setX(x1);
        miPunto.setY(y1);
        System.out.print("ingrese BASE: ");
        double base = teclado.nextDouble();
        System.out.print("ingrese ALTURA: ");
        double altura = teclado.nextDouble();
        miRectanulo.setBase(base);
        miRectanulo.setAltura(altura);
        miRectanulo.setPuntoUno(miPunto);
        miRectanulo.calcularPto2();
        System.out.println("Realizando Caluculos .....");
        System.out.println("P2(x2,y2)= "+"P2("+miRectanulo.getPuntoDos().getX()+","+miRectanulo.getPuntoDos().getY()+")");
        miRectanulo.calcularPto3();
        System.out.println("P3(x3,y3)= "+"P3("+miRectanulo.getPuntoTres().getX()+","+miRectanulo.getPuntoTres().getY()+")");
        miRectanulo.calcularPto4();
        System.out.println("P4(x4,y4)= "+"P4("+miRectanulo.getPuntoCuatro().getX()+","+miRectanulo.getPuntoCuatro().getY()+")");
        System.out.println("Superficie: "+miRectanulo.calcularSuperficie());
        System.out.println("Perimetro: "+miRectanulo.calcularPerimetro());
          System.out.println("____________________________________________________________________________");
      
// TODO code application logic here
    }

}
