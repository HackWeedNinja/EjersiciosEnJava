
package yo;


public class Resistor {
   private int color;
   public Resistor(String resi){
   switch(resi){
       case "NEGRO"-> this.color=0;
       case "MARRON"-> this.color= 1;
       case "ROJO"-> this.color=2;
       case "NARANJA" -> this.color=3;
       case "AMARILLO"-> this.color = 4;
       case "VERDE"-> this.color=5;
       case "AZUL"-> this.color =6;
       case "VIOLETA" -> this.color=7;
       case "GRIS"-> this.color=8;
       case "BLANCO"-> this.color=9;
       default -> this.color =-1;
       }
    }
   public int getColor(){
   return color;
   }
   
}
