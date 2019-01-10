package Ejercicios_tema_3;

import java.util.Scanner;

public class Año_bisiesto {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int a;
		do {
			System.out.println("introduce un año mayor que 0");
			a = t.nextInt();
		} while (a <= 0);

		if (a % 4 == 0) {
			if (a % 100 != 0) {
				System.out.println("leap year");
				} else {
					if (a % 400 == 0) {
						System.out.println("leap year");
				}else {
					System.out.println("leap year");
				}
			} 
		} else {
			if (a % 400 == 0) {
				System.out.println("leap year");
			} else {
				System.out.println("no leap year");
			}
		}

	}
}
