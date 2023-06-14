package pencabangan;

import java.util.Scanner;

public class cekTahunKabisat {
	public static void main(String[] args) {
		int x;

		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan tahun di sini: ");
		x = sc.nextInt();

		if (x % 4 == 0) {
			System.out.println("Ini adalah tahun Kabisat");
		} else {
			System.out.println("Ini bukan tahun Kabisat");
		}
	}
}
