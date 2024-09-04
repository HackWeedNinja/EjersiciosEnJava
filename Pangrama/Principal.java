package principal;

import java.util.Scanner;


public class Principal {

    static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("INGRESE UNA PALABRA");
        String palabra = tc.nextLine();
    System.out.println("VERIFICANDO PALABRA "+ palabra);
    if(pangrama(palabra)){
        System.out.println("ESTA PALABRA ES UN PANGRAMA");
      }else{
        System.out.println("LA PALABRA NO ES UN PANGRAMA");
      }
   
    }
    static boolean pangrama(String pal){
   String abc []= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
   boolean pangrama=false;
   int cont =0;
  
       for(String i : abc){
          int cont2 =0;
       for(int j =0; j<pal.length(); j++){
           if(cont2==1){
           break;
            }else{
          String let = i;
          String let2 = String.valueOf(pal.charAt(j));
          if(let.equalsIgnoreCase(let2)){
              cont2++;
          cont++;
           }
       }
    }
    
}
       if(cont>=27){
       
        pangrama=true;
       return pangrama;
       }else{
       return pangrama;
        }
    }
}