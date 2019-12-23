import java.io.*;
import java.util.*;
class Calculator
{
    static int powerInt(int a,int b)
    {
      int c=a^b;
      return c;
    }
    static double powerDouble(double num1,double num2)
    {
        double c=Math.pow(num1,num2);
        return c;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int n=Calculator.powerInt(12,2);
        double m=Calculator.powerDouble(12.00,2.00);
        System.out.println(n+" "+m);
    }
}