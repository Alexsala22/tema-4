package Pruebas;
import java.util.Scanner;
public class complemento {

	public static void main (String [] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("introduce un numero");
		int n=t.nextInt();
		String bin= Integer.toBinaryString(n);
		System.out.println("el numero "+n+" en binario es "+bin);
		int x=~n;
		System.out.println("el complemento a1 de "+n+ "es: "+x);
	}
}
