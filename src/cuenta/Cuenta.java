
package cuenta;

import java.util.List;




public class Cuenta
{
   private String id;
   private String nombre;
   private double saldo;

    public Cuenta(String xd,String siu,int dinero) {
 
    id=xd;
    nombre=siu;
    saldo=dinero;
    
    }
   

 public  void ingresar(double b){
    
 saldo=b+saldo;
 }
 
 public  void retirar(double c){
 
     if(saldo-c<-500){
         System.out.println("Es menos que -500");
     }
     else saldo=-saldo-c;
 
 }
    
   public double getsaldo(){
   
   return saldo;
   } 

public void setsaldo(int c){


}


}
