/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto_05.dominio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class RegistroCirculo {
    ArrayList<Circulo> miArrayList = new ArrayList<>();

    public void cargarRegistro(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese identificacion circulo: ");
        String ide= teclado.nextLine();
        System.out.println("ingrese radio del circulo: ");
        double ra = teclado.nextDouble();
        
        Circulo miCirculo = new Circulo(ide, ra);
        miArrayList.add(miCirculo);
    }
    
    public void mostrarRegistros(){
        if(miArrayList.isEmpty()){
            System.out.println("registro vacio");
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
