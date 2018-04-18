/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_04.dominio;

import java.util.Arrays;

/**
 *
 * @author Diego
 */
public class Arreglo {
    private int array[];
    private int i=0;
    
    public void cargarArreglo(int numero){
        array[i]=numero;
        i++;
    }
    
    public void mostrarArreglo(){
        System.out.println(Arrays.toString(getArray()));
    
    }
    
    public int mostrarMayor(){
        int max=array[0];
        for(int i=1;i<getArray().length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    public int mostrarMenor(){
        int min=array[0];
        for(int i=1;i<getArray().length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
    
    public double calcularPromedio(){
        int sumaTotal=0;
        for(int i=0;i<array.length;i++){
            sumaTotal=sumaTotal+array[i];
        }
        return sumaTotal/array.length;
    }
    
    public Arreglo() {
        this.array = new int[10];
    }

    public int[] getArray() {
        return array;
    }
    
    

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setI(int i) {
        this.i = i;
    }
}
