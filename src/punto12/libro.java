
package punto12;
import punto12.autor12;
/**-Brandan  */

public class libro {
    private String isb;
    private String categ;
    private String tit;
    private autor12 autor;
    private int precio;

    public libro(String is, String cat, String ti, autor12 au, int pre ){
       isb=is;  categ=cat;  tit=ti; autor=au; precio=pre; }

    public libro() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }      

    public String getIsb() {
        return isb;
    }

    public void setIsb(String isb) {
        this.isb = isb;
    }

    public String getCateg() {
        return categ;
    }

    public void setCateg(String categ) {
        this.categ = categ;
    }

    public String getTit() {
        return tit;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public autor12 getAutor() {
        return autor;
    }

    public void setAutor(autor12 autor) {
        this.autor = autor;
    }

  
    
    
}
