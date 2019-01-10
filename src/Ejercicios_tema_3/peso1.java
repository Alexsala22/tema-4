package Ejercicios_tema_3;
import java.util.Scanner;
/*Clase denominada Alejandro_Peso
 * Autor: Alejandro Martínez Loro
 * fecha: 30/10/2018
 * Descripción: clase para crear objetos que guardara una medida en kilos
 */
public class peso1 {
/*Atrinutos*/
	double medida;
	

	/*Método: double conversor(double p, String l);
	 * 
	 * Entradas: p -> medida a convertir en kilos
	 * 			 l -> Tipo de medida de p
	 * 
	 * Salidas: np -> Peso en kilos de la medida p
	 */
	private static double conversor(double p, String l) {
		double np=0.0;
		
		/*convierto las medidas a gramos */
		switch(l) {
		case "Lb":  //si la medida esta en libras
			np=p*453;
			break;
		case "Li":   //Si la medida esta en lingotes
			np=p*14590;
			break;
		case "Oz":   //si la medida esta en onzas
			np=p*28.25;
			break;
		case "P":   //si la medida esta en peniques
			np=p*1.55;
			break;
		case "G":   //si la medida esta en gramos
			np=p;
			break;
		case "Q":   //si la medida esta en quintales
			np=p*43300;
			break;
		default:		//para medidas en kilo o si no coincide se interpreta en kilos
			np = p*1000;
		break;		//Opcional
		}
		return np/1000;
	}
	/* Método: constructor clase peso_Alejandro
	 * 
	 * Entradas: p -> medida a convertir em kilos
	 * 			 l -> Tipo de medida de p
	 * 
	 */
	public peso1(double p, String l) {
		medida=conversor(p,l);
	}
	
	/* Método: double getPeso(double p, String l);
	 * 
	 * Entradas: p -> objeto a convertir en l
	 * 			 l -> Tipo de medida
	 * 
	 * Salida:  np -> El peso de p en la medida l
	 */
	
	public static double getPeso(peso1 p, String l) {
		double np=0.0;
		
		/* Convierto las medidas en kilos a l */
		
		switch(l) {
		case "Lb":  //si la medida esta en libras
			np = (p.medida*1000)/453;
			break;
		case "Li":   //Si la medida esta en lingotes
			np=(p.medida*1000)/14590;
			break;
		case "Oz":   //si la medida esta en onzas
			np=(p.medida*1000)/28.25;
			break;
		case "P":   //si la medida esta en peniques
			np=(p.medida*1000)/1.55;
			break;
		case "G":   //si la medida esta en gramos
			np=p.medida*1000;
			break;
		case "Q":   //si la medida esta en quintales
			np=(p.medida*1000)/43300;
			break;
		default:		//para medidas en kilo o si no coincide se interpreta en kilos
			np = p.medida;
		break;		//Opcional
		}
		
		return np;
	}
	
	
	/* Método: double getLibras(double p, String l);
	 * 
	 * Entradas: p -> objeto a convertir en l
	 * 			 l -> Tipo de medida
	 * 
	 * Salida:  np -> El peso de p en la medida l
	 */
	
	public static double getLibras(peso1 p){
			double np = getPeso(p,"Lb");
			
			return np;
	}
	
	
	/* Método: double getLingotes(peso1 p);
	 * 
	 * Entradas: p -> objeto a convertir en lingotes
	 * 			
	 * 
	 * Salida:  np -> El peso de p en la medida lingotes
	 */
	
	public static double getLingotes(peso1 p){
			double np = getPeso(p,"Li");
			
			return np;
	}
	
	
	public static void main(String[]args) {
	/*Variables*/
		Scanner t=new Scanner(System.in);
				String l= "k";
		
	}
}
	




