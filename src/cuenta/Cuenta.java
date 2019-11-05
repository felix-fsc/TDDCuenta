
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
    
 saldo=1000;
 }
 
 public  void retirar(double c){
 
 saldo=-1000;
 
 }
    
   public double getsaldo(){
   
   return saldo;
   } 

public void setsaldo(int c){


}


}
