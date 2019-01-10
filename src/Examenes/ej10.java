package Examenes;
import java.util.Scanner;
public class ej10 {
	final static int N=8;
	
	public static void main(String[]args) {
		int i, a=0;
		for(i=0;i<N;i++) 
		{
			if(i%2==0) {
				a+=2;
			}
			else {
				a+=3;
			}
			System.out.println(a+ " ");
		}
	}
}
