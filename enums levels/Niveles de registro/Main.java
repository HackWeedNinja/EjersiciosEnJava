
package main;

import Niveles.Elementos;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
         static Scanner tc = new Scanner(System.in);
     
          
    public static void main(String[] args) {
      ingresar();
        
    }

    private static void ingresar() {
        System.out.println("DE QUE NIVEL SERA SU ETIQUETA");
        System.out.print("INF\nTRC\nDBG\nWRN\nERR\nFTL\n");
        String codi = tc.next().toUpperCase();
        tc.nextLine();
        System.out.println("INGRESE LA FRASE QUE IRA EN SU MENSAJE DE ERROR");
        codi="["+codi+"]"+": ";
        codi+= tc.nextLine();
        comprobar_etiqueta(codi);
    }
    private static void comprobar_etiqueta(String codi){
    Registro re = new Registro(codi);
    re.etiqueta();
     }
}