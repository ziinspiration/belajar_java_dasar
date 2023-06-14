package pengulangan;

import java.util.Scanner;

public class WhileHitungDonasi {
	public static void main(String[] args) {
		int jumlahMhs, besarDonasi;
		Scanner sc = new Scanner(System.in);
		System.out.print("Jumlah Mahasiswa: ");
		jumlahMhs = sc.nextInt();

		int i = 1;
		int totalDonasi = 0;
		while (i <= jumlahMhs) {
			System.out.print("Besar Donasi Ke-" + i + ": Rp.");
			besarDonasi = sc.nextInt();
			totalDonasi += besarDonasi;
			i++;
		}
		System.out.println("Total Donasi = Rp." + totalDonasi);

		sc.close();
	}
}
