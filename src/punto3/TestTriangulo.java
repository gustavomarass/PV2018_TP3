 //diego Velazquez
package punto3;

import punto3.Triangulo;
import java.util.Scanner;

 //diego Velazquez
public class TestTriangulo {

    
    public void menu(){
        // TODO code application logic here
      System.out.println("____________________PUNTO 3__________________________________________________");
      
        System.out.println("+++++DIEGO VELAZQUEZ ");
         
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese lado A: ");
        int a = teclado.nextInt();
        System.out.print("ingrese lado B: ");
        int b = teclado.nextInt();
        System.out.print("ingrese lado C: ");
        int c = teclado.nextInt();
        Triangulo miTri = new Triangulo(a, b, c);
        miTri.verificarTriangulo();
       System.out.println("____________________________________________________________________________");
         
    }
    
}
