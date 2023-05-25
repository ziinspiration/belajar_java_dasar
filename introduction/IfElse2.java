package introduction;

import java.util.Scanner;

public class IfElse2 {
	public static void main (String[] args) {
	
		System.out.print("Masukan angka disini : ");
		int hasil = new java.util.Scanner(System.in).nextInt();
		//
		if (hasil % 2 == 0) {
		    System.out.println("angka" + hasil + "adalah angka genap");
		}
		//
		else {
		    System.out.println("angka " + hasil + " adalah angka ganjil");
		}

	}	   
}



