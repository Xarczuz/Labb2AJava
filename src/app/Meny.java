package app;

import java.io.IOException;
import java.util.Scanner;

public class Meny {
	
	private static Scanner in;
	
	public void menuChoise() throws IOException, ClassNotFoundException {
		
		in = new Scanner(System.in);

		int val = 0;

		while (val != 9) {
			System.out.println("\n======================================");
			System.out.println("| Välj i menyn nedan.");
			System.out.println("======================================");
			System.out.println("| 1. > Skapa rapport.");
			System.out.println("| 2. > Skapa data.");
			System.out.println("| 9. > Avsluta");
			System.out.println("======================================");
			System.out.print("| Välj från menyn: ");
			
			val = in.nextInt();

			if (val == 1) {
				
			} else if (val == 2) {
				
			} else if (val == 3) {
				

			} else if (val == 4) {
				
			} else if (val == 5) {
			

			} else if (val == 6) {
				
			} else if (val == 7) {
			
			} else if (val == 8) {
			
			} else if (val == 9) {
			
			} else {
			}
		}
	}

}
