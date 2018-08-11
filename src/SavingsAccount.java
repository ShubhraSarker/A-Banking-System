public class SavingsAccount extends Account {
	double interestrate = 5;
	double minBalance = 500;
	double maxWithLimit;
	public SavingsAccount(String name,double balance,String aN,double withdraw)
	{
		super(name, balance,aN);
		maxWithLimit = withdraw;
	}
	public double getBalance(){
		double total = accountBalance + accountBalance*(interestrate/100);
		return total;
	}
	public void withdraw(double amount)
	{
		if(amount>maxWithLimit)
		{
			System.out.println("Withdraw limit exceeded!!!");
		}
		else if((accountBalance-amount) < minBalance)
		{
			System.out.println("Not enough balance!!!");
		}
		else
		{
			accountBalance = accountBalance-amount;
		}
	}
}
