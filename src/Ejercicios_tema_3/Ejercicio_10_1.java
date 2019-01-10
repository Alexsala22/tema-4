package Ejercicios_tema_3;
/***
 * PROGRAMA DE MENU DE AREAS
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 16/10/2018
 *** 
 * CURSO: DM1B
 * 
 ***/
import java.util.Scanner;

public class Ejercicio_10_1 {
	final static double PI = 3.141592;

	/* método de validacion */
	public static boolean validar(int opc) {
		if ((opc < 1) || (opc > 4)) {
			System.out.println("ese numero no es valido, debe ser entre 1 y 4");
			return false;
		} else {
			return true;
		}
	}

	/* Método que calcula el area del rectángulo */
	public static double rectangulo(double a, double b) {

		return (a * b);
	}

	public static double triangulo(double a, double b) {
		return (a * b) / 2;
	}

	public static double circulo(double a, double b) {
		return a * a * PI;

	}

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		int opc = 0;
		double a = 0.0, b = 0.0;

		/* cabecera del programa */
		System.out.println("---------------------------------------");
		System.out.println("Cálculo del area de diferentes espacios");
		System.out.println("---------------------------------------");

		do {
			
			do {

				System.out.println();
				System.out.println("1.-Área de un rectángulo");
				System.out.println("2.-Área de un triángulo");
				System.out.println("3.-Área de un círculo");
				System.out.println("4.-Salir");
				System.out.println();
				System.out.println("Elegir una opción");
				opc = t.nextInt();
			} while (validar(opc) == false);

			switch (opc) {
			case 1:
				System.out.println();
				System.out.print("introduce la base del rectángulo");
				b = t.nextDouble();
				System.out.println("introduce la altura del rectangulo");
				a = t.nextDouble();

				System.out.println("El área del rectángulo es: " + rectangulo(a, b));
				break;
			case 2:
				System.out.println();
				System.out.print("introduce la base del triangulo");
				b = t.nextDouble();
				System.out.println("introduce la altura del triangulo");
				a = t.nextDouble();

				System.out.println("El área del rectángulo es: " + triangulo(a, b));
				break;
			case 3:
				System.out.println();
				System.out.print("introduce la base del circulo");
				b = t.nextDouble();
				System.out.println("introduce la altura del circulo");
				a = t.nextDouble();

				System.out.println("El área del rectángulo es: " + circulo(a, b));
				break;

			case 4: // salir del programa
				System.out.println("gracias por utilizar este programa.");
				break;

			}
		} while (opc!= 4);
	}
}
		
	
