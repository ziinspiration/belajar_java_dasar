package introduction;

import java.util.Scanner;

public class HitungLuasLingkaran {
	public static void main (String[] args) {
		int jari2; // int -> untuk menampung variabel
		double luas; //double -> untuk menampung variabel dalam bentuk terbesar
		
		Scanner sc=new Scanner(System.in);	
		System.out.print("Ketik Jari-Jari : "); jari2=sc.nextInt();
		
		luas=3.14*jari2*jari2;
		System.out.println ("Luas = "+ luas);
    }
}

