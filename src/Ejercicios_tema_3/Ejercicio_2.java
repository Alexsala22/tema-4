//Crear una piramide de asteriscos.
package Ejercicios_tema_3;
/***
 * PROGRAMA DE PIRAMIDE DE ASTERISCOS
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 16/10/2018
 *** 
 * CURSO: DM1B
 * 
 ***/
import java.util.Scanner;
public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int i, j;

		System.out.println("Triángulo de asteriscos");
		System.out.println("-----------------------");
		System.out.println();
		System.out.print("número de filas a pintar: ");
		int n = t.nextInt();
		for (i = 1; i <= n; i++) { // Control de fila
			for (j = 0; j < ((n - 1) - 1); j++) { // control de espacios
				System.out.print(" ");
			}
			for (j = 0; j < (1 + ((i - 2) + 1)); j++) { // control de asteriscos
				System.out.print("*");
			}
			System.out.println();
		
		
		}

	}
}
