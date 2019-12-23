import java.io.*;
import java.util.*;
class patient
{ int c;
double d;
    patient(int a,int b)
    {
         c=a+b;
    }
    patient(double a1,double b1)
    {
         d=a1+b1; 
    }
}
public class Main1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        patient p=new patient(1,2);
        patient p1=new patient(1.00,2.00);
        
        System.out.println(p.c+" "+p1.d);
    }
}