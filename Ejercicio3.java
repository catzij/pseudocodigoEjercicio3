import java.util.*;
public class Ejercicio3{
	public static void main (String args[]){
		Scanner read = new Scanner(System.in);

		//factorial de un numero

	int numero;
	int resultado=1;

	System.out.println( "Ingrese un numero");
	numero = read.nextInt();

	System.out.println("factorial de :"+numero+"!");

		while(numero >=1){

			resultado = resultado * numero;
 			
 			System.out.print(numero+"*");
	  	 	numero = numero - 1;
	  	 	
		}
		System.out.println("=");
		System.out.println(resultado);
	}

}