package main;

import Niveles.Elementos;


public class Registro {
    private String formato;
    public Registro(String formato){
   this.formato=formato;
   
     }
    
    public void etiqueta(){
    char assci [] = new char[3];
    int cont=1;
    for(int i =0;i<3; i++){
    assci[i]= formato.charAt(cont);
    cont++;
       }
    String acum = String.valueOf(assci[0]);
    String acum1 = String.valueOf(assci[1]);
    String acum2 = String.valueOf(assci[2]);
    String total= acum+acum1+acum2;
        System.out.println(formato+"\nNIVEL: " + darEtiqueta(total));
     }

    private Elementos darEtiqueta(String total) {
        switch(total){
            case "INF"-> {return Elementos.INFO;}
            case "TRC"-> {return Elementos.TRACE;}
            case "DBG"-> {return Elementos.DEBUG;}
            case "WRN"-> {return Elementos.WARNING;}
            case "ERR"-> {return Elementos.ERROR;}
            case "FTL"-> {return Elementos.FATAL;}
            default -> {return Elementos.UNKNOWN;}
            
         }
    }
    
    
}