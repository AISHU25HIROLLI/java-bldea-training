package bldeatrainning;

import java.util.Scanner;

public class Arraycode3 {
	public static int LinearSearch(int arr[],int key)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==key)
			{
				return(i+1);
		}
	}
		
		return 0;
		
		
	}
	public static void main(String[] args) {
		int arr[]= {10,15,20,25,30,35,40,45,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key element to be searched:");
		int key=sc.nextInt();
		int res=LinearSearch(arr,key);
		
		
		
		
	}

}
