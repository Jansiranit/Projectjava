package org.automation.autotesting;

public class ElectricityBill {
	
	long billAmount;
	int unitCharge =5;
	
		public static void electricityBoard() {
		System.out.println("The Electricity Board name is TNEB");
		System.out.println("The Unit Charge : 5");
		System.out.println("=============================");
	}
//non static method 
	public void cusDetails(String cusname,int preReading, int currReading) {
		System.out.println("the customer name is:" +cusname);
        System.out.println("The previous Reading :"  +preReading);
        //System.out.println("Current Reading is:"+currReading);	
		int useUnit = preReading-currReading;
		System.out.println("The used unit is:" +useUnit);
		
       long billAmount = useUnit*unitCharge;
        System.out.println("Bill Amount is:" +billAmount);
        System.out.println("=============================================");
		}
	//
     	public static void main(String[] args) {
		electricityBoard();
		ElectricityBill eb = new ElectricityBill();
		eb.cusDetails("jansi", 250, 200);
		
		eb.cusDetails("jinu", 300, 50);
		
		
}
}