package Ejercicios_tema_3;

import java.util.Scanner;

public class Ej3 {
	
		public static void main(String[] args) {
			Scanner texto = new Scanner(System.in);
			System.out.print("Introduce un numero de veces: ");
			int n=texto.nextInt();
				for (int i=1;i<=n;i++) {
					String str = "*";
					String repeated = new String(new char[i]).replace("\0", str);
					System.out.println(repeated);
				
			}
		}

	}

