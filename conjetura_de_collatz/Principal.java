
package com.mycompany.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {
    static int cont =0;
    static List<Integer> numero = new ArrayList<>();
    static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("INGRESE UN NUMERO");
        int num = tc.nextInt();
        numero.add(num);
        System.out.println(collats(num));
        System.out.println("PASOS: "+ cont);
        System.out.println("NUMEROS: ");
        int contador=1;
        for(Integer i : numero){
            System.out.println("PASO # " +(contador)+" NUMERO: "+ i);
            contador++;
         }
    
     }

    private static int collats(int num) {
      if(num%2==0 && num!=1){
          numero.add(num/2);
          cont++;
      return collats(num/2);
        }else if (num%2!=0 && num!=1){
            numero.add((num*3)+1);
            cont++;
        return collats((num*3)+1);
         }else if(num==1){
         return num;
          }
      return 0;
    }
}
