package bldeatrainning;

import java.util.Scanner;
public class Program5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of age");
		int age=sc.nextInt();
		if(age<18)
		{
			System.out.println("You are still minor");
		}
		else if(age>65)
		{
			System.out.println("You are senior citizen!!");
		}
		else
		{
			System.out.println("Congraluations you are in the list of groom");
		}

	}
}




