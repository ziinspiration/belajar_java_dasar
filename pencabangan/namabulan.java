package pencabangan;

import java.util.Scanner;

public class namabulan {
	public static void main (String[] args) {
	int x;
	
		Scanner sc=new Scanner (System.in);
		System.out.print("Masukan bilangan disini : ") ;x=sc.nextInt();
		if (x > 0) {
			
			if (x % 2 == 0)
				System.out.println("Positif genap");
			else
			System.out.println("Positif ganjil");
		}
		
		else {
			System.out.println("Bukan bilangan positif");
		}
	}	   
}

