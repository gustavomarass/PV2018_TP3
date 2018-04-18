
package punto12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import punto12.libro;
import punto12.autor12;

/* Brandan  */

public class buscar implements Serializable {
    private String dato="";
    private List<libro> lista;
    private libro li;
    public List<String>categ;
    public autor12 autor;
   
   public void borrar() {  for (int i=0; i<200;i++) {  System.out.println();}     }
   
   
   public void menu () throws InterruptedException {
     categ =new ArrayList<String>();
     categ.add("MATEMATICA");
     categ.add("PROGRAMACION");
     categ.add("INFORMATICA");
     categ.add("LENGUA");
     categ.add("INGLES");
     categ.add("NOVELA");
     categ.add("HISTORIA");
     categ.add("TERROR");
     categ.add("POLITICA");
     int op=1 ,bus=1;
     String is="",cat="", tit="", ape="", nom="", pais="";
     int precio=0;
     boolean ban=true;
     lista =new ArrayList<libro>();
     autor= new autor12();
     while((op>=1)&&(op<=3)){  ban=true; autor=new autor12();   borrar();  op=0; bus=1;
        System.out.println("===========PUNTO-12-BUSCAR LIBROS--Brandan-Gonzalo===================");
        System.out.println("...............'1'-CARGAR ");
        System.out.println("...............'2'-BUSCAR");
        System.out.println("...............'3'-MOSTRAR TODO ");
        System.out.println("...............'4'-SALIR");
        System.out.println("==============================================================================");
        System.out.print(".............Elija una opcion:: ");
        Scanner leer1 = new Scanner (System.in);
        op=leer1.nextInt(); 
        if (op==1) {
          int cate=0;
         System.out.println("............................................................................");
         try {
            System.out.print(".........Ingrese ISBN::");
            BufferedReader ent= new BufferedReader(new InputStreamReader (System.in));
            is=ent.readLine();     
            System.out.print(".........Ingrese apellido AUTOR::");
            BufferedReader ent2= new BufferedReader(new InputStreamReader (System.in));
            ape=ent2.readLine();
            System.out.print(".........Ingrese nombre AUTOR::");
            BufferedReader nomb= new BufferedReader(new InputStreamReader (System.in));
            nom=nomb.readLine();
            System.out.print(".........Ingrese Pais del AUTOR::");
            BufferedReader paiss= new BufferedReader(new InputStreamReader (System.in));
            pais=paiss.readLine();
            System.out.print(".........Ingrese Titulo::");
            BufferedReader ent4= new BufferedReader(new InputStreamReader (System.in));
            tit=ent4.readLine();
            System.out.print(".........Ingrese Precio entero::");
            Scanner precios = new Scanner (System.in);
            precio=precios.nextInt();       
            System.out.println(".........Seleccione Categoria..........................");
            System.out.println(".........1- MATEMATICA ");
            System.out.println(".........2- PROGRAMACION");
            System.out.println(".........3- INFORMATICA");
            System.out.println(".........4- LENGUA");
            System.out.println(".........5- INGLES");
            System.out.println(".........6- NOVELA");
            System.out.println(".........7- HISTORIA");
            System.out.println(".........8- TERROR");
            System.out.println(".........9- POLITICA");
            System.out.println("......................................................");
            Scanner ent232 = new Scanner (System.in);
            cate=ent232.nextInt(); }
       catch (IOException e) { ban=false;  System.out.println(",,,,,,,,,,,ERROR DATOS INVALIDOS");  } 
        
       int i1=0,i2=0,i3=0,i4=0,i5=0,i6=0;
       i1=is.length();  i3=tit.length(); 
        i4=ape.length(); i5=nom.length(); i6=pais.length();
        if ((ban==true)&&(i1>2)&&(i3>2)&&(i4>2)&&(i5>2)&&(i6>2)&&(precio>0)&&(cate>=1)&&(cate<=9)) { autor=new autor12();
                if (cate==1){cat="MATEMATICA";}
                if (cate==2){cat="PROGRAMACION";}
                if (cate==3){cat="INFORMATICA";}
                if (cate==4){cat="LENGUA";}
                if (cate==5){cat="INGLES";}
                if (cate==6){cat="NOVELA";}
                if (cate==7){cat="HISTORIA";}
                if (cate==8){cat="TERROR";}
                if (cate==9){cat="POLITICA";}
           autor.setApellido(ape); autor.setNombre(nom); autor.setPais(pais);
           li=new libro();  li.setIsb(is); li.setCateg(cat); li.setAutor(autor);
           li.setTit(tit); li.setPrecio(precio);  lista.add(li);
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
         while((bus>=1)&&(bus<=4)){  
         System.out.println("===============BUSCAR==============================");
         System.out.println("       '1'-Buscar por Categoria ");
         System.out.println("       '2'-Buscar por Categoria y Titulo");
         System.out.println("       '3'-Buscar por Titulo ");
         System.out.println("       '4'-Buscar Por Autor");
         System.out.println("       '5'-Salir");
         System.out.println("===================================================");
         System.out.print("..........Elija una opcion:: ");
         Scanner leer2 = new Scanner (System.in);
         bus=leer2.nextInt(); 
         if (bus==1) { boolean cheq=true;
          int cate=0;
                System.out.println(".........Seleccione Categoria..........................");
                System.out.println(".........1- MATEMATICA ");
                System.out.println(".........2- PROGRAMACION");
                System.out.println(".........3- INFORMATICA");
                System.out.println(".........4- LENGUA");
                System.out.println(".........5- INGLES");
                System.out.println(".........6- NOVELA");
                System.out.println(".........7- HISTORIA");
                System.out.println(".........8- TERROR");
                System.out.println(".........9- POLITICA");
                System.out.println("......................................................");
                Scanner ent222 = new Scanner (System.in);
                cate=ent222.nextInt(); 
         if ((cheq==true)&&(cate>=1)&&(cate<=9)) { autor=new autor12();
           String aux="";
           int i=0, res=0,total=0;
                if (cate==1){cat="MATEMATICA";}
                if (cate==2){cat="PROGRAMACION";}
                if (cate==3){cat="INFORMATICA";}
                if (cate==4){cat="LENGUA";}
                if (cate==5){cat="INGLES";}
                if (cate==6){cat="NOVELA";}
                if (cate==7){cat="HISTORIA";}
                if (cate==8){cat="TERROR";}
                if (cate==9){cat="POLITICA";}
           System.out.println("................................................................."); 
          for(i=0;i<size;i++){
              li=lista.get(i); autor=new autor12(); aux=li.getCateg(); 
             autor=li.getAutor();   res=aux.indexOf(cat);
           if (res != -1) { total=total+1;   
                 System.out.println("...."+i+" - "+li.getIsb()+" , "+li.getCateg()+" , "+li.getTit()+
                " , "+li.getPrecio()+" , "+autor.getApellido()+","+autor.getNombre()+","+autor.getPais() );} 
            } 
           System.out.print(".........Se encontraron:: "+total+"  Registros");   
            System.out.println("......................................................");
          } else {System.out.println("..........ERROR Categoria Invalida!!!!!........");  }  
          Thread.sleep(6000);
         } //por categoria......................
        
        //===========================================================================================
        //===========================================================================================
         if (bus==2){ // por Categoria y titulo
            int cate=0;          
            boolean cheq=true;  
            try {
                System.out.println(".........Seleccione Categoria.......................::");
                System.out.println(".........1- MATEMATICA ");
                System.out.println(".........2- PROGRAMACION");
                System.out.println(".........3- INFORMATICA");
                System.out.println(".........4- LENGUA");
                System.out.println(".........5- INGLES");
                System.out.println(".........6- NOVELA");
                System.out.println(".........7- HISTORIA");
                System.out.println(".........8- TERROR");
                System.out.println(".........9- POLITICA");
                System.out.println("......................................................");
                Scanner ent22 = new Scanner (System.in);
                cate=ent22.nextInt();     
                System.out.print(".........Ingrese Titulo::");
                BufferedReader ent33= new BufferedReader(new InputStreamReader (System.in));
                tit=ent33.readLine(); }
            catch (IOException e) { cheq=false; System.out.println(",,,,,,,,,,,ERROR DATOS INVALIDOS");  } 
         
            if ((cheq==true)&&(cate>=1)&&(cate<=9)&&(tit.length()>2)) { 
                String cat2="", tit2="";
                int i=0, res=0, res2=0, total=0;
                    if (cate==1){cat="MATEMATICA";}
                    if (cate==2){cat="PROGRAMACION";}
                    if (cate==3){cat="INFORMATICA";}
                    if (cate==4){cat="LENGUA";}
                    if (cate==5){cat="INGLES";}
                    if (cate==6){cat="NOVELA";}
                    if (cate==7){cat="HISTORIA";}
                    if (cate==8){cat="TERROR";}
                    if (cate==9){cat="POLITICA";}
                System.out.println("......................................................");     
                for(i=0;i<size;i++){ li=lista.get(i); autor=new autor12(); cat2=li.getCateg(); tit2=li.getTit(); 
                res=cat2.indexOf(cat); res2=tit2.indexOf(tit); autor=li.getAutor();
                  if ((res != -1)&&(res2 != -1)) { total=total+1;   
                    System.out.println("...."+i+" - "+li.getIsb()+" , "+li.getCateg()+" , "+li.getTit()+
                    " , "+li.getPrecio()+" , "+autor.getApellido()+","+autor.getNombre()+","+autor.getPais()); }      
                 } 
                System.out.print(".........Se encontraron:: "+total+"  Registros");   
                 System.out.println("......................................................");
                }   else {System.out.println(",,,,,,,ERROR DATOS INVALIDOS!!!!!!!"); }   
            Thread.sleep(6000);
          } //por categoria y titulo
         
         //===================================================================================
          if (bus==3) { boolean cheq=true; //por titulo
           try {
           System.out.print(".........Ingrese Titulo::");
           BufferedReader ent55= new BufferedReader(new InputStreamReader (System.in));  tit=ent55.readLine(); }
           catch (IOException e) { cheq=false; System.out.println("..........ERROR Titulo Invalido........");  }    
          if ((cheq==true)&&(tit.length()>0)) {
           String aux="";
           int i=0, res=0,total=0;
            System.out.println("......................................................");
           for(i=0;i<size;i++){ li=lista.get(i); autor=new autor12(); 
           aux=li.getTit(); res=aux.indexOf(tit); autor=li.getAutor();
            if (res != -1) { total=total+1;   
                System.out.println("...."+i+" - "+li.getIsb()+" , "+li.getCateg()+" , "+li.getTit()+
                " , "+li.getPrecio()+" , "+autor.getApellido()+","+autor.getNombre()+","+autor.getPais() );}  
           } 
           System.out.print(".........Se encontraron:: "+total+"  Registros");    
           System.out.println("......................................................"); 
          } else {System.out.println(",,,,,,,,,,,ERROR DATOS INVALIDOS"); }
          Thread.sleep(6000);
          } //por titulo......................
         
         //===================================================================================
          if (bus==4) { boolean cheq=true; //por autor
           try {
           System.out.print(".........Ingrese Apellido Autor::");
           BufferedReader ent66= new BufferedReader(new InputStreamReader (System.in));  ape=ent66.readLine(); 
           System.out.print(".........Ingrese Nombre Autor::");
           BufferedReader ent88= new BufferedReader(new InputStreamReader (System.in));  nom=ent88.readLine(); }
           catch (IOException e) { cheq=false; System.out.println("..........ERROR Autor Invalido........");  }    
          if ((cheq==true)&&(ape.length()>1)&&(nom.length()>1)) {
           String ape2="", nom2="";
           int i=0, res1=0, res2=0, total=0;
            System.out.println("......................................................");
           for(i=0;i<size;i++){ li=lista.get(i); autor=new autor12(); autor=li.getAutor(); 
            ape2=autor.getApellido(); nom2=autor.getNombre();   
            res1=ape2.indexOf(ape); res2=nom2.indexOf(nom);
            if ((res1 != -1)||(res2 != -1)) { total=total+1;   
            System.out.println("...."+i+" - "+li.getIsb()+" , "+li.getCateg()+" , "+li.getTit()+
                    " , "+li.getPrecio()+" , "+ape2+","+nom2+","+autor.getPais() );}
            } 
           System.out.print(".........Se encontraron:: "+total+"  Registros");
            System.out.println("......................................................");
           } else {System.out.println(",,,,,,,,,,,ERROR DATOS INVALIDOS"); }
          Thread.sleep(6000);
          } //por autor......................  
        
              
          }
         } else {  System.out.println(".......ERROR - Lista VACIA......."); }  Thread.sleep(6000);   borrar();   }
      
      //======================BUSCAR=====================================================
     //======================BUSCAR=====================================================
      //======================BUSCAR=====================================================
      //====================================================================================
        if (op==3){
        System.out.println("_______________________________________________________________________________________");
         int size=lista.size();  
         int i=0;
         if (size>0) {
           for(i=0;i<size;i++){ li=lista.get(i); autor=new autor12(); autor=li.getAutor();
          System.out.println("...."+i+" - "+li.getIsb()+" , "+li.getCateg()+" , "+li.getTit()+
                    " , "+li.getPrecio()+" , "+autor.getApellido()+","+autor.getNombre()+","+autor.getPais() ); }
         
         } else {  System.out.println(".......ERROR - Lista VACIA......."); }
         System.out.println("_______________________________________________________________________________________");
           Thread.sleep(6000);
        }
       
     }//end-while 
   } 
    
   
}
