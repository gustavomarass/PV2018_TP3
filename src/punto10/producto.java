
package punto10;

import java.io.Serializable;

/** Brandan  */


public class producto implements Serializable {
    private int codigo;
    private String nombre;
    private double precio;
    private int cuota;
    private double valor;     
    
   public producto (int cod, String nom, double p,int c, double v) {
    codigo=cod;
    nombre=nom;
    precio=p;
    cuota=c;
    valor=v;
    }

    public producto() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
    
}
