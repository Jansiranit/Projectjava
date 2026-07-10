package org.automation.autotesting;

import java.util.Scanner;

public class AtmBanking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - Balance Enquiry");
		System.out.println("2 - Cash Withdrawal");
		System.out.println("3 - Cash Deposit");
		System.out.println("4 - Mini Statement");
		System.out.println("Select your Option");
		String choice = sc.nextLine();

		switch (choice) {
		case "Balance Enquiry":
			System.out.println("Balance amount is 20000");
			break;
		case "Cash Withdrawal":
			System.out.println("Withdrawal Successfully");
			break;
		case "Cash Deposit":
			System.out.println("Deposit Successfully");
			break;
		case "Mini Statement":
			System.out.println("Mini Statement downloaded");
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}

}
