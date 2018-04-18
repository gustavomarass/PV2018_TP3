/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

/**
 *
 * @author gustavo
 */
public class Circulo {
    private String identificacion;
    private double radio;
    private double perimetro;
    private double superficie;

    public Circulo(String identificacion, double radio) {
        this.radio = radio;
        this.identificacion=identificacion;
    }
    
    public void mostrarAtributos(){
    
    
    }

    public Circulo() {
    }
    
    
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerimetro() {
        double PI=3.14;
        perimetro=2*PI*radio;
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getSuperficie() {
        double PI=3.14;
        superficie=PI*Math.pow(radio, 2);
        
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    
    
}
