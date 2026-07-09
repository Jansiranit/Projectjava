package Wrapper;

import java.util.Scanner;

public class WrapperClass {
	static String inputcustomerID ="656565";
	static String inputcustomerName ="Jansi";
	static String inputcustomerAge ="30";
	static String inputmonthlySalary="60000";
	static String inputaccountBalance ="50000";
	static String inputmobileNumber ="6757678688";
	static String inputaadhaarNumber="7867657565767";
	static String inputpannumber="876vhh767";

	public static void main(String[] args) {
		
		int customerID = Integer.parseInt(inputcustomerID);
		System.out.println(customerID);
		String customerName  = inputcustomerName;
		System.out.println(customerName);
		int age = Integer.parseInt(inputcustomerAge);
		if(age<18) {
			System.out.println("not eleigible");	
			return;
		}
		System.out.println(age);
		double salary= Double.parseDouble(inputmonthlySalary);
		System.out.println(salary);
		double accBalance = Double.parseDouble(inputaccountBalance);
		System.out.println(accBalance);
		long mobile = Long.parseLong(inputmobileNumber);
		System.out.println(mobile);
		long aadhar= Long.parseLong(inputaadhaarNumber);
		System.out.println(aadhar);
		String pan = inputpannumber;
		System.out.println(pan);
		
		
		
		
	}

}
