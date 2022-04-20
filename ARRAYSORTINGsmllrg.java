import java.io.*;
import java.util.*;
class arrsrtsmllrg
{
public static void main(String args[])
{
int n,i,j,tem=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter the limit of array : ");
n=s.nextInt();
int[] a=new int[n];
System.out.print("Enter the array elements :");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
for(j=0;j<n;j++)
{
if(a[i]<a[j])
{
tem=a[i];
a[i]=a[j];
a[j]=tem;
}
}
int min=a[0];
int max=a[n-1];

System.out.print("sorted array is : ");
for(i=0;i<n;i++)
{
System.out.print(a[i]+"\t");
}
System.out.print("\nlarge= "+max);
System.out.print("\nSmall= "+min+"\n");
}
}
