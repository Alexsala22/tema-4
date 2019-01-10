package EjercicioResuelto;

public class test {
	public static char getLetras() {
	return (char)(Math.random()*26 + 'a'); // el 26 esta siendo utilizado para que haya 26 valores, el cual es el numero de letras del abecedario.
	}
	public static void main (String[] args) {
		System.out.println(getLetras());
		System.out.println(getLetras());
		System.out.println(getLetras());
		System.out.println(getLetras());
	}
}
