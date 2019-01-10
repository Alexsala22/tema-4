package vectores;

import java.util.Scanner;

public class Ejercicio2 {
	final static int MAX = 20;
	public static Scanner t = new Scanner(System.in);
	private static boolean flag;
	public static int num = 0;

	public static void main(String[] args) {
		int[] aleatorio = new int[20];
		int contador = 0;

		for (int i = 0; i < MAX; i++) {
			aleatorio[i] = (int) (Math.random() * 100) + 1;

			System.out.print(aleatorio[i] + " ");

		}
		System.out.println("");
		System.out.println("Introduce un valor mayor que cero");
		int a = t.nextInt();
		while (a < 0) {
			System.out.println("El numero introducido no es valido, introduce uno mayor que cero");
			a = t.nextInt();
		}
		System.out.println("Introduce otro valor mayor que cero");
		int b = t.nextInt();
		while (b < 0) {
			System.out.println("Introduce otro valor mayor que cero");
			b = t.nextInt();
		}
		for (int i = 0; i < MAX; i++) {
			aleatorio[i] = (int) (Math.random() * 100) + 1;

			contador++;

			if ((aleatorio[i] >= a) && (aleatorio[i] <= b)) {
				System.out.println("");
				System.out.println("valor: " + aleatorio[i]);

				System.out.println("posicion: " + contador);
				System.out.println("");
			}
		}
		for (int i = 0; i < MAX; i++) {
			boolean flag = false;
			do {
				flag = false;
				for (i = 0; i < (MAX - 1); i++) {
					if (aleatorio[i] > aleatorio[i + 1]) {

						int aux = aleatorio[i + 1];
						aleatorio[i + 1] = aleatorio[i];
						aleatorio[i] = aux;
						contador++;
						flag = true;

					}

				}

			} while (flag != false);
			for (i = 0; i < MAX; i++) {
				System.out.print(aleatorio[i] + " ");
			}

		}
		int num=t.nextInt();
		int c=0;
		int d= MAX;
		flag = false;
		 do {
			int i=(c+d)/2;
			 
			 if(aleatorio[i]==num) {
				 System.out.println("El valor " +num+"esta en la posicion : "+i);
				 flag=true;
			 }
			 else{
				 if(aleatorio[i]>num) {
					 b= i-1;
				 }
				 else {
					 a=i+1;
				 }
			 }
			
		 }while((flag==false)&&(a<b));
			 
		 
	}

}



