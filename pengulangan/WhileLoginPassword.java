package pengulangan;

import java.util.Scanner;

public class WhileLoginPassword {
	public static void main (String[] args) {
		String Pass;
		
		Scanner sc=new Scanner (System.in);
		System.out.print("Your Password :") ;Pass=sc.nextInt();
				
		
		while (!Pass.contentEquals("$$$")) {
		System.out.print("Your Password :") ;Pass=sc.nextInt();
		
		}
		System.out.println("Login Succes") ;
    }
}
