/***
 * PROGRAMA DE vectores
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 30/11/2018
 *** 
 * CURSO: DM1B
 * 
 ***/
package tema_7;

import java.util.Scanner;

public class vectores {
	private static int[] sumas;
	private static int[] veces;




	

	public static void main (String[]args) {

		int POS = 11;
		int[] sumas= {2,3,4,5,6,7,8,9,10,11,12};
		int[] veces= {3,8,9,11,20,19,16,13,11,6,4};
		for (int i = 1; i <POS; i++) {
		sumas= new int[2];
		System.out.println(sumas[2]);
	}
	}
	final static int POS = 12;




}
/*
 * 
 
public static void main (String[]args) {
	double dato=0;

	sumas= new int[POS];
			for(int i=0; i<POS;i++) {
				try{
					
					System.out.println("introduce las notas");
					Scanner t=new Scanner(System.in);
					
					
					while((dato<0)||(dato>10)) {
						System.out.println("el numero a introducir es un erro, introduce uno entre el 0 y el 10");	
						dato=t.nextDouble();
					}
				}catch(Exception e) {
					System.out.println("el dato introducido es erróneo");
				}
				veces[POS]=dato;
			}
			System.out.println(media());
}
	
	
}
*/