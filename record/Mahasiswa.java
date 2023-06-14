package record;

import java.util.Locale;
import java.util.Scanner;

public class Mahasiswa {
    private String NRP;
    private String Nama;
    private float UTS, UAS, Prak, Quiz, Tgs, Hdr, NA;
    private char Idx;

    public void BacaMhs() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("NRP: ");
        NRP = sc.nextLine();
        System.out.print("Nama: ");
        Nama = sc.nextLine();
        System.out.print("UTS: ");
        UTS = sc.nextFloat();
        System.out.print("UAS: ");
        UAS = sc.nextFloat();
        System.out.print("Praktikum: ");
        Prak = sc.nextFloat();
        System.out.print("Quiz: ");
        Quiz = sc.nextFloat();
        System.out.print("Tugas: ");
        Tgs = sc.nextFloat();
        System.out.print("Kehadiran: ");
        Hdr = sc.nextFloat();
        sc.close();
    }

    public void TampilMhs() {
        System.out.println("Data Mahasiswa: ");
        System.out.println("NRP: " + NRP);
        System.out.println("Nama: " + Nama);
        System.out.println("Nilai akhir: " + String.format(Locale.US, "%.1f", NA));
        System.out.println("Indeks Nilai: " + Idx);
    }

    public void HitungNa() {
        double Nas;

        Nas = 0.3 * UTS + 0.3 * UAS + 0.2 * Prak + 0.1 * Quiz + 0.1 * Tgs + 0.1 * Hdr;
        NA = (float) Nas;

        if (NA >= 85) {
            Idx = 'A';
        } else if (NA >= 70) {
            Idx = 'B';
        } else if (NA >= 50) {
            Idx = 'C';
        } else if (NA >= 30) {
            Idx = 'D';
        } else {
            Idx = 'E';
        }
    }

    public static void main(String[] args) {
        Mahasiswa T = new Mahasiswa();

        T.BacaMhs();
        T.HitungNa();
        T.TampilMhs();
    }
}
