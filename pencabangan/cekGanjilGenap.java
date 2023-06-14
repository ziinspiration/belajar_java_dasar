package pencabangan;

import java.util.Scanner;

public class cekGanjilGenap {
	public static void main(String[] args) {
		int x;

		Scanner sc = new Scanner(System.in);
		System.out.print("Ketik bilangan bulat: ");
		x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("Bilangan genap");
		} else {
			System.out.println("Bilangan ganjil");
		}
	}
}
