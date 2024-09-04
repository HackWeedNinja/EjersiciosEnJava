package principal;

import java.util.Scanner;


public class Principal {

    static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
            verTablero();
 
    }
    
    
    
    
    
    static void verTablero(){
         String tab[][] = new String[8][8];
      int tab2 [] = new Tablero().ajedrez();
        int cont =0;
        for(String [] i : tab){
           for(int j=0; j<i.length; j++){
           i[j]= "*";
           cont++;
             }
          }
        for(String i[]: tab){
             for (String j : i) {
                 System.out.print(j + " ");
             }
            System.out.println("");
         }

        buscarGrano(tab2);
     }
    static void buscarGrano(int [] tab){
        System.out.println("INGRESE EL NUMERO DEL CUADRO PARA VER LOS GRANOS");
        int num = tc.nextInt();
        System.out.println("EN LA CASILLA " + num+ " HAY " + new Tablero().granosCuadro(tab,num)+ " GRANOS DE MAIZ");
        System.out.println("HAY UN TOTAL DE: " +totalGranos(0,tab)+ " GRANOS DE MAIZ");
     }
    static int totalGranos(int num,int tab[]){
        int suma =tab[num];
        if(num==tab.length-1){
        return suma;
         }else{
            suma+=totalGranos(num+1,tab);
        return suma;
        
         }
      }
}