package EjerciciosPropuestos;

public class Ej6 {
	public static void main(String[] args) {
		double r=5.2;
		// creamos la variable r, asignandole el valor del radio de la circunferencia.
		double cuad= r * r;
		// creamos la variable cuad, a la cual le asignamos el valor de r^2
		double A= cuad * Math.PI;
		//finalmente creamos la variable A, asignandole la formula del area de una circunferencia (A=PI*r^2)
		System.out.println("El área de la circunferencia de radio 5,2cm es: "+A+ "cm^2");
	}
}
