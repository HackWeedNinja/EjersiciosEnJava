
package com.mycompany.yo;

import java.util.Random;



public class Annalyn {
    public Annalyn() {
    }
 
     static boolean ataqueRapido(boolean caballero){
        boolean rescate=false;
    if(caballero == false){
        rescate = true;
       }
    return rescate;
      }
     static boolean espiar(boolean caballero, boolean arquero, boolean prisionero){
     boolean espiar = false;
     if(caballero ==true && arquero == false && prisionero == false){
     espiar=true;
     return espiar;
         }else if(caballero ==false && arquero == false && prisionero == true){
         espiar = true;
         return espiar;
          }else if(caballero ==false && arquero == true && prisionero == false){
          espiar = true;
          return espiar;
           }
     return espiar;
      }
     static boolean señal(boolean arquero, boolean prisionero){
     boolean rescate = false;
     if(arquero==false && prisionero == true){
     rescate = true;
     return rescate;
       }
     
     return rescate;
       }
     static boolean rescatarAnna(boolean caballero, boolean arquero, boolean perro,boolean prisionero){
     boolean rescate = false;
     if(perro==true && arquero == false && caballero == true && prisionero == true){
     rescate = true;
     return rescate;
       }else if(perro == false && prisionero == true && caballero ==false && arquero == false){
       rescate = true;
       return rescate;
         }
     
     return rescate;
      }
     
}
