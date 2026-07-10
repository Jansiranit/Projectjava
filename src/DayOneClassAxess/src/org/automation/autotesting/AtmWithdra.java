package org.automation.autotesting;

public class AtmWithdra {

	public void withdrawAmount(double accBalance, double withdraAmount) {
		if (withdraAmount<=accBalance) {
			System.out.println("Withdrawal Successful");
			
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	public static void main(String[] args) {
		AtmWithdra aw= new AtmWithdra();
		aw.withdrawAmount(30000, 40000);
	}
}
