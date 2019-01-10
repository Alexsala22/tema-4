package Ejercicios_tema_3;

/***
 * PROGRAMA DE validacion de capicua de 3 cifras
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 16/10/2018
 *** 
 * CURSO: DM1B
 * 
 ***/
import java.util.Scanner;

public class capicua {
	//método el cual validará si el numero es correcto o no
	public static boolean validar(int numero) {
		if ((numero <= 100) || (numero >= 9999999)) {
			return false;
		} else {
			return true;
		}
	}
	//método el cual nos permite introducir el numero de 7 cifras
	public static String capicua(int n) {
		int comprobacion = n;
		int n1, n2, n3, n4, n5, n6, n7;
		String validar;
		n1 = comprobacion % 10;
		comprobacion = comprobacion / 10;
		n2 = comprobacion % 10;
		comprobacion = comprobacion / 10;
		n3 = comprobacion % 10;
		comprobacion = comprobacion / 10;
		n4 = comprobacion % 10;
		comprobacion = comprobacion / 10;
		n5 = comprobacion % 10;
		comprobacion = comprobacion / 10;
		n6 = comprobacion % 10;
		comprobacion = comprobacion / 10;
		n7 = comprobacion % 10;
		comprobacion = comprobacion / 10;

		System.out.println("los digitos del numero introducido son: " + n7 + ", " + n6 + ", " + n5 + ", " + n4 + ", "
				+ n3 + ", " + n2 + ", " + n1);
		//método el cual nos indica si el numero introducido es o no capicúa
		if (n1 == n3) {
			validar = "el numero es capicua, ";
		} else if (n1 == n4) {
			validar = "el numero es capicua, ";
		} else if (n1 == n5) {
			validar = "el numero es capicua, ";
		} else if (n1 == n6) {
			validar = "el numero es capicua, ";
		} else if (n1 == n7) {
			validar = "el numero es capicua, ";
		} else {
			validar = "el numero no es capicua, ";
		}

		System.out.print(validar);
		return validar;
	}

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		System.out.println("introduce un numero de entre 3 y 7 cifras");
		int n = t.nextInt();
		while (validar(n) == false) {
			System.out.println("El numero introducido es invalido, por favor");
			System.out.println("introduce uno de entre 3 y 7 cifras");
			n = t.nextInt();
		}
		while (validar(n) == true) {
			capicua(n);
			System.out.println("introduzca otro numero");
			n = t.nextInt();

		}

	}
}	