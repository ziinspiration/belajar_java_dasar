package pencabangan;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		System.out.print("Masukkan angka di sini: ");
		int hasil = new Scanner(System.in).nextInt();

		if (hasil % 2 == 0) {
			System.out.println("Angka " + hasil + " adalah angka GENAP");
		} else {
			System.out.println("Angka " + hasil + " adalah angka GANJIL");
		}

		if (hasil >= 0) {
			System.out.println("Angka ini adalah bilangan POSITIF");
		} else {
			System.out.println("Angka ini adalah bilangan NEGATIF");
		}
	}
}
