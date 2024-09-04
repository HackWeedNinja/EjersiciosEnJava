
package main;
import java.util.Scanner;

public class Main {
  
    static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        Scrabble pa = new Scrabble();
        System.out.println("INGRESE UNA PALABRA");
        String pal = tc.next();
        System.out.println("TIENES " + pa.darValor(pal) + " PUNTOS");
    }
     }
