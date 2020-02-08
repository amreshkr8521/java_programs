package com.bridegelabz.stockManagementJson.model;
/**
 * 
 * @author Amresh Kumar
 * 
 */
public class StockAccount {
private String name;
private String companyName;
private long amount;
private String symbol;
private long share;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getAmount() {
	return amount;
}
public void setAmount(long amount) {
	this.amount = amount;
}
public String getSymbol() {
	return symbol;
}
public void setSymbol(String symbol) {
	this.symbol = symbol;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public long getShare() {
	return share;
}
public void setShare(long share) {
	this.share = share;
}
public StockAccount(){};
}
