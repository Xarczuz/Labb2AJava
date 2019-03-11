package app;

import java.util.UUID;

public class Cars {
	String sellerID, carUID, brand, modell, color, status;
	double purchasePrice, sellPrice;
	
	public Cars(String brand, String modell, String color, String status, double purchasePrice,
			double sellPrice) {
		
		this.carUID = UUID.randomUUID().toString();
		this.brand = brand;
		this.modell = modell;
		this.color = color;
		this.status = status;
		this.purchasePrice = purchasePrice;
		this.sellPrice = sellPrice;
	}
	
	
	public String getBrand() {
		return brand;
	}


	public String getCarUID() {
		return carUID;
	}


	public String getColor() {
		return color;
	}


	public String getModell() {
		return modell;
	}


	public double getPurchasePrice() {
		return purchasePrice;
	}


	public String getSellerID() {
		return sellerID;
	}


	public double getSellPrice() {
		return sellPrice;
	}


	public String getStatus() {
		return status;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setCarUID(String carUID) {
		this.carUID = carUID;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setModell(String modell) {
		this.modell = modell;
	}
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public void setSellerID(String sellerID) {
		this.sellerID = sellerID;
	}
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Cars [sellerID=" + sellerID + ", carUID=" + carUID + ", brand=" + brand + ", modell=" + modell
				+ ", color=" + color + ", status=" + status + ", purchasePrice=" + purchasePrice + ", sellPrice="
				+ sellPrice + "]";
	}
	
	
}
