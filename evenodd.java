import java.io.*;
import java.util.*;
class evenodd
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter a number: ");
n=s.nextInt();
if(n%2==0)
System.out.println("The number "+n+ " is even.");
else
System.out.println("The number "+n+ " is odd.");
}
}
