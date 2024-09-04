package com.mycompany.yo;
import java.util.Scanner;


public class Yo {
static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
    ingresarNumero();
    }

    private static void ingresarNumero() {
        boolean salir = false;
       do{
         
           System.out.println("INGRESE UN NUMERO");
           int num = tc.nextInt();
           gotas(num);
           System.out.println("INGRESE 1 PARA SALIR 2 PARA CONTINUAR");
           num = tc.nextInt();
           if(num ==1){
              salir = true;
             }else if(num == 2){
           salir = false;
               }else{
               System.out.println("NO HAS INGRESADO UNA INSTRUCCION VALIDA");
              }
        } while(salir == false);
    }

    private static void gotas(int num) {
        if(num%3==0 || num%5==0 ||num%7==0){
            if(num%3==0){
            System.out.print("PLING");
            }
            if(num%5==0){
                System.out.print("PLANG");
            }  if(num%7==0){
                    System.out.println("PLONG");
                  }
         }else{
            String cadena= String.valueOf(num);
            System.out.print("\""+cadena+"\"");
         }
System.out.println("");
}

}