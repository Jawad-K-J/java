import java.io.*;
import java.util.*;
public class areaperm
{
public static void main(String args[])
{int n=0;
Scanner s=new Scanner(System.in);
do {System.out.println("Enter your choice");
System.out.println("1.Area and perimeter of Rectangle.");
System.out.println("2.Area and perimeter of Square. ");
System.out.println("3.Area and circumference of Circle.");
System.out.println("4.EXIT");
n=s.nextInt();
switch(n)
{
case 1: double l,w;
System.out.println("Enter length of rectangle: ");
l =s.nextDouble();
System.out.println("Enter width of rectangle: ");
w =s.nextDouble();
rectarea(l,w);
break;
case 2: double a;
System.out.println("Enter the side of the square ");
a =s.nextDouble();
squarearea(a);
break;
case 3: double r;
System.out.println("Enter the radius of Circle: ");
r =s.nextDouble();
circlearea(r);
break;
case 4: System.exit(0);
default: System.out.println("Invalid entry");
}
}while(n!=4);}
public static void rectarea(double l,double w)
{
double perimeter,area;
perimeter = 2 * (l + w);
area = l * w;
System.out.println("Perimeter of rectangle is " + perimeter + " units.");
System.out.println("Area of rectangle is " + area + " sq. units.");
}
public static void squarearea(double a)
{
double perimeter,area;
perimeter =4*a ;
area = a*a;
System.out.println("Perimeter of square is " + perimeter + " units.");
System.out.println("Area of square is " + area + " sq. units.");
}public static void circlearea(double r)
{
double perimeter,area;
perimeter =2 * 3.14 * r ;
area =3.14 * r * r;
System.out.println("Perimeter of circle is " + perimeter + " units.");
System.out.println("Area of circle is " + area + " sq. units.");
}
}
