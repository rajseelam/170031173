import java.io.*;
import java.util.*;
public class minarray
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int a[]=new int[100];
		int n=sc.nextInt();
		int min=1000,max=0;
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    if(min>a[i])
		    {
		        min=a[i];
		    }
		    if(max<a[i])
		    {
		        max=a[i];
		    }
		}
		
	System.out.println(min+" "+max);
		
	}
}
