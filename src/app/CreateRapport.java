package app;

import java.util.Scanner;

public class CreateRapport {
	
	private static Scanner in;
	
	public static void rapportMenu() {
		in = new Scanner(System.in);

			while (true) {
				System.out.println("\n======================================");
				System.out.println("| Skapa rapport.");
				System.out.println("======================================");
				System.out.println("| 1. > Skapa rapport.");
				System.out.println("| 2. > Skapa data.");
				System.out.println("| 9. > Avsluta");
				System.out.println("======================================");
				System.out.print("| Välj från menyn: ");
				
				int val = in.nextInt();

				if (val == 1) {
					
				} else if (val == 2) {
					
				} else if (val == 9) {
					return;
				} 
			}
	}
}
