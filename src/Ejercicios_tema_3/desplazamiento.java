package Ejercicios_tema_3;
import java.util.Scanner;
public class desplazamiento {
		public static int suma(int n) {
		//SEPARAMOS A Y B
			int a=((n>>16) & 0x0000FFFF); //recojo a
			int b=(n & 0x0000FFFF);       //recojo b 
			n=a+b;
			
			return n;
		}
		public static void main(String[]args) {
			Scanner t=new Scanner(System.in);
			int a= 0, b=0, c=0, n=0;
			
			do {
			System.out.print("Introduce el numero a [0-32000]");
			a=t.nextInt();
			}while((a<0)||(a>32000));
			
			do {
			System.out.print("Introduce el numero b [0-32000]");
			b=t.nextInt();
			}while((b<0)||(b>32000));
			
			// JUNTAMOS EN n, a Y b: n=a|b
			n=((a<<16) & 0xFFFF0000);  //coloco a: n=a|0
			n |= (b & 0x0000FFFF);     //coloco b: n=a|b
			
			c= suma(n);
			
			System.out.println("resultado");
			System.out.println(a+ " + " +b+ " = " +c);
		}
	
}
