package Pruebas;

public class dsf {
	public static void main(String[] args) {
		int x= 3756;
		
		int b=x/500;
		int r=x%500;
		System.out.println("se necesitan " +b+ " billetes de 500");
		
		b=r/200;
		r=x%200;
		System.out.println("Se necesitan " +b+ " billetes de 200");
	
		b=r/100;
		r=x%100;
		System.out.println("Se necesitan " +b+ "billetes de 100 ");
		
	}
}
