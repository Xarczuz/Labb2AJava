package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CreateRapport {

	private static Scanner in;
	static ArrayList<Seller> sellerList = new ArrayList<Seller>();
	static ArrayList<Cars> carsList = new ArrayList<Cars>();
	static HashMap<String, String> soldCarsList = new HashMap<String, String>();

	public static void rapportMenu() {
		in = new Scanner(System.in);
		readDataFromFile();
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
				printSoldCars();

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
			soldCarsToArr(s);
			s = IOData.readFromFile("sellerlist.txt");
			sellerListToArr(s);
			s = IOData.readFromFile("carslist.txt");
			carsListToArr(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void soldCarsToArr(String inData) {
		String[] tmpStr = inData.split("\n");
		for (String s : tmpStr) {
			String[] tmpStrArr = s.split(",");
			soldCarsList.put(tmpStrArr[0].split(":")[1], tmpStrArr[1].split(":")[1]);
		}
	}

	public static void sellerListToArr(String inData) {
		String[] tmpStr = inData.split("\n");
		for (String s : tmpStr) {
			String[] tmpStrArr = s.split(",");
			String sellerName = tmpStrArr[0].split("=")[1];
			String sellerPhone = tmpStrArr[1].split("=")[1];
			String sellerAdress = tmpStrArr[2].split("=")[1];
			String sellerInformation = tmpStrArr[3].split("=")[1];
			String sellerStatus = tmpStrArr[4].split("=")[1];

			Seller tmpSeller = new Seller(sellerName, sellerPhone, sellerAdress, sellerInformation, sellerStatus);
			tmpSeller.setSellerID(tmpStrArr[5].split("=")[1]);
			sellerList.add(new Seller(sellerName, sellerPhone, sellerAdress, sellerInformation, sellerStatus));
		}

		for (Seller string : sellerList) {

			System.out.println(string.toString());
		}
	}

	public static void carsListToArr(String inData) {

		String[] tmpStr = inData.split("\n");
		for (String s : tmpStr) {
			String[] tmpStrArr = s.split(",");

			String brand = tmpStrArr[0].split("=")[1];
			String modell = tmpStrArr[2].split("=")[1];
			String color = tmpStrArr[3].split("=")[1];
			String status = tmpStrArr[4].split("=")[1];
			double purchasePrice = Double.parseDouble(tmpStrArr[5].split("=")[1]);
			double sellPrice = Double.parseDouble(tmpStrArr[6].split("=")[1]);

			Cars tmpCar = new Cars(brand, modell, color, status, purchasePrice, sellPrice);
			tmpCar.setCarUID(tmpStrArr[1].split("=")[1]);
			carsList.add(tmpCar);
		}

		for (Cars string : carsList) {

			System.out.println(string.toString());
		}
	}

	public static void printSoldCars() {
		int purchase = 0;
		int sold = 0;

		for (Cars string : carsList) {
			if (string.getStatus().toLowerCase().contentEquals("såld")) {

				System.out.println(string.toString());
			}
			purchase += string.getPurchasePrice();
			sold += string.getSellPrice();
		}

		int profit = sold - purchase;
		System.out.println("Företagets vinst! " + profit + "kr");
	}

	public static void printCarsSoldBySeller() {

	}

}
