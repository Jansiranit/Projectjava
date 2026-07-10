package javaprojectone;

public  class PassportService extends Citizen implements Service {
	public PassportService(String citizenName) {
		super(citizenName);
	}

	// sub class
	@Override
	public void applyService() {
		displayDetails();
		System.out.println("Selected Service : Passport Service");
		System.out.println("Create PassportService object");

	}
}
