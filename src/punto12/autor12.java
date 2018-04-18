
package punto12;

/**-Brandan */

public class autor12 {
    
    private String apellido;
    private String nombre;
    private String pais;


    public autor12(String ape, String nom, String pa){
       apellido=ape;  nombre=nom;  pais=pa; }

    public autor12() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
}
