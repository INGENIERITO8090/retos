  // importamos la clase escanner 
import java.util.Scanner; 
// creamos la clase 
public class reto2{ 
// creamos el metodo de ejecucuión 
public static void main (String[] args) {  

     // instanciar clase  
  Scanner leer  = new Scanner(System.in); 
// declarar variables 
  String  nombre_bebe; 

  String nombre_medico; 

  String nombre_vacuna; 

  String nombre_papa; 

  String nombre_eps; 

  double peso_bebe ; 

  int meses_bebe; 

  double dosis_vacuna=0; 

  // solicitar datos  
 System.out.println("escriba nombre bebe ");

// capturar datos  
nombre_bebe = leer.nextLine();

// solicitar datos  
System.out.println("escriba nombre medico  ");  

// capturar datos   
nombre_medico = leer.nextLine();  

   // solicitar datos  
System.out.println("escriba nombre vacuna "); 

   // capturar datos 
   nombre_vacuna = leer.nextLine(); 

   // solicitar datos  
   System.out.println("escriba nombre papa ");  

   // capturar datos  
   nombre_papa = leer.nextLine(); 

   // solicitar datos  
   System.out.println(" nombre eps"); 

   // capturar datos  
   nombre_eps = leer.nextLine();  

   // solicitar datos  
   System.out.println(" escriba el peso del bebe");  

   // capturar  datos  
   peso_bebe= leer.nextDouble();  

   //  solicitar  datos   
   System.out.println("digite cantidad de meses bebe");  

   // capturar datos   
   meses_bebe = leer.nextInt();  

     

 
 //operamos 

 dosis_vacuna = (peso_bebe*15)/(meses_bebe*15)*10;  

 
// 

 // imprimir resultados  

System.out.println(" el nombre del bebe es "+nombre_bebe+" el nombre del medico que lo atendio es "+nombre_medico+" el nombre de la vacuna es "+nombre_vacuna+"el nombre del papa es "+nombre_papa+" el nombre de la eps es "+nombre_eps+"el peso del bebe es "+peso_bebe+" la cantidd de meses de edad del bebe son "+meses_bebe+" la cantidad de dosis sumistrada fue  "+dosis_vacuna );  
   

 leer.close();
}

}





