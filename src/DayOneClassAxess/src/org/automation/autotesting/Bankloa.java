package org.automation.autotesting;

import java.util.Scanner;

public class Bankloa {
	public static void main(String[] args) {

		double availableLoan = 200000;
		double loanApproved = 100000;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Salary :");
		double salary = sc.nextDouble();
		System.out.println("Year of Experience    :");
		int yearOfexp = sc.nextInt();
		System.out.println("Enter Credit Score    :");
		double creditScore = sc.nextDouble();

		if (salary > 50000 && yearOfexp >= 5 && creditScore >= 700) {

			System.out.println("Loan Approved ");
			double updatedLoan = availableLoan + loanApproved;
			System.out.println("Customer Salary is         :" + salary);
			System.out.println("No Of Year Exprience is    :" + yearOfexp);
			System.out.println("Credit Score is            :" + creditScore);
			System.out.println("The Approved Loan Amount is:" + loanApproved);
			System.out.println("Updated Loan Limit is      :" + updatedLoan);
		} else {
			System.out.println("Loan Rejected");
		}
	}

}
