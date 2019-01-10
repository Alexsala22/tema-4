import java.util.Scanner;
public class media {
private static double [] notas;
final static double MAX=10;
	public static void main(String[]args) {
		Scanner t=new Scanner(System.in);
		
		
		System.out.println();
		System.out.println("Cálculo de media");
		System.out.println();
		
		//RECOJO LAS NOTAS
	for(int i=0;i < MAX;i++) {
	do {
		try {
			System.out.println("introducir nota" +(i+1) +": ");		
			notas[i]=t.nextFloat();
			}
			catch(Exception e) {
				System.out.println("valor introducido incorrecto");
				t.next();
				notas[i]=-1.0;
				
			}
	}while((notas[i]<0.0)||(notas[i]>10.0));
	
	
	}
	//MUESTRO LAS NOTAS
	System.out.println();
	for(int i=0;i<MAX;i++) {
		System.out.println("Nota " + (i+1) +": " +notas[i]);
	}
	//CALCULO LA MEDIA
		float media=0;
		for(int i=0;i<MAX;i++) {
			media+=notas[i];
		}
		System.out.println("la media es " + media/MAX);
}
}