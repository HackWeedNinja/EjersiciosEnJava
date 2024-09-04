
package com.mycompany.yo;




public class Coche {
    public static boolean bat = false;
private static int bateria =10;
private static int distancia;
private static boolean compra = false;
public Coche(String buy){
if(buy.equals("BUY")){
compra = true;
    }
 }


public void distanciaDrive(){
    if(compra){
        System.out.println("DISTANCIA " + distancia+ " METROS");
    
        }

     }
     public void porcentajeBateria(){
     if(compra){
         System.out.println("BATERIA EN " + bateria);
     
         }
     
       }
     public void conducir(){
         if(bateriaBaja()==false){
     distancia+=20;
     bajarBateria();
           }
        }
     static void bajarBateria(){
     bateria--;
        }
     static boolean bateriaBaja(){
         boolean baja = false;
         if(bateria == 0){
         System.out.println("BATERIA DESCARGADA");
         baja = true;
         }
         bat = baja;
         return baja;
        }
}