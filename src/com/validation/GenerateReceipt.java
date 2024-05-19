package com.validation;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class GenerateReceipt {
	
	public int verifyParty (Receipt r){
		
		String seller = r.transactionparty.seller;
		String buyer = r.transactionparty.buyer;
		
		Pattern p = Pattern.compile("^[a-zA-Z]+$");
		Matcher sellermatcher =p.matcher(seller);
		Matcher buyermatcher = p.matcher(buyer);
		
		int count =0;
		
		if(sellermatcher.matches()) {
			count++;
		} if (buyermatcher.matches()) {
			count++;
		}
		return count;
	}
	
	public String calcGst(Receipt r) {
		String inputstring = r.productsQR;
		String ratePriceArray[] = inputstring.split("@");
		int sumofAll = 0;
		
		for(String current : ratePriceArray) {
			String splitIndividual[] = current.split(",");
			String Quantity = splitIndividual[1];
			String Rate = splitIndividual[0];
			int rate = Integer.parseInt(Rate);
			int quantity = Integer.parseInt(Quantity);
			
			sumofAll = sumofAll + rate * quantity;
		}
		
		int  Gst = (sumofAll*12/100);
		String s = Integer.toString(Gst);
		return s;
	}

}
