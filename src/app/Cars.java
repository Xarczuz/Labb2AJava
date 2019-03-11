package app;

public class Cars {
	String carUID, brand, name, modell, color, status;
	int purchasePrice, sellPrice;
	public Cars(String carUID, String brand, String name, String modell, String color, String status, int purchasePrice,
			int sellPrice) {
		
		this.carUID = carUID;
		this.brand = brand;
		this.name = name;
		this.modell = modell;
		this.color = color;
		this.status = status;
		this.purchasePrice = purchasePrice;
		this.sellPrice = sellPrice;
	}
	
	@Override
	public String toString() {
		return "Cars [carUID=" + carUID + ", brand=" + brand + ", name=" + name + ", modell=" + modell + ", color="
				+ color + ", status=" + status + ", purchasePrice=" + purchasePrice + ", sellPrice=" + sellPrice + "]";
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
	public String getName() {
		return name;
	}
	public int getPurchasePrice() {
		return purchasePrice;
	}
	public int getSellPrice() {
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
	public void setName(String name) {
		this.name = name;
	}
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
