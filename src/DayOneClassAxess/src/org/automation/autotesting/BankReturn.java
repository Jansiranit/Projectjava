package org.automation.autotesting;

public class BankReturn {
	public double calculateInterest(double amount, int interestRate, int nofyear) {
		//System.out.println("Amount is:" +amount);
		//System.out.println("Interrest Rate is:"+interestRate);
		//System.out.println("the no of year is:"+nofyear);
		return   (amount*interestRate*nofyear)/100;
		
	}

	public static void main(String[] args) {
		BankReturn br = new BankReturn();
		double totalinterest= br.calculateInterest(4000, 4, 5);
		
		System.out.println("the calculate interest: "+totalinterest);
		// how to store the returned value in a variable doubt
	}

}
