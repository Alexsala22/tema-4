package Pruebas;

public class bucle_for {
public static void main (String[]args) {
	int rest=1;
	for (int i=0;i<5;i++) {
		for (int j=1;j<4;j++) {	
			rest+=(i+1)*(j*10);
			System.out.println(rest);
		}
	}
	
}

		
}
