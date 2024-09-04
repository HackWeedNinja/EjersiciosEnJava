
package com.mycompany.yo;

import java.util.Random;


public class Secuestradores extends Annalyn{
   private final boolean caballero;
   private final boolean arquero;
   private final boolean prisionero;
   private final boolean perro;
   public Secuestradores(int cab, int ar, int pri,int per){
       if(cab >= 1 && cab<=10){
       caballero = true;
        }else{
       caballero = false;
        }if(ar >= 1 && ar<=10){
        arquero=true;
         }else{
        arquero=false;
         }if(pri >= 1 && pri<=10){
         prisionero = true;
          }else{
         prisionero = false;
          }if(per >= 1 && per<=10){
          perro = true;
           }else{
          perro = false;
           }
     
    }

    public boolean getCaballero() {
        return caballero;
    }

    public boolean getArquero() {
        return arquero;
    }
   public boolean getPrisionero() {
        return prisionero;
    }

    public boolean getPerro() {
        return perro;
    }
   
}
