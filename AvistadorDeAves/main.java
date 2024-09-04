

package com.mycompany.yo;


import java.util.Scanner;

public class main {
static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        String nom ="-1";
        boolean salir = false;
        while(salir == false){
        System.out.println("INGRESE SU NOMBRE PARA CONTINUAR");
         String nombre = tc.next();
         if(!nom.equals(nombre)){
             System.out.println("ESTE NOMBRE NO ESTA REGISTRADO INGRESE LA PALABRA \"AGREGAR\" PARA AGREGARLO");
             String pal = tc.next().toUpperCase();
             if(pal.equals("AGREGAR")){
                 System.out.println("EL NOMBRE SE A AGREGADO CORRECTAMENTE, INICIE CON SU NOMBRE POR FAVOR");
             nom = nombre;
               }else{
             throw new Error("NO HAS ESCRITO BIEN LA PALABRA. REINICIE EL PROGRAMA");
               }
          }else{
           ingresoDeAves();
           salir = true;
            }
        }
    }
    
   static void aves(int[] hoy){
      RegistroAves registro = new RegistroAves(hoy);
           boolean salir = false;
do{
       System.out.println("INGRESE EL NUMERO 1 PARA VER EL REGISTRO DE LA SEMANA ANTERIOR");
       System.out.println("O INGRESE CUALQUIER NUMERO PARA SEGUIR CON EL REGISTRO ACTUAL");
       int num = tc.nextInt();
       if(num!=1){
           System.out.println("1: VER REGISTRO DE LAS AVES DE ESTA SEMANA\n2: INCREMENTAR AVE\n3: COMPROVAR DIAS SIN VISITAS\n4: CALCULAR LA CANTIDAD DE AVES DE CIERTOS DIAS\n5: VER CUANTOS DIAS FUERON LOS MAS AJEDREADOS");
       int decion = tc.nextInt();
       switch(decion){
           case 1->{
               registro.verDatos();
           break;
            }case 2->{
                System.out.println("INGRESE EL INCREMENTO DE AVES");
                int incre = tc.nextInt();
                registro.incrementarConteo(incre);
           break;
            }case 3->{
                registro.sinVisitas();
           break;
            }case 4->{
                System.out.println("INGRESE LOS PRIMEROS DIAS QUE SE CALCULAR LA CANTIDAD DE AVES");
                int dias = tc.nextInt();
                registro.visitantes(dias);
           break;
            }case 5->{
                registro.diaPesado();
           break;
            }
         }
       }else{
          for(int i=0; i<registro.getRecuentoSemanaPasada().length; i++){
              System.out.println("------------");
              System.out.println("DIA: " +(i+1)+ " AVES --> " + registro.getRecuentoSemanaPasada()[i]);
               System.out.println("------------");
             }
          }
         System.out.println("DESEA CONTINUAR?\n1: PARA SI\n2: PARA NO");
           int sino = tc.nextInt();
           if(sino==2){
           salir=true;
              }else if(sino == 1){
           salir = false;
              }else{
               System.out.println("NUMERO INCORRECTO");
               }
} while(salir==false);
     }
   static void ingresoDeAves(){
       int avesHoy[] = new int[7];
       System.out.println("REGISTRAR AVES DE ESTA SEMANA");
       for(int i =0; i<avesHoy.length; i++){
           System.out.println("INGRESE LA CANTIDAD DE AVES DEL DIA " + (i+1));
           avesHoy[i]=tc.nextInt();
        }
       aves(avesHoy);
     }
}
