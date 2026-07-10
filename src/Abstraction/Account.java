package Abstraction;

public abstract class  Account {
	private String customerName;
	private double balance;
	
	public Account(String customerName, double balance) {
		this.customerName=customerName;
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance +=amount;
		System.out.println("Deposited :"+amount);

	}
	public void withdraw(double amount) {
		if(amount>0 && balance>=amount) {
			balance -=amount;
			System.out.println("Withrawn amount :" +amount);
		}else {
			System.out.println("Error :insufficient balance");
		}

	}
	public abstract void calculateInterest();
	
	}

