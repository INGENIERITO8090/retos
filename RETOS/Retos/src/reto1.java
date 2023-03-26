  // importamos la clase escanner 
     import java.util.Scanner; 
  // creamos la clase con el nombre reto 1 
    public class reto1 {  
   // creamos el metodo de ejecuion "main" invoca el jdk 
        public static void main(String[] args) {  
     // creamos el objeto de la clase escanner 
        Scanner leer = new Scanner(System.in); 

     // declararamos  variables  inicializasas por que los resultados de estan  van a ser opreciones 
        double temp_f =0; 
        
        double temp_c=0; 

        double temp_k=0; 

       
      
    // solicitamos datos segun el reto    
         System.out.println( " digite la tempemperatura en fahrenheitº");
        temp_f=leer.nextDouble(); 
    // operamos para imprimir resultados  
     temp_c = temp_f -32/1.8 + 7; 
     temp_k = temp_f +273.15 + 7; 
    // este reto hace una convercion de escalas de temperatura , de grados fahrenheit a centigrados y de grados fahrenheit kelvin     

    // imprimimos resultados 
 
    System.out.println( "la convercion de grados fahrenheit "+temp_f+"º a  grados centigrados es "+temp_c+"º");
    System.out.println("la convercion de grados fahrenheit "+temp_f+"º a  grados centigrados es "+temp_k+"º");

leer.close();

}




    

 
 
 

}  

  

 

 

 
    
    


