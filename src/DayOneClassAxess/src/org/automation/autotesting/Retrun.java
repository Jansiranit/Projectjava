package org.automation.autotesting;

public class Retrun {
	
	public String name(String firstName, String lastName) {
		return firstName+lastName;
		
		
	}
public static void main(String[] args) {
	Retrun r = new Retrun();

System.out.println("The name is:"+r.name("Jansi", "rani"));
}
}
