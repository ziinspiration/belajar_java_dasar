package pengulangan;

import java.util.Scanner;

public class WhileHitungRata {
	public static void main (String[] args) {
		int JumlahMhs;
		float Nilai;
		
		Scanner sc=new Scanner (System.in);
		System.out.print("Jumlah Mahasiswa :") ;JumlahMhs=sc.nextInt();
				
		int i=1;
		float k=0;
		while (i<=JumlahMhs) {
			System.out.print("Nilai Mahsiswa ke "+i+": ") ;Nilai=sc.nextInt();
			k=k+Nilai;
			i =i+1 ;		
		}
		System.out.println("Total Nilai ="+k) ;
		float Rata=k/JumlahMhs;
		System.out.println("Nilai Rata-Rata ="+Rata) ;
    }
}
