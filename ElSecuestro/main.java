

package com.mycompany.yo;

import java.util.Random;
import java.util.Scanner;

public class main {
static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("INGRESE 1 PARA INICIAR EL RESCATE");
        int num = tc.nextInt();
        if(num == 1){
        boolean inicio = iniciarRescate();
        if(inicio){
            System.out.println("ENHORABUENA");
            System.out.println("SE HA RESCATADO AL PRISIONERO");
            }else{
            System.out.println("----------------------------------");
            System.out.println("SE A HECHO LO POSIBLE PERO");
            System.out.println("EL PRISIONERO A MUERTO :(");
            System.out.println("----------------------------------");
            }
         }
       }

    private static boolean iniciarRescate() {
        Random numeros = new Random();
        int cab = 1+numeros.nextInt(20);
        int ar = 1+numeros.nextInt(20);
       int pri = 1+numeros.nextInt(20);
       int per = 1+numeros.nextInt(20);
        Secuestradores secuestro = new Secuestradores(cab,ar,pri,per);
        boolean atacRap = Annalyn.ataqueRapido(secuestro.getCaballero());
        if(atacRap){
            System.out.println("SE A EJECUTADO UN ATAQUE RAPIDO");
         }
        boolean espiar = Annalyn.espiar(secuestro.getCaballero(), secuestro.getArquero(), secuestro.getPrisionero());
        if(espiar){
            System.out.println("SE A ESPIADO A LOS SECUESTRADORES");
         }
        boolean señalar = Annalyn.señal(secuestro.getArquero(), secuestro.getPrisionero());
        if(señalar){
            System.out.println("HAN VOLADO LOS PAJAROS Y HAN DADO UNA SEÑAL");
         }
        boolean perro= secuestro.getPerro();
        if(perro){
            System.out.println("EL PERRO A JUGADO UN PAPEL IMPORTANTE, SE MERECE UNA GALLETA");
         }else{
            System.out.println("EL PERRO SE A QUEDADO DORMIDO EN LA HABITACION, FUE NECESARIO");
          }
        boolean rescate = Annalyn.rescatarAnna(secuestro.getCaballero(),secuestro.getArquero(),secuestro.getPerro(),secuestro.getPrisionero());
        return rescate;
    }
    
   
}
