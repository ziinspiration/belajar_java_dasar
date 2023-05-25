package record;

import java.util.Scanner;

public class titik {
	int x, y;

	public static void main(String[] args) {
		titik T = new titik();

		Scanner sc = new Scanner(System.in);
		System.out.print("x :");
		T.x = sc.nextInt();
		System.out.print("y :");
		T.y = sc.nextInt();
		System.out.println("Titik : (" + T.x + ", " + T.y + ")");
	}
}
