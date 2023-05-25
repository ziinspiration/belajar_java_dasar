package introduction;

import java.util.Scanner;

public class HitungDetikJam {
	public static void main (String[] args) {
		int jam,menit,detik,totaldetik;
		
		Scanner sc=new Scanner(System.in);	
		System.out.print("Ketik Jam : ");jam=sc.nextInt();
		System.out.print("Ketik Menit : ");menit=sc.nextInt();
		System.out.print("Ketik Detik : ");detik=sc.nextInt();
		totaldetik=jam*3600+menit*60+detik;
		System.out.println ("Total Detik = "+ totaldetik);
    }
}

