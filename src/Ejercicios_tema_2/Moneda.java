package Ejercicios_tema_2;

public class Moneda {
	public static double DolarAEuro(double moneda) {
		return (0.87)*moneda * 0.87;
	}
	public static double EuroADolar(double moneda) {
		return (1.15)*moneda * 1.15;
	}
	public static void main(String[] args) {
		System.out.println("0 euros son " +EuroADolar(0)+ " Dólares.");
		System.out.println("50 euros son " +EuroADolar(50)+ " Dólares.");
		System.out.println("100 euros son " +EuroADolar(100)+ " Dólares.");
		System.out.println("0 Dólares son " +DolarAEuro(0)+ " Éuros.");
		System.out.println("250 Dólares son " +DolarAEuro(250)+ " Éuros.");
		System.out.println("420 Dólares son " +DolarAEuro(420)+ " Éuros.");
	}
}
