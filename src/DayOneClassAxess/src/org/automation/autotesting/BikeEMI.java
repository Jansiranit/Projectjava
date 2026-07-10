package org.automation.autotesting;

import java.util.Scanner;

public class BikeEMI {
	 double balanceloan;
	
	 double monthlyemi;
	public double amountDetails(double bikePrice,double downpay ) {
		
	 	balanceloan= bikePrice-downpay;
		//System.out.println("Loan amount is :" +balanceloan);
		return balanceloan;
	}
	public  double emi( int noofEmi, double balanceloan) {
		
		System.out.println("----- EMI DETAILS -----");
		 monthlyemi=balanceloan/noofEmi ;
		//System.out.println("Monthly EMI IS:"+monthlyemi);
		return monthlyemi;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 BikeEMI be = new BikeEMI();
		System.out.println("Enter Bike price:");
		double price=scan.nextDouble();
		System.out.println("Down payment amount");
	    double downpay=scan.nextDouble();
	    System.out.println("Enter number of EMI");
	    int noofEmi=scan.nextInt();	    
	    double balanceloan =be.amountDetails(price, downpay);
	    System.out.println("Loan amount is :" +balanceloan);
	   double monthlyemi= be.emi(noofEmi, balanceloan);
	   
	   System.out.println("Monthly EMI IS:"+monthlyemi);
	}
}
