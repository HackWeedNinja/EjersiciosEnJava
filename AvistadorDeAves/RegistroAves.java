
package com.mycompany.yo;




public class RegistroAves {
  private int recuentoSemanaPasada[]={0,2,5,3,7,8,4};
  private static int [] recuentoHoy= new int[7];
     public RegistroAves(int []hoy){
   recuentoHoy=hoy;
       }  
     
     public int[] getRecuentoSemanaPasada(){
     return recuentoSemanaPasada;
      }

    public int[] getRecuentoHoy() {
        return recuentoHoy;
    }
     public void verDatos(){
     for(int i =0; i<recuentoHoy.length; i++){
         System.out.println("DIA " + (i+1)+ " --> AVES " + recuentoHoy[i]);
          }
         System.out.println("HOY TE HAN VISITADO " + recuentoHoy[6]+ " AVES");
        }
     public void incrementarConteo(int cant){
     recuentoHoy[6]+=cant;
         System.out.println("SE HA INCREMENTADO LA CANTIDAD DE AVES DEL DIA DE HOY");
         System.out.println("AVES -> "+ recuentoHoy[6]);
      }
     public void sinVisitas(){
     for(int i =0; i<recuentoHoy.length; i++){
     if(recuentoHoy[i]==0){
         System.out.println("EL DIA " + (i+1)+ " TU JARDIN NO TUVO VISITAS");
            }else{
         System.out.println("NO TIENES DIAS SIN VISITAS, HAS TRABAJADO DURO :)");
         break;
             }
         }
     
       }
     public void visitantes(int num){
         int suma=0;
     for(int i =0; i<num; i++){
         suma+=recuentoHoy[i];
         }
         System.out.println("LA SUMA TOTAL DE AVES DE LO PRIMEROS " + num + " DIAS ES DE: " + suma);
       }
     public void diaPesado(){
         int cont =0;
     for(int i =0; i<recuentoHoy.length; i++){
     if(recuentoHoy[i]>=5){
     cont++;
          }
          }
         System.out.println("SE HAN TENIDO " + (cont+1)+" DIAS PESADOS");
     for(int i =0; i<recuentoHoy.length; i++){
     if(recuentoHoy[i]>=5){
         System.out.println("DIA: " + (i+1));
          }
       }
}
}