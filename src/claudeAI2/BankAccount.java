package claudeAI2;

public class BankAccount {


	//attributes
	private int accountNumber;
	private String owner;
	private double balance;

	//constructors
	public BankAccount() {
	this.accountNumber =0;
	this.owner = "Unknown";
	this.balance = 0.00;}


	public BankAccount(int accountNumber, String owner) {
	this.accountNumber = accountNumber;
	this.owner = owner;
	this.balance = 0.00;
	}

	public BankAccount(int accountNumber, String owner, double balance) {
	this.accountNumber = accountNumber;
	this.owner = owner;
	this.balance = balance;
	}


	@Override
	public String toString()
	{
		return "BankAccount {accountNumber=" + accountNumber + ", owner=" + owner + ", balance=" + balance + "}";
	}
}

