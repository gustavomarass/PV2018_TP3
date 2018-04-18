
package punto7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** * @author Brandan */
public class RegistroAuto {
        private final List<Auto> listaAutos;
        

    public RegistroAuto() {
      listaAutos = new ArrayList<>();
      listaAutos.add(new Auto("XBC123","Renault","Rojo",2009,"Nafta"));
      listaAutos.add(new Auto("HGS412" ,"Ford","Negro",2014,"Nafta"));
      listaAutos.add(new Auto("XCC777" ,"Chevrolet","BLanco",2017,"Nafta"));
      listaAutos.add(new Auto("UUU999" ,"Fiat","Verde",2017,"Nafta"));
      listaAutos.add(new Auto("GHA577" ,"Fiat","Amarillo",2013,"Gas"));
      listaAutos.add(new Auto("UYY231" ,"HONDA","MORADO",2011,"Nafta"));
      listaAutos.add(new Auto("OLP518" ,"FERRARI","NEGRO",2010,"ELECTRICO"));
      listaAutos.add(new Auto("UQQ612" ,"FERRARI","ROJO",2009,"ELECTRICO"));
      listaAutos.add(new Auto("PQL001" ,"CHEVROLET","ROJO",2005,"GAS"));       
        
    }
  
    
    public void modificarAuto(){
        System.out.println("________________________________________________________________________"); 
        System.out.println(".........PUNTO 7 -Brandan, Maras, Velazquez.............................");
        System.out.print(".........ingrese posicion del auto a modificar: ");
        Scanner teclado = new Scanner(System.in);
        int posicion = teclado.nextInt();
        System.out.print(".........ingrese patente: ");
        String patente = teclado.next();
        System.out.print(".........ingrese marca: ");
        String marca = teclado.next();
        System.out.print(".........ingrese color: ");
        String color = teclado.next();
        System.out.print(".........ingrese año: ");
        int anio = teclado.nextInt();
        System.out.print(".........ingrese combustible: ");
        String combu = teclado.next();
        System.out.println("________________________________________________________________________"); 
      
        boolean band=false;
        for (int i=0;i<listaAutos.size();i++) {
            if ((patente.equals(listaAutos.get(i).getPatente()))&&(i != posicion))  {band=true; 
            System.out.println("........ERROR YA EXISTE UN AUTO CON LA MISMA PATENTE:: ");
            System.out.println("Auto["+i+"]"+" ["+listaAutos.get(i).getPatente()+
                   ","+listaAutos.get(i).getMarca()+","+listaAutos.get(i).getColor()+","+
                   +listaAutos.get(i).getModelo()+","+listaAutos.get(i).getCombustible()+"]"); }
           
        }
        if (band==true) { System.out.println(".................CARGA INCORRECTA Ingrese Otra Patente............");      }
        if (band==false) {
        Auto auto = new Auto(patente, marca, color, anio, combu);
        listaAutos.set(posicion, auto);
        System.out.println("...................REGISTRO MODIFICADO CORRECTAMENTE.............."); }
    }
    
    
    public void mostrarAutos(){
        if(listaAutos.isEmpty()){
            System.out.println("registro vacio");
        }else{
            System.out.println("Auto[posicion][patente,marca,color,anio,tipo_nafta]");
       for (int i=0;i<listaAutos.size();i++) {
           System.out.println("Auto["+i+"]"+" ["+listaAutos.get(i).getPatente()+
                   ","+listaAutos.get(i).getMarca()+","+listaAutos.get(i).getColor()+","+
                   +listaAutos.get(i).getModelo()+","+listaAutos.get(i).getCombustible()+"]");
           
        } 
        }
        
    
    }

    
}
