import java.io.*;
import java.util.*;
class muitip
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number for multiplication table : ");
int n=s.nextInt();
int i;
System.out.println("Multiplication table of "+n);
for(i=1;i<=10;i++)
{
System.out.println(n+" * "+i+" = "+(n*i));
}
}
}
