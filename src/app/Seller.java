package app;

import java.util.UUID;

public class Seller {

	String sellerName, sellerPhone, sellerAdress, sellerInformation, sellerStatus;
	int sellerImportPurchase, sellerSoldPrice;
	int sellerStoreAmount, sellerProfit, sellerSoldAmounnt;
	float provision;
	String sellerID = UUID.randomUUID().toString();

	/**
	 * @param namn
	 * @param information
	 * @param tel
	 * @param status
	 * @param vinst
	 * @param saljande
	 * @param provision
	 * @param antal_affar
	 * @param id
	 * 
	 */
	public Seller(String namn, String information, String tel, String status, int vinst, int saljande, float provision,
			int antal_affar) {

		this.sellerName = namn;
		this.sellerInformation = information;
		this.sellerPhone = tel;
		this.sellerStatus = status;
		this.sellerProfit = vinst;
		this.sellerSoldPrice = saljande;
		this.provision = provision;
		this.sellerStoreAmount = antal_affar;

	}

	/**
	 * @return the antal_affar
	 */
	public int getAntal_affar() {
		return sellerStoreAmount;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return sellerID;
	}

	/**
	 * @return the information
	 */
	public String getInformation() {
		return sellerInformation;
	}

	/**
	 * @return the namn
	 */
	public String getNamn() {
		return sellerName;
	}

	/**
	 * @return the provision
	 */
	public float getProvision() {
		return provision;
	}

	/**
	 * @return the saljande
	 */
	public int getSaljande() {
		return sellerSoldPrice;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return sellerStatus;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return sellerPhone;
	}

	/**
	 * @return the vinst
	 */
	public int getVinst() {
		return sellerProfit;
	}

	/**
	 * @param antal_affar the antal_affar to set
	 */
	public void setAntal_affar(int antal_affar) {
		this.sellerStoreAmount = antal_affar;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.sellerID = id;
	}

	/**
	 * @param information the information to set
	 */
	public void setInformation(String information) {
		this.sellerInformation = information;
	}

	/**
	 * @param namn the namn to set
	 */
	public void setNamn(String namn) {
		this.sellerName = namn;
	}

	/**
	 * @param provision the provision to set
	 */
	public void setProvision(float provision) {
		this.provision = provision;
	}

	/**
	 * @param saljande the saljande to set
	 */
	public void setSaljande(int saljande) {
		this.sellerSoldPrice = saljande;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.sellerStatus = status;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.sellerPhone = tel;
	}

	/**
	 * @param vinst the vinst to set
	 */
	public void setVinst(int vinst) {
		this.sellerProfit = vinst;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Person [namn=" + sellerName + ", information=" + sellerInformation + ", tel=" + sellerPhone
				+ ", status=" + sellerStatus + ", vinst=" + sellerProfit + ", saljande=" + sellerSoldPrice
				+ ", provision=" + provision + ", antal_affar=" + sellerStoreAmount + ", id=" + sellerID + "]";
	}

}
