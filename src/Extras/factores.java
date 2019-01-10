package Extras;

import java.util.Scanner;

public class factores {


	public static void main (String [] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("Introduce un numero mayor que 0");
		System.out.println("-------------------------------");
		int a=t.nextInt();
		
		while(a<=0) {
			System.out.println("El numero introducido ha de ser mayor que 0");
			a=t.nextInt();
		}
		int divisor=2;
		int i;
		for(i=0; i<=a;i++) {
		if(a%divisor==0) {
			System.out.println(a+"  | " +divisor);
			a=a/divisor;
			
		}else {
			divisor++;
		}
	}
		System.out.println("1  | 1");
}

}
