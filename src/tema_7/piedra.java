package tema_7;
import java.util.Scanner;
public class piedra {

	public static void main(String[]args) {
		char a=0, b=0, c=0, q=0, w=0, e=0;
		int n=0;
		Scanner t  =new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("PIEDRA PAPEL O TIJERA");
		System.out.println("---------------------");
		System.out.println("");
		System.out.println("1.- Un jugador");
		System.out.println("2.- Dos jugadores");
		System.out.println("3.- Opciones");
		System.out.println("---------------------");
		System.out.println("Selecciona una opcion");
		int opc=t.nextInt();
			
		if(opc==1) {System.out.println("antes debes seleccionar los controles del jugador 1");
		opc=3;
		}
		if(opc==2) {System.out.println("antes debes seleccionar los controles de los jugadores");}
			
	
			if(opc==3) {
				System.out.println("1.- configurar controles jugador 1.");
				System.out.println("2.- configurar controles jugador 2");
				System.out.println("3.- nivel de dificultad para 1 jugador");
				System.out.println("4.- volver al menú");
				int opc1=t.nextInt();
				while(opc1!=4) {
					if(opc1==1) {
						System.out.println("selecciona los controles");
						System.out.println("------------------------");
						System.out.println("Elige una letra para piedra");
						a=t.next().charAt(0);
						System.out.println("Elige otra letra para papel");
						b=t.next().charAt(0);
						System.out.println("elige otra letra para tigeras");
						c=t.next().charAt(0);
				}
					if(opc1==2) {
						System.out.println("selecciona los controles");
						System.out.println("------------------------");
						System.out.println("Elige una letra para piedra");
						 q=t.next().charAt(0);
						System.out.println("Elige otra letra para papel");
						 w=t.next().charAt(0);
						System.out.println("elige otra letra para tigeras");
						 e=t.next().charAt(0);
					}
				
				if(opc1==3) {
					System.out.println("Selecciona el nivel de difcultad (1-facil, 2-medio, 3-dificil)");
					n=t.nextInt();
				}
				}
			
				if(opc1==4) {
					System.out.println("---------------------");
					System.out.println("PIEDRA PAPEL O TIJERA");
					System.out.println("---------------------");
					System.out.println("");
					System.out.println("1.- Un jugador");
					System.out.println("2.- Dos jugadores");
					System.out.println("3.- Opciones");
					System.out.println("---------------------");
					System.out.println("Selecciona una opcion");
					opc=t.nextInt();
				}
				}
			}
	}

