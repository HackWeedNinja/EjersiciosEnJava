
package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> lista = new ArrayList<>();
    static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("SEMILLAS\nC -> Hierba\nG -> Trebol\nR -> Rabano\nV -> Violeta ");
      jardin();
    
     }
    private static void jardin(){
        System.out.println("EL JARDIN ESTA VACIO");
        Jardineria fila = new Jardineria();
        fila.mostarJardin();
            System.out.println("PULSE 1 PARA REPARTIR TODAS LAS PLANTAS A LOS ESTUDIANTES");
            int deci = tc.nextInt();
            if(deci==1){
               boolean salir = false;
            while(salir == false){
           String etiqueta = fila.darPlantas();
           if(etiqueta.equals("YA SE HAN DADO TODAS LAS PLANTAS")){
           salir = true;
                }else{
           lista.add(etiqueta);
                  }
             }
                System.out.println("SE HAN REPARTIDO TODAS LAS PLANTAS");
                boolean salir2;
                    do{
                System.out.println("1: VER JARDIN\n2: VER PLANTAS DE TODOS LOS ALUMNOS\n3: VER PLANTAS DE CIERTOS ALUMNOS");
                int dess = tc.nextByte();
                revicion(dess,fila);
                        System.out.println("INGRESE \"1\" PARA SEGUIR INGRESANDO O \"2\" PARA SALIR");
                        int sal = tc.nextByte();
                        salir2= sal==2;
                    } while(salir2 == false);
    }
   
}
    static void verificar(String nom, Jardineria obj){
      String niños[] = obj.getNIño();
      int pos =0;
      for(int i =0; i<niños.length; i++){
      if(niños[i].equals(nom)){
          pos=i;
      break;
         }
       }
        System.out.println(lista.get(pos));
        
        
    
     }
    static void revicion(int decicion, Jardineria obj){
        
        switch(decicion){
            case 1-> obj.mostarJardin();
                case 2-> {
                    for(String i : lista){System.out.println("-> " + i);}
                break;
                }
                    case 3-> {
                        System.out.println("LISTA");
                        String niños[] = obj.getNIño();
                        for(int i =0; i<niños.length; i++){
                            System.out.println((i+1)+ ": "+niños[i]);
                         }
                        boolean salir = false;
                        do{
                        System.out.println("INGRESE EL NOMBRE DEL ALUMNO");
                        String nom = tc.next().toUpperCase();
                        verificar(nom,obj);
                            System.out.println("BUSCAR OTRO ALUMNO S/N");
                            String deci = tc.next().toUpperCase();
                            if(deci.equals("S") || deci.equals("N")){
                            if(deci.equals("N")){
                            salir = true;
                             }
                             }else{
                                System.out.println("NO HAS INGRESADO UNA OPCION");
                             }
                        }while(salir==false);
                        break;
                     }
         }
     }
}