
package punto9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import punto9.libros2;

/**Brandan */
public class buscar2 {
    
   private String dato="";
    private List<libros2> lista;
    private libros2 li;
   
   public void borrar() {  for (int i=0; i<200;i++) {  System.out.println();}     }
   
   
   public void menu () throws InterruptedException {
      int op=1 ,bus=1;
      String is="",cat="", tit="", p="", a="";
      boolean ban=true;
      lista =new ArrayList<libros2>();
     while((op>=1)&&(op<=3)){   
     borrar();  
     System.out.println("===========PUNTO-9-BUSCAR LIBROS--Brandan-Gonzalo====================");
     System.out.println("         '1'-CARGAR ");
     System.out.println("         '2'-BUSCAR");
     System.out.println("         '3'-MOSTRAR TODO ");
     System.out.println("         '4'-SALIR");
     System.out.println("==============================================================================");
     System.out.print(".............Elija una opcion:: ");
     Scanner leer1 = new Scanner (System.in);
     op=leer1.nextInt(); 
      if (op==1) {
       System.out.println("________________________________________________________________________");
      try {
        System.out.print(".........Ingrese ISBN::");
        BufferedReader ent= new BufferedReader(new InputStreamReader (System.in));
        is=ent.readLine();     
        System.out.print(".........Ingrese AUTOR::");
        BufferedReader ent2= new BufferedReader(new InputStreamReader (System.in));
        a=ent2.readLine();
        System.out.print(".........Ingrese Categoria::");
        BufferedReader ent3= new BufferedReader(new InputStreamReader (System.in));
        cat=ent3.readLine();
        System.out.print(".........Ingrese Titulo::");
        BufferedReader ent4= new BufferedReader(new InputStreamReader (System.in));
        tit=ent4.readLine();
        System.out.print(".........Ingrese Precio::");
        BufferedReader ent5= new BufferedReader(new InputStreamReader (System.in));
        p=ent5.readLine();       }
       catch (IOException e) { ban=false;  System.out.println(",,,,,,,,,,,ERROR DATOS INVALIDOS");  } 
        
       int i1=0,i2=0,i3=0,i4=0,i5=0;
        i1=is.length(); i2=a.length(); i3=cat.length(); i4=tit.length(); i5=p.length();
        if ((ban==true)&&(i1>0)&&(i2>0)&&(i3>0)&&(i4>0)&&(i5>0)) {
           li=new libros2(); li.setAutor(a); li.setIsb(is); li.setCateg(cat); 
           li.setTit(tit); li.setPrecio(p);   lista.add(li);
          System.out.println("........CARGA CORRECTA..........");    
        }  else {System.out.println(",,,,,,,,,,,ERROR DATOS INVALIDOS"); }
       System.out.println("________________________________________________________________________");
       Thread.sleep(2000); 
      }
      
      //======================BUSCAR=====================================================
     //======================BUSCAR=====================================================
      //======================BUSCAR=====================================================
      if (op==2){ int size=lista.size(); 
        if (size>0) { 
         while (bus==1){  borrar();
         System.out.println("===========================BUSCAR=================");
         System.out.println("       '1'-Buscar por Titulo ");
         System.out.println("       '2'-Salir");
         System.out.println("=================================================");
         System.out.print("..........Elija una opcion:: ");
         Scanner leer2 = new Scanner (System.in);
         bus=leer2.nextInt(); 
        
         //===================================================================================
          if (bus==1) { boolean cheq=true; //por titulo
           try {
           System.out.print(".........Ingrese Titulo::");
           BufferedReader ent55= new BufferedReader(new InputStreamReader (System.in));  tit=ent55.readLine(); }
           catch (IOException e) { cheq=false; System.out.println("..........ERROR Titulo Invalido........");  }    
          if ((cheq==true)&&(tit.length()>0)) {
           String aux="";
           int i=0, res=0,total=0;
           for(i=0;i<size;i++){ li=lista.get(i); aux=li.getTit(); res=aux.indexOf(tit);
            if (res != -1) { total=total+1;   
            System.out.println("...."+i+" - "+li.getIsb()+" , "+li.getCateg()+" , "+li.getAutor()+" , "+li.getTit()+" , "+li.getPrecio()); }
           } 
           System.out.print(".........Se encontraron:: "+total+"  Registros");    
           } else {System.out.println(",,,,,,,,,,,ERROR DATOS INVALIDOS"); }
         
          } //por titulo......................
         
         //===================================================================================
       
             Thread.sleep(6000);  
          }
         } else {  System.out.println(".......ERROR - Lista VACIA......."); }         }
      
      //======================BUSCAR=====================================================
     //======================BUSCAR=====================================================
      //======================BUSCAR=====================================================
      //====================================================================================
        if (op==3){
        System.out.println("_______________________________________________________________________________________");
         int size=lista.size();  
         int i=0;
         if (size>0) {
           for(i=0;i<size;i++){ li=lista.get(i);
           System.out.println("...."+i+" - "+li.getIsb()+" , "+li.getCateg()+" , "+li.getAutor()+" , "+li.getTit()+" , "+li.getPrecio() );  }
         
         } else {  System.out.println(".......ERROR - Lista VACIA......."); }
         System.out.println("_______________________________________________________________________________________");
           Thread.sleep(6000);
        }
       
     }//end-while 
   }  
    
    
}
