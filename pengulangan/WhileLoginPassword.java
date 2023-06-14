package pengulangan;

import java.util.Scanner;

public class WhileLoginPassword {
	public static void main(String[] args) {
		String pass;

		Scanner sc = new Scanner(System.in);
		System.out.print("Your Password: ");
		pass = sc.nextLine();

		while (!pass.equals("$$$")) {
			System.out.print("Your Password: ");
			pass = sc.nextLine();
		}

		System.out.println("Login Success");

		sc.close();
	}
}
