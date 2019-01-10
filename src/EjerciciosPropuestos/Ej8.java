package EjerciciosPropuestos;

public class Ej8{

public static char getLetras() {
	
	return (char)(Math.random()*26+'a');
}
public static void main(String[] args) {
	int i;
	char letra;
	
	for(i=0; i<10; i++) {
		letra = getLetras();
		
		if((letra == 'a')||(letra == 'e')||(letra == 'i')||(letra == 'o')||(letra == 'u'))
			System.out.println(letra + " es vocal");
		else
			System.out.println(letra + " es consonante");
		
	}
}
}
