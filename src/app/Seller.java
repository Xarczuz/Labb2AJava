package app;

import java.util.UUID;

public class Seller {

	String sellerName, sellerPhone, sellerAdress, sellerInformation, sellerStatus;
	int sellerImportPurchase, sellerSoldPrice;
	int sellerStoreAmount, sellerProfit, sellerSoldAmounnt;
	float provision;
	String sellerID = UUID.randomUUID().toString();

	/**
	 * @param sellerName
	 * @param sellerPhone
	 * @param sellerAdress
	 * @param sellerInformation
	 * @param sellerStatus
	 * @param sellerImportPurchase
	 * @param sellerSoldPrice
	 * @param sellerStoreAmount
	 * @param sellerProfit
	 * @param sellerSoldAmounnt
	 * @param provision
	 * @param sellerID
	 */
	public Seller(String sellerName, String sellerPhone, String sellerAdress, String sellerInformation,
			String sellerStatus, int sellerImportPurchase, int sellerSoldPrice, int sellerStoreAmount, int sellerProfit,
			int sellerSoldAmounnt, float provision, String sellerID) {
		super();
		this.sellerName = sellerName;
		this.sellerPhone = sellerPhone;
		this.sellerAdress = sellerAdress;
		this.sellerInformation = sellerInformation;
		this.sellerStatus = sellerStatus;
		this.sellerImportPurchase = sellerImportPurchase;
		this.sellerSoldPrice = sellerSoldPrice;
		this.sellerStoreAmount = sellerStoreAmount;
		this.sellerProfit = sellerProfit;
		this.sellerSoldAmounnt = sellerSoldAmounnt;
		this.provision = provision;
		this.sellerID = sellerID;
	}

	/**
	 * @return the provision
	 */
	public float getProvision() {
		return provision;
	}

	/**
	 * @return the sellerAdress
	 */
	public String getSellerAdress() {
		return sellerAdress;
	}

	/**
	 * @return the sellerID
	 */
	public String getSellerID() {
		return sellerID;
	}

	/**
	 * @return the sellerImportPurchase
	 */
	public int getSellerImportPurchase() {
		return sellerImportPurchase;
	}

	/**
	 * @return the sellerInformation
	 */
	public String getSellerInformation() {
		return sellerInformation;
	}

	/**
	 * @return the sellerName
	 */
	public String getSellerName() {
		return sellerName;
	}

	/**
	 * @return the sellerPhone
	 */
	public String getSellerPhone() {
		return sellerPhone;
	}

	/**
	 * @return the sellerProfit
	 */
	public int getSellerProfit() {
		return sellerProfit;
	}

	/**
	 * @return the sellerSoldAmounnt
	 */
	public int getSellerSoldAmounnt() {
		return sellerSoldAmounnt;
	}

	/**
	 * @return the sellerSoldPrice
	 */
	public int getSellerSoldPrice() {
		return sellerSoldPrice;
	}

	/**
	 * @return the sellerStatus
	 */
	public String getSellerStatus() {
		return sellerStatus;
	}

	/**
	 * @return the sellerStoreAmount
	 */
	public int getSellerStoreAmount() {
		return sellerStoreAmount;
	}

	/**
	 * @param provision the provision to set
	 */
	public void setProvision(float provision) {
		this.provision = provision;
	}

	/**
	 * @param sellerAdress the sellerAdress to set
	 */
	public void setSellerAdress(String sellerAdress) {
		this.sellerAdress = sellerAdress;
	}

	/**
	 * @param sellerID the sellerID to set
	 */
	public void setSellerID(String sellerID) {
		this.sellerID = sellerID;
	}

	/**
	 * @param sellerImportPurchase the sellerImportPurchase to set
	 */
	public void setSellerImportPurchase(int sellerImportPurchase) {
		this.sellerImportPurchase = sellerImportPurchase;
	}

	/**
	 * @param sellerInformation the sellerInformation to set
	 */
	public void setSellerInformation(String sellerInformation) {
		this.sellerInformation = sellerInformation;
	}

	/**
	 * @param sellerName the sellerName to set
	 */
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	/**
	 * @param sellerPhone the sellerPhone to set
	 */
	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}

	/**
	 * @param sellerProfit the sellerProfit to set
	 */
	public void setSellerProfit(int sellerProfit) {
		this.sellerProfit = sellerProfit;
	}

	/**
	 * @param sellerSoldAmounnt the sellerSoldAmounnt to set
	 */
	public void setSellerSoldAmounnt(int sellerSoldAmounnt) {
		this.sellerSoldAmounnt = sellerSoldAmounnt;
	}

	/**
	 * @param sellerSoldPrice the sellerSoldPrice to set
	 */
	public void setSellerSoldPrice(int sellerSoldPrice) {
		this.sellerSoldPrice = sellerSoldPrice;
	}

	/**
	 * @param sellerStatus the sellerStatus to set
	 */
	public void setSellerStatus(String sellerStatus) {
		this.sellerStatus = sellerStatus;
	}

	/**
	 * @param sellerStoreAmount the sellerStoreAmount to set
	 */
	public void setSellerStoreAmount(int sellerStoreAmount) {
		this.sellerStoreAmount = sellerStoreAmount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Seller [sellerName=" + sellerName + ", sellerPhone=" + sellerPhone + ", sellerAdress=" + sellerAdress
				+ ", sellerInformation=" + sellerInformation + ", sellerStatus=" + sellerStatus
				+ ", sellerImportPurchase=" + sellerImportPurchase + ", sellerSoldPrice=" + sellerSoldPrice
				+ ", sellerStoreAmount=" + sellerStoreAmount + ", sellerProfit=" + sellerProfit + ", sellerSoldAmounnt="
				+ sellerSoldAmounnt + ", provision=" + provision + ", sellerID=" + sellerID + "]";
	}

}
