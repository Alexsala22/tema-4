package tema_4;
import java.util.Scanner;
public class triangulo {

	//MIEMBRO ESTATICO
			static int numtriangulo=0;
			
			//Atributos
			private int alto;
			private int ancho;
			private int angulo;
			
			//Constructor
			triangulo(){
				alto =1;
				ancho =1;
				angulo =90;
				numtriangulo++;
				
			}
			
			//Constructor
			triangulo(int al, int an,int ang){
				alto =al;
				ancho =an;//base
				angulo =ang;
				numtriangulo++;
				
			}
			
			public int getAlto() {
				return this.alto;
			}
			
			public int getAncho() {
				return this.ancho;
			}
			public triangulo setAlto(int al) {
				
				this.alto=al;
				return this;
			}
			
			public triangulo setAncho(int an) {
				
				this.ancho=an;
				return this;
				
			}
			
			public triangulo setAngulo(int ang){
				this.angulo=ang;
				
				return this;
			}

			public static int contador() {
				return numtriangulo;
			}
			
			public void modificar(int a, int b,int ang){
					this.alto=a;
					this.ancho=b;
					this.angulo=ang;
				
			}
			
			/* 		public float getArea()
			 * Entrada--> a: introducimos la base del triangulo
			 * 			  b: introducimos la altura del triangulo
			 * Salida-->  area: nos devuelve el area del triangulo
			 * 
			 * Este metodo nos da el area del rectangulo
			 * 
			 */
			public float getArea(){
				float area;
				area=(this.alto * this.ancho)/2;
				return area;
			}

			/* 		public float getPerímetro()
			 * Entrada--> a: introducimos la base del triangulo
			 * 			  b: introducimos la altura del triangulo
			 * Salida-->  peri:nos devuelve el perimetro del triangulo
			 * 
			 * Este metodo nos da el perimetro del rectangulo
			 * 
			 */
			public float getPerimetro() {//No soy capaz de sacar la formula para sacar el perimetro con el angulo alfa
				// TODO Auto-generated method stub
				float peri,b1;
				int a=this.ancho;
				int b=this.alto;
				int c;
				b1=(a*a)+(b*b);
				c= (int)Math.sqrt(b1);
				peri=a+b+c;
				return peri;
			
			}
			
			
			
			}