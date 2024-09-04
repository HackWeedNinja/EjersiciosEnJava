// cuenta del uno al diez luego del 2 al 10, del 3 al 10 y asi sucesivamente
package main;
import java.util.Scanner;

public class Main {
      
    static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        int fin =1;
       while(fin<=10){
         for(int i =fin; i<=10; i++){
             System.out.print(i+" ");
            }
           System.out.println("");
         fin++;
         }
           fin =10;
       while(fin>=1){
         for(int i =fin; i<=10; i++){
             System.out.print(i+" ");
            }
           System.out.println("");
         fin--;
         }
        System.out.println("");
    }
  
}
