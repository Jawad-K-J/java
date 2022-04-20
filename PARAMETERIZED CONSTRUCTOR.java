import java.io.*;
import java.util.*;
class Box
{
private double width;
private double depth;
private double height;
Box( double w, double d, double h)
{width=w;
depth=d;
height=h;
}double volume(){
return width*depth*height;}
}class constrctr
{public static void main(String[] args)
{
double w,d,h;
Scanner s=new Scanner(System.in);System.out.println("Enter the width: ");
w=s.nextDouble();
System.out.println("Enter the depth: ");
d=s.nextDouble();
System.out.println("Enter the height: ");
h=s.nextDouble();
Box b1=new Box(w,d,h);
double v1=b1.volume();
System.out.println("The volume of the box is: "+v1);
System.out.println("Enter the width: ");
w=s.nextDouble();
System.out.println("Enter the depth: ");
d=s.nextDouble();
System.out.println("Enter the height: ");
h=s.nextDouble();
Box b2=new Box(w,d,h);
double v2=b2.volume();
System.out.println("The volume of the box is: "+v2);
}
}
