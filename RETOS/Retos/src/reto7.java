// importamos libreria
import java.util.*;
// creamos la clase 
public class reto7 {
  // creamos el metodo de ejecucion  
    public static void main(String[] args) {
      // instanciamos 
      Scanner leer = new Scanner(System.in);
      // declaramos variables 
        String nombre,email,password,v_password;
        int n_tel,id,i=0,eleccion; 
        // creamos el ciclo do while
        do {
          // solicitamos y capturamos datos 
          System.out.println( "ingrese nombres completos ");
          nombre=leer.next(); 
          
          System.out.println("ingrese direccion de correo electronico  " );
          email= leer.next(); 

         System.out.println("digite el numero de su documento  ");
         id=leer.nextInt(); 

         System.out.println("digite le numero telefonico  ");
         n_tel=leer.nextInt(); 
        
         System.out.println("digite la contraseña  que utilizara  " );
         password=leer.next();
         System.out.println(" digite de nuevo la contraseña  "); 
        v_password=leer.next();
         // condicional  para confirmar contraseña
        if(password.equals(password)==v_password.equals(password)){ 
          System.out.println( " el registro del usuario se hizo correctamente  ") ;
           // solicitamos decicion 
          System.out.println("desea volver a llenar el formulario  de nuevo? \n digite 1 si lo desea   \n digite 2 si no lo desea ");
          eleccion=leer.nextInt();
          // condicion swhich que depende la decicion  modifica el contador 
          switch (eleccion){
            case 1 :
            // en el caso que el usuario desesee repetir el programa no se le suma a el contador y el contador va a tener un valor de 0 
         i=i+0;
        break;
        
        case 2:
        // en el caso de que  el usuario desee salir del programa le sumamos 2 a el contador para que inmediatamente salga del ciclo  
        i=i+2;
          }
           
          ;}
           // condicional en el caso de que las contraseñass no coincidan  no se le agrega contador para que el usuario llene bien el formulario y no salga del programa 
          else  {System.out.println( " ha ocurrido un error!    las contraseñas   (no  cionciden)  ");}
         
          // condicion del ciclo se ejecutara mientras el contador (i ) sea menor que 1 

              }while(i<1);
 

leer.close();
         


         







           
         




    }
    
}
