package bldeatrainning;

import java.util.Scanner;

public class Program14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int count;

		for(int i=1; i<=n; i++)
		{
			count=i;

			for(int j=1; j<=n; j++)
			{
				System.out.print(count+"	" );
				count=count+5;

			}
			System.out.println( );
		}

	}
}

