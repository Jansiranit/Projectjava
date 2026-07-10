package Abstraction;

import java.util.Scanner;

public class Mainclass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter customer name");
		String name= scan.nextLine();
		System.out.println("Enter opening balance");
		double initiBalance = scan.nextDouble();
		System.out.println("Choose account type 1 .saving or 2. current");
		int type = scan.nextInt();
		Account myAccount;
		if(type == 1) {
			myAccount= new SavingsAccount(name, initiBalance);
					
			
		}else{
			myAccount = new CurrentAccount(name, initiBalance);
			
		}
		
		boolean keepRunning = true;
		while(keepRunning) {
			System.out.println("---BANK MANU---");
			System.out.println("1.Deposit Cas");
			System.out.println("Withraw Cash");
			System.out.println("check balance & added interest");
			System.out.println("Enter your choice");
			int choice =scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter deposit amount");
				double deAmount = scan.nextDouble();
				myAccount.deposit(deAmount);
				break;
			case 2:
				System.out.println("Enter withraw amount");
				double withamount = scan.nextDouble();
				myAccount.withdraw(withamount);
				break;
			case 3:
				myAccount.calculateInterest();
				System.out.println("currect balance" +myAccount.getCustomerName()+":"+myAccount.getBalance());
				break;
			case 4:
				keepRunning = false;
				System.out.println("Thank you for baking with us");
				break;
				
			default:
				System.out.println("Invalid option");
			}
		}
	}

}
