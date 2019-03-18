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
			System.out.println("| 2. > Skapa databas.");
			System.out.println("| 3. > Skapa data.");
			System.out.println("| 4. > kolla data.");
			System.out.println("| 9. > Avsluta");
			System.out.println("======================================");
			System.out.print("| Välj från menyn: ");
			
			val = in.nextInt();

			if (val == 1) {
				CreateRapport.rapportMenu();
			} else if (val == 2) {
				//CreateData.createSeller(); 
				CreateData.createNewDatabase("TheDataBase.db");
				CreateData.createNewTable("TheDataBase.db");
				
			} else if (val == 3) {
	
				
					CreateData.insert("Kalle","Li", "076-855632", "Sveavägen 23");
					CreateData.insert("Björn","Kar", "076-856222", "Brommavägen 5");
					CreateData.insert("Vlad","Li", "076-895663", "Årstigen 18");
					CreateData.insert("Van","Mi", "076-66566632", "Öveavägen 73");
					CreateData.insert("Lenart","Young", "073-875637", "Svantevägen 21");
					CreateData.insert("Jenny","Davidson", "070-825322", "Fiskhamnen 43");
					CreateData.insert("Jessica","Lund", "076-775682", "Sundlandvägen 21");
					CreateData.insert("Johanna","Van", "070-355432", "Kroneberg 42");
					CreateData.insert("Peter","Li", "070-353632", "Sveavägen 88");

		
			}else if (val == 4) {		
					CreateData.selectAll("TheDataBase.db");
			} else if (val == 9) {
				System.exit(0);
			} 
		}
	}

}
