import java.io.*;
import java.util.*;
class lcmhcf
{
public static void main(String args[])
{
int a, b, x, y, t, hcf, lcm;
Scanner s=new Scanner(System.in);
System.out.print("Enter two numbers : ");
x=s.nextInt();
y=s.nextInt();
a = x;
b = y;
while(b != 0)
{
t = b;
b = a%b;
a = t;
}
hcf = a;
lcm = (x*y)/hcf;
System.out.println("HCF = " +hcf);
System.out.println("LCM = " +lcm);
}
}
