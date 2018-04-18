
package punto11;

/**Brandan */
public class zapatillas {
    
    private String marcass;
    private String copiass;
    private String orig;

    public zapatillas(String m, String c, String o ){ marcass=m;  copiass=c;  orig=o; }

    public zapatillas() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  

    public String getMarcass() {
        return marcass;
    }

    public void setMarcass(String marcass) {
        this.marcass = marcass;
    }

    public String getCopiass() {
        return copiass;
    }

    public void setCopiass(String copiass) {
        this.copiass = copiass;
    }

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }
    
    
}
