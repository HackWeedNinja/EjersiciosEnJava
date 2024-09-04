

import java.util.ArrayList;
import java.util.List;


public class Segumiento{
    
    private List<String> lenguajes = new ArrayList<>();
    
  public Segumiento(){}
  public void Agg_lenguajes(String lenguaje){
 
      lenguajes.add(lenguaje);
     
  
   }
  public void verLista(){
      if(lenguajes.isEmpty()){
      sinLenguaje();
       }else{
      for(String i : lenguajes){
          System.out.println(i);
       }
       }
   }
  private void sinLenguaje(){
      System.out.println("LA LISTA ESTA VACIA");
    }
  
  public boolean listaVacia(){
  boolean vacia = lenguajes.isEmpty();
  if(vacia){
  sinLenguaje();
    }
return vacia;
    }
  public void borrarLenguaje(String lenguaje){
  if(lenguajes.isEmpty()){
  sinLenguaje();
     }else{
      if(lenguajes.contains(lenguaje)){
      lenguajes.remove(lenguaje);
         }else{
          System.out.println("LA LISTA NO CONTIENE " + lenguaje);
        }
  
       }
   }
  public String primerLenguaje(){
      String primero=null;
  if(lenguajes.isEmpty()){
  sinLenguaje();
     }else{
  primero=lenguajes.getFirst();
   }
  return primero;
   }
  public int cantidad_idiomas(){
      int cant = lenguajes.size();
      if(cant==0){
      sinLenguaje();
      return cant;
       }else{
      return cant;
       }
    }
  public boolean verificar_lenguaje(String lenguaje){
      boolean leng=false;
      if(lenguajes.isEmpty()){
      sinLenguaje();
      return leng;
        }else{
      leng = lenguajes.contains(lenguaje);
      return leng;
       }
    }
  public boolean emocionante(){
  boolean emocion= lenguajes.contains("JAVA") || lenguajes.contains("KOTLIN");
  
  return emocion;
   }
}
