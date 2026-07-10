package Abstraction;

public class CurrentAccount extends Account {

	public CurrentAccount(String name, double balance) {
		super(name, balance);
		
	}

	@Override
	public void calculateInterest() {
		System.out.println("Current account has0% interest");
		
	}
	
	

}
