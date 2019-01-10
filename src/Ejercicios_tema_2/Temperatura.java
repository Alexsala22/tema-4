package Ejercicios_tema_2;

public class Temperatura {
	public static double CelsiusToFarenheit(double temp) {
		return (1.8)*temp + 32;
	}
	public static double FarenheitToCelsius(double temp) {
		return (temp - 32)/1.8;
	}
	public static void main(String [] args) {
	System.out.println("0 grados celsius son " +CelsiusToFarenheit(0)+ " Grados Farenheit.");
	System.out.println("15 grados celsius son " +CelsiusToFarenheit(15)+ " Grados Farenheit.");
	System.out.println("20 grados celsius son " +CelsiusToFarenheit(20)+ " Grados Farenheit.");
	System.out.println("0 grados Farenheit son " +FarenheitToCelsius(0)+ " Grados celsius.");
	System.out.println("40 grados Farenheit son " +FarenheitToCelsius(40)+ " Grados celsius.");
	System.out.println("70 grados Farenheit son " +FarenheitToCelsius(70)+ " Grados celsius.");
	}
}

