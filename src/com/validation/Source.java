package com.validation;

import java.util.Scanner;
public class Source {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String seller = sc.nextLine();
		String buyer = sc.nextLine();
		String productQR = sc.nextLine();
		TransactionParty t1 = new TransactionParty(seller, buyer);
		Receipt r1 = new Receipt(t1,productQR);
		GenerateReceipt g1 = new GenerateReceipt();
		System.out.println(g1.verifyParty(r1));
		System.out.println(g1.calcGst(r1));
		
		sc.close();
	}

}
