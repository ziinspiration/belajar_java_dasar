package introduction;

import java.util.Scanner;

public class HitungLuasLingkaranV2 {
	public static void main (String[] args) {
		double phi=3.14; 
		// phi = konstanta -> angka / nilai isi sudah ditetapkan "3.14"
		int jari2;
		double luas;
		
		Scanner sc=new Scanner(System.in);	
		System.out.print("Ketik Jari-Jari : ");jari2=sc.nextInt();
		
		luas=phi*jari2*jari2;
		System.out.println ("Luas = "+ luas);
    }
}

