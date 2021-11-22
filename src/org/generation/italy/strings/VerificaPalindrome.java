package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserire la parola: ");
		String parola = scan.nextLine();
		
		String inversa = "";
		
		for(int i = parola.length()-1; i >= 0; i--) {
			inversa += parola.charAt(i);
		}
		
		System.out.println("La lunghezza della parola è: " + parola.length());
		
		if(parola.equals(inversa)) {
			System.out.println("La parola inserita è palindroma");
		}else {
			System.out.println("La parola inserita non è palindroma");
		}
		
		
		scan.close();
		
	}

}
