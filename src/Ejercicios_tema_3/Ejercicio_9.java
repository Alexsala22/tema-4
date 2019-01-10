package Ejercicios_tema_3;
/***
 * PROGRAMA DE ADIVINAR UN NUMRO ENTRE 0 Y 100
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 16/10/2018
 *** 
 * CURSO: DM1B
 * 
 ***/
import java.util.Scanner;
public class Ejercicio_9 {
	public static void main(String []args) {
		int random=(int) (Math.random()*(100-1)+1);
		
		Scanner t= new Scanner(System.in);
		System.out.println("dame un numero entre el 0 y el 100");
		int numero = t.nextInt();
			while(numero<0 || numero>100) {
				System.out.println("El numero introducido no es válido, por favor introduzca uno entre el 0 y el 100");
				numero = t.nextInt();
			}
		while(numero!=random) {
			System.out.println("Has fallado");
		
		
		
			if(numero<random) {
				System.out.println("el numero introducido era menor");
			}
			else {
				System.out.println("el numero introducido era mayor");
			}
			numero= t.nextInt();
			
			if(numero==random) {
				System.out.println("has acertado");
			}
		
		}
	
	
	}
}
