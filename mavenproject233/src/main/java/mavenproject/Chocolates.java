package mavenproject;

import java.util.Arrays;
import java.util.*;

public class Chocolates extends Abstruct_Class{
		
		public int cal_total_weight(int n,int a[])
		{int total=0;
		for(int i=0;i<n;i++)
		{
			total=total+a[i];
		}
		return total;
		}
		public int sort_list(int n,int a[])
		{
			Arrays.sort(a);
			System.out.println("Sort total cost of each chocolates is:");
			for(int i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
			return 0;
			
		}
		public int  range(int l,int h,int n,int a[])
		{
			int count=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]>=l&&a[i]<=h)
				{
					count++;
				}
			}
			return count;
		}
	}


