package javaprojectone;

import java.util.Scanner;

public class MainMethod {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Citizen Name :");
		String citizen = scan.next();
		System.out.println("Select Service Choice ");
		System.out.println("1. Aadhaar Service");
		System.out.println("2. Passport Service");
		String Choice = scan.nextLine();
	}

}
