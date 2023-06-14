package tugas;

import java.util.Scanner;

public class jam {
    private int jam, menit, detik;
    private Scanner sc;

    public jam() {
        sc = new Scanner(System.in);
    }

    public void bacaJam() {
        do {
            System.out.print("jam : ");
            jam = sc.nextInt();
        } while (jam < 0 || jam > 23);
        do {
            System.out.print("menit : ");
            menit = sc.nextInt();
        } while (menit < 0 || menit > 59);
        do {
            System.out.print("detik : ");
            detik = sc.nextInt();
        } while (detik < 0 || detik > 59);
    }

    public void tulisJam() {
        System.out.print(jam + ":" + menit + ":" + detik);
    }

    public void ucapan() {
        if (jam >= 0 && jam <= 5) {
            System.out.println("Selamat Subuh");
        } else if (jam >= 6 && jam <= 10) {
            System.out.println("Selamat Pagi");
        } else if (jam >= 11 && jam <= 15) {
            System.out.println("Selamat Siang");
        } else if (jam >= 16 && jam <= 18) {
            System.out.println("Selamat Sore");
        } else if (jam >= 19 && jam <= 23) {
            System.out.println("Selamat Malam");
        }
    }

    public String tulisJam2() {
        return jam + ":" + menit + ":" + detik;
    }

    public String ucapan2() {
        String ucapan = null;
        if (jam >= 0 && jam <= 5) {
            ucapan = "Selamat subuh";
        } else if (jam >= 6 && jam <= 10) {
            ucapan = "Selamat pagi";
        } else if (jam >= 11 && jam <= 15) {
            ucapan = "Selamat siang";
        } else if (jam >= 16 && jam <= 18) {
            ucapan = "Selamat sore";
        } else if (jam >= 19 && jam <= 23) {
            ucapan = "Selamat malam";
        }
        return ucapan;
    }

    public static void main(String[] args) {
        jam j = new jam();
        j.bacaJam();
        j.tulisJam();
        System.out.println(j.ucapan2());
    }
}
