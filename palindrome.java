import java.io.*;
import java.util.*;
class palin
{
public static void main(String args[])
{
int r,sum=0,t;
int n;
Scanner s=new Scanner(System.in);
System.out.print("enter number : ");
n=s.nextInt(); t=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(t==sum)
System.out.println(t+" is a palindrome number ");
else
System.out.println(t+" is not a palindrome");
}
}
