import java.io.*;
import java.util.*;
class swprvs
{
public static void main(String args[])
{
int n=0;
Scanner s=new Scanner(System.in);
do{
System.out.println("Enter the choice");
System.out.println("1.Reverse of a number\n2.Swapping two numbers \n3.Exit");
System.out.println("Enter your choice");
n=s.nextInt();
switch(n)
{
case 1: int a;
System.out.println("Enter the number: ");
a=s.nextInt();
revdigit(a);break;
case 2: int b,c;
System.out.println("Enter the first number: ");
b=s.nextInt();
System.out.println("Enter the second number: ");
c=s.nextInt();
System.out.println("The numbers before swapping is : "+b+" and "+c);
swapf(b,c); break;
case 3: System.exit(0);
default: System.out.println("Invalid entry");
}
}while(n!=3);
}
public static void revdigit(int a)
{
int r=0;
while(a>0)
{
r=r*10;
r=r+a%10;
a=a/10;
}System.out.println("Reverse of the number "+r);
}
public static void swapf(int b,int c)
{
int t=0; t=b; b=c; c=t;
System.out.println("The numbers after swapping is: "+b+" and "+c);
}
}
