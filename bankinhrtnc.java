import java.io.*;
import java.util.*;
class bank
{
private int customer_id;
private String customer_name;
private int customer_age;
public void abank(int cust_id,String cust_name,int cust_age)
{
customer_id=cust_id;
customer_name=cust_name;
customer_age=cust_age;
}
void display()
{
System.out.println("Customer Id: "+customer_id);
System.out.println("Customer Name: "+customer_name);
System.out.println("Customer Age: "+customer_age);}
}
class account extends bank
{
private int account_number;
private int balance_amount;
private String account_type;
account(int acno,int balamt,String actype)
{
account_number=acno;
balance_amount=balamt;
account_type=actype;
}
void accnt_details()
{
System.out.println("Account No.: "+account_number);
System.out.println("Balance Amount: "+balance_amount);
System.out.println("Account Type: "+account_type);
}
}
class bankinhrtnc
{
public static void main(String args[]) throws IOException
{
Scanner s=new Scanner(System.in);
System.out.println("Enter account no.: ");
int acno=s.nextInt();System.out.println("Enter balance amount: ");
int balamt=s.nextInt();
System.out.println("Enter account type: ");
String actype=s.next();
System.out.println("Enter Customer Id: ");
int cust_id=s.nextInt();
System.out.println("Enter Customer Name: ");
String cust_name=s.next();
System.out.println("Enter Customer Age: ");
int cust_age=s.nextInt();
account a=new account(acno,balamt,actype);
a.accnt_details();
a.abank(cust_id,cust_name,cust_age);
a.display();
}
}
