
package com.mycompany.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Principal {
    static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("INGRESE EL NUMERO");
        int num = tc.nextInt();
        System.out.println("INGRESE EL NUMERO A ELIMINAR");
        int borrar = tc.nextInt();
       List<Integer> lista = new ArrayList<>();
        while(num>0){
        int digito = num%10;
            lista.add(digito);
            num/=10;
         }
        int vector[] = new int[lista.size()];
        int cont=0;
       for(int i = vector.length-1; i>=0; i--){
           vector[cont] = lista.get(i);
           cont++;
         }
       for(Integer i :eliminar(vector,borrar)){
           System.out.print(i);
        }
        System.out.println("");
    }

    private static List<Integer> eliminar(int[] vector, int borrar) {
        List<Integer> nueva = new ArrayList<>();
      for(int i : vector){
      if(i==borrar){
      continue;
         }
         nueva.add(i);
       }
     return nueva;
    }

  
}
