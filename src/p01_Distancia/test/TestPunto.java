
package p01_Distancia.test;

import p01_Distancia.dominio.Punto;

public class TestPunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto miPunto = new Punto(3, 5);
        Punto otroPunto = new Punto(7, 1);
        
        System.out.println("distacia: "+miPunto.CalcularDistancia(otroPunto));
    }
    
}
