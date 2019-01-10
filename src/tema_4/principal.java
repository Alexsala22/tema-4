/***
 * PROGRAMA DE calculo de areas de figuras geometricas.
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 30/11/2018
 *** 
 * CURSO: DM1B
 * 
 ***/
package tema_4;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class principal {

	
	/*ALEJANDRO, NO ME SALE QUE TENGA NINGUN ERROR DE CODIGO SIN EMBARGO COMPILO EL PROGRAMA, Y AL INTRODUCIR EL NUMERO
	 * PARA ELEGIR LA OPCION ME DA UN ERROR QUE DESCONOZCO, NO SE QUE SIGNIFICA, NI COMO ARREGLARLO.
	 * EL ERROR DICE ALGO DEL SCANNER PERO LOS HE CAMBIADO TODOS VARIAS VECES Y ME LO SIGUE DANDO
	 * 
	 */
	public static int menu() {
		int opc=0;
		Scanner t=new Scanner (System.in);

			do {
				try {
					System.out.println("0.Salir");
					System.out.println("1.Crear/Modificar rectángulo");
					System.out.println("2.Crear/Modificar triángulo");
					System.out.println("3.Crear/Modificar círculo");
					System.out.println("4.Calcular el perímetro de las figuras");
					System.out.println("5.Calcular el área de las figuras");
					opc=t.nextInt();
				}catch(Exception e) {
					System.out.println("Introducción errónea.");
					t.next();
				}
			}while((opc<0)||(opc>5));
		
			
		
			t.close();
			
			
		
		return opc;
	}
	
	
	public static void main(String[] args) {
		Scanner t=new Scanner (System.in);
		int a,b;
		int opc;
		float area;
		double areac;
		rectangulo uno=null;
		triangulo unot=null;
		circulo unoc=null;
		
		do {
			opc=menu();
			switch (opc) {
			case 1:
				do {
					try {
				System.out.println("Crear/modificar Rectangulo: ");
				System.out.print("Nuevo alto :");
				a=t.nextInt();
				uno = uno.setAlto(a);

					}catch(Exception e) {
						a=-1;
						t.next();
						
					}
				}while((a<0));
				
				do {
					try {
				System.out.print("Nuevo ancho :");
				a=t.nextInt();
				uno = uno.setAncho(a);

					}catch(Exception e) {
						a=-1;
						t.next();
						
					}
				}while((a<0));
				
				
				break;
			case 2:
				do {
					try{
				System.out.println("Crear/modificar Triangulo: ");
				System.out.print("Nueva altura :");
				a=t.nextInt();
				unot = unot.setAlto(a);
					}catch(Exception e){
						a=-1;
						t.next();
						
					}	
				}while((a<0));
				
				do {
					try{
				System.out.print("Nueva base :");
				b=t.nextInt();
				unot = unot.setAncho(b);
					}catch(Exception e){
						b=-1;
						t.next();
						
					}	
				}while((b<0));
				
				do {
					try{
				System.out.print("Nuevo angulo :");
				b=t.nextInt();
				unot = unot.setAngulo(b);
					}catch(Exception e){
						b=-1;
						t.next();
						
					}	
				}while((a<360));
				
				break;
			case 3:
				do {
					try {
						System.out.println("Crear/modificar Circulo: ");
						System.out.print("Nuevo radio :");
						a=t.nextInt();
						unoc = unoc.setRadio(a);

					}catch(Exception e) {
						a=-1;
						t.next();
						
					}
				}while((a<0));
				
				
				break;
				
				
			case 4:
				area=uno.getPerimetro();
				System.out.println("Perimetro rectangulo: "+area+ " unidades");
				area=unot.getPerimetro();
				System.out.println("Perimetro triangulo: "+area+ " unidades");
				areac=unoc.getPerimetro();
				System.out.println("Perimetro circulo(circunferencia): "+areac+ " unidades");
				
				break;
			case 5: 
				area=uno.getArea();
				System.out.println("Area rectangulo: " + area+" unidades cuadradas");
				area=unot.getArea();
				System.out.println("Area triangulo: " + area+" unidades cuadradas");
				areac=unoc.getArea();
				System.out.println("Area circulo: " + areac+" unidades cuadradas");
				break;
			
			
			}
			
			
			
			
			
			
		}while(opc!=0);
		t.close();
	}

}
