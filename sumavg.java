import java.io.*;
import java.util.*;
class sumavg
{
public static void main(String args[])
{
int i=0;
int sum=0;
int n=0;
float avg;
Scanner s=new Scanner(System.in);
System.out.print("Enter the limit : ");
n=s.nextInt();
while(i<=n)
{
sum=sum+i;
i++;
}
avg=(float)sum/n;
System.out.println("Sum= "+sum);
System.out.println("n= "+n);
System.out.println("Average= "+avg);
}
}
