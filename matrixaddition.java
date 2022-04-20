import java.io.*;
import java.util.*;
class matxadd
{
public static void main(String args[])
{
int m1,n1,m2,n2,i,j;
Scanner s=new Scanner(System.in);
System.out.print("Enter the total number columns and row of first matrix : ");
m1=s.nextInt();
n1=s.nextInt();
System.out.print("Enter the total number columns and row of second matrix : ");
m2=s.nextInt();
n2=s.nextInt();
int[][] first=new int[m1][n1];
int[][] second=new int[m2][n2];
int[][] sum=new int[m1][n2];
if(m1==m2&&n1==n2)
{
System.out.println("enter the first matrix :");
for(i=0;i<m1;i++)
for(j=0;j<n1;j++)
{
first[i][j]=s.nextInt();
}
System.out.println("enter the second matrix :");
for(i=0;i<m2;i++)
for(j=0;j<n2;j++)
{
second[i][j]=s.nextInt();
}
for(i=0;i<m1;i++)
for(j=0;j<n2;j++)
{
sum[i][j]=first[i][j]+second[i][j];
}
System.out.println("sum of the matrices: ");
for(i=0;i<m1;i++){
for(j=0;j<n2;j++)
{
System.out.print(sum[i][j]+"\t");
}
System.out.print("\n");
}
}
else
{
System.out.print("its not possible !\n");
}
}
}
