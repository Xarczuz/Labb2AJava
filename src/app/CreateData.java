package app;

import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CreateData {
    private static Connection connect(String fileName) {
        // SQLite connection string
    	String url = "jdbc:sqlite:" + Paths.get(".").toAbsolutePath().normalize().toString() + "/" + fileName;
    	Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
	  public static void insert(String LastName,String FirstName,String Address , String Phone)  {
	        String sql = "INSERT INTO Personal(LastName,FirstName,Address,Phone) VALUES(?,?,?,?)";
	 
	        try (Connection conn = CreateData.connect("TheDataBase.db");
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, LastName);
	            pstmt.setString(2, FirstName);
	            pstmt.setString(3, Address);
	            pstmt.setString(4, Phone);
	            
	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	public static void selectAll(String fileName){
        String sql = "SELECT * FROM Personal";
    	String url = "jdbc:sqlite:" + Paths.get(".").toAbsolutePath().normalize().toString() + "/" + fileName;
        try (Connection conn = DriverManager.getConnection(url);
        		  Statement stmt  = conn.createStatement();
                ResultSet rs    = stmt.executeQuery(sql)){
        	  while (rs.next()) {
                  System.out.println(rs.getInt("PersonID") +  "\t" + 
                                     rs.getString("FirstName") + "\t" +
                                     rs.getString("LastName") + "\t" +
                                     rs.getString("Address") + "\t" +
                                     rs.getString("Phone")                          
                		  );
              }          
	 
} catch (SQLException e) {
    System.out.println(e.getMessage());
}
	}
	public static void createNewTable(String fileName) {
		  // SQLite connection string
		String url = "jdbc:sqlite:" + Paths.get(".").toAbsolutePath().normalize().toString() + "/" + fileName;
        // SQL statement for creating a new table

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
        	System.out.println("Connected");
            // create a new table
            String sql = "CREATE TABLE IF NOT EXISTS Personal (\n" + 
            		"    PersonID integer PRIMARY KEY,\n" + 
            		"    LastName text,\n" + 
            		"    FirstName text,\n" + 
            		"    Address text,\n" + 
            		"    Phone text"+
            		");";

            stmt.execute(sql);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}

	public static void createNewDatabase(String fileName) {
		String url = "jdbc:sqlite:" + Paths.get(".").toAbsolutePath().normalize().toString() + "/" + fileName;
		System.out.println(url);
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
			if (conn != null) {
				DatabaseMetaData meta = conn.getMetaData();

				System.out.println("The driver name is " + meta.getDriverName());
				System.out.println("A new database has been created.");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}

	}

	public static void createSeller() {

		ArrayList<Cars> carsList = new ArrayList<Cars>();
		// brand, modell, color, status purchasePrice, sellPrice Bilar i lager
		carsList.add(new Cars("Mazda", "CX-5", "Röd", "Finns i Lager", 78000, 264900));
		carsList.add(new Cars("Mazda", "6", "Blå", "Finns i Lager", 67000, 270900));
		carsList.add(new Cars("Mercedes", "CLA Coupé", "Vit", "Finns i Lager", 78000, 264900));
		carsList.add(new Cars("Audi", "CX-5", "Röd", "Finns i Lager", 78000, 264900));
		carsList.add(new Cars("BMW", "CX-5", "Svart", "Finns i Lager", 120000, 454900));
		carsList.add(new Cars("Skoda", "CX-5", "Röd", "Finns i Lager", 78000, 264900));
		carsList.add(new Cars("Tesla", "CX-5", "Röd", "Finns i Lager", 78000, 264900));
		carsList.add(new Cars("Volvo", "CX-5", "Röd", "Finns i Lager", 90000, 350900));
		carsList.add(new Cars("Toyota", "CX-5", "Röd", "Finns i Lager", 78000, 264900));
		carsList.add(new Cars("Opel", "CX-5", "Röd", "Finns i Lager", 50000, 180900));
		carsList.add(new Cars("Honda", "CX-5", "Röd", "Finns i Lager", 78000, 264900));
		carsList.add(new Cars("Fiat", "CX-5", "Röd", "Finns i Lager", 78000, 264900));
		carsList.add(new Cars("Renault", "CX-5", "Röd", "Finns i Lager", 78000, 264900));
		carsList.add(new Cars("Aston Martin", "CX-5", "Röd", "Finns i Lager", 278000, 1364900));
		carsList.add(new Cars("Ferrari", "CX-5", "Röd", "Finns i Lager", 78000, 264900));
		carsList.add(new Cars("Lamborgini", "CX-5", "Röd", "Finns i Lager", 708000, 2564900));
		carsList.add(new Cars("Rolls-Royce", "CX-5", "Röd", "Finns i Lager", 78000, 264900));
		carsList.add(new Cars("Jaguar", "CX-5", "Röd", "Finns i Lager", 78000, 264900));
		carsList.add(new Cars("Ford", "CX-5", "Röd", "Finns i Lager", 78000, 264900));
		carsList.add(new Cars("Chevrolet", "CX-5", "Röd", "Finns i Lager", 78000, 264900));

		ArrayList<Seller> sellerList = new ArrayList<Seller>();
		// antal säljare 8
		sellerList.add(new Seller("Kalle Li", "076-855632", "Sveavägen 23", "BMW sold", "online"));
		sellerList.add(new Seller("Björn Kar", "076-856222", "Brommavägen 5", "Toyota Supra Sold", "online"));
		sellerList.add(new Seller("Vlad Li", "076-895663", "Årstigen 18", "Tesla Sold", "offline"));
		sellerList.add(new Seller("Van  Mi", "076-66566632", "Öveavägen 73", "Volvo sold", "offline"));
		sellerList.add(new Seller("Lenart Young", "073-875637", "Svantevägen 21", "Saab sold", "offline"));
		sellerList.add(new Seller("Jenny Davidson", "070-825322", "Fiskhamnen 43", "Mercedes sold", "online"));
		sellerList.add(new Seller("Jessica Lund", "076-775682", "Sundlandvägen 21", "Tesla sold", "online"));
		sellerList.add(new Seller("Johanna Van", "070-355432", "Kroneberg 42", "BMW sold", "offline"));
		sellerList.add(new Seller("Peter Li", "070-353632", "Sveavägen 88", "Nissan sold", "online"));

		ArrayList<String> soldCarsList = new ArrayList<String>();
		// koppla säljare till såld bil

		for (Cars c : carsList) {
			// Math.floor(Math.random() * 2);

			if (Math.floor(Math.random() * 2) == 1) {
				Math.floor(Math.random() * sellerList.size());
				sellerList.get((int) Math.floor(Math.random() * sellerList.size()));
				c.setStatus("Såld");
				String s = ("Car ID: " + c.getCarUID() + ", " + "Seller ID: "
						+ sellerList.get((int) Math.floor(Math.random() * sellerList.size())).getSellerID());
				soldCarsList.add(s);
			}
		}

		try {
			IOData.writeToFile(soldCarsList, "soldCars.txt");
			IOData.writeToFile(carsList, "carslist.txt");
			IOData.writeToFile(sellerList, "sellerlist.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
