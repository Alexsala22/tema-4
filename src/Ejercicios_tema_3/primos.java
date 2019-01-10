package Ejercicios_tema_3;

import java.util.Scanner;

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

public class primos {
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Hasta que numero quieres que se muestren los primos");
		int limite = Keyboard.nextInt();

		for (int i = 1; i <= limite; i++) {
			if (esPrimo(i)) {
				System.out.println("Numero Primo:" + i);
			}
		}
	}

	public static boolean esPrimo(int numero) {
		int aux;
		for (int cont = 2; cont < numero; cont++) {
			aux = numero % cont;
			if (aux == 0)
				return false;
		}
		return true;
	}
}
