package com.bridgelabz.stockManajement.model;

/**
 * model class for the stock containing all the esential data required in stock
 * using getter and setter
 * 
 * @author amresh kumar
 *
 */
public class StockModel {

	private String NameOfCompany;
	private double priceOfShare;
	private long noOfShare;
	private String logo;

	public String getNameOfCompany() {
		return NameOfCompany;
	}

	public void setNameOfCompany(String nameOfCompany) {
		NameOfCompany = nameOfCompany;
	}

	public double getPriceOfShare() {
		return priceOfShare;
	}

	public void setPriceOfShare(double priceOfShare) {
		this.priceOfShare = priceOfShare;
	}

	public long getNoOfShare() {
		return noOfShare;
	}

	public void setNoOfShare(long noOfShare) {
		this.noOfShare = noOfShare;
	}

	public StockModel(String nameOfCompany, double priceOfShare, int noOfShare) {
		this.NameOfCompany = nameOfCompany;
		this.noOfShare = noOfShare;
		this.priceOfShare = priceOfShare;
	}

	public StockModel() {
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

}
