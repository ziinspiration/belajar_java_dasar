package introduction;

import java.util.Scanner;

public class OperasiLogicBilangan {
	public static void main (String[] args) {
		boolean x=true, y=false, z=true, hasil; 
		// & -> and 
		// || -> or		
		// ! -> not
		// ^ -> xor
		
			hasil= (x && y) || z;
		System.out.println ("(X and Y) or Z = "+ hasil);
		
			hasil= x && (y || z);
		System.out.println ("X and (Y or Z)= "+ hasil);
		
			hasil= ! (x && z);
		System.out.println (" not (X and Z)= "+ hasil);
		
			hasil= (y ^ z) && y;
		System.out.println ("(X and Y) or Z = "+ hasil);
    }
}

