package EjercicioResuelto;

import java.util.Scanner;


public class metodos {
	/*
	 * Método: double getPeso(double p, String l);
	 * 
	 * Entradas: p -> objeto a convertir en l l -> Tipo de medida
	 * 
	 * Salida: np -> El peso de p en la medida l
	 */
	public static int getDato() {
		Scanner t = new Scanner(System.in);
		int d = t.nextInt();
		return d;
		
	}

	/*
	 * Método: String Imprimir();
	 * 
	 * Entradas: 
	 * 
	 * Salida: d -> 
	 */
	public static String imprimir(String d) {
		System.out.println(d);
		return d;
	}

	/*
	 * Método: double getSuma(int a, int b);
	 * 
	 * Entradas: a -> 1er sumando b -> 2º sumando
	 * 
	 * Salida: suma -> suma de a y b
	 */
	public static int getSuma() {
		System.out.println("dame el primer sumando: ");
		int a = getDato();
		System.out.println("dame el segundo sumando: ");
		int b = getDato();
		int suma = a + b;
		System.out.println("la suma de a y b es: " + suma);
		return suma;
	}

	public static void menu() {
		System.out.println("--------------------------------------");
		System.out.println("1.- dame la suma de a y b");
		System.out.println("2.- dame la resta de a y b");
		System.out.println("3.- dame la multiplicacion de a y b");
		System.out.println("4.- dame la division de a y b");
		System.out.println("0.- Salir");
		System.out.println("-------------------------------------");
		
	}

	/*
	 * Método: double getResta(int a, int b);
	 * 
	 * Entradas: a -> Minuendo b -> Sustraendo
	 * 
	 * Salida: resta -> minuendo-sustraendo
	 */
	public static int getResta() {
		System.out.println("dime el minuendo: ");
		int a = getDato();
		System.out.println("dime el sustraendo: ");
		int b = getDato();
		int resta = a - b;
		System.out.println("la resta de a y b es: " + resta);
		return resta;
	}

	/*
	 * Método: double getDiv(double a, double b);
	 * 
	 * Entradas: a -> 1er numerador b -> 2º divisor
	 * 
	 * Salida: Div -> la division entre a y b
	 */
	public static double getDiv() {
		System.out.println("dime el divisor");
		double a = getDato();
		System.out.println("dime el dividendo (no puede ser 0): ");
		double b = getDato();
		while (b == 0) {
			System.out.println("El divisor no puede ser 0, introduce un nuevo valor: ");
			b = getDato();
		}

		double div = a / b;
		System.out.println("la division de a y b es: " + div);
		return div;
	}

	/*
	 * Método: double getMulti(long a, long b);
	 * 
	 * Entradas: a -> 1er factor b -> 2º factor
	 * 
	 * Salida: mult -> multiplicacion de a y b
	 */
	public static long getMult() {
		System.out.println("dime el primer factor: ");
		long a = getDato();
		System.out.println("dime el segundo factor: ");
		long b = getDato();
		long mult = a * b;
		System.out.println("la multiplicacion de a y b es: " + mult);
		return mult;
	}

	public static void show() {
		int opc = getDato();
		do {
			switch (opc) {
			case 1:
				getSuma();
				break;
			case 2:
				getResta();
				break;
			case 3:
				getMult();
				break;
			case 4:
				getDiv();
				break;
			case 0:
				System.out.println("gracias por usar el programa");
				break;
			}
		} while ((opc < 0) || (opc > 4));

	}

	public static void main(String[] args) {
		menu();
		show();

	}
}
