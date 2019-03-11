package app;

import java.util.ArrayList;

public class CreateData {

	public void createSeller() {

		ArrayList<Seller> sellerList = new ArrayList<Seller>();
		sellerList.add(new Seller("Kalle Li", "076-855632", "Sveavägen 23", "BMW sold", "online"));
		sellerList.add(new Seller("Björn Kar", "076-856222", "Brommavägen 5", "Toyota Supra Sold", "online"));
		sellerList.add(new Seller("Vlad Li", "076-895663", "Årstigen 18", "Tesla Sold", "offline"));
		sellerList.add(new Seller("Van  Mi", "076-66566632", "Öveavägen 73", "Volvo sold", "offline"));
		sellerList.add(new Seller("Lenart Young", "073-875637", "Svantevägen 21", "Saab sold", "offline"));
		sellerList.add(new Seller("Jenny Davidson", "070-825322", "Fiskhamnen 43", "Mercedes sold", "online"));
		sellerList.add(new Seller("Jessica Lund", "076-775682", "Sundlandvägen 21", "Tesla sold", "online"));
		sellerList.add(new Seller("Johanna Van", "070-355432", "Kroneberg 42", "BMW sold", "offline"));
		sellerList.add(new Seller("Peter Li", "070-353632", "Sveavägen 88", "Nissan sold", "online"));
	}

}
