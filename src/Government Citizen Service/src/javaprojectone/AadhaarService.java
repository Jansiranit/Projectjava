package javaprojectone;

public  class AadhaarService extends Citizen implements Service {

	public AadhaarService(String citizenName) {
		super(citizenName);
			}

	//sub class
	@Override
	public void applyService() {
		displayDetails();
		System.out.println("Selected Service : Aadhar service");
		System.out.println("Create AadhaarService object");
		
	}
}
