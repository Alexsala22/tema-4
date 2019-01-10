package Matrices;
import java.util.Scanner;
public class juego {

	public static int[][]m= {{1,0,0},{0,1,0},{0,0,1}};
	public static Scanner t= new Scanner(System.in);
	

	public static void tablero() {
	System.out.println("introduce el valor de a: ");
	int a=t.nextInt();
	while(a<0||a>3) {
		System.out.println("el valor introducido no es valido, introduzca otro: ");
		a=t.nextInt();
	}

	System.out.println("introduce el valor de b: ");
	int b=t.nextInt();
	while(b<0||b>3) {
		System.out.println("el valor introducido no es valido, introduzca otro: ");
		b=t.nextInt();
	}
		System.out.println(" -- -- --");
		System.out.println("|"+m[a][b]+" |"+m[a][b]+" |"+m[0][2]+" |");
		System.out.println(" -- -- --");
		System.out.println("|"+m[1][0]+" |"+m[1][1]+" |"+m[1][2]+" |");
		System.out.println(" -- -- --");
		System.out.println("|"+m[2][0]+" |"+m[2][1]+" |"+m[2][2]+" |");
		System.out.println(" -- -- --");
	}
	public static void main(String[]args) {
		
		
		System.out.println("------------------");
		System.out.println("juego de 3 en raya");
		System.out.println("------------------");
		tablero();
		
	
		
	}
}
