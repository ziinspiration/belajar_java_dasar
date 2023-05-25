package pencabangan;

import java.util.Scanner;

public class IfElse {
	public static void main (String[] args) {
	
		System.out.print("Masukan angka disini : ");
		int hasil = new java.util.Scanner(System.in).nextInt();
		//
		if (hasil % 2 == 0) {
		    System.out.println("angka " + hasil + " adalah angka 'GENAP'");
		}
		//
		else {
		    System.out.println("angka " + hasil + " adalah angka 'GANJIL'");
		}

		if (hasil >= 0) {
		    System.out.println("dan angka ini adalah bilangan 'POSITIF'");
		}
		//
		else {
		    System.out.println("dan angka ini adalah bilangan 'NEGATIF'");
		}

	}	   
}

