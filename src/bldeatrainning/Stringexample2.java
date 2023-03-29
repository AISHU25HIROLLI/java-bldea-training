package bldeatrainning;

import java.io.IOException;

import java.util.Scanner;
public class Stringexample2 {

	public static void main(String[] args)throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1=sc.nextLine();
	
		char []c=new char[str1.length()];
		for(int i=0; i<str1.length(); i++)
		{
			if(c[i]=='a'|| c[i]=='e'|| c[i]=='i'|| c[i]=='o'||
					c[i]=='u')
			{
				str1.replace(c[i],'?');
			}
		
		}
		System.out.println(str1);
		

	}
}

