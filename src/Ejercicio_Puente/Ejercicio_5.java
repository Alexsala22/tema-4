/***
 * PROGRAMA DE conjetura de Collatz entre un intervalo dado por el usuario.
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 08/12/2018
 *** 
 * CURSO: DM1B
 * 
 ***/
package Ejercicio_Puente;
import java.util.Scanner;
public class Ejercicio_5 {
	
	
	//VALORES ESTÁTICOS
	public static Scanner t = new Scanner(System.in);
	public static int MAX=0;
	public static int j=0;
	
	/*	public static void longciclo()
	 * 			entradas--> minimo: se le introduce el numero menor del intervalo
	 * 						maximo: se le introduce el numero mayor del intervalo
	 * 			salidas-->  numero: nos devuelve la sucesion de collatz para cada numero determinado
	 * 
	 * este metodo nos permite calcular la sucesion de Collatz para los numeros contenidos en el intervalo especificado
	 */
	public static void longciclo() {
		System.out.println("Introduzca el numero de inicio (mayor que 0)");
		int minimo= t.nextInt();
		System.out.println(minimo);
		while(minimo<0) {
			System.out.println("numero introducido incorrecto, introduzca uno de nuevo");
			minimo=t.nextInt();
		}
		System.out.println("Introduzca el numero de fin (mayor que 0)");
		int maximo= t.nextInt();
		
		while(maximo<0) {
			System.out.println("numero introducido incorrecto, introduzca uno de nuevo");
			maximo=t.nextInt();
		}
		
		System.out.println(minimo);
		
		for(int i=minimo;i<=maximo;i++) {
			System.out.println(i);
			
			int numero=i;
			j=0;
			
			
		while(numero!=1) {
			j++;
			
			if (numero%2==0)		numero=numero/2;
			else					numero=(numero*3)+1;
	
			System.out.println(numero);
		}
			if(j>MAX)	MAX=j;
		System.out.println("-------------------------");
	}
		
	
	}
	

	
	/*	public static void main(String[]args)
	 * 			entradas--> 
	 * 						
	 * 			salidas-->  longciclo(): nos permite calcular la sucesion de Collatz para los numeros contenidos en el intervalo especificado
	 * 						MAX: es el numero maximo de interacciones dentro de una sucesion para cada numero.
	 * este metodo nos sirve para calcular el numerode sumas en el intervalo dado.
	 */
	public static void main(String[]args) {
		longciclo();
		System.out.println("el numero mas alto de iteraciones es: " +(MAX+1));
	}

}
