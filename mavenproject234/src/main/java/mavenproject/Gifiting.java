package mavenproject;

import java.util.Scanner;
import java.io.*;
import java.util.*;


public class Gifiting {
	
	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Sweets:");
		int nu_s=sc.nextInt();
		System.out.println("Enter the Number of Chocolates:");
		int nu_c=sc.nextInt();
		int s_weight[]=new int[nu_s];
		int c_weight[]=new int[nu_c];
		int s_cost[]=new int[nu_s];
		int c_cost[]=new int[nu_c];
		for(int i=0;i<nu_s;i++)
		{
			System.out.println("Enter the Weight of Sweets"+(i+1)+"is in grams:");
			s_weight[i]=sc.nextInt();
			System.out.println("Enter the Cost of Sweets"+(i+1)+"is in Rs:");
			s_cost[i]=sc.nextInt();	
		}
		System.out.println("Enter the range you find no of Sweets");
		System.out.println("Enter the lower range");
		int lowerrange=sc.nextInt();
		int higerrange=sc.nextInt();
		sweets s=new sweets(nu_s,s_weight);
		sweets s1=new sweets(lowerrange,higerrange,s_weight,nu_s);
		for(int i=0;i<nu_c;i++)
		{
			System.out.println("Enter the Weight of Candies"+(i+1)+"is:");
			c_weight[i]=sc.nextInt();
			System.out.println("Enter the Cost of Candies"+(i+1)+"is");
			c_cost[i]=sc.nextInt();
			
		}
		int total_cost[]=new int[nu_s];
		for(int i=0;i<nu_s;i++)
		{
			total_cost[i]=s_weight[i]*s_cost[i];
		}
		sweets s3=new sweets(0,nu_s,total_cost);
		
		Chocolates c1=new Chocolates();
		System.out.println("the total weight of sweets is:"+s.getStuID());
		System.out.println("The total count in the range between  sweets is:"+s1.getStuID1());
		System.out.println("Enter the range you find no of Chocolates:");
		System.out.println("Enter the lower range");
		int lowerrangec=sc.nextInt();
		int higerrangec=sc.nextInt();
		int cal_totalW =c1.cal_total_weight(nu_c,c_weight);
		int Sort_clist=c1.sort_list(nu_c,c_weight);
		int ran=c1.range(lowerrangec, higerrangec,nu_c,c_weight);
		System.out.println("The no of chocolates in between  range is:"+ran);
	
		int total_costcal[]=new int[nu_c];
		
		for(int i=0;i<nu_c;i++)
		{
			total_costcal[i]=c_weight[i]*c_cost[i];
		}
	
		
		
	}

}
