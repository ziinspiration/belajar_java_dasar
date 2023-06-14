package record;

import java.util.Scanner;

public class titik {
	private int x;
	private int y;

	public static void main(String[] args) {
		titik t = new titik();

		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		t.x = sc.nextInt();
		System.out.print("y: ");
		t.y = sc.nextInt();
		System.out.println("titik: (" + t.x + ", " + t.y + ")");

		sc.close();
	}
}
