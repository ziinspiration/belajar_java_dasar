package pencabangan;

import java.util.Scanner;

public class cekTahunKabisat {
	public static void main (String[] args) {
	int x;
	// % adalah mod
	Scanner sc=new Scanner (System.in);
	System.out.print("Masukan tahun disini : ") ;x=sc.nextInt();
	if (x % 4 == 0) {
		System.out.print("Ini adalah tahun Kabisat");
	}
	else {
		System.out.print("Ini bukan tahun Kabisat");
	}
		

	}	   
}


