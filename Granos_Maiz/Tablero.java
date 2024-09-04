
package principal;

public class Tablero {
    private final int casillas []= new int [64];
    private int numeroGranos =1;
   public Tablero(){
   
    }
   public int[] ajedrez(){
   for(int i =0; i<casillas.length; i++){
       casillas[i]=numeroGranos*2;
       numeroGranos ++;
         }
   return casillas;
     }
    public int granosCuadro(int [] casillas,int gran){
        boolean salir = false;
    if(gran>=1 && gran<=64){
    gran--;
    for(int i =0; i<casillas.length; i++){
    if(gran== i){
    salir=true;
    break;
          }
         
       }
     if(salir){
    return casillas[gran];
    }
       }
   return 0;
     }
}
