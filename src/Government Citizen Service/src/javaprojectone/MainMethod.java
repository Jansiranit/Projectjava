package javaprojectone;

import java.util.Scanner;

public class MainMethod {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Citizen Name :");
		String name = scan.next();
		System.out.println("Select Service Choice ");
		System.out.println("1. Aadhaar Service");
		System.out.println("2. Passport Service");
		
		int Choice = scan.nextInt();
		Citizen c=null;
		if(Choice==1) {
			c = new AadhaarService(name) ;
			
		}
		else if(Choice==2) {
			c = new PassportService(name) ;
		}
		else {
			System.out.println("invalid serive slected");
			return;
		}
		System.out.println("====================================");
		if(c instanceof Service) {
			((Service)c).applyService();
		}
		System.out.println("=====================================");
	}

}
