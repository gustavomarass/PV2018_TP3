
package tp3.brandan;

import java.io.IOException;
import java.util.Scanner;

import punto1.TestPunto;
import punto2.TesRectangulo;
import punto3.TestTriangulo;
import punto4.TestArreglo;
import punto5.TestRegistroCirculo;
import punto6.TestRegistroTabla;
import punto7.TestRegistroAuto;
import punto8.buscar3;
import punto9.buscar2;
import punto10.ListaPro;
import punto11.listas;
import punto12.buscar;


/** Brandan */

public class TP3Brandan {

   public void borrar() {  for (int i=0; i<200;i++) {  System.out.println();}     }
   

    public static void main(String[] args) throws InterruptedException {   
     int op=1;  
     while((op>=1)&&(op<=12)){  
        
     System.out.println("===========TP3 Gonzalo Brandan Gonzalo- Puntos===============================================");
     System.out.println("         '1'-Punto 1 - Distancia-Clase punto ");
     System.out.println("         '2'-Punto 2 - Rectangulo ");
     System.out.println("         '3'-Punto 3 - Triangulo ");
     System.out.println("         '4'-Punto 4 - Arreglo con 10 numeros ");
     System.out.println("         '5'-Punto 5 - Circulos ");
     System.out.println("         '6'-Punto 6 - Eliminar Rectangulos de una Tabla");
     System.out.println("         '7'-Punto 7 - Cargar Autos y Modificar ");
     System.out.println("         '8'-Punto 8 - Registrar Libros ");
     System.out.println("         '9'-Punto 9 - Buscar por Titulo Libros y carga");
     System.out.println("         '10'-Punto 10 - Producto Cuotas ");
     System.out.println("         '11'-Punto 11 - Registrar Zapatillas ");
     System.out.println("         '12'-Punto 12 - Busqueda de libros y carga ");
   
     System.out.println("         '13'-SALIR");
     System.out.println("==============================================================================");
     System.out.print(".............Elija una opcion:: ");
     Scanner leer1 = new Scanner (System.in);
     op=leer1.nextInt(); 
      switch(op) {
     
      case 1: { TestPunto lis= new TestPunto();  lis.menu(); break;  } 
      case 2: { TesRectangulo lis= new TesRectangulo();  lis.menu(); break;  } 
      case 3: { TestTriangulo lis= new TestTriangulo();  lis.menu(); break;  } 
      case 4: { TestArreglo lis= new TestArreglo();  lis.menu(); break;  } 
      case 5: { TestRegistroCirculo lis= new TestRegistroCirculo();  lis.menu(); break;  } 
      case 6: { TestRegistroTabla lis= new TestRegistroTabla();  lis.menu(); break;  } 
      case 7: { TestRegistroAuto lis= new TestRegistroAuto();  lis.menu(); break;  } 
      case 8: { buscar3 lis= new buscar3(); lis.menu(); break;  } 
      case 9: { buscar2 lis= new buscar2(); lis.menu(); break;  } 
      case 10: { ListaPro lis= new ListaPro(); lis.ingreso();  break;} 
      case 11: { listas lis= new listas(); lis.guardar(); break;} 
      case 12: { buscar lis= new buscar(); lis.menu(); break; } 
      default: {System.out.println(".......................FIN.........................."); break;}
      
      }
    
    } }
    
}
