import java.io.*;
import java.util.*;
class sumsqr
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the limit: ");
n=s.nextInt();
sumsquare(n);
}
static void sumsquare(int a)
{
int sum = 0;
for (int i = 1; i <= a; i++)
sum=sum+(i*i);
System.out.println("Sum of Squares of "+a+" natural numbers is: "+sum);
}
}
