package introduction;

import java.util.Scanner;

public class OperasiLogicString {
	public static void main(String[] args) {
		String nama1 = "Santi", nama2 = "Sinta", nama3 = "";
		char ch1 = 'a', ch2 = 'b', ch3 = 'A';
		boolean hasil;
		int kode;
		// & -> and
		// || -> or
		// ! -> not
		// ^ -> xor

		// untuk sama dengan matematik gunakan == , jika pakai = untuk assignment
		// untuk membuat password -> equals
		// untuk membuat fitur search -> equalIgnoreCase

		hasil = nama1.equals("Santi");
		System.out.println("Nama1=='Santi' = " + hasil);

		hasil = nama1.equalsIgnoreCase("Sinta");
		System.out.println("Nama1!='Sinta' = " + hasil);

		hasil = nama1.isEmpty();
		System.out.println(" Nama1=='' = " + hasil);

		hasil = nama3.isEmpty();
		System.out.println("Nama3=='' = " + hasil);

		hasil = ch1 == ch2;
		System.out.println(" ch1==ch2 = " + hasil);

		hasil = ch1 != ch2;
		System.out.println(" ch1!=ch2 = " + hasil);

		hasil = ch1 < ch2;
		System.out.println(" ch1<ch2 = " + hasil);

		hasil = ch1 < ch3;
		System.out.println(" ch1<ch3 = " + hasil);

		kode = ch1;
		System.out.println(" ASC ch1 = " + kode);

		kode = ch2;
		System.out.println(" ASC ch2 = " + kode);

		kode = ch3;
		System.out.println(" ASC ch3 = " + kode);

	}
}
