
import java.util.List;
import java.util.Scanner;

public class  Yo{

    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        Segumiento lista = new Segumiento();
        boolean bandera = false;
        do{
        inicio(lista);
            System.out.println("CONTINUAR S/N?");
            String salir = tc.next().toUpperCase();
            if(salir.equals("S") || salir.equals("N")){
            if(salir.equals("N")){
            bandera = true;
              }
             }else{
                System.out.println("NO HAS INGRESADO UNA OPCION VALIDA");
                throw new IllegalAccessError("EXPRESION ILEGAL");
                
             }
                    
                    }while(bandera == false);
    }

    static void inicio(Segumiento obj) {
        System.out.println("---INGRESE UNA OPCION---");
        System.out.println("1: AGREGAR LENGUAJE\n2: BORRAR LENGUAJE\n3: VERIFICAR LENGUAJE\n4: CANTIDAD DE LENGUAJES REGISTRADOS\n5: VER LISTA\n6: EMOCION\n7: PRIMER LENGUAJE\n8: VERIFICAR SI LA LISTA ESTA VACIA");
        int decicion = tc.nextInt();
        if (decicion == 1 || decicion == 2 || decicion == 3 || decicion == 4 || decicion == 5 || decicion == 6 || decicion == 7 || decicion == 8) {
            darMensaje(obj, decicion);
        }else{
            System.out.println("-------------------ERROR-------------------");
            System.out.println("**********************************************");
        throw new IllegalArgumentException("HAS INGRESADO UN ARGUMENTO QUE NO ESTA EN LAS ESPESIFICACIONES");
   
         }
    }

    static void darMensaje(Segumiento obj, int num) {
        switch (num) {
            case 1 -> {
                System.out.println("INGRESE EL LENGUAJE");
                String len = tc.next().toUpperCase();
                obj.Agg_lenguajes(len);
                break;
            }
            case 2 -> {
                System.out.println("INGRESE EL LENGUAJE QUE SE ELIMINARA");
                String len = tc.next().toUpperCase();
                obj.borrarLenguaje(len);
                break;
            }
            case 3 -> {
                System.out.println("INGRESE EL LENGUAJE PARA VERIFICAR");
                String leng = tc.next().toUpperCase();
                boolean esta = obj.verificar_lenguaje(leng);
                if (esta) {
                    System.out.println(leng + " ESTA EN LA LISTA");
                } else {
                    System.out.println(leng + " NO ESTA EN LA LISTA");
                }
                break;
            }
            case 4 ->
                System.out.println("TIENE REGISTRADOS " + obj.cantidad_idiomas() + " LENGUAJES");
            case 5 ->
                obj.verLista();
            case 6 -> {
                boolean vacia = obj.listaVacia();
                if(obj.emocionante()){
                    System.out.println("TU LISTA ES MUY EMOCIONANATE");
                 }else{
                   if(vacia==false){
                       System.out.println("TU LISTA ES BUENA :)");
                    }
                 }
                break;
            }
            case 7 -> System.out.println("TI PRIMER LENGUAJE APRENDIDO ES: " + obj.primerLenguaje());
            case 8 -> obj.listaVacia();
        }
    }
}
