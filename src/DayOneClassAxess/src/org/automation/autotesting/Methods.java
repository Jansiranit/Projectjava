package org.automation.autotesting;

public class Methods {
	
	// why add static in front of variable declaration - doubt
   String employeename;
   String desgination;
   int salary;
   //Static method
   public static void companyPolicy() {
        System.out.println("company timing : 9AM TO 6PM");
        
}
   //non- static method
   public void employeeDedails() {
	System.out.println("The emp name is:" +employeename);
System.out.println("The emp salary is:" +salary);
System.out.println("The emp desgination is:" +desgination);

}
   public static void main(String[] args) {
	   //call static method
	companyPolicy();
	//call non static method
	
	Methods m = new Methods();
	m.employeename = "jansi";
	m.salary = 800000;
	m.desgination = "QA TEASTER";
	m.employeeDedails();
	System.out.println("===================================");
	System.out.println("                                        ");
	
	m.employeename = "jinu";
	m.salary = 80000;
	m.desgination = "sinior engineer";
	m.employeeDedails();
	System.out.println("===================================");
	System.out.println("                                        ");
	
	
	
}
}
