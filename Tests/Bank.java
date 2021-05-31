package LabTest;
import java.util.*;

class MinBalanceException extends Exception
{
	public MinBalanceException()
	{}
	public MinBalanceException(String m)
	{}
}

class Bank
{
	static int accno;
	static float balance;
    static char ch1='y';
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	do
		{
			System.out.println("Bank System 1. Deposit \n 2. Withdraw\n 3. Exit");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();

			switch(ch)
				{
					case 1 :Deposit();break;
					case 2 :Withdraw();break;
	
					default :
						break;

				}

			System.out.println("Press Y if u want to continue.....");
			ch1=sc.next().charAt(0);
		}while(ch!='n');

static void Deposit()
{
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter amount to be credited ");
	float amount = sc.nextFloat();
	balance = balance + amount;
	System.out.println("An amount credited successfully");
	System.out.println("Total amount is Rs " + balance);

}
static void Withdraw() throws MinBalanceException
{
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter amount to be debited");
	float amount=sc.nextFloat();
	if(balance<1000)
	{

			throw new MinBalanceException("Cannot debited");
	}catch(MinBalanceException ex) 
	{
		System.err.println(ex.getMessage());
	}
}

}