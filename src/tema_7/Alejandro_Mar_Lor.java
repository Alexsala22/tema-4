package tema_7;
import java.util.Scanner;
public class Alejandro_Mar_Lor {
	public static void main (String []args) {
		char tablero [][] = new char [3][3];
		char jugador1 = 'X';
		char jugador2= 'O';
		boolean ganador=false;
		int tiradas=0;
		int a=0;
		int b=0;
		int c=0;
		int d=0;

		
		
		for(a=0;a<3;a++) 
			for(b=0;b<3;b++)
				tablero[a][b]= ' ';
		System.out.println(" |1   2   3" + "\n------------");
		System.out.println("1|"+tablero[0][0]+" | "+tablero[0][1]+" | "+tablero[0][2]+"|" + "\n------------");
		System.out.println("2|"+tablero[1][0]+" | "+tablero[1][1]+" | "+tablero[1][2]+"|"+ "\n------------");		
		System.out.println("3|"+tablero[2][0]+" | "+tablero[2][1]+" | "+tablero[2][2]+"|"+ "\n------------");
	
		Scanner sn=new Scanner(System.in);
		
		do {
			do {
				do {
					do {
						do {
				System.out.println("jugador 1 selecciona una fila");
				tiradas++;
				
				a=sn.nextInt();
				a=a-1;
				while((a<0)||(a>3)) {
					System.out.println("El numero introducido no es valido, introduzca uno entre 1 y 3");
					a=sn.nextInt();
					a=a-1;
				}
				
				System.out.println("jugador 1 selecciona una columna");
				
				b=sn.nextInt();
				b=b-1;
				
				while((b<0)||(b>3)) {
					System.out.println("El numero introducido no es valido, introduzca uno entre 1 y 3");
					b=sn.nextInt();
					b=b-1;
				}
				while(tablero[a][b]!=' ') {
					System.out.println("no puedes poner ahi una ficha, ponla en un lugar que no este ocupado");
					a=sn.nextInt();
					b=sn.nextInt();
					
	
				}
				
				tablero[a][b]=jugador1;
				System.out.println(" |1   2   3" + "\n------------");
				System.out.println("1|"+tablero[0][0]+" | "+tablero[0][1]+" | "+tablero[0][2]+"|" + "\n------------");
				System.out.println("2|"+tablero[1][0]+" | "+tablero[1][1]+" | "+tablero[1][2]+"|"+ "\n------------");		
				System.out.println("3|"+tablero[2][0]+" | "+tablero[2][1]+" | "+tablero[2][2]+"|"+ "\n------------");
			
				
				//JUGADOR 2
				
				
				System.out.println("jugador 2 selecciona una fila");
				
						tiradas++;
				c=sn.nextInt();
				c=c-1;
				while((c<0)||(c>3)) {
					System.out.println("El numero introducido no es valido, introduzca uno enre 1 y 3");
					c=sn.nextInt();
					c=c-1;
				}
				
				System.out.println("jugador 2 selecciona una columna");
				
				d=sn.nextInt();
				d=d-1;
				while((d<0)||(d>3)) {
					System.out.println("El numero introducido no es valido, introduzca uno enre 1 y 3");
					d=sn.nextInt();
					d=d-1;
				}
				
				while(tablero[c][d]!=' ') {
					System.out.println("no puedes poner ahi una ficha, ponla e un lugar que no este ocupado");
					a=sn.nextInt();
					a=a-1;
					b=sn.nextInt();
					b=b-1;
				}
				
				
				
				
				tablero[c][d]=jugador2;
				System.out.println(" |1   2   3" + "\n------------");
				System.out.println("1|"+tablero[0][0]+" | "+tablero[0][1]+" | "+tablero[0][2]+"|" + "\n------------");
				System.out.println("2|"+tablero[1][0]+" | "+tablero[1][1]+" | "+tablero[1][2]+"|"+ "\n------------");		
				System.out.println("3|"+tablero[2][0]+" | "+tablero[2][1]+" | "+tablero[2][2]+"|"+ "\n------------");
						
					if((tablero[0][0]==jugador1)&&(tablero[0][1]==jugador1)&&(tablero[0][2]==jugador1)) {
					ganador=true;
					System.out.println("gana el jugador 1");
					}
					
					
					if((tablero[1][0]==jugador1)&&(tablero[1][1]==jugador1)&&(tablero[1][2]==jugador1)) {
					ganador=true;
					System.out.println("gana el jugador 1");
					}
					
					
					if((tablero[2][0]==jugador1)&&(tablero[2][1]==jugador1)&&(tablero[2][2]==jugador1)) {
					ganador=true;
					System.out.println("gana el jugador 1");
					}
					
					
					if((tablero[0][0]==jugador1)&&(tablero[1][1]==jugador1)&&(tablero[2][2]==jugador1)) {
					ganador=true;
					System.out.println("gana el jugador 1");
					}
					
					
					if((tablero[0][2]==jugador1)&&(tablero[1][1]==jugador1)&&(tablero[2][0]==jugador1)) {
					ganador=true;
					System.out.println("gana el jugador 1");
					}
					
					
					if((tablero[0][0]==jugador1)&&(tablero[1][0]==jugador1)&&(tablero[2][0]==jugador1)) {
					ganador=true;
					System.out.println("gana el jugador 1");
					}
					
					if((tablero[0][1]==jugador1)&&(tablero[1][1]==jugador1)&&(tablero[2][1]==jugador1)) {
					ganador=true;
					System.out.println("gana el jugador 1");
					}
					
					if((tablero[0][2]==jugador1)&&(tablero[1][2]==jugador1)&&(tablero[2][2]==jugador1)) {
					ganador=true;
					System.out.println("gana el jugador 1");
					}
						}while((a>0) || (a<2) || (b>0)  ||  (b<2));
						}while (tablero[a][b]!=0);
					
					//COMPROBACIONES JUGADOR 2
					
					if((tablero[0][0]==jugador2)&&(tablero[0][1]==jugador2)&&(tablero[0][2]==jugador2)) {
						ganador=true;
						System.out.println("gana el jugador 2");
						}
						
						if((tablero[1][0]==jugador2)&&(tablero[1][1]==jugador2)&&(tablero[1][2]==jugador2)) {
						ganador=true;
						System.out.println("gana el jugador 2");
						}
						
						if((tablero[2][0]==jugador2)&&(tablero[2][1]==jugador2)&&(tablero[2][2]==jugador2)) {
						ganador=true;
						System.out.println("gana el jugador 2");
						}
						
						if((tablero[0][0]==jugador2)&&(tablero[1][1]==jugador2)&&(tablero[2][2]==jugador2)) {
						ganador=true;
						System.out.println("gana el jugador 2");
						}
						
						if((tablero[0][2]==jugador2)&&(tablero[1][1]==jugador2)&&(tablero[2][0]==jugador2)) {
						ganador=true;
						System.out.println("gana el jugador 2");
						}
						
						if((tablero[0][0]==jugador2)&&(tablero[1][0]==jugador2)&&(tablero[2][0]==jugador2)) {
						ganador=true;
						System.out.println("gana el jugador 2");
						}
						
						if((tablero[0][1]==jugador2)&&(tablero[1][1]==jugador2)&&(tablero[2][1]==jugador2)) {
						ganador=true;
						System.out.println("gana el jugador 2");
						}
						
						if((tablero[0][2]==jugador2)&&(tablero[1][2]==jugador2)&&(tablero[2][2]==jugador2)) {
						ganador=true;
						System.out.println("gana el jugador 2");
						}
					}while((c>0) || (c<2) || (d>0) || (d<2));
					}while(tablero[c][d]!=0);
			}
		while(tiradas<6 && ganador!=true);
	
	}
}
