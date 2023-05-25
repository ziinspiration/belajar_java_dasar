package introduction;

import java.util.Scanner;

public class HitungLuasPersegiPanjang {
	public static void main (String[] args) {
		int luas, panjang, lebar;
		
		Scanner sc=new Scanner(System.in);	
		System.out.print("Ketik panjang  : "); panjang=sc.nextInt();
		System.out.print("Ketik lebar : "); lebar=sc.nextInt();
		luas=panjang*lebar;
		System.out.println ("Luas = "+ luas);
    }
}

