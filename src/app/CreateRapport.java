package app;

import java.io.IOException;
import java.util.Scanner;

public class CreateRapport {
	
	private static Scanner in;
	
	public static void rapportMenu() {
		in = new Scanner(System.in);

			while (true) {
				System.out.println("\n======================================");
				System.out.println("| Skapa rapport.");
				System.out.println("======================================");
				System.out.println("| 1. > Sålda bilar.");
				System.out.println("| 2. > Skapa data.");
				System.out.println("| 3. > Skapa data.");
				System.out.println("| 9. > Gå till huvud meny.");
				System.out.println("======================================");
				System.out.print("| Välj från menyn: ");
				
				int val = in.nextInt();

				if (val == 1) {
					System.out.println("\nSålda Bilar\n");
					readDataFromFile();
				} else if (val == 2) {
					
				} else if (val == 9) {
					return;
				} 
			}
	}
	
	public static void readDataFromFile() {
		String s;
		try {
			s = IOData.readFromFile("soldCars.txt");
			System.out.println(s);
			s = IOData.readFromFile("sellerlist.txt");
			System.out.println(s);
			s = IOData.readFromFile("carslist.txt");
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
