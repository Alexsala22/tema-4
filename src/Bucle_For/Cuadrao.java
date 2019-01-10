package Bucle_For;

import java.util.Scanner;

public class Cuadrao {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		System.out.println("¿cuantas filas quieres?");

		int altura = leer.nextInt();
		int esp = leer.nextInt();
		int ast = leer.nextInt();
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < esp; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < ast; j++) {
				System.out.print('*');
			}
			System.out.println();
			esp--;
			ast += 2;
		}
		for (int i = 4; i <= 0; i--) {
			System.out.print("*");
		}
	}
}
