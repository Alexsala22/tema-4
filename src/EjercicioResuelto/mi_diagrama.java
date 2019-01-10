package EjercicioResuelto;
import java.util.Scanner;
public class mi_diagrama {
	public static void main(String []args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce un numero por teclado");
		int año=teclado.nextInt();
		while (año<0) {
			System.out.println("introduce un numero por teclado");
		}
		
		if (año%4==0) {
			if(año%100==0) {
				if (año%400==0) {
					System.out.println("el año introducido es bisiesto");
				}else {
					System.out.println("el año introducido no es bisiesto");
				}
			}else {
				System.out.println("El año introducido no es bisiesto");
			}
		}else {
			if (año%400==0) {
				System.out.println("el año introducido es bisiesto");
			}else {
				System.out.println("el año introducido no es bisiesto");
			}
			}
		}
	}

