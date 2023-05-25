package introduction;

import java.util.Scanner;

public class HitungLuasPersegi {
	public static void main (String[] args) {
		int keliling, sisi;
		
		Scanner sc=new Scanner(System.in);	
		System.out.print("Ketik sisi : "); sisi=sc.nextInt();
		keliling=4*sisi;
		System.out.println ("Keliling persegi = "+ keliling);
    }
}

