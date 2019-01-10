/*crear un programa el cual te muestre el lucky number de una persona, que se calcula haciendo que la fecha de nacimineto se 
 * convierta en un numero de un solo digito*/

package Ejercicios_tema_3;
/***
 * PROGRAMA DE CALCULAR LUCKY NUMBER
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 16/10/2018
 *** 
 * CURSO: DM1B
 * 
 ***/

import java.util.Scanner;

public class Ejercicio_5 {
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);

		int a;
		int b;
		int c;

		System.out.println("introduce tu fecha de nacimiento.");
		System.out.println("--------------------------------");
		System.out.println("Dia de nacimiento:");
		a = Keyboard.nextInt();
		while(a<1 || a>31) {
			System.out.println("el numero introducido no es valido, por favor, introduzca uno entre 1 y 31");
			a = Keyboard.nextInt();
		}
		System.out.println("mes de nacimiento:");
		b = Keyboard.nextInt();
		while(b<1 || b>12) {
			System.out.println("el numero introducido no es valido, por favor, introduzca uno entre 1 y 12");
			b = Keyboard.nextInt();
		}
		System.out.println("año de nacimiento:");
		c = Keyboard.nextInt();
		while(c<1 || c>2018) {
			System.out.println("el numero introducido no es valido, por favor, introduzca uno entre 1 y 2018");
			c = Keyboard.nextInt();
		}
		System.out.println("la fecha de nacimiento es " + a + "-" + b + "-" + c);

		int suma1 = a + b + c;
		System.out.println("La suma de estros tres da " + suma1);

		int Digito1 = suma1 % 10;
		System.out.println("El cuarto digito es: " + Digito1);
		suma1 = suma1 / 10;
		int Digito2 = suma1 % 10;
		System.out.println("El tercer dígito es: " + Digito2);
		suma1 = suma1 / 10;
		int Digito3 = suma1 % 10;
		System.out.println("El segundo dígito es: " + Digito3);
		suma1 = suma1 / 10;
		int Digito4 = suma1 % 10;
		System.out.println("El primero dígito es: " + Digito4);

		int suma2 = Digito1 + Digito2 + Digito3 + Digito4;
		System.out.println("La suma de estos cuatro es:");
		System.out.println(suma2);

		int num1 = suma2 % 10;
		System.out.println("El segundo digito es: " + num1);
		suma2 = suma2 / 10;
		int num2 = suma2 % 10;
		System.out.println("El primer digito es: " + num2);

		int num3 = num1 + num2;

		System.out.println("Tu 'Lucky number' es: " + num3);

	}
}
