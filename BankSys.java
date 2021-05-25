/*1)WAP to demonstrate (2.45pm to 3.30)
a)class, object
b)array of object
c)different method
d)constructor
e)constructor /method overloading
f)static variable, method*/

import java.util.*;
class Bank
{
String name;
float balance;
String address;

Scanner sc = new Scanner(System.in);
Bank(String name,float bal,String add)
{
this.name = name;
this.balance = bal;
this.address = add;
}
}

class Operations 
{

void deposit()
{
System.out.println("Enter the amount you want to credit");
float amt = sc.nextFloat();
balance = balance+amt;
System.out.println("Total amount is "+ balance);
}

void withdraw()
{
System.out.println("Enter the amount you want to debit");
float amt = sc.nextFloat();
if(amt<balance)
{balance = balance+amt;
System.out.println("Total amount is "+ balance);
}
else
System.out.println("sorry..you dont have enough balance");
}
/*void checkbalance()
{
 System.out.println("Your balance is Rs. ",+ balance);
}*/

}

public class BankSys
{
public static void main(String args[])
{
Bank obj= new Bank();
Operations obj1=new Operation();
System.out.println("How many no of customer u want to add");
int no = sc.nextInt();
boolean bool = true;
Bank customer[] = new Bank[no];
for(int i=0;i<no;i++)
customer[i] = new Bank(name.next(),balance,address);

do
{
System.out.println("---------- Bank System -------------");
System.out.println("\n2. Deposit \n3. Withdrawl\n4. Check balance \n5. Exit");
System.out.println("Enter your choice");
int choice = sc.nextInt();
switch(choice)
{
case 2: obj1.deposit();
        break;
case 3: obj1.withdraw();
        break;
case 4: obj1.checkBalance();
        break;
default:bool=false; 
	break;
    
}
}while(bool!=false);

}
}