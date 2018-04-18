
package punto10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import punto10.producto;


public class ListaPro implements Serializable {
    private double sumatoria;
    private double total;
    private String productos;
    private int codigos;
    private String nombres;
    private double precios;
    private int cuotas;
    private List<producto> listapro;
    private producto pro;
    private List<producto> Res;
    private String[] listado;
    private int[] cuotass;
    
    
    
  public void ingreso(){  
    int p=0, c=0 ;
       pro=new producto();
        listapro =new ArrayList<producto>(); 
        listapro.add(new producto(0,"",0,0,0));
        listado = new String[4];
        listado[0] = "'1'-Cafe-$4.5";
        listado[1] = "'2'-Galletas-$2.7";
        listado[2] = "'3'-GaseosaPepsi-$3.5";
        listado[3] = "'4'-Jabon-$1.8";
        cuotass = new int[7];
        cuotass[0] = 1;
        cuotass[1] = 2;
        cuotass[2] = 3;
        cuotass[3] = 4;
        cuotass[4] = 5;
        cuotass[5] = 6;
        cuotass[6] = 7;   
   System.out.println("===========PUNTO-10-Brandan-Gonzalo=============");
   System.out.println("'1'-Cafe-$4.5 ");
   System.out.println("'2'-Galletas-$2.7 ");
   System.out.println("'3'-GaseosaPepsi-$3.5 ");
   System.out.println("'4'-Jabon-$1.8 ");
   System.out.println("========================================================");
   System.out.print("Elija un Producto:: ");
   Scanner leer1 = new Scanner (System.in);
    p=leer1.nextInt(); 
   System.out.print("Ingrese valor cuota entre 1-7:: ");
   Scanner leer2 = new Scanner (System.in);
    c=leer2.nextInt(); 
    
    if ((p>=1)&&(p<=4)&&(c>=1)&&(c<=7)) {
     double interes=0;
     double antes=0;
      double suma=0;
      int i=1;
      productos=nombres;
      if (p==1){ nombres="Cafe"; codigos=1; precios=4.5; }  
      if (p==2){ nombres="Galletas"; codigos=2; precios=2.7; } 
      if (p==3){ nombres="GaseosaPepsi"; codigos=3; precios=3.5; } 
      if (p==4){ nombres="Jabon"; codigos=4; precios=1.8; } 
      total=precios/c;
      listapro.clear();
     System.out.println("_______________________________________________________________");  
      for (i=1; i<=c;i++) {pro=new producto(); pro.setCodigo(codigos); pro.setCuota(i); 
        interes=(1.5*antes)/100;
        pro.setNombre(nombres); pro.setPrecio(precios); total=total+interes;
        pro.setValor(total); listapro.add(pro); antes=total+interes;
        suma=suma+total; 
        
      System.out.println("______"+codigos+"--"+nombres+"--"+precios+"--"+i+"--"+total);  
      }
     System.out.println("_______________________________________________________________");    
      sumatoria=suma;
     System.out.println(",,,,,,,,,,SUMA TOTAL A PAGAR::"+sumatoria); 
      
    }else{System.out.println("!!!ERROR, INGRESO INVALIDOS--FIN");}
    
  }

    public double getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(double sumatoria) {
        this.sumatoria = sumatoria;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getCodigos() {
        return codigos;
    }

    public void setCodigos(int codigos) {
        this.codigos = codigos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getPrecios() {
        return precios;
    }

    public void setPrecios(double precios) {
        this.precios = precios;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public List<producto> getListapro() {
        return listapro;
    }

    public void setListapro(List<producto> listapro) {
        this.listapro = listapro;
    }

    public producto getPro() {
        return pro;
    }

    public void setPro(producto pro) {
        this.pro = pro;
    }

    public List<producto> getRes() {
        return Res;
    }

    public void setRes(List<producto> Res) {
        this.Res = Res;
    }

    public String[] getListado() {
        return listado;
    }

    public void setListado(String[] listado) {
        this.listado = listado;
    }

    public int[] getCuotass() {
        return cuotass;
    }

    public void setCuotass(int[] cuotass) {
        this.cuotass = cuotass;
    }
  
  
  
  
}
