
package main;

import java.util.Random;


public class Jardineria {
    
    private static int contadorNiño=-1;
    private final String niño [] = {"ALICE", "BOB", "CHARLIE", "DAVID", "EVE", "FRED", "GINNY", "HARRIET", "ILEANA", "JOSEPH", "KINCAID" , "LARRY"};
    private static String jardin [][] = new String[2][24];
    private final String plantas[] = {"G","C","R","V",}; 
    private static int columna =0;
    private static int fila=0;
    public Jardineria(){
    relleno_jardin();
    }
    
    
    
    private static void relleno_jardin(){
    for(String [] i : jardin){
        for(int j =0; j<i.length; j++){
        i[j] = ".";
            }
         }
     
    
    
     }
    public String darPlantas(){
    Random dar = new Random();
    String planta1 = plantas[dar.nextInt(plantas.length)];
    String planta2 = plantas[dar.nextInt(plantas.length)];
    String planta3 = plantas[dar.nextInt(plantas.length)];
    String planta4 = plantas[dar.nextInt(plantas.length)];
    if(columna != jardin[0].length-2 || fila != jardin[0].length-2){
      jardinear(planta1,planta2,planta3,planta4);
    }
    planta1 = plantar(planta1);
    planta2 = plantar(planta2);
    planta3 = plantar(planta3);
    planta4 = plantar(planta4);
    
    contadorNiño++;
    
    return contadorNiño!=niño.length ? niño[contadorNiño] + " PLANTAS: "+ planta1+ " - " + planta2 + " - " + planta3 + " - " + planta4 : "YA SE HAN DADO TODAS LAS PLANTAS"; 
             
     }
    public void  jardinear(String planta1,String planta2,String planta3,String planta4){
        String planticas [] = {planta1,planta2,planta3,planta4};
      
        if(!jardin[0][0].equals(".")){
            columna+=2;
            fila+=2;
        jardin[0][0+columna] = planticas[0];
        jardin[0][1+fila] = planticas[1];
        jardin[1][0+columna] = planticas[2];
        jardin[1][1+fila] = planticas[3];
        }else{
         jardin[0][0] = planticas[0];
        jardin[0][1] = planticas[1];
        jardin[1][0] = planticas[2];
        jardin[1][1] = planticas[3];
         }
        }
     
    public void mostarJardin(){
        System.out.println("[WINDOW] [WINDOW]");
       for(String i [] : jardin){
            for (String j: i) {
                System.out.print(j);
            }
            System.out.println("");
         }
     }

    private String plantar(String planta) {
     String retorno = null;
     switch(planta){
         case "G"-> retorno = "Hierba";
       case "C"-> retorno = "Trebol";
       case "R"-> retorno = "Rabano";
       case "V"-> retorno = "Violeta";
     }
     
     
     return retorno;
    }
   public String[] getNIño(){
   return niño;
    }
}
