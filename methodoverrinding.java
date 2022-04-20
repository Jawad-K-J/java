import java.lang.*;
import java.util.*;
import java.io.*;
abstract class figure
{
int dim1,dim2;
void getdata()throws IOException
{
Scanner s= new Scanner(System.in);
System.out.println ("Enter Value of 1st Dimension");
dim1=s.nextInt();
System.out.println ("Enter Value of 2nd Dimension");
dim2=s.nextInt();
}
abstract void area();
}
class Rectangle extends figure
{
void getdata() throws IOException
{
super.getdata();
}void area()
{
int a=dim1*dim2;
System.out.println ("Area of Rectangle = "+a);
}
}
class Triangle extends figure
{
void getdata() throws IOException
{
super.getdata();
}
void area()
{
double b=(1*dim1*dim2)/2;
System.out.println ("Area of Triangle = "+b);
}
}
class methodoverrinding
{
public static void main(String args[]) throws IOException
{
Rectangle R = new Rectangle();
R.getdata();
R.area();
Triangle T = new Triangle();
T.getdata();
T.area();
}
}
