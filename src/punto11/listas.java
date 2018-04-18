
package punto11;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.lang.*;
import punto11.zapatillas;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**Brandan */

public class listas implements Serializable{
    public String origg;
    public String copyy;
    private String marca;
    private boolean original;
    private boolean copia;
    private String[] marcas;
    private List<zapatillas> listazap;
    private zapatillas zap;
    private List<zapatillas> Res;

   public void borrar() {  for (int i=0; i<200;i++) {  System.out.println();}     }
  
  public void guardar() throws InterruptedException{
      int m=1, c=5; 
     listazap =new ArrayList<zapatillas>();
    while((m>=1)&&(m<=4)&&(c>=5)&&(c<=6)){   borrar();
     System.out.println("===========PUNTO-11-REGISTRAR ZAPATILLAS--Brandan-Gonzalo===========");
     System.out.println("'1'-ADIDAS ");
     System.out.println("'2'-NIKE");
     System.out.println("'3'-PUMA ");
     System.out.println("'4'-TOPPER");
     System.out.println("------------------------------------------------------------------------------");
     System.out.println("'5'-Copia");
     System.out.println("'6'-Original");
     System.out.println("==============================================================================");
     System.out.println("'7'-SALIR");
     System.out.println("______________________________________________________________________________");
     System.out.print("Elija una Marca del 1-4:: ");
     Scanner leer1 = new Scanner (System.in);
     m=leer1.nextInt(); 
     System.out.print("Es copia u original 5-6:: ");
     Scanner leer2 = new Scanner (System.in);
     c=leer2.nextInt();
     if ((m>=1)&&(m<=4)&&(c>=5)&&(c<=6))   {
        zap=new zapatillas();
       if(m==1){zap.setMarcass("Adidas");}
       if(m==2){zap.setMarcass("Nike");}
       if(m==3){zap.setMarcass("Puma");}
       if(m==4){zap.setMarcass("Topper");}
       if(c==5){zap.setCopiass("SI"); zap.setOrig("NO");}
       if(c==6){zap.setCopiass("NO"); zap.setOrig("SI");}
       listazap.add(zap);
       System.out.println("DATOS GUARDADOS CORRECTAMENTE");
      System.out.println("___________________________________________________________");
      int size=listazap.size();  
      int i=0;  
      for(i=0;i<size;i++){ zap=listazap.get(i);
      System.out.println(",,,,,,Marca::"+zap.getMarcass()+"  Original::"+zap.getOrig()+"  Copia::"+zap.getCopiass());  }
      System.out.println("___________________________________________________________");
   
      } else {System.out.println("¡¡¡ERROR DATOS INVALIDOS!!! FIN"); }   
   Thread.sleep(6000);  
    }
   
 }

  
  
    public String getOrigg() {
        return origg;
    }

    public void setOrigg(String origg) {
        this.origg = origg;
    }

    public String getCopyy() {
        return copyy;
    }

    public void setCopyy(String copyy) {
        this.copyy = copyy;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isOriginal() {
        return original;
    }

    public void setOriginal(boolean original) {
        this.original = original;
    }

    public boolean isCopia() {
        return copia;
    }

    public void setCopia(boolean copia) {
        this.copia = copia;
    }

    public String[] getMarcas() {
        return marcas;
    }

    public void setMarcas(String[] marcas) {
        this.marcas = marcas;
    }

    public List<zapatillas> getListazap() {
        return listazap;
    }

    public void setListazap(List<zapatillas> listazap) {
        this.listazap = listazap;
    }

    public zapatillas getZap() {
        return zap;
    }

    public void setZap(zapatillas zap) {
        this.zap = zap;
    }

    public List<zapatillas> getRes() {
        return Res;
    }

    public void setRes(List<zapatillas> Res) {
        this.Res = Res;
    }

  
    
}
