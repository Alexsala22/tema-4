package Ejercicios_tema_3;
/***
 * PROGRAMA DE BUSQUEDA DE NÚMEROS PRIMOS
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 16/10/2018
 *** 
 * CURSO: DM1B
 * 
 ***/
import java.util.Scanner;
public class Ej_3 {

	public static void main(String []args) {
		Scanner t= new Scanner(System.in);
		int i,j;
		
		System.out.println("Triángulo de asteriscos");
		System.out.println("-----------------------");
		System.out.println();
		System.out.print("número de filas a pintar: ");
		int n = t.nextInt();
		
		for(i=1; i<=n; i++) {
			for(j=0;j<i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
}