import java.io.*;
import java.util.*;
class employee
{
String name;
int age;
double basic,HRA,TA,DA;
employee()
{
this.name=name;
this.age=age;
this.HRA=HRA;
this.TA=TA;
this.DA=DA;
this.basic=basic;
}
void display(String name,int age,double HRA,double TA,double DA,
double basic)
{
System.out.println("NAME:"+name);
System.out.println("AGE:"+age);
System.out.println("BASIC PAY:"+basic);System.out.println("HRA:"+HRA);
System.out.println("TA:"+TA);
System.out.println("DA:"+DA);
double total=basic+(HRA+TA+DA);
System.out.println("SALARY="+total);
}
}
class constrctrfunctn
{
public static void main(String args[])throws IOException
{
employee e1=new employee();
employee e2=new employee();
employee e3=new employee();
Scanner c=new Scanner(System.in);
System.out.println("EMPLOYEE 1");
System.out.println("Enter employee name");
String name1 = c.next();
System.out.println("Enter employee age");
int age1= c.nextInt();
System.out.println("Enter Basic pay");
double basic1= c.nextDouble();
System.out.println("Enter HRA");
double HRA1= c.nextDouble();
System.out.println("Enter TA");
double TA1= c.nextDouble();
System.out.println("Enter DA");
double DA1= c.nextDouble();
e1.display(name1,age1,HRA1,TA1,DA1,basic1);
System.out.println("EMPLOYEE 2");
System.out.println("Enter employee name");
String name2 = c.next();
System.out.println("Enter employee age");int age2= c.nextInt();
System.out.println("Enter Basic pay");
double basic2= c.nextDouble();
System.out.println("Enter HRA");
double HRA2= c.nextDouble();
System.out.println("Enter TA");
double TA2= c.nextDouble();
System.out.println("Enter DA");
double DA2= c.nextDouble();
e2.display(name2,age2,HRA2,TA2,DA2,basic2);
System.out.println("EMPLOYEE 3");
System.out.println("Enter employee name");
String name3 = c.next();
System.out.println("Enter employee age");
int age3= c.nextInt();
System.out.println("Enter Basic pay");
double basic3= c.nextDouble();
System.out.println("Enter HRA");
double HRA3= c.nextDouble();
System.out.println("Enter TA");
double TA3= c.nextDouble();
System.out.println("Enter DA");
double DA3= c.nextDouble();
e3.display(name3,age3,HRA3,TA3,DA3,basic3);
}
}
