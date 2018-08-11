
public class CurrentAccount extends Account {
	String tradeLicenseNumber;
	public CurrentAccount(String name,double balance,String aN,String tLC)
	{
		super(name, balance,aN);
		tradeLicenseNumber = tLC;
	}
	
	public double getBalance()
	{
		return accountBalance;
	}
	public void withdraw(double amount)
	{
		if(amount>accountBalance)
		{
			System.out.println("Account doesn't have enough balance!!!");
		}
		else
		{
			accountBalance=accountBalance-amount;
		}
	}

}
