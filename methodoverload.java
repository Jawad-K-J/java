import java.io.*;
import java.util.*;
class Shape
{
void area(int a)
{
System.out.println("The area of the square is "+a*a+" sq.units");
}
void area(int l,int b)
{
System.out.println("the area of the rectangle is "+l*b+" sq units");
}
void area(float ba,float h)
{
System.out.println("the area of the triangle is "+0.5*ba*h+" sq units");
}
}
class methodoverload
{
public static void main(String args[])
{
Shape s=new Shape();
Scanner c=new Scanner(System.in);
System.out.println("Enter the base and height of triangle: ");
float ba=c.nextFloat();
float h=c.nextFloat();
s.area(ba,h);
System.out.println("Enter the length and breadth of rectangle: ");
int l=c.nextInt();
int b=c.nextInt();
s.area(l,b);
System.out.println("Enter the side of square: ");
int a=c.nextInt();
s.area(a);
}
}
