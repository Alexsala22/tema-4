package EjerciciosPropuestos;

public class Ej11 {
	public static void main(String[] args) {
		int x=9267;
		
		int b=x/500;
		int r=x%500;
		System.out.println("se necesitan " +b+ " billetes de 500");
		
		b=r/200;
		r=r%200;
		System.out.println("Se necesitan " +b+ " billetes de 200");
		
		b=r/100;
		r=r%100;
		System.out.println("Se  necesitan " +b+ " billetes de 100");
		
		b=r/50;
		r=r%50;
		System.out.println("Se necesitan " +b+ " billetes de 50");
		
		b=r/20;
		r=r%20;
		System.out.println("Se necesitan " +b+ " billetes de 20");
		
		b=r/10;
		r=r%10;
		System.out.println("Se necesitan " +b+ " billetes de 10");
		
		b=r/5;
		r=r%5;
		System.out.println("Se necesitan " +b+ " billetes de 5");
		
		System.out.println("sobran " +r+ " euros");
	}
}
