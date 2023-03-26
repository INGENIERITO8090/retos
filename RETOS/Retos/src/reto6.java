 // importamos las librerias
 import java.util.*;
 // creamos la clase 
public class reto6 { 
  // invocamos el metodo de ejecucion   
    public static void main(String[] args) {
      // instanciamos la clase 
            Scanner leer = new Scanner(System.in);
            // definimos variables 

           String respuesta="mariposa",palabra;
  
            int i=3;

        // imprimimos reglas del juego 
        System.out.println(  " este es un programa que simula el juego de encuentra la palabra \n escribe en minuscula ");
        System.out.println(" tienes 3 intentos para adivinar la plabra por si escribes la palabra incorrecta pierdes un intento ");
        // creamos el ciclo 
          while (i>0) {
      // imprimimos  y capturamos
        System.out.println(" volando en el aire y besando las florez se pasa su vida de luz y colores  ¿quien soy? "); 
        palabra = leer.nextLine();
      // condicional 
        if  (palabra.equalsIgnoreCase(respuesta)){
          
          //imprimimos  

      System.out.println( " !adivinaste!  la palabra es mariposa ");
      // contador 
      i=i-4;
        }  
        else if (palabra != "mariposa" && i>0){
          // contador 
         i=i-1;   
         // imprimimos 
        System.out.println( "palabra incorrecta te quedan "+i+" intentos");


       
    }
  
 } System.out.println("gracias por jugar ");



  leer.close();
    }
    
}
