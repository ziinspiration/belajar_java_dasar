package record;

import java.util.Scanner;

public class titiktanparecord {

	public static void main(String[] args) {
		Titik T = new Titik();

		Scanner sc = new Scanner(System.in);
		System.out.print("x : ");
		T.setX(sc.nextInt());
		System.out.print("y : ");
		T.setY(sc.nextInt());

		System.out.println("Titik : (" + T.getX() + ", " + T.getY() + ")");
	}

}

class Titik {
	private int x;
	private int y;

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
