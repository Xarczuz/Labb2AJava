package app;

import java.util.UUID;

public class Seller {

	private String sellerName, sellerPhone, sellerAdress, sellerInformation, sellerStatus;
	private double sellerImportPurchase, sellerSoldPrice;
	private double sellerStoreAmount, sellerProfit, sellerSoldAmounnt;
	private double provision;
	private String sellerID;

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
			String sellerStatus) {
		this.sellerID = UUID.randomUUID().toString();
		this.sellerName = sellerName;
		this.sellerPhone = sellerPhone;
		this.sellerAdress = sellerAdress;
		this.sellerInformation = sellerInformation;
		this.sellerStatus = sellerStatus;

	}

	/**
	 * @return the provision
	 */
	public double getProvision() {
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
	public double getSellerImportPurchase() {
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
	public double getSellerProfit() {
		return sellerProfit;
	}

	/**
	 * @return the sellerSoldAmounnt
	 */
	public double getSellerSoldAmounnt() {
		return sellerSoldAmounnt;
	}

	/**
	 * @return the sellerSoldPrice
	 */
	public double getSellerSoldPrice() {
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
	public double getSellerStoreAmount() {
		return sellerStoreAmount;
	}

	/**
	 * @param provision the provision to set
	 */
	public void setProvision(double provision) {
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
	public void setSellerImportPurchase(double sellerImportPurchase) {
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
	public void setSellerProfit(double sellerProfit) {
		this.sellerProfit = sellerProfit;
	}

	/**
	 * @param sellerSoldAmounnt the sellerSoldAmounnt to set
	 */
	public void setSellerSoldAmounnt(double sellerSoldAmounnt) {
		this.sellerSoldAmounnt = sellerSoldAmounnt;
	}

	/**
	 * @param sellerSoldPrice the sellerSoldPrice to set
	 */
	public void setSellerSoldPrice(double sellerSoldPrice) {
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
	public void setSellerStoreAmount(double sellerStoreAmount) {
		this.sellerStoreAmount = sellerStoreAmount;
	}

	@Override
	public String toString() {
		return "sellerName=" + sellerName + ", sellerPhone=" + sellerPhone + ", sellerAdress=" + sellerAdress
				+ ", sellerInformation=" + sellerInformation + ", sellerStatus=" + sellerStatus + ", sellerID="
				+ sellerID + "";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

}
