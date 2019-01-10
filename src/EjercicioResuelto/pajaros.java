package EjercicioResuelto;

import java.util.Scanner;

public class pajaros {
	/*ATRIBUTOS*/
	String color;  //Define el color del pájaro
	boolean volar; //Define el vuelo: true = vuela; false = no vuela
	
	/*MÉTODOS*/
	//Constructor por defecto: pájaro blanco y no suena
	public pajaros(){
		color = "blanco";
		volar = false;
	}
	//Constructor con las característica que de el usuario
	public pajaros(String col, boolean vol) {
		color = col;
		volar = vol;
	}
	
	
	// Mostrar color de los pajaros
	public static String getColor(pajaros name) {
		System.out.println("el color del pajaro es: "+ name.color);
		return name.color;
	}
	//Devolver vuelo de los pajaros
	public static boolean getVolar(pajaros name) {
		return name.volar; //para evolver algo utilizamos un return
	}
	
	/*METODO MAIN PARA TESTEAR LA CLASE*/
	public static void main(String[]args) {
		
		/*VARIABLES*/
		pajaros piolin = null, pardal = null;
		
		Scanner t = new Scanner(System.in);
		int opc=0;
		
		System.out.println("--------------------------");
		System.out.println("Testeo de la clase pajaros");
		System.out.println("--------------------------");
		System.out.println();
		
		do {
		do {
			System.out.println("1.- Crear pájaro por defecto");
			System.out.println("2.- Crear pájaro propio");
			System.out.println("3.- Mostrar color de pajaro");
			System.out.println("4.- Mostrar si vuela el pajaro");
			System.out.println("opcion: ");
			opc= t.nextInt();
		
		}while((opc<0)||(opc>4));
		
		switch(opc) {
			case 0:		//OPCION SALIR
				System.out.println("Gracias por probar la clase pajaro");
			break;
			
			case 1:		//OPCION DE CREAR POR DEFECTO
				piolin= new pajaros();
			break;
			
			case 2:		//OPCION PARA CREAR TU PROPIO PAJARO
				System.out.println("Dame el color del pajaro: ");
				String col=t.next();
				System.out.println("Volar (false=no),(true=si): ");
				boolean vol=t.nextBoolean();
				pardal= new pajaros(col, vol);
			break;
			
			case 3:		//OPCION PARA 
				String ver = getColor(piolin);
				System.out.println("color de piolin: " + ver);
				ver = getColor(pardal);
				System.out.println("color de pardal: " + ver);
			break;
			
			case 4: 
				boolean vuelo=getVolar(piolin);
				System.out.println("Vuela piolin: " + vuelo);
				vuelo= getVolar(pardal);
				System.out.println("Vuela pardal: " + vuelo);
			break;
		}
	}while(opc!=0);
	}
}
