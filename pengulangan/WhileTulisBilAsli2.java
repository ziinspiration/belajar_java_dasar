package pengulangan;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class WhileTulisBilAsli2 {
	public static void main (String[] args) {
		int i=1;
		
		while (i<=100) {
			if (i %5 == 0)
				System.out.println(i);
			else
				System.out.println(i++);
			i =i+1 ;
		}
    }
}

