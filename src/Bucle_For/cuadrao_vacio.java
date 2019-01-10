package Bucle_For;

import java.util.Scanner;
public class cuadrao_vacio {
	

			public static void main(String[]args) {
				
				Scanner leer=new Scanner(System.in);
				
				System.out.println("¿cuantas filas quieres?");
				
				int n=leer.nextInt();
				//tapa
					for(int i=0;i<n;i++) {
						System.out.print(" *");
					} 
					System.out.println("");
					//medio
					
					for(int i=0;i<n-2;i++) {
						System.out.print(" *");
						for(int j=0;j<n+1;j++) {
							System.out.print(" ");
					}
						System.out.println(" *");
						//final
					}
					for(int j=0;j<n;j++) {
						System.out.print(" *");
			}
					System.out.println(" ");
			
	}
}
