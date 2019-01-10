package Extras;
import java.util.Scanner;
public class inverso {
	 
    public static void main(String[] args) {
    	Scanner t=new Scanner(System.in);
    	int n;
        System.out.println("Introduce un número para invertir: ");
        n = t.nextInt();
        while(n<=0) {
        	System.out.println("el numero introducido debe ser mayor que 0");
        	n = t.nextInt();
        }
        System.out.println("El número inverso es el "+ invertir(n));
        System.out.println("Y el doble es: "+ invertir(n)*2 );
    }
     
    private static int invertir(int numero){
        int cifra, inverso = 0;
        while(numero!=0){
            cifra = numero%10;
            inverso = (inverso * 10) + cifra;
            numero/=10;
        }
        return inverso;
    }
}

