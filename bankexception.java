import java.io.*;
import java.util.*;
class bankexception
{
public static void main(String args[])
{
int acno,balance;
String name,actype;
int custid,n,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of customers: ");
n=s.nextInt();
for(i=1;i<=n;i++)
{
System.out.println("Enter the customer id: ");
custid=s.nextInt();
System.out.println("Enter the customer name: ");
name=s.next();System.out.println("Enter the customer account number: ");
acno=s.nextInt();
System.out.println("Enter the balance: ");
balance=s.nextInt();
System.out.println("Enter the account type: ");
actype=s.next();
try
{
if(balance<2000)
{
throw new ArithmeticException();
}
}
catch(ArithmeticException e)
{
System.out.println("The customer has to maintain minimum balance: ");
}
System.out.println("The customer details.... ");
System.out.println(" Customer id: "+custid);
System.out.println(" Customer name: "+name);
System.out.println(" Account number: "+acno);
System.out.println(" Balance: "+balance);
System.out.println("AccountType: "+actype);
}
}
}
