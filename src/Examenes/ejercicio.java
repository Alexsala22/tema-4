package Examenes;
import java.util.Scanner;
public class ejercicio {
	
	public static int datos(int tipo) {
		int n=0, i=0, aux=0;
		boolean ok=true;
		Scanner t=new Scanner(System.in);
		if(tipo==0) {
		
		switch(tipo) {
		case 0:
			
		do {
	System.out.println("0.-Salir del programa");
	System.out.println("1.-Pasar de binario a octal");
	System.out.println("2.-mostrar el negativo de un binario");
	System.out.println("3.-De ocatl a binario");
	System.out.println("4.-De C2 a binario");
	System.out.println("Selecciona una opcion");
		n=t.nextInt();
		}while((n<0)||(n>2));
		break;
		case 1:
			do {
				System.out.print("Introduce un numero binario de 6 bits: ");
				n=t.nextInt();
				
				if(n>=0) {
					aux = n;
					ok = true;
					for(i=0;i<5;i++) {
						if((aux%10)>1)   ok=false;
						aux /= 10;
					}
				}
			}while((n<0)||(n>111111)||(ok == false));
			break;
			case 2:
				do {
					System.out.print("Introduce un numero octal de 6 bits: ");
					n=t.nextInt();
					
					ok=true;
					if(n>=0) {
						if((n%10)>7) ok=false;
						if((n/10)>7) ok=false;
						}
					
				}while((n<0)||(n>111111)||(ok == false));
				break;
		}
		
	}
		return n;
	}
	
	public static void binToOctal(int a) {
		int b=0, n=0, i=0, j=0, p=1;
		
		int aux=a;
		for(i=0;i<2;i++) {
			b=0;
			p=1;
			for(j=0;j<3;j++) {
			b+=(aux%10)*p;
			aux/=10;
			p*=2;
		}
		if (i==1)		n+= (b * 10);
		else			n+=b;
	}
		System.out.println("El número "+a+ " en Octal es: 0" +n);
}
	
	public static void binToC2(int a) {
		int n=a,aux=a,i=0,p=1;
		
		while((aux%10)!=1) {  //dejamos los 0
			aux/=10;
			p*=10;
			i++;
		}
		p*=10;	//dejamos el primer 1
		aux/=10;
		i++;
		do {
			if((aux%10)==1)		n-=p;
			else				n+=p;
			
			aux/=10;
			p*=10;
			i++;
		
		}while(i<8);
		
		System.out.println("El número 00"+a+" en negativo C2 es: "+n);
	}
	
	public static void octToBin(int a) {

			switch(a/10){
			case 0:
				System.out.println("000");
			break;
			case 1:
				System.out.println("001");
			break;
			case 2:
				System.out.println("010");
			break;
			case 3:
				System.out.println("011");
			break;
			case 4:
				System.out.println("100");
			break;
			case 5:
				System.out.println("101");
			break;
			case 6:
				System.out.println("110");
			break;
			case 7:
				System.out.println("111");
			break;
			}
			
			switch(a%10){
			case 0:
				System.out.println("000");
			break;
			}
			System.out.println("El número 00"+a+" en negativo C2 es: "+a);
		}
			
	


	
	
	
	public static void main(String [] args) {
	
			int opc=0, a=0;
		System.out.println("-----------------------------------");
		System.out.println("programa de comprensión del binario");
		System.out.println("-----------------------------------");
		System.out.println();
	
	do {
		opc = datos(0);
		System.out.println("programa de comprensión del binario");
		switch(opc) {
		case 0: //Salir del programa
			
		break;
		case 1:
			a=datos(1);
			binToOctal(a);
		break;
		case 2:
			a= datos(1);
			binToC2(a);
		break;
		case 3:
			a= datos(2);
			octToBin(a);
			
		
		break;
		}
	}while(opc!=0);
	}

}
