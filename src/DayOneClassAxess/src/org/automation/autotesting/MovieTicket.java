package org.automation.autotesting;

import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {
		int customerAge = 25;
		String screen = "";
		Scanner sc = new Scanner(System.in);
		
		if (customerAge >= 18) {
			System.out.println("1 - VIP Screen");
			System.out.println("2 - Normal Screen");
			System.out.println("Enter Screen Choice");
		     screen = sc.nextLine();
		} else {
			System.out.println("Age Restriction");
		}
		switch (screen) {
		case "VIP Screen":
			System.out.println("Your selected VIP screen");
			System.out.println("Thanks for booking");
			break;
		case "Normal Screen":
			System.out.println("Your selected Normal Screen");
			System.out.println("Thanks for booking");
			break;

		default:
			System.out.println("Invalid  choice");
		}
	}
}
