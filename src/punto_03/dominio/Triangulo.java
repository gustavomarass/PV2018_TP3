/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_03.dominio;

/**
 *
 * @author Diego
 */
public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

/* realice la aplicacion en base a un triangulo rectangulo, verificar*/   
public double obtenerPerimetroRectangulo(){
    return ladoA + ladoB + ladoC;
}

public boolean VerificarEntradas(){
       
    boolean resp;
    if(ladoA>0 && ladoB>0 && ladoC >0){
        if (ladoA < ladoC && ladoB < ladoC){
            resp = true;
        }else
        {
            resp = false;
        }
    }else
    {
        resp = false;
    }
    return resp;
}
    
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
}
