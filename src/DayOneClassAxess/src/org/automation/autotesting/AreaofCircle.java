package org.automation.autotesting;

import java.util.Scanner;

public class AreaofCircle {
	
	
	public double calculteArea(double radius) {
		//double calArea= Math.PI*radius*radius;
		double calArea=3.14*radius*radius;
		
		return calArea;
		

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius value");
		double r=scan.nextDouble();
		AreaofCircle ac = new AreaofCircle();
		double area= ac.calculteArea(r);
		System.out.println("Area of circle is:"+area);
		
		
		
	}
}
