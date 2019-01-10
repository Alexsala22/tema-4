package tema_4;
import java.util.Scanner;
public class circulo {

		//MIEMBRO ESTATICO
		static int numcirculo=0;
		static double PI = 3.14159;
		
		//Atributos
		private int radio;

		
		//Constructor
		circulo(){
			radio =1;
			
			numcirculo++;
			
		}
		
		//Constructor
		circulo(int rad){
			radio=rad;
			numcirculo++;
			
		}
			
		public int getRadio() {
			return this.radio;
		}
		
		public circulo setRadio(int rad) {
			
			this.radio=rad;
			return this;
			
		}

		public static int contador() {
			return numcirculo;
		}
		
		public void modificar(int rad){
				this.radio=rad;
				
			
		}
		/* 		public double getArea()
		 * Entrada--> this.radio: se le pasa el radio del circulo
		 * 			  
		 * Salida-->  area: nos devuelve el area del círculo
		 * 
		 * Este metodo nos da el area del Círculo
		 * 
		 */
		public double getArea(){ //Pi*r*r
			double area;
			area=(this.radio * this.radio)*PI;
			return area;
		}
		/* 		public double getArea()
		 * Entrada--> this.radio: se le pasa el radio del circulo
		 * 			  
		 * Salida-->  perimetro: nos devuelve el perimetro del círculo
		 * 
		 * Este metodo nos da el perimetro del Círculo
		 * 
		 */
		public double getPerimetro() {
			// TODO Auto-generated method stub
			double perimetro=2*PI*this.radio;
			return perimetro;
		}
	}
