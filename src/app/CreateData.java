package app;

import java.util.ArrayList;

public class CreateData {

	public void createSeller() {

		ArrayList<Seller> sellerList = new ArrayList<Seller>();
		sellerList.add(
				new Seller("Kalle Li", "076-855632", "Svevägen23", "BMW sold", "online", 1000, 100000, 10, 58, 32, 5));
	}

}
