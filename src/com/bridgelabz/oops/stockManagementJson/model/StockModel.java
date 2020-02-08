package com.bridegelabz.stockManagementJson.model;
/**
 * 
 * @author Amresh Kumar
 *
 */
public class StockModel {
	private String NameOfCompany;
	private long priceOfShare;
	private long noOfShare;
	private String logo;
	private String transaction;
	public String getNameOfCompany() {
		return NameOfCompany;
	}
	public void setNameOfCompany(String nameOfCompany) {
		NameOfCompany = nameOfCompany;
	}
	public long getPriceOfShare() {
		return priceOfShare;
	}
	public void setPriceOfShare(long priceOfShare) {
		this.priceOfShare = priceOfShare;
	}
	public long getNoOfShare() {
		return noOfShare;
	}
	public void setNoOfShare(long noOfShare) {
		this.noOfShare = noOfShare;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public StockModel() {}
	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
	
}
