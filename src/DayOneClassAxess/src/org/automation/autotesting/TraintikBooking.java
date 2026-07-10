package org.automation.autotesting;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class TraintikBooking {
	static String trainName = "chennai Express";
	static int availableSeat = 10;
	static int tickerPrice = 200;
	static double totalAmount;

	public static void passengerDetails(String name, String sourceStation, String destinationSation, int noOFtickets) {
		if (noOFtickets <= availableSeat) {
			double totalAmount = tickerPrice * noOFtickets;
			// System.out.println("The total amount:" + totalAmount);
			System.out.println("Ticket Booked Successfully!");
			int remainingSeats = availableSeat - noOFtickets;
			System.out.println("The Remaing Seats:" + remainingSeats);
		} else {
			System.out.println("Seats not available");
		}
	}

	public static void cancelDetails() {
		System.out.println("Ticket Cancelled Successfully!");
		System.out.println("Refund the amount:" + totalAmount);
		int remainingSeats = availableSeat;
		System.out.println("The Remaing Seats:" + remainingSeats);
		// System.out.println("Thank You for Booking");
	}

	private static void ticketBooking() {
		System.out.println("===== Train Ticket Booking =====");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter passenger name");
		String name = scan.next();
		System.out.println("Enter Source Station ");
		String source = scan.next();
		System.out.println("Enter Destination Station");
		String destination = scan.next();
		System.out.println("Available seat:" + availableSeat);
		System.out.println("Enter number of Tickets");
		int noOFtickets = scan.nextInt();
		System.out.println("=======Booking tickets======");
		System.out.println("Passenger Name :" + name);
		System.out.println("Train Name     :" + trainName);
		System.out.println("From           :" + source);
		System.out.println("To             :" + destination);
		System.out.println("Tickets Booked :" + noOFtickets);
		totalAmount = noOFtickets * tickerPrice;
		System.out.println("Total Amount   :" + totalAmount);
		passengerDetails(name, source, destination, noOFtickets);
		System.out.println("Do you want to cancel ticket?");
		String cancel = scan.next();
		if (cancel.equalsIgnoreCase("no")) {
			passengerDetails(name, source, destination, noOFtickets);

		} else {
			cancelDetails();
		}
	}

	public static void main(String[] args) {
		ticketBooking();
	}
}
