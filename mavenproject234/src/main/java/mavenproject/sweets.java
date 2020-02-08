package mavenproject;

import java.util.Arrays;
import java.util.*;
import java.io.*;

public class sweets {
	 private int total;
	 private int count;
	sweets(int n,int a[])
	{
		for(int i=0;i<n;i++)
		{
		total=total+a[i];	
		}
	}
	sweets(int l,int  h,int a[],int n)
	{
		
		for(int i=0;i<n;i++)
		{
			if(a[i]>=l&&a[i]<=h)
			{
				count++;
			}
		}
	}
	sweets(int l,int n,int a[])
	{
		Arrays.sort(a);
		System.out.println("Sort Sweets based on the totalcost:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	 public int getStuID() {
	       return total;
	   }
	   public void setStuID(int total) {
	       this.total = total;
	   }
	   public int getStuID1() {
	       return count;
	   }
	   public void setStuID1(int count) {
	       this.count = count;
	   } 

}
