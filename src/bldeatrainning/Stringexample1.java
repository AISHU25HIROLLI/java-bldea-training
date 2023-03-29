package bldeatrainning;
import java.util.Scanner;

public class Stringexample1 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1=sc.nextLine();
		
		int count=1;
		for(int i=0; i<str1.length()-1; i++) {
		if((str1.charAt(i)==' ')&&(str1.charAt(i+1)!=' '))
		{
		
          count++;
	}
		else
		{
			
		}
		}
System.out.println("the total number of words is"+count);

}
}
