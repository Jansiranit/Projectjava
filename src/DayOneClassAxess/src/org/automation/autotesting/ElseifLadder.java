package org.automation.autotesting;

public class ElseifLadder {

	public void checkDiscount(double billAmount) {
		if (billAmount>=5000)
		{
			System.out.println("20% Discount Applied");
		}
		else if (billAmount>=3000) {
			System.out.println("10% Discount Applied");
		}
		else if (billAmount>=1000) {
			System.out.println("5% Discount Applied");
		}
		else {
			System.out.println("No Discount");
		}
		
	}
	public static void main(String[] args) {
		ElseifLadder el = new ElseifLadder();
		el.checkDiscount(3000);
	}
}
