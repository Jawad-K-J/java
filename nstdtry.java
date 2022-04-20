import java.io.*;
class nstdtry
{
public static void main(String args[])
{
//Parent try block
try{
//Child try block
try{
System.out.println("Inside block1");
int b =45/0;
System.out.println(b);
}
catch(ArithmeticException e1)
{
System.out.println("Exception: e1");
}
System.out.println("Just other statement");
}
catch(ArithmeticException e2)
{System.out.println("Arithmetic Exception");
System.out.println("Inside parent try catch block");
}
catch(ArrayIndexOutOfBoundsException e3)
{
System.out.println("ArrayIndexOutOfBoundsException");
System.out.println("Inside parent try catch block");
}
catch(Exception e4)
{
System.out.println("Exception");
System.out.println("Inside parent try catch block");
}
System.out.println("Next statement..");
}
}
