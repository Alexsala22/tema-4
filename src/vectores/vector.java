package vectores;
import java.util.Scanner;
public class vector {
private static double [] vectores1;
final static int POS=10;


public static double media(){
	double a=0.0;
	for (double i=0.0;i<POS;i++) {
		a=a+vectores1[i];
	}
	a=a/POS;
	System.out.println("La media de las notas es: ");
	
	return a;
	
}


public static void main (String[]args) {
	double dato=0;

	vectores1= new double[POS];
			for(int i=0; i<POS;i++) {
				try{
					
					System.out.println("introduce las notas");
					Scanner t=new Scanner(System.in);
					
					dato=t.nextDouble();
					while((dato<0)||(dato>10)) {
						System.out.println("el numero a introducir es un erro, introduce uno entre el 0 y el 10");	
						dato=t.nextDouble();
					}
				}catch(Exception e) {
					System.out.println("el dato introducido es erróneo");
				}
				vectores1[i]=dato;
			}
			System.out.println(media());
}
	
	
}
