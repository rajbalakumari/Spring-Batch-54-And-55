package com.nit.beans;

public class CurrencyTransaction {

	private int transactionId;
	private String customerName;
	private String sourceCurrency;
	private String targetCurrency;
	private double amount;

	public CurrencyTransaction(int transactionId, String customerName, String sourceCurrency, String targetCurrency,
			double amount) {

		this.transactionId = transactionId;
		this.customerName = customerName;
		this.sourceCurrency = sourceCurrency;
		this.targetCurrency = targetCurrency;
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}
