import java.awt.Menu;
import java.util.Scanner;

public class Bank {
	public static void Menu(Account[] acc, int i)
	{
		while(true){
			Scanner in3 = new Scanner(System.in);
			System.out.println("Press '1' to deposit money!!!");
			System.out.println("Press '2' to withdraw money!!!");
			System.out.println("Press '3' to display balance!!!");
			System.out.println("Press '0' to exit the system!!!");
			int z = in3.nextInt();
			if(z==1)
			{
				System.out.println("Enter amount to deposit: ");
				double amount = in3.nextDouble();
				System.out.println("Press '11' to know the balance!");
				int ch = in3.nextInt();
				if(ch==11)
				{
					System.out.println("Balance before deposit: "+(acc[i]).getBalance());
					acc[i].deposit(amount);
					System.out.println("Balance after deposit: "+(acc[i]).getBalance());
				}
				else
				{
					System.out.println("Choice not found!!");
					continue;
				}
			}
			else if(z==2)
			{
				System.out.println("Enter withdrawal amount: ");
				double amount1 = in3.nextDouble();
				System.out.println("Press '22' to know the balance!");
				int ch1 = in3.nextInt();
				if(ch1==22)
				{
					System.out.println("Balance before deposit: "+acc[i].getBalance());
					acc[i].withdraw(amount1);
					System.out.println("Balance after deposit: "+acc[i].getBalance());
				}
				else
				{
					System.out.println("Choice not found!!");
					continue;
				}
			}
			else if(z==3)
			{
				double gb1=acc[i].getBalance();
				System.out.println("Balance: "+gb1);
			}
			else if(z==0)
			{
				break;
			}
			else {
				continue;
			}
			
		}
	}
	
	public static void main(String [] args)
	{
		Account accArray[] = new Account [10];
		int accTypeChoice;
		int noOfAcc=0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Press 1 to open Savings Account");
		System.out.println("Press 2 to open Current Account");
		accTypeChoice = in.nextInt();
		in.nextLine();
		
		if(accTypeChoice==1)
		{
			System.out.println("Enter Name: ");
			String name = in.nextLine();
			System.out.println("Enter Account Number: ");
			String accNum = in.nextLine();
			System.out.println("Enter Deposit Amount: ");
			double accBal = in.nextDouble();
			System.out.println("Enter Maximum Withdraw Amount: ");
			double maxWithAmount = in.nextDouble();
			accArray[noOfAcc++] = new SavingsAccount(name, accBal,accNum, maxWithAmount);
			Menu(accArray, noOfAcc-1);
		}
		else if(accTypeChoice==2)
		{
			System.out.println("Enter Name: ");
			String n2 = in.nextLine();
			System.out.println("Enter Account Number: ");
			String accNum = in.nextLine();
			System.out.println("Enter Deposit Amount: ");
			double aB2 = in.nextDouble();
			in.nextLine();
			System.out.println("Enter Trade License Number: ");
			String tLN1 = in.nextLine();
			accArray[noOfAcc++] = new CurrentAccount(n2, aB2,accNum, tLN1);
			Menu(accArray, noOfAcc-1);
		}
		
	}

}
