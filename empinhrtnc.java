import java.util.*;
import java.io.*;
class Employee
{
String name;
String address;
int age;
char gender;
public void display(String name,String address,int age,String gender)
{
System.out.println("Name : "+name);
System.out.println("Address : "+address);
System.out.println("Age : "+age);
System.out.println("Gender : "+gender);
}
}class FulltimeEmployee extends Employee
{
String des;
int salary;
Scanner sf=new Scanner(System.in);
public void read()
{
System.out.println("Enter the designation of the employee : ");
des=sf.next();
System.out.println("Enter the salary of the employee : ");
salary=sf.nextInt();
}
public void fdisplay()
{
System.out.println("Designation : "+des);
System.out.println("Salary : "+salary);
}
}
class ParttimeEmployee extends Employee
{
int workinghrs;
int rate;
int sal;
Scanner sp=new Scanner(System.in);
public void reads()
{
System.out.println("Enter the working hour of the employee : ");workinghrs=sp.nextInt();
System.out.println("Enter the rate per hour : ");
rate=sp.nextInt();
}
public void calculate()
{
sal= rate * workinghrs;
}
public void pdisplay()
{
System.out.println("Salary : "+sal);
}
}
class empinhrtnc
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("\n"+"Enter Full Time Employee Details"+"\n");
System.out.println("Enter the name of the employee : ");
String name=s.next();
System.out.println("Enter the address of the employee : ");
String address=s.next();
System.out.println("Enter the age of the employee : ");
int age=s.nextInt();
System.out.println("Enter the gender of the employee : ");
String gender=s.next();FulltimeEmployee f=new FulltimeEmployee();
f.read();
f.display(name,address,age,gender);
f.fdisplay();System.out.println("\n"+"Enter Part Time Employee Details"
+"\n");
System.out.println("Enter the name of the employee : ");
String name1=s.next();
System.out.println("Enter the address of the employee : ");
String address1=s.next();
System.out.println("Enter the age of the employee : ");
int age1=s.nextInt();
System.out.println("Enter the gender of the employee : ");
String gender1=s.next();
ParttimeEmployee p=new ParttimeEmployee();
p.reads();
p.display(name1,address1,age1,gender1);
p.calculate();
p.pdisplay();
}
}
