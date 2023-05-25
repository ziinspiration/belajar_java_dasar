package pengulangan;

import java.nio.file.ClosedFileSystemException;
import java.util.Scanner;

public class WhileHitungDonasi {
	public static void main(String[] args) {
		int JumlahMhs, BesarDonasi;
		Scanner sc = new Scanner(System.in);
		System.out.print("Jumlah Mahasiswa :");
		JumlahMhs = sc.nextInt();

		int i = 1;
		int k = 0;
		while (i <= JumlahMhs) {
			System.out.print("Besar Donasi Ke " + i + ": Rp.");
			BesarDonasi = sc.nextInt();
			k = k + BesarDonasi;
			i = i + 1;
		}
		System.out.println("Total Donasi = Rp." + k);

	}
}
