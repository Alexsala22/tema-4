package Bucle_For;

import javax.swing.JOptionPane;

public class comprueba_mail {
	
	public static void main(String[]args) {
		

	boolean arroba= false;
	
	String mail=JOptionPane.showInputDialog("introduce mail");
	
	for( int i=0; i<mail.length(); i++) {
		
		if(mail.charAt(i)=='@') {
			arroba=true;
			
			}
		}
	
	if(arroba=true) {
		System.out.println("Es correcto");
	}
	else {
		System.out.println("Es falso");
	}
	}
}
