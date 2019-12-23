import java.io.*;
import java.util.*;
public class arrayvalue
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int a[]=new int[100];
		int n=sc.nextInt();
		int min=1000,max=0,j=0,flag=0;
		int value=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    if(a[i]==value)
		    { flag=1;
		        j=i;
		        break;
		    }
		}
		if(flag==0)
		{
		   System.out.println("-1"); 
		}
		else{
		    System.out.println(j);
		}
		
	
		
	}
}
