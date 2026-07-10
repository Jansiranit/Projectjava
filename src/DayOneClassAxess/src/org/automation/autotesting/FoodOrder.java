package org.automation.autotesting;

public class FoodOrder {
	//static methods
	String customername;
	String fooditem;
	public static void restaurant() {
		System.out.println("The restaurant name is Food Corner");
        System.out.println("Delivery Charhge is 40 Rupees");
        System.out.println("====================================");
        	}
	
	//non static method
	public void customerDetails(String cusname,String fooditem) {
		System.out.println("The cutomer name is:" +cusname);
        System.out.println("Food Item is:" +fooditem);
        System.out.println("===================================");
        
        
	}
	public static void main(String[] args) {
		//static method
		restaurant();
		//non static method
		FoodOrder fd = new FoodOrder();
		fd.customerDetails("jansi", "pizza");
		restaurant();
		fd.customerDetails("jinu", "Idly");
		
	}
	

}
