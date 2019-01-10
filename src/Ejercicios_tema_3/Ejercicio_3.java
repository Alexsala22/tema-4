//Crear un rombo de asteriscos.
package Ejercicios_tema_3;
/***
 * PROGRAMA DE ROMBO DE ASTERISCOS
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 16/10/2018
 *** 
 * CURSO: DM1B
 * 
 ***/
import java.util.Scanner;

public class Ejercicio_3 {

	
	
		public static void main(String[] args) {
			Scanner t= new Scanner(System.in);
			int i,j;
			int k;
			System.out.println("rombo de asteriscos");
			System.out.println("--------------------");
			System.out.println();
			System.out.println("numero de filas a pintar: ");
			int n = t.nextInt();
			k=n/2;
			
			for(i=1; i<=(k+1); i++) { 
				for(j=0;j<((k+1)-i);j++) {
					System.out.print(" ");
				}
				for(j=0;j<(i+(i-1)); j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(i=k; i>0; i--) { 
				for(j=(1-i+(k+1)-1);j>0;j--) {
					System.out.print(" ");
				}
				for(j=(i+(i-1));j>0;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
			
			
			
		

