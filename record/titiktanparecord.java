package record;

import java.util.Scanner;

public class titiktanparecord {
	private int x;
	private int y;

	public static void main(String[] args) {
		titiktanparecord t = new titiktanparecord();

		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		t.setX(sc.nextInt());
		System.out.print("y: ");
		t.setY(sc.nextInt());

		System.out.println("Titik: (" + t.getX() + ", " + t.getY() + ")");

		sc.close();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
