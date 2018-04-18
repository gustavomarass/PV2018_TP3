
package punto6;
import java.io.Serializable;

 // GUSTAVO
public class Rectangulo implements Serializable{
    private double base;
    private double altura;
    private double superficie;
    private double perimetro;
    private Integer aa;
    private Integer bb;
    private Punto puntoA = new Punto(aa,bb);
    
    
    public Rectangulo(Punto pntoA,double base, double altura, double superf, double perim){
        this.altura=altura;
        this.base=base;
        this.superficie=superf;
        this.perimetro=perim;
        this.puntoA=pntoA;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public Punto getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }

    public Integer getAa() {
        return aa;
    }

    public void setAa(Integer aa) {
        this.aa = aa;
    }

    public Integer getBb() {
        return bb;
    }

    public void setBb(Integer bb) {
        this.bb = bb;
    }

    

   
}
