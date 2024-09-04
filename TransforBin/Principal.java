package principal;
import java.util.Scanner;


public class Principal {
    static int cont;
    static  int numero;
    static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean salir = false;
        do{
        System.out.println("\t-------TRANSFORMAR NUMEROS BINARIOS-------\n");
        System.out.println("INGRESE UNA OPCION\n1: DE BINARIO A DECIMAL\n2: DE DECIMAL A BINARIO");
        byte decision = tc.nextByte();
        iniciar(decision);
        System.out.println("CONTINUAR EL PROGRAMA? S/N");
        String s = tc.next().toUpperCase();
        if(s.equals("N")){
            salir = true;
        }
        } while(salir==false);
    }



    static void iniciar(byte deci){
        switch(deci){
            
            case 1-> {
                System.out.println("INGRESE EL NUMERO EN BINARIO");
                long binario = tc.nextLong();
                long decimal = binario_Decimal(binario);
                if(decimal==0){
                    System.out.println("\t **********A OCURRIDO UN ERROR**********");
                    throw new Error("-----------> "+binario+" NO ES UN NUMERO BINARIO CORRECTO "+"<-----------");

                }else{
                System.out.println("EL NUMERO "+ binario+" EN DECIMAL ES: "+ decimal);
                }
                break;
            }case 2->{
                System.out.println("INGRESE EL NUMERO DECIMAL");
                numero = tc.nextInt();
                int decimal = numero;
                decimal_Binario(decimal);
                break;
            } default -> System.out.println("INGRESE UNA OPCION VALIDA");
        }
    } 

    

    // BINARIO A DECIMAL
       static long binario_Decimal(long num){
        String numeroCadena = String.valueOf(num);
        int numero[] = new int[numeroCadena.length()];
         int cont=0;
         for(int i =numeroCadena.length()-1; i>=0; i--){
         String nuevoNum= String.valueOf(numeroCadena.charAt(i));
         int acum = Integer.parseInt(nuevoNum);
         numero[cont]= acum;
         cont++;
          }
       long suma = conversion(numero);
       return suma;
        } 
        // CONVERSION DEL METODO BINARIO A DECIMAL
       static long conversion(int numero[]){
         int suma=0;
         int contador=1;
        for(int i: numero){
        if(i==1){
        suma+=contador;
        contador*=2;
            }else{
        contador*=2;
         }
         }
        return suma;
        }

        // DECIMAL A BINARIO
        static int decimal_Binario(int num){
            if(num==1){
                cont++;
            division(numero);
            return num;
            }else{
                
            cont++;
                return decimal_Binario(num/2);
            }
    }
    static void division(int num){
        int binario = num;
     int numeros []= new int[cont];
     int contador=0;
        while(binario>=1){
            numeros[contador] = binario%2;
            binario /=2;
        contador++;

        }
       mostrar(numeros);
     }
     static void mostrar(int arr[]){
        System.out.print("EL NUMERO " + numero+ " EN BINARIO ES: ");
        for(int i = arr.length-1; i>=0; i--){
        System.out.print(arr[i]);

        }
        System.out.println("");

     }
}