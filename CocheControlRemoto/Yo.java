package com.mycompany.yo;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Yo {
static Scanner tc = new Scanner(System.in);
    
    public static void main(String[] args) {
          System.out.println("INGRESE LA PALABRA \"BUY\" PARA COMPRAR EL VEHICULO");
         String buy = tc.next().toUpperCase();
        init(buy);
     }
    static void conduccion(String buy){
            Coche car = new Coche(buy);  
            car.conducir();
            if(Coche.bat){
                System.out.println(":(");
             }else{
                System.out.println("BRUM...BRUM...BRUUM...BRUUUM...BRRRUUUUUMMMMM -- RUUUUUUUUUNNNNN");
        System.out.println("");
             }
      }
    static void pantallaLed(String buy){
            Coche car = new Coche(buy);  
            car.distanciaDrive();
            car.porcentajeBateria();
      }
    static void init(final String buy){
    boolean carga = false;
      
        if(buy.equals("BUY")){
        System.out.println("---------- INFORMACION DEL VEHICULO ----------");
        System.out.println("INGRESE --> \"1\" <-- PARA CONDUCIR EL COCHE --> \"99\" <-- PARA CARGARLO --> \"2\" <-- PARA VER BATERIA Y DISTANCIA DEL COCHE");
        System.out.println("------------------------------");
        
           do{
               
               int car = tc.nextInt();
               switch (car) {
                   case 1 -> conduccion(buy);
                   case 99 ->{ System.out.println("EL COCHE ESTA CARGANDO PRONTO LO VOLVERAS A CONDUCIR :D");   
                    carga = true;
                   break;
                   }
                   case 2 -> pantallaLed(buy);
                   default -> System.out.println("NO HAS INGRESADO UNA INSTRUCCION VALIDA");
               }
             } while(carga == false);

          }else{
        throw new Error("NO HAS COMPRADO EL VEHICULO SAL DEL PROGRAMA");
          }
      }
}