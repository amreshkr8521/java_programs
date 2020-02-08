package com.bridegelabz.stockManagementJson.service;

public interface IServices {
	public void buy(long amount, String symbol);

	public void printReport();

	public void sell(long amount, String symbol);
}
