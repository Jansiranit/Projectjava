package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Passengerlist {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<String> waitinglist = new LinkedList<String>();
		waitinglist.add("Sachin");
		waitinglist.add("Rahul");
		waitinglist.add("Amit");
		System.out.println("Enter new Passenger");
		String newpassenger = scanner.nextLine();
		waitinglist.add(newpassenger);
		System.out.println(waitinglist + "added to the waiting list successfully.");
		
		for(int i=0;i<waitinglist.size();i++) {
			System.out.println(waitinglist.get(i));
	}
		System.out.println();
		
		System.out.println("confirmed passenger cancels the ticket.");
		if(!waitinglist.isEmpty()) {
		String movePassenger=	waitinglist.remove(0);
		System.out.println(movePassenger +"  Move the first passenger from the waiting list to the confirmed list.");
		
		System.out.println("updated waiting list :");
		for(int i=0;i<waitinglist.size();i++) {
			System.out.println(waitinglist.get(i));
		}
		}
		
	}
	
	
	

}
