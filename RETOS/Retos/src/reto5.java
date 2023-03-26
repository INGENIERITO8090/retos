// importamos librerias 
import java.util.*;
// creamos la clase 
public class reto5 {
// invocamos el metodo de ejecucion        
public static void main(String[] args) {
    // creamos objetos 
     Scanner leer  = new Scanner( System.in); 
     Random n_c = new Random();
// declaramos variables 
     String nombre; 
     int vidas=0,i=2;
     int edad,eleccion=0,ganador,eleccion_m=0;
    

 // solicitamos y capturamos
    System.out.println(" digite su nombre "); 
    nombre=leer.next(); 
    System.out.println(" digite su edad  ");  
    edad=leer.nextInt();  
     // creamos condicional 
    if(edad<=18 ||edad>=100 ){
        System.out.println(" usted no puede jugar  "); 
       
     }
     else; 
    
   //creamos condicional 
        if (edad>18 ){
            // ciclo 

            while (i>=vidas) {
        //  solicita y captura  eleccion usuario 
        System.out.println(" selecione \n1 piedra \n2 palel \n3 tijera  ");
        eleccion= leer.nextInt();
        // operacion para la eleccion de la maquina  
         eleccion_m=n_c.nextInt(3); 
       // condicional para mostar mensaje de la eleccion de la maquina 
        if (eleccion_m==0){System.out.println(" la maquina elije piedra ");}
        else if (eleccion_m==1){  System.out.println(" la maquina elije papel ");}
        else if (eleccion_m==2){   System.out.println(" la maquina elije tijera  ");}
        else;
// muestra  el ganador 
// con el contador se determina segun el resultado si pierde una vida o no  para cuando o gana o empata se e suma 0 a el contador  para cuando pierde se le resta 1 al contador para esto se le da inicio a al contador en 2  
     if(eleccion==0 && eleccion_m==0 ){  System.out.println(" empate con la maquina  ");  i=i+0;}
    else if (eleccion==1 && eleccion_m==1 ){  System.out.println(" usted pierde con la maquina \n usted perdio una vida  sus vidas restantes son "+i  ); i=i-1; }
     else if (eleccion==1 && eleccion_m==2 ){  System.out.println(" usted le gana ala maquina");i=i+0;}
     else if (eleccion==2 && eleccion_m==0){  System.out.println(" usted le gana ala maquina  ");i=i+0;  }
     else if (eleccion==2 && eleccion_m==1 ){  System.out.println(" empate con la maquina  ");i=i+0;  }
    else if (eleccion==2 && eleccion_m==2 ){  System.out.println(" usted pierde con la maquina \n usted perdio una vida  sus vidas restantes son "+i  ); i=i-1; }
    else if (eleccion==3 && eleccion_m==1 ){  System.out.println(" usted le gana a la maquina  ");i=i+0;  }
     else if (eleccion==3 && eleccion_m==0 ){   System.out.println(" usted pierde con la maquina \n usted perdio una vida  sus vidas restantes son "+i  ); i=i-1;  }
     else if (eleccion==3 && eleccion_m==2 ){  System.out.println(" empate con la maquina  ");  }
    

        } 
        // mostrar mensaje de agradecimiento 
 System.out.println( " GRACIAS POR JUGAR  ");
 // limpiamos el bufer s
leer.close();
} 
 
 }
     }
 
    



