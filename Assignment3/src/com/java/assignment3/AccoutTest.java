package com.java.assignment3;

public class AccoutTest {

	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		account.setYearlyinterestrate(4.5d);
		
		double totalAfterWithDraw = account.withDraw(2500d);
		System.out.println("Total Balance after withdrawing "+ totalAfterWithDraw);
		
		double totalAfterDeposit = account.deposit(3000d);
		System.out.println("Total Balance after deposit :" + totalAfterDeposit);
		  Transaction tr1 = new Transaction('c', 500d, 1000d, "Transaction1", "Ap");
		  

	}

}
