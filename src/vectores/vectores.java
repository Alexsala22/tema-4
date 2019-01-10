/***
 * PROGRAMA DE calculo de la mediay ladesviacion típica de una seriede tiradas de un dado.
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 04/12/2018
 *** 
 * CURSO: DM1B
 * 
 ***/

package vectores;

public class vectores {
	public static int sumas[]=new int[]{2,3,4,5,6,7,8,9,10,11,12};
	public static int veces[]=new int[]{3,8,9,11,20,19,16,13,11,6,4};
	public static int MAX=10;
	public static int a=0;
	public static double b=0;
	public static double tiradas=120.0;
	
	
	/*	public static double porcentaje()
	 * 			entradas--> sumas[]: se le introduce el numero guardado en el correspondiente estpacio del vector
	 * 						
	 * 			salidas-->  porcentaje: nos dael porcentaje de numeroscomprendidos entre el intervalo dado
	 * 
	 * este metodo nos sirve para calcular el numerode sumas en el intervalo dado.
	 */
	public static double porcentaje() {
		int i=0;
		
		
		for (int p=0;p<=MAX;p++) {
			int c= sumas[p];
			if((c>4)&&(c<10)) {
				i++;
			}
			
		}
		System.out.println("El numero de sumas en el intervalo es: "+i);
		double porcentaje=(i*100)/12;
		return porcentaje;
			
		
	}
	
	/*	public static double intervalo()
	 * 			entradas--> Desv(): se le introduce el numero guardado en el correspondiente estpacio del vector
	 * 						media(): se le introduce el numero guardado en el correspondiente estpacio del vector
	 * 			salidas-->  intervalo: nosdevuelve el primer numero del intervalo
	 * 						intervalo1: nos devuelve el segundo numero del intervalo
	 * 
	 * este metodo nos sirve para mostrar el intervalo en el que tienen que estar comprendidos los numeros
	 */
	public static String intervalo() {
	
		
		double media=media()/2;
		double intervalo=media-Desv();
		double intervalo2=media+Desv();
		String intervalo1=intervalo+","+intervalo2;
		return intervalo1;
	}
	
	
	/*	public static double media()
	 * 			entradas--> sumas[]: se le introduce el numero guardado en el correspondiente estpacio del vector
	 * 						veces[]: se le introduce el numero guardado en el correspondiente estpacio del vector
	 * 			salidas-->  media: nos devuelve el valor de la media de las tiradas
	 * 
	 * este metodo nos sirve para calcular la media de las tiradas que ha hecho el dado.
	 */
	public static double media() {
		for(int i=0;i<=MAX;i++) {
			a=a+sumas[i]*veces[i];
			
		}
		double media=a/tiradas;
		return media;
	}
	/*	public static double media()
	 * 			entradas--> sumas[]: se le introduce el numero guardado en el correspondiente estpacio del vector
	 * 						veces[]: se le introduce el numero guardado en el correspondiente estpacio del vector
	 * 			salidas-->  Desv: nos devuelve el valor de la desviacio ntipica de las tiradas
	 * 
	 * este metodo nos sirve para calcular la desviacion tipica de las tiradas que ha hecho el dado.
	 */
	public static double Desv() {
		for(int j=0;j<=MAX;j++) {
			b=(float) Math.sqrt((b+sumas[j]*(sumas[j]*veces[j]))/tiradas);
		}
		double desviacion=b;
		return desviacion;
	}
	
	public static void main(String[]args) {
		
		
		System.out.println("La media de las tiradas es: " + media());
		System.out.println("La suma de veces es: " + Desv());
		System.out.println("porcentaje de valores en el intervalo: ("+intervalo()+")");
		System.out.println("El porcentaje de numeros en el intervalo es: " +porcentaje()+"%");
		
	}

}
