package Abstraction;

public class SavingsAccount extends Account{

	public SavingsAccount(String name, double balance) {
		super(name, balance);
		
	}

	@Override
	public void calculateInterest() {
		double interest = getBalance()*0.05;
		setBalance(getBalance()+interest);
		System.out.println("5% interest of :" + interest +"added to saving");
		
	}

}
