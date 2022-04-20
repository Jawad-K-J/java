import java.util.*;
class student{
int total;
String name;
void caltotal(int m1,int m2,int m3)
{
total=m1+m2+m3;}
void put(String name,int rollno)
{
System.out.println("The name of the student is:"+name);
System.out.println("The roll no is:"+rollno);
System.out.println("The totl mark is:"+total);
}
}
class prgrscardinhrtnc extends student{
public static void main(String args[])
{Scanner s =new Scanner(System.in);
int i,m1,m2,m3,n,rollno;
String name;
student ob=new student();
System.out.println("Enter the no of students:");
n=s.nextInt();
for(i=0;i<n;i++)
{System.out.println("Enter the name of the student:");
name=s.next();
System.out.println("Enter the roll no:");
rollno=s.nextInt();
System.out.println("Enter the mark 1:");
m1=s.nextInt();
System.out.println("Enter the mark 2:");
m2=s.nextInt();
System.out.println("Enter the mark 3:");
m3=s.nextInt();
ob.caltotal(m1,m2,m3);
ob.put(name,rollno);
}}}
