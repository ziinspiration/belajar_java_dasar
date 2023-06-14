package tugas;

import java.util.Scanner;

public class Mahasiswa {
    private String NRP;
    private String Nama;
    private double UTS;
    private double UAS;
    private double Prak;
    private double Quiz;
    private double Tugas;
    private double Kehadiran;
    private double NA;
    private char Indeks;

    public void bacaMahasiswa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NRP: ");
        NRP = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        Nama = scanner.nextLine();
        System.out.print("Masukkan Nilai UTS: ");
        UTS = scanner.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        UAS = scanner.nextDouble();
        System.out.print("Masukkan Nilai Praktikum: ");
        Prak = scanner.nextDouble();
        System.out.print("Masukkan Nilai Quiz: ");
        Quiz = scanner.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        Tugas = scanner.nextDouble();
        System.out.print("Masukkan Nilai Kehadiran: ");
        Kehadiran = scanner.nextDouble();
    }

    public double hitungNa() {
        NA = 0.3 * UTS + 0.3 * UAS + 0.2 * Prak + 0.05 * Quiz + 0.05 * Kehadiran + 0.1 * Tugas;
        return NA;
    }

    public char nentuinIndeks() {
        if (NA >= 85) {
            Indeks = 'A';
        } else if (NA >= 75) {
            Indeks = 'B';
        } else if (NA >= 55) {
            Indeks = 'C';
        } else if (NA >= 45) {
            Indeks = 'D';
        } else {
            Indeks = 'E';
        }
        return Indeks;
    }

    public void tulisMahasiswa() {
        System.out.println("NRP: " + NRP);
        System.out.println("Nama: " + Nama);
        System.out.println("Nilai UTS: " + UTS);
        System.out.println("Nilai UAS: " + UAS);
        System.out.println("Nilai Praktikum: " + Prak);
        System.out.println("Nilai Quiz: " + Quiz);
        System.out.println("Nilai Tugas: " + Tugas);
        System.out.println("Nilai Kehadiran: " + Kehadiran);
        System.out.println("Nilai Akhir: " + NA);
        System.out.println("Indeks: " + Indeks);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.bacaMahasiswa();
        mahasiswa.hitungNa();
        mahasiswa.nentuinIndeks();
        mahasiswa.tulisMahasiswa();
    }
}
