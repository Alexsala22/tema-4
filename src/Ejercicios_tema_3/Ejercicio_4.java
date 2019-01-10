//crear un rombo de asteriscos que tenga el interior vacío y solo se muestren sus bordes
package Ejercicios_tema_3;
/***
 * PROGRAMA DE ROMBO DE ASTERISCOS VACÍO
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 16/10/2018
 *** 
 * CURSO: DM1B
 * 
 ***/
import java.util.Scanner;
public class Ejercicio_4 {
	    
	    public static void main(String[] args) {
	        int n;
	        Scanner num = new Scanner(System.in);  
	        try {
	            System.out.print("Ingresa una cantidad entera: ");
	            n = num.nextInt();
	            asterisco(n);
	        } catch (Exception e) {
	            System.out.println("ERROR: tiene que ser entero.");
	        }
	    }
	    static void asterisco(int n){
	        final char simbolo = '*';
	        for (int i = 0; i < n; ++i) {
	            System.out.println();
	            for (int j = 0; j < n-i-1; ++j) {                      
	                System.out.print(" ");           
	            }
	            for (int j = 0; j < 2*i+1; ++j){
	                if ((i==0)||(j==0)||(j==2*i)) {
	                    System.out.print(simbolo);
	                } else {
	                    System.out.print(" ");
	                }                
	            }            
	        }
	        for (int j = n-2; j >= 0; --j) {
	            System.out.println();
	            for (int i = 0; i < n-j-1; ++i) {                
	                System.out.print(" ");
	            }
	            for (int i = 0; i < 2*j+1; ++i) {
	                if ((j==0)||(i==0)||(i==2*j)) {
	                    System.out.print(simbolo);
	                } else {
	                    System.out.print(" ");
	                }                
	            }
	        }
	        System.out.println();
	    }
	}

