package com.java;

import java.util.Scanner;



public class ArrayPrograms {
	
	
	//Array ascending order
//	public static void main(String[] args) {
//		int arr[]=new int[5];
//		//int arr[];
//		int i, j,temp=0;
//		int n;
//		Scanner sc= new Scanner(System.in);
//		int length1=arr.length;
//		System.out.println("length="+length1);
//		System.out.println("Enter the element of array");
//		for(i=0;i<length1;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("Elements of array are");
//		for(i=0;i<length1;i++)
//		{
//			System.out.println("Elements are="+ i +"=="+arr[i]+"");
//		}
//		for(i=0;i<length1;i++)
//		{
//			for(j=i+1;j<length1;j++)
		
//				if(arr[i]>arr[j])
//				{
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			
//			
//		}
//		System.out.println("Ascending order of element is");
//		for(i=0;i<length1;i++)
//		{
//			System.out.println(" "+arr[i]);
//		}
//			
//	}
//	
//}
	
	
//	//Array Descending order
//	
//	
//	public static void main(String[] args) {
//		int i,j,temp=0, Second;
//		int arr[]=new int[7];
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Element of array");
//		for(i=0;i<arr.length;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		for(i=0;i<arr.length;i++)
//		{
//			for(j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]<arr[j])
//				{
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//							
//				}
//			}
//		}
//		System.out.println("Descending order of element");
//		for(i=0;i<arr.length;i++)
//		{
//			System.out.println(+i+"="+arr[i]);
//		}
//		int n=arr.length;
//		//System.out.println("2nd largest number from array is "+arr[1]);
//		int secondSmallest=arr[n-2];
//		System.out.println("2nd smallest number from array"+secondSmallest);
//	}

	
	//Second largest number from array
	
//	public static void main(String[] args) {
//	int arr[]=new int[5];
//	int i,temp=0,j;
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the element of array");
//	for(i=0;i<arr.length;i++)
//	{
//		arr[i]=sc.nextInt();
//	
//	}
//	for(i=0;i<arr.length;i++)
//	{
//		for(j=i+1;j<arr.length;j++)
//		{
//			if(arr[i]>arr[j])
//			{
//				temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//		}
//	}
//	System.out.println("Ascending order of array");
//	for(i=0;i<arr.length;i++)
//	{
//		System.out.println(""+arr[i]);
//	}
//	int l=arr.length;
//	System.out.println("Second largest number from array="+arr[l-2]);
//	
//	//Largest number from array
//	System.out.println("Largest number from array is="+arr[l-1]);
//	
//	
//	
//}
	
	
	
	
	//finding largest number in array
	
//	public static void main(String[] args)
//	{
//		int i,max = 0;
//		int arr[]={10,50,9,46,89};
//		arr[0]= max;
//		for(i=1;i<arr.length;i++)
//		{
//			if(arr[i]>max)
//			{
//				max=arr[i];
//			}
//		}
//		
//		System.out.println("Largest number from array"+max);
//	}
	
	
	//Reverse array
	
//	public static void main(String[] args) {
//		int i;
//		int arr[]={56,78,1,2,3,4,5,6,7};
//		for(i=arr.length-1;i>=0;i--)
//		{
//			System.out.println(""+arr[i]);
//		}
//			
//	}
	
	
	
	

		//Smallest  number from array

//public static void main(String[] args) {
//	int i;
//	int arr[]={45,8,1,3,4};
//	int max=arr[0];
//	
//	for(i=1;i<arr.length;i++)
//	{
//		if(arr[i]<max)
//		{
//			max=arr[i];
//		}
//	}
//	System.out.println("Smallest number from array="+max);
//}

	
	
	
					//Sum of elements
	
	
//	public static void main(String[] args) {
//		int i,sum=0;
//		int arr[]={3,6,8,2,4,5,66,78};
//		for(i=0;i<arr.length;i++)
//		{
//			sum=sum+arr[i];
//		}
//		System.out.println("Sum of elements are="+sum);
//	}

	
	
	
			//Repeated elements from array
	
//	public static void main(String[] args) {
//		int i,j;
//		
//		
//		int arr[]={45,67,8,3,2,33,3,2,1,5,33};
//		
//		for(i=0;i<arr.length;i++)
//		{
//			for(j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					System.out.println("Similar="+arr[i]);
//				}
//			}
//		}
//	}
//	
	
	
			//find number is even or odd from array
	
	
//	public static void main(String[] args) {
//		int i,j;
//		int arr[]={345,789,567,23,24};
//		for(i=0;i<arr.length;i++)
//		{
//			if(arr[i]%2==0)
//			{
//				System.out.println("Number "+arr[i]+" is even");
//			}
//			else
//			{
//				System.out.println("Number "+arr[i]+" is odd");
//			}
//		}
//	}
//	
	
	
	
			//Count No of even or odd from array
	
//	public static void main(String[] args) {
//		int i,j,evencount=0,oddCount=0;
//		int arr[]={876,98,234,12,4,6,55,45,89};
//		for(i=0;i<arr.length;i++)
//		{
//			if(arr[i]%2==0)
//			{
//				evencount++;
//			}
//			else
//			{
//				oddCount++;
//			}
//		}
//		System.out.println("Count of even numbers="+evencount);
//		System.out.println("Count of odd numbers="+oddCount);
//	}
//	
	
	
	
	
//Max number from array
	
//	public static void main(String[] args) {
//		//int arr[]=new int[5];
//		int temp,i;
//		int arr[]={4,6,7,2,1};
//		int max=arr[0];
//		for(i=1;i<arr.length;i++)
//		{
//			if(arr[i]>max)
//			{
//				max=arr[i];
//			}
//		}
//		System.out.println("Laegest number from array is"+max);
//	
//			
//		
//	}
	
	
	//Count number from integer
	
	public static void main(String[] args) {
		int num,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number= ");
		num=sc.nextInt();
		
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Count of digits in integer="+count);
	}
	
	
	
	
}