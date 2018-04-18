
package punto6;
import java.io.Serializable;
//GUSTAVO

public class Punto implements Serializable{
    private Integer x;
    private Integer y;
    
    public Punto(Integer a, Integer b){
    this.x=a;
    this.y=b;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

   

    
    
    
}
