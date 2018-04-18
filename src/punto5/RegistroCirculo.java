/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class RegistroCirculo {
    ArrayList<Circulo> miArrayList = new ArrayList<>();

    public void cargarRegistro(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("...........ingrese identificacion circulo: ");
        String ide= teclado.nextLine();
        System.out.print("...........ingrese radio del circulo: ");
        double ra = teclado.nextDouble();
        Circulo miCirculo = new Circulo(ide, ra);
        miArrayList.add(miCirculo);
         System.out.print("...........CARGA CORRECTA ");
       
    }
    
    public void mostrarRegistros(){
        if(miArrayList.isEmpty()){
            System.out.println("...........Registro vacio");
        }else{
            System.out.println("ID_objeto[radio,perimetro,superficie]");
       for (int i=0;i<miArrayList.size();i++) {
           System.out.println(miArrayList.get(i).getIdentificacion()+"["+miArrayList.get(i).getRadio()+","
                   +miArrayList.get(i).getPerimetro()+","+miArrayList.get(i).getSuperficie()+"]");
           
}
        }
        
    
    }
    
    public ArrayList<Circulo> getMiArrayList() {
        return miArrayList;
    }

    public void setMiArrayList(ArrayList<Circulo> miArrayList) {
        this.miArrayList = miArrayList;
    }

    
    
}
