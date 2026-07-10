package org.automation.autotesting;

public class BankLoan {
	
	public void cusDetails(double salary, int creditscore) {
		System.out.println("Enter salary:" +salary);
		System.out.println("Enter Credit Score:"+creditscore);
		
		if(salary>50000)
		{
			//System.out.println("Salary is eligible ");
		
		 if (creditscore>700) 
		 {
			System.out.println("Loan Approved");
			
		}
		 
		else  
		{
			System.out.println("Low Credit Score");
		}
		}
		else {
			System.out.println("Salary Not Eligible");
		}
	}
	

	public static void main(String[] args) {
		BankLoan bl= new BankLoan();
	bl.cusDetails(40000, 800);
		
		
		
		
	}

}
