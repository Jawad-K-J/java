import java.io.*;
import java.util.*;
class armstr
{
public static void main(String args[])
{
int a=0,b,c;
int n;
System.out.println("Enter a number : ");
Scanner s=new Scanner(System.in);
n=s.nextInt();
c=n;
while(n>0)
{
b=n%10;
n=n/10;
a=a+(b*b*b);
}
if(c==a)
System.out.println("The number "+ c +" is armstrong");
else
System.out.println("The number "+ c +" is not an armstrong");
}
}
