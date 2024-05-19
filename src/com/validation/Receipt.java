package com.validation;

public class Receipt {
	
	TransactionParty transactionparty;
	String productsQR;
	
	Receipt(TransactionParty transactionparty, String productsQR){
		this.transactionparty=transactionparty;
		this.productsQR=productsQR;
	}
}
