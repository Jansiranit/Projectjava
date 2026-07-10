package javaprojectone;

public class Citizen {
	String citizenName;
	
	public Citizen (String citizenName) {
		this.citizenName = citizenName;
	}
	public void displayDetails() {
		System.out.println("Citizen Name  : "+citizenName);
	}
}
