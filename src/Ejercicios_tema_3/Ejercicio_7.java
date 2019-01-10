package Ejercicios_tema_3;
/***
 * PROGRAMA DE SACAR EL FACTORIAL DE UN NUMERO
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 16/10/2018
 *** 
 * CURSO: DM1B
 * 
 ***/
import java.util.Scanner;

public class Ejercicio_7 {
	public static void main(String[]args) {
		long fact=1;
		int num;
		Scanner numero =new Scanner(System.in);
		System.out.println("Dame un numero entero mayor que 0");
		num = numero.nextInt();
		for(int i = num; i > 0; i--) {
			
			fact = fact * i;
			}
		System.out.println("El factorial de " + num + " es: " + fact);
		}
	}

