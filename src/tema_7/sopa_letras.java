package tema_7;
import java.util.Scanner;
public class sopa_letras {
	static Scanner t=new Scanner(System.in);
	static double c,d;
	static int a,b;
	static char [][] matriz = new char [15][15];
	final static void palabra() {
		
		String p1;
		
		int i;
	
		System.out.println("introduce una palabra");
	
	p1= t.next();
	
	char tabla1[]= p1.toCharArray();
	
	for(i=0;i<p1.length();i++) {
		System.out.print(tabla1[i]);
		
	}
	
	}
	
	
	
	public static void main(String[]args) {
	
	
	
	
	c=(Math.random()*15);
	System.out.println("--------------");
	System.out.println("Sopa de letras");
	System.out.println("--------------");
	palabra();
	
	
	
	
	
	for( a=0;a<15;a++) {
		for( b=0;b<15;b++) {
		matriz[a][b]= (char)(Math.random()*26 +'a'); 
		System.out.print(" "+matriz[a][b]+"|");
	}
		System.out.println();
}
	

}
}