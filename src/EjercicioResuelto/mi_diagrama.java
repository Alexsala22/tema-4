package EjercicioResuelto;
import java.util.Scanner;
public class mi_diagrama {
	public static void main(String []args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce un numero por teclado");
		int a�o=teclado.nextInt();
		while (a�o<0) {
			System.out.println("introduce un numero por teclado");
		}
		
		if (a�o%4==0) {
			if(a�o%100==0) {
				if (a�o%400==0) {
					System.out.println("el a�o introducido es bisiesto");
				}else {
					System.out.println("el a�o introducido no es bisiesto");
				}
			}else {
				System.out.println("El a�o introducido no es bisiesto");
			}
		}else {
			if (a�o%400==0) {
				System.out.println("el a�o introducido es bisiesto");
			}else {
				System.out.println("el a�o introducido no es bisiesto");
			}
			}
		}
	}

