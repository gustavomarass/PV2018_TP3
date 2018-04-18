/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class RegistroTabla {
    
    private final List<Rectangulo> listaRectangulo;

    public RegistroTabla() {
        
        listaRectangulo=new ArrayList();
        listaRectangulo.add(new Rectangulo(new Punto(1,2),7,3,4,5));
        listaRectangulo.add(new Rectangulo(new Punto(3,6),5,3,2,7));
        listaRectangulo.add(new Rectangulo(new Punto(3,1),7,3,4,5));
        listaRectangulo.add(new Rectangulo(new Punto(10,2),5,9,2,1));
        listaRectangulo.add(new Rectangulo(new Punto(5,6),7,3,5,7));
    }
    
    
    public void eliminarRectangulo(){
        System.out.print(".........Ingrese posicion a eliminar: ");
        Scanner teclado = new Scanner(System.in);
        int posicion = teclado.nextInt();
        listaRectangulo.remove(posicion);
        System.out.print(".........RECTANGULO ELIMINADO CORRECTAMENTE: ");
    }
    
    
    public void mostrarRegistros(){
        if(listaRectangulo.isEmpty()){
            System.out.println("..........Registro vacio");
        }else{
            System.out.println("Rectangulo [x1,y1,base,altura,superficie,perimetro]");
       for (int i=0;i<listaRectangulo.size();i++) {
           System.out.println("Rectangulo["+i+"]"+" ["+listaRectangulo.get(i).getPuntoA().getX()+
                   ","+listaRectangulo.get(i).getPuntoA().getY()+","+listaRectangulo.get(i).getBase()+","+
                   +listaRectangulo.get(i).getAltura()+","+listaRectangulo.get(i).getSuperficie()+","+
                   listaRectangulo.get(i).getPerimetro()+"]");
           
}
        }
        
    
    }
    
    
    
}
