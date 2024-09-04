
package yo;

import java.util.Scanner;



public class Yo {
  
    static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
       
        iniciar();
     }
    static void iniciar(){
        int nums [] = new int[3];
        int cont =-1;
        boolean salir = false;
        do{
            System.out.println("INGRESE UN COLOR || \"TERMINAR PARA SALIR\"");
            String color = tc.next().toUpperCase();
            if(color.equals("TERMINAR")){
            salir=true;
             }else{
            Resistor ohmnios = new Resistor(color);
            int valor_color=ohmnios.getColor();
            if(valor_color!=-1){
            cont++;
            nums[cont]=valor_color;
             }else{
                System.out.println("ESTE COLOR NO ES VALIDO");
              }
            
             }
        
        }while(salir==false);
    imprimir(nums);
     }
   static void imprimir(int nums[]){
       String etiqueta;
       int numero1= nums[0];
       int numero2=nums[1];
       int numero_junto =cadena(numero1,numero2);
       long elevador=10;
       if(nums[2]!=0){
       elevador=  (long) (Math.pow(elevador,nums[2]));
        }
       if(elevador!=10){
           elevador= numero_junto*elevador;
           etiqueta= String.valueOf(elevador);
           if(etiqueta.length()>4){
               etiqueta =String.valueOf("\""+numero_junto)+" KILOOHMIOS"+"\"";
               System.out.println("----"+elevador+"----"+" OHMS");
           
             }else{
               etiqueta= String.valueOf("\""+elevador)+" KILOOHMIOS"+"\"";
               System.out.println("----"+elevador+"----" +"OHMS");
            }
                   
       }else{
           etiqueta = String.valueOf("\""+numero_junto)+" OHMIOS"+"\"";
           
        }
       System.out.println(etiqueta);
       
    }
   static int cadena(int num1,int num2){
   String numero1= String.valueOf(num1);
   String numero2=String.valueOf(num2);
   String juntos = numero1+numero2;
    int numero = Integer.parseInt(juntos);
   return numero;
     }
   
    }

  
