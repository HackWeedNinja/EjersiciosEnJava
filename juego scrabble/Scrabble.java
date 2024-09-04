
package main;



public class Scrabble {
    private int resultado;
    public Scrabble(){}
 
    
    public int darValor(String palabra){
    for(int i =0; i<palabra.length(); i++){
        resultado+=valores(palabra.charAt(i));
    
       }
    return resultado;
     }
    
    private static int valores(char caracter){
        String conver = String.valueOf(caracter);
   switch(conver.toUpperCase()){
       case "A","E","I","O","U","L","N","R","S","T"->{
           return 1;
        } case "D","G"->{
         return 2;
         } case "B", "C", "M", "P"->{
         return 3;
          } case "F", "H", "V", "W", "Y"->{ 
           return 4;
           } case "k"->{  
            return 5;
            } case "J","X"->{
            return 8;
             } case "Q","Z"->{
             return 10;
              }
   }
    return 0;
     }
}
