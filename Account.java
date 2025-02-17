
public class Account 
{
	private double balance;
	private double rate;
	
	public Account()
	{
		balance = 100.00;
		rate = 0.03;
	}
	
	public void displayBalance()
	{
		String output = "The balance is %.2f";
		output = String.format(output, balance);
		System.out.println(output);
	}
	
	//ToDo Display Rate
	public void displayRate()
	{
		string output = "The interest rate is %.2f%%;
		output = String.format(ourput, rate * 100);
		System.out.println(output);
	}
	
	//ToDo Deposit Money
	public boolean deposit(double amount)
	{
		if (amount > 0)
		{
			balance += amount;
			return true;
		}
		return false;
	}
	
	//ToDo Withdraw Money
	public boolean withdraw(double amount)
	{
		if (amount > 0 && amounr <= balance)
		{
			balance -= amount;
			return true;
		}
		return false;
	}
	
	//ToDo Project Interest
	public boolean accrueInterest(int months)
	{
		if (months > 0)
		{
			for (int i = 0; i < months; i++)
				{
					balance += (balance * rate)/12;
				}
			return true;
		}
		return false;
	}
}
