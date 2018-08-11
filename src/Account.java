import java.util.Random;


public abstract class Account {
	String memberName;
	String accountNumber;
	double accountBalance;
	public Account(String n,double b,String aN)
	{
		memberName = n;
		accountBalance = b;
		accountNumber = aN;
	}
	public void deposit(double amount){
		accountBalance = accountBalance+amount;
	}
	abstract public double getBalance();
	abstract public void withdraw(double amount);
}

