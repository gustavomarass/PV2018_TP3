
package punto2;

 //diego Velazquez
public class Rectangulo {
    private Punto puntoUno;
    private Punto puntoDos, puntoTres, puntoCuatro;        
    private double base; 
    private double altura; 
    
    public Rectangulo() {
        puntoUno = new Punto();
        puntoDos = new Punto();
        puntoTres = new Punto();
        puntoCuatro = new Punto();    
    }

    public Punto getPuntoUno() {
        return puntoUno;
    }

    public void setPuntoUno(Punto puntoUno) {
        this.puntoUno = puntoUno;
    }

    public Punto getPuntoDos() {
        return puntoDos;
    }

    public void setPuntoDos(Punto puntoDos) {
        this.puntoDos = puntoDos;
    }

    public Punto getPuntoTres() {
        return puntoTres;
    }

    public void setPuntoTres(Punto puntoTres) {
        this.puntoTres = puntoTres;
    }

    public Punto getPuntoCuatro() {
        return puntoCuatro;
    }

    public void setPuntoCuatro(Punto puntoCuatro) {
        this.puntoCuatro = puntoCuatro;
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
     
    public void calcularPto2(){
        double x2, y2;
        x2 = this.puntoUno.getX();
        y2 = this.puntoUno.getY() + this.altura;
        this.puntoDos.setX(x2);
        this.puntoDos.setY(y2);        
    }
    
    public void calcularPto3(){
        double x3, y3;
        x3 = this.puntoUno.getX() + this.base;
        y3 = this.puntoUno.getY() + this.altura;
        this.puntoTres.setX(x3);
        this.puntoTres.setY(y3);        
    }
    
    public void calcularPto4(){
        double x4, y4;
        x4 = this.puntoUno.getX() + this.base;
        y4 = this.puntoUno.getY();
        this.puntoCuatro.setX(x4);
        this.puntoCuatro.setY(y4);        
    }
    
    public double calcularSuperficie(){
        return (base*altura);
    }
    
    public double calcularPerimetro(){
        return (base*2+altura*2);
    }

    
    
    
    
    
    
    
    
}
