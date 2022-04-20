import java.io.*;
import java.util.*;
class sumdig
{
public static void main(String args[])
{
int rem;
int sum=0;
int n=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter the number : ");
n=s.nextInt();
while(n!=0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println("Sum of digits = "+sum);
}
}
