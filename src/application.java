import java.util.Scanner;


/*public class application {

	public static void main(String[] args) {
		Account array[] = new Account[10];
		int i;
		int c;
		Scanner in = new Scanner(System.in);
		System.out.println("Press 1 to open Savings Account");
		System.out.println("Press 2 to open Current Account");
		i = in.nextInt();
		int x=1;
		int y=2;
		if(i==x)
		{
			Scanner in1 = new Scanner(System.in);
			System.out.println("Enter Name: ");
			String n1 = in1.nextLine();
			System.out.println("Enter Deposit Amount: ");
			double aB1 = in1.nextDouble();
			System.out.println("Enter Maximum Withdraw Amount: ");
			double mWA1 = in1.nextDouble();
			Account array[i] = new SavingsAccount(n1, aB1, mWA1);
			c=0;
			
			
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
						System.out.println("Balance before deposit: "+acc1.getBalance());
						acc1.deposit(amount);
						System.out.println("Balance after deposit: "+acc1.getBalance());
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
						System.out.println("Balance before deposit: "+acc1.getBalance());
						acc1.withdraw(amount1);
						System.out.println("Balance after deposit: "+acc1.getBalance());
					}
					else
					{
						System.out.println("Choice not found!!");
						continue;
					}
				}
				else if(z==3)
				{
					double gb1=acc1.getBalance();
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
		else if(i==y)
		{
			Scanner in2 = new Scanner(System.in);
			System.out.println("Enter Name: ");
			String n2 = in2.nextLine();
			System.out.println("Enter Deposit Amount: ");
			double aB2 = in2.nextDouble();
			in2.nextLine();
			System.out.println("Enter Trade License Number: ");
			String tLN1 = in2.nextLine();
			CurrentAccount acc2 = new CurrentAccount(n2, aB2, tLN1);
			
			
			while(true){
				Scanner in4 = new Scanner(System.in);
				System.out.println("Press '1' to deposit money!!!");
				System.out.println("Press '2' to withdraw money!!!");
				System.out.println("Press '3' to display balance!!!");
				System.out.println("Press '0' to exit the system!!!");
				int z1 = in4.nextInt();
				if(z1==1)
				{
					System.out.println("Enter amount to deposit: ");
					double amount = in4.nextDouble();
					System.out.println("Press '11' to know the balance!");
					int ch = in4.nextInt();
					if(ch==11)
					{
						System.out.println("Balance before deposit: "+acc2.getBalance());
						acc2.deposit(amount);
						System.out.println("Balance after deposit: "+acc2.getBalance());
					}
					else
					{
						System.out.println("Choice not found!!");
						continue;
					}
				}
				else if(z1==2)
				{
					System.out.println("Enter withdrawal amount: ");
					double amount1 = in4.nextDouble();
					System.out.println("Press '22' to know the balance!");
					int ch1 = in4.nextInt();
					if(ch1==22)
					{
						System.out.println("Balance before deposit: "+acc2.getBalance());
						acc2.withdraw(amount1);
						System.out.println("Balance after deposit: "+acc2.getBalance());
					}
					else
					{
						System.out.println("Choice not found!!");
						continue;
					}
				}
				else if(z1==3)
				{
					double gb2=acc2.getBalance();
					System.out.println("Balance: "+gb2);
				}
				else if(z1==0)
				{
					break;
				}
				else 
				{
					continue;
				}
			}
		}
	}
}
		
		

*/