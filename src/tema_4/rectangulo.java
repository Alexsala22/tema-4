package tema_4;
import java.util.Scanner;

public class rectangulo { //Se llama asi porque ya tengo una clase llamada rectangulo
	

	//MIEMBRO ESTATICO
	static int numrectangulo=0;
	
	//Atributos
	private int alto;
	private int ancho;
	
	//Constructor
	rectangulo(){
		alto =1;
		ancho =1;
		numrectangulo++;
		
	}
	
	//Constructor
	rectangulo(int al, int an){
		alto =al;
		ancho =an;
		numrectangulo++;
		
	}
	
	public int getAlto() {
		return this.alto;
	}
	
	public int getAncho() {
		return this.ancho;
	}
	public rectangulo setAlto(int al) {
		
		this.alto=al;
		return this;
	}
	
	public rectangulo setAncho(int an) {
		
		this.ancho=an;
		return this;
		
	}

	public static int contador() {
		return numrectangulo;
	}
	
	public void modificar(int a, int b){
			this.alto=a;
			this.ancho=b;
		
		
	}
	/* 		public float getArea()
	 * Entrada--> this.alto: se le pasa el alto del rectangulo
	 * 			  this.ancho: se le pasa el ancho del rectangulo
	 * Salida-->  area: nos devuelve el area del rectangulo
	 * 
	 * Este metodo nos da el area del rectangulo
	 * 
	 */
	public float getArea(){
		float area;
		area=this.alto * this.ancho;
		return area;
	}
	/* 		public float getPerimetro()
	 * Entrada--> this.alto: se le pasa el alto del rectangulo
	 * 			  this.ancho: se le pasa el ancho del rectangulo
	 * Salida-->  peri: nos devuelve el perimetro del rectangulo
	 * 
	 * Este metodo nos da el perimetro del rectangulo
	 * 
	 */
	
	public float getPerimetro(){
		float peri;
		peri=2*(this.alto) + 2*(this.ancho);
		
		
		return peri;
	}
	}