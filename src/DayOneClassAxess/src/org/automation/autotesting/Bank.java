package org.automation.autotesting;

public class Bank {
	String customername;
	long accbalance;
	
 //static method
	
	public static void bankName() {
		System.out.println("The bank name is HDFC");

	}
	public static void interestRate() {
		System.out.println("The Bank Interest Rate is 5%");
		System.out.println("**********************************");

	}
	
	//non static method
	
	public  void customerDetails() {
		System.out.println("The Customer Name is:" +customername);
		System.out.println("The customer salary is:" +accbalance);

	}
	public static void main(String[] args) {
		//call static method
		bankName();
		interestRate();
		//to call non static method
		
		Bank b = new Bank();
		b.customername="jansi";
		b.accbalance= 87678686l;
		b.customerDetails();
		System.out.println("==============================");
		
		Bank b1 = new Bank();
		b1.customername="jinu";
		b1.accbalance=8000000l;
		b1.customerDetails();
		System.out.println("==============================");
		
	}
}
