 //diego Velazquez
package punto3;

 //diego Velazquez
public class Triangulo {
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo() {
    }

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    
    
    
    public void verificarTriangulo(){
        if(getLadoA()+getLadoB()>getLadoC()&&getLadoA()+getLadoC()>getLadoB()&&getLadoA()+getLadoC()>getLadoA()){
            System.out.println("ES TRIANGULO");
            int perimetro = getLadoA()+getLadoB()+getLadoC();
            System.out.println("perimetro= "+perimetro);
        }else{
            System.out.println("NO ES TRIANGULO");
        
    }
    }
    

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }
}
