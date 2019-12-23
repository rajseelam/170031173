import java.io.*;
import java.util.*;
class patient
{
    double BMI(String name,double height,double weight)
    {
      return (weight/(height*height))*703;  
    }
}
public class Hospital
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        patient p=new patient();
        double d=p.BMI("Raj",10,20);
        System.out.println(d);
    }
}