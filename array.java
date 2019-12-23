import java.io.*;
import java.util.*;
public class array
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int a[]=new int[100];
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    sum=sum+a[i];
		}
		double avg=sum/n;
	System.out.println(avg+" "+sum);
		
	}
}
