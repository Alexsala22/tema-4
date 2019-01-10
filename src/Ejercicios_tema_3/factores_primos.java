package Ejercicios_tema_3;
import java.util.Scanner;
public class factores_primos {
static Scanner t=new Scanner(System.in);
public static void main(String[]args) {
	int a = 2, num;
	System.out.println("Introduzca un numero a calcular: ");
	num=t.nextInt();
	System.out.println("Los factores primos de "+num+" Son: ");
	while(num!=1) {

		if (num % a ==0) {
			System.out.print(a+ ", ");
			num=num/a;
		}else
			a=a+1;
	}
}
}
