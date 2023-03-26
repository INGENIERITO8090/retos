
    
// importamos librerias 
    import java.util.*;
    // creamos la clase 
    public class reto3 {
      // creamos el metodo de ejecucion 
    public static void main(String[] args) {
      // instanciamos clases 
        Scanner leer = new Scanner(System.in );
         Random n_c = new Random(2);
         // declaramos variables 
         int edad,eleccion=0, ganador=0;
         String nombre;
        // solicitamos y capturamos datos 
         System.out.println(" digite su nombre  ");
        nombre= leer.nextLine();
        System.out.println(" digite su edad ");
        edad=leer.nextInt(); 
       // operamos 

       // creamos el primer condicional  que consiste que el algoritmo no seguira su curso  si la edad es menor  a 18 
        if(edad<=18)  { 
        // imprimimos el resultado si el caso se cumple 
          System.out.println(" usted es menor de edad no puede  jugar ");}
       
       // creamos el segundo condicional que consiste en que si la edad digitada es mayot o igual a 18  el algoritmo seguira suu curso 
        else  if (edad>18){
          // solicitamos datos d
              System.out.println("elija cara o sello  \n1 cara \n2sello    ");
              //capturamos datos 
              eleccion=leer.nextInt();
              // creamos el primer condicional del segundo condicional  el algoritmo tomara el curso corespondiente a la eleccion del usuario 
               if (eleccion==1){
                // imprimimos resultados 
                System.out.println(" la maquina elije sello ");
               }
                else if(eleccion==2)  { 
                  // imprimimos datos 
                    System.out.println("la maquina  elije cara ");

                }
            
          
                    // operamos para saber el ganador   utilizando la clase ramdoom    
                      ganador=n_c.nextInt(2)+1;
          
                     // imprimimos 
                    System.out.println(+ganador );
                    // creamos el tercer condicional que dependiendo el resultado de la variable ganador mostrara un resultado 

                     if (ganador==1){
                     // imprime resultados
                    System.out.println(" gana cara ");}
                    // imprime resultados 
                     else {System.out.println("gana sello  ");}

// limpliamos el buffer 
    leer.close();
  }}}
    
    
        
       

    
    

        
      
    
    
    
