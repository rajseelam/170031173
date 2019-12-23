import java.io.*;
import java.util.*;
class Box
{ 
    double width;
    double height;
    double depth;
    double volumere(double width,double height,double depth)
{
    this. width=width;
     this. height=height;
     this. depth=depth;
    double volume=width*height*depth;
    return volume;
}
}
 public class Main
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         double w=sc.nextDouble();
          double h=sc.nextDouble();
           double d=sc.nextDouble();
           Box b=new Box();
          double vol= b.volumere(w,h,d);
          System.out.println(vol);
         
     }
 }
