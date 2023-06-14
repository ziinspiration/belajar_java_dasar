package pengulangan;

import java.util.Scanner;

public class WhileHitungRata {
	public static void main(String[] args) {
		int jumlahMhs;
		float nilai;

		Scanner sc = new Scanner(System.in);
		System.out.print("Jumlah Mahasiswa: ");
		jumlahMhs = sc.nextInt();

		int i = 1;
		float totalNilai = 0;
		while (i <= jumlahMhs) {
			System.out.print("Nilai Mahasiswa ke-" + i + ": ");
			nilai = sc.nextFloat();
			totalNilai += nilai;
			i++;
		}

		System.out.println("Total Nilai = " + totalNilai);
		float rata = totalNilai / jumlahMhs;
		System.out.println("Nilai Rata-Rata = " + rata);

		sc.close();
	}
}
