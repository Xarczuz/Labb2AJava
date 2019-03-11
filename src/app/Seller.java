package app;

import java.util.UUID;

public class Seller {

	String sellerName, information, tel, status;
	int antal_affar, vinst, saljande;
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

		this.namn = namn;
		this.information = information;
		this.tel = tel;
		this.status = status;
		this.vinst = vinst;
		this.saljande = saljande;
		this.provision = provision;
		this.antal_affar = antal_affar;

	}

	/**
	 * @return the antal_affar
	 */
	public int getAntal_affar() {
		return antal_affar;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the information
	 */
	public String getInformation() {
		return information;
	}

	/**
	 * @return the namn
	 */
	public String getNamn() {
		return namn;
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
		return saljande;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @return the vinst
	 */
	public int getVinst() {
		return vinst;
	}

	/**
	 * @param antal_affar the antal_affar to set
	 */
	public void setAntal_affar(int antal_affar) {
		this.antal_affar = antal_affar;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param information the information to set
	 */
	public void setInformation(String information) {
		this.information = information;
	}

	/**
	 * @param namn the namn to set
	 */
	public void setNamn(String namn) {
		this.namn = namn;
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
		this.saljande = saljande;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @param vinst the vinst to set
	 */
	public void setVinst(int vinst) {
		this.vinst = vinst;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Person [namn=" + namn + ", information=" + information + ", tel=" + tel + ", status=" + status
				+ ", vinst=" + vinst + ", saljande=" + saljande + ", provision=" + provision + ", antal_affar="
				+ antal_affar + ", id=" + id + "]";
	}

}
