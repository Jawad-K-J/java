import java.io.*;
import java.util.*;
class factfib
{
public static void main(String args[])
{
int ch=0;
Scanner s=new Scanner(System.in);
do
{
System.out.println("Enter the choice");
System.out.println("1.Factorial of a number\n2.Fibonacci series\n3.Exit");
ch=s.nextInt();
switch(ch)
{
case 1: int n;
System.out.println("Enter the number: ");
n=s.nextInt();
fact(n);
break;
case 2: int l;
System.out.println("Enter the limit: ");
l=s.nextInt();
fibonacci(l);
break;
case 3:System.exit(0);
default: System.out.println("Invalid entry");
}
}while(ch!=3);
}
public static void fact(int n)
{
int i,fact=1;
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("Factorial of "+n+" is "+fact);
}
public static void fibonacci(int l)
{
int p=0,q=0,r=1;
System.out.println(p);
for(int j=1;j<=l;j++)
{
p=q;
q=r;
r=p+q;
System.out.println(" "+q);
}
}
}

