//hacer un programa que nos muestre por pantalla el mayor y el menor de tres numeros que introduzcamos
package Ejercicios_tema_3;
/***
 * PROGRAMA DE MAYOR Y MENOR
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 16/10/2018
 *** 
 * CURSO: DM1B
 * 
 ***/
import java.util.Scanner;

public class Ejercicio_1 {
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);

		int a;
		int b;
		int c;

		System.out.println("dame el primer numero");
		a = Keyboard.nextInt();
		System.out.println("dame el segundo numero");
		b = Keyboard.nextInt();
		System.out.println("dame el tercer numero");
		c = Keyboard.nextInt();
		Keyboard.close();

		if (a > b && a > c) {
			System.out.println(a + " Es el numero mayor y");
		}
		if (b > a && b > c) {
			System.out.println(b + " Es el numero mayor y");
		}
		if (c > b && c > a) {
			System.out.println(c + " Es el numero mayor y");
		}
		if (a < b && a < c) {
			System.out.println(a + " Es el numero menor.");
		}
		if (b < a && b < c) {
			System.out.println(b + " Es el numero menor.");
		}
		if (c < b && c < a) {
			System.out.println(c + " Es el numero menor.");
		}

	}

}
