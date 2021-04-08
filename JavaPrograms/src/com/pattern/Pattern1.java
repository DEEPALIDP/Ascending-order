package com.pattern;

import java.util.Scanner;

//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5 
		


public class Pattern1 {
//	public static void main(String[] args) {
//		int i, j, rows;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number of rows");
//		rows=sc.nextInt();
//		for(i=1;i<=rows;i++)
//		{
//			for(j=1;j<=i;j++)
//			{
//				System.out.print(" "+j);
//			}
//				System.out.println(" ");
//		}
//		
//	}


//	12345 
//	1234 
//	123 
//	12 
//	1 


//	public static void main(String[] args)
//	{
//		int i, j, rows;
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the number of rows");
//		rows=sc.nextInt();
//		for(i=rows;i>=1;i--)
//		{
//			for(j=1;j<=i;j++)
//			{
//				System.out.print(" "+j);
//			}
//			System.out.println(" ");
//		}
//			
//	1
//	2 2
//	3 3 3
//	4 4 4 4
//	5 5 5 5 5
	
//	public static void main(String[] args) {
//		int i,j,rows;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number of rows");
//		rows=sc.nextInt();
//		for(i=1;i<=rows;i++)
//			{
//				for(j=1;j<=i;j++)
//				{
//					System.out.print(" "+i);
//				}
//				System.out.println(" ");
//			}
//	}
	
//	}
	
//			1
//			1 2
//			1 2 3 
//			1 2 3 4 
//			1 2 3 4 5 
//			1 2 3 4 
//			1 2 3
//			1 2
//			1
	
	public static void main(String[] args) {
		int i,j,rows;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of rows");
		rows=sc.nextInt();
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println("");
		}
		for(i=rows-1;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println("");
		}
	
	}
	
	
}







