package Ejercicios_tema_2;

public class Moneda {
	public static double DolarAEuro(double moneda) {
		return (0.87)*moneda * 0.87;
	}
	public static double EuroADolar(double moneda) {
		return (1.15)*moneda * 1.15;
	}
	public static void main(String[] args) {
		System.out.println("0 euros son " +EuroADolar(0)+ " D�lares.");
		System.out.println("50 euros son " +EuroADolar(50)+ " D�lares.");
		System.out.println("100 euros son " +EuroADolar(100)+ " D�lares.");
		System.out.println("0 D�lares son " +DolarAEuro(0)+ " �uros.");
		System.out.println("250 D�lares son " +DolarAEuro(250)+ " �uros.");
		System.out.println("420 D�lares son " +DolarAEuro(420)+ " �uros.");
	}
}
