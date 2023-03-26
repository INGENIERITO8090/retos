// importamos librerias 
import java.util.*;
// creamos la clase 
public class reto8 { 
// creamos el metodo de ejecucion 
    public static void main(String[] args) {
      // instanciamos la clase  
      Scanner leer = new Scanner(System.in);
         Random n_c = new Random(); 
// declaramos las variables 
         String j_1,j_2;
         int r_1 ,r_2 ,vj1=3,vj2=3,j=0,decicion,rp,h=0;  
        

//  solicitamos y capturamos datos 
       System.out.println( " ingrese nombre del jugador 1 ");
            j_1=leer.next();
       System.out.println(" ingrese el nombre del jugador 2" );
            j_2=leer.next();

            // creamos un ciclo tipo do while 
   do {           
    
    do{       // creamos un ciclo do while dentro de otro ciclo do while  
// operamos para obtener  el resultado del primer jugador
        r_1=n_c.nextInt(6);
        // le sumamos 1 a ese resultado para que no de 0 
        r_1=r_1+1; 
// imprimimos resultado 
         System.out.println( j_1+" saco "+r_1);  
// operamos para obtener el resultado del segundo  jugador  
         r_2=n_c.nextInt(6);
         // le sumamos 1 a ese resultado para que no de 0 
         r_2=r_2+1;  
         // imprimimos resultado 
         System.out.println( j_2+" saco "+r_2); 
        
        // creamos condicional para determinar el ganador 
         if (r_1>r_2){
  System.out.println(j_1+" gana " );
  vj1=vj1+0;
  vj2=vj2-1;
System.out.println(j_2+" pierde   \n"+j_2+" pierde una vida \n vidas restantes " + j_2+vj2 ); 

  } 
  else if (r_2>r_1){  

    System.out.println(j_2+" gana " );
    vj1=vj1-1;
   vj2=vj2+0;
  System.out.println(j_1+" pierde   \n"+j_1+" pierde una vida \n vidas restantes  "+ j_1 +vj1 ); 
   

  } 
  else if (r_1==r_2 ){
      System.out.println( j_1 +" empata con "+j_2  );
      vj1=vj1+0;
      vj2=vj2+0;

  }
// solicitar opccion del usuario
  System.out.println((vj2>=1 && vj1>=1)?"  digite 0 para jugar los dados  digite 1 para abandonar el juego" : "fin del juego  ");
  decicion=leer.nextInt();
// condicional tipo swicht que evalua la opcion elegida por el usuario 
  switch(decicion){
    case 0 : 
    j=j+0;
    break;
    case 1:
    j=j+1;
    break; }
  }while(j>1);// condicion del do while interior  
 }while(vj1>=0 && vj2>=0); // condicion del do while del do while exterior 

 


leer.close();





          }
         

    }
    

