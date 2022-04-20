import java.io.*;
import java.lang.*;
class stringfct2
{
public static void main(String args[])
{
String s1=" ALL OF YOU ARE WELCOME";
int n=s1.indexOf('L');
System.out.println("\n a)indexOf() \nb) lastindexOf()\n c) length()\nd) capacity()");


System.out.println("\n Index of L in the string is: "+(n+1));
int m=s1.lastIndexOf('E');
System.out.println("\n Last Index of E in the string is: "+(m+1));
System.out.println("\n Length of "+s1+" is : "+s1.length());
StringBuffer s=new StringBuffer(10);
System.out.println("\n Amount of storage available is: "+s.capacity());
}
}
