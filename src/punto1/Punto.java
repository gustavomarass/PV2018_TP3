
package punto1;

 //diego Velazquez
public class Punto {

    private double x;
    private double y;

    public Punto() {
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double CalcularDistancia(Punto otroPunto) {
        double distancia = Math.sqrt(Math.pow(getX() - otroPunto.getX(), 2)
                + Math.pow(otroPunto.getY() - getY(), 2));

        return distancia;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

}
