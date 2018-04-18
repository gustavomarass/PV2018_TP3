
package punto7;
import java.io.Serializable;


           // Brandan Gonzalo
public class Auto implements Serializable{
    
    public String patente;
    public String marca;
    public String color;
    public int modelo;
    public String combustible;

    public Auto(String p, String m, String c, int mod, String com) {
       patente=p;
       marca=m;
       color=c;
       modelo=mod;
       combustible=com;
    }

    public void asignacion (String p, String m, String c, int mod, String com) {
    patente=p;
       marca=m;
       color=c;
       modelo=mod;
       combustible=com;
    }
    
    public Auto() {}

    public String getPatente() { return patente;}
    public void setPatente(String patente) {this.patente = patente;}
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public int getModelo() { return modelo; }
    public void setModelo(int modelo) { this.modelo = modelo; }
    public String getCombustible() { return combustible; }
    public void setCombustible(String combustible) {this.combustible = combustible;}
}
