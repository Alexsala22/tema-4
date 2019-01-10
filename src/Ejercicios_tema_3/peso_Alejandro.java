/***
 * PROGRAMA DE MAYOR Y MENOR
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 30/10/2018
 *** 
 * CURSO: DM1B
 * 
 ***/

package Ejercicios_tema_3;

import java.util.Scanner;

public class peso_Alejandro {

	static Scanner t = new Scanner(System.in);
	/* Atributos */
	static double P; // kg
	static double p;

	/* conversor a kg */
	private static double convKg(double P, String l) {
		// tengo que pasar cualquier "p" en medida "l" a kg
		System.out.println("vuelve a introducir el numero");
		P = t.nextDouble();
		System.out.println("ahora introduce la unidad: ");
		System.out.println("lb = libras ");
		System.out.println("li = lingotes ");
		System.out.println("Oz = onzas ");
		System.out.println("P = peniques ");
		System.out.println("K= kilogramos ");
		System.out.println("G = gramos ");
		System.out.println("Q = quintales ");

		l = t.next();
		switch (l) {
		case "lb":
			p=P* 0.453;
			System.out.println(p + "kg");

			break;

		case "li":
			getLingotes(p);
			System.out.println(p + "Kg");
			break;

		case "Oz":
			p = P * 28.35;
			System.out.println(p + "Kg");
			break;

		case "P":
			p = P * 0.001;
			System.out.println(p + "Kg");
			break;

		case "K":
			p = P * 1;
			System.out.println(p + "Kg");
			break;

		case "G":
			p = P * 1000;
			System.out.println(p + "Kg");
			break;

		case "Q":
			p = P * 43.3;
			System.out.println(p + "Kg");
			break;
		}
		return p;
	}

	// metodo getLibras
	public static double getLibras(double p) {
		double lib;
		lib = p / 0.453;
		System.out.println(p + " Kg son: " + lib);
		return lib;
	}

	public static double getLingotes(double p) {
		double lin;
		lin = p * 0.068;
		System.out.println(p + " Kg son: " + lin + " lingotes");
		return lin;
	}

	// metodo getpeso
	public static double getPeso(double P, String l) {
		/* en funcion de l, convertir el peso k(kg) a libras */
		getLibras(P);
		return P;
	}

	/* constructor */
	public peso_Alejandro(double p, String l) {

	}

	public static void main(String[] args) {
		System.out.println("Introduce un numero para pasar a kg");
		P = t.nextDouble();
		String l = null;
		double a;
		a = convKg(P, l);
		int opc;

		do {
			System.out.println("1.- cambiar a libras");
			System.out.println("2.- cambiar a lingotes");
			System.out.println("3.- cambiar a Onzas");
			System.out.println("4.- cambiar a peniques");
			System.out.println("5.- cambiar a kilogramos");
			System.out.println("6.- cambiar a gramos");
			System.out.println("7.- cambiar a quintales");

			opc = t.nextInt();
		} while (opc < 1 || opc > 7);
		switch (opc) {
		case 1:
			getLibras(p);

			break;
		case 2:
			getLingotes(p);
			break;
		case 3:
			double onz;
			onz=p*0.035;
			System.out.println(p+" kg son: "+onz+" Onzas");
			break;
		case 4:
			double pen;
			pen=p*645.16;
			System.out.println(p+" kg son: "+pen+" peniques");
			break;
		case 5:
			double k;
			k=p;
			System.out.println(p+" kg son: "+k+ " kilogramos");
			break;
		case 6:
			double g;
			g=p*1000;
			System.out.println(p+" kg son: "+g+" gramos");
			break;
		case 7:
			double q;
			q=p*0.023;
			System.out.println(p+" kg son: "+q+" Quintales");
		}
	}
}
