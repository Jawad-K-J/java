import java.io.*;
import java.util.*;
class recfact
{
static int facto(int n)
{
if(n==1)
return 1;
else
return(n*facto(n-1));
}
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("enter a number : ");
n=s.nextInt();
int fact=1;
fact=facto(n);
System.out.println("Factorial of "+n+" is "+fact);
}
}
