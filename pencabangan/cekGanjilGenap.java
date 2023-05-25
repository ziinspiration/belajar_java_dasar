package pencabangan;

import java.util.Scanner;

public class cekGanjilGenap {
	public static void main (String[] args) {
	int x;
	// % adalah mod
	Scanner sc=new Scanner (System.in);
	System.out.print("Ketik bilangan bulat : ") ;x=sc.nextInt();
	if (x % 2 == 0) {
		System.out.print("Bilangan genap");
	}
	else {
		System.out.print("Bilangan ganjil");
	}
		

	}	   
}

