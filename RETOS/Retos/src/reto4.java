// importamos librerias 
import java.util.*;
// creamos clases 
public class reto4 {    
    // invocamos  el metodo de ejecucion 
public static void main(String[] args) {
    // instanciamos creando objetos de otras clases 
         Scanner leer  = new Scanner( System.in); 
     Random n_c = new Random();
    // declaramos variables 
     String nombre; 
     int edad,eleccion=0,ganador,eleccion_m=0;
// solicitamos y capturamos datos 
    System.out.println(" digite su nombre "); 
    nombre=leer.nextLine(); 
    System.out.println(" digite su edad  ");  
    edad=leer.nextInt(); 

    // creamos condiciones 

    if(edad<=18 ||edad>=100 ){
        System.out.println(" usted no puede jugar  ");
    } 
    // creamos un condicional anidado 
     else if (edad>18 ){ 
        System.out.println(" selecione \n1 piedra \n2 palel \n3 tijera  ");
        eleccion= leer.nextInt();
    // opreracion para saber la eleccion de la maquina 
         eleccion_m=n_c.nextInt((3)+1);
       
       // condicional para mostrar  la eleccion de la maquina  
         if (eleccion_m==1){System.out.println(" la maquina elije piedra ");}
        else if (eleccion_m==2){  System.out.println(" la maquina elije papel ");}
        else if (eleccion_m==3){   System.out.println(" la maquina elije tijera  ");}
        else;}
// creamos el condicional para mostar resultados 

     if(eleccion==1 && eleccion_m==1 ){  System.out.println(" empate con la maquina  ");}
     else if (eleccion==1 && eleccion_m==2 ){  System.out.println(" gana la maquina  "); }
     else if (eleccion==1 && eleccion_m==3 ){  System.out.println(" usted le gana ala maquina");}
     else if (eleccion==2 && eleccion_m==1){  System.out.println(" usted le gana ala maquina  ");  }
     else if (eleccion==2 && eleccion_m==2 ){  System.out.println(" empate con la maquina  ");  }
     else if (eleccion==3 && eleccion_m==2 ){  System.out.println(" usted le gana a la maquina  ");  }
     else if (eleccion==2 && eleccion_m==1 ){  System.out.println(" usted le gana ala maquina   ");  }
     else if (eleccion==2 && eleccion_m==3 ){  System.out.println(" usted pierde con la maquina   ");  }
     else if (eleccion==3 && eleccion_m==1 ){  System.out.println(" usted pierde contra la maquina  ");  }
     else if (eleccion==3 && eleccion_m==2 ){  System.out.println(" usted le gana ala maquina  ");  }
     else if (eleccion==3 && eleccion_m==3 ){  System.out.println(" empate con la maquina  ");  }
    
 leer.close();

}
        
}
