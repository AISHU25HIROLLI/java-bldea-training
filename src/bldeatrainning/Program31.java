package bldeatrainning;

import java.util.Scanner;
public class Program31 {
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  value of n");
		int n =sc.nextInt();
		//to print I
		for( int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				if(i==0||j==(n/2)||i==(n-1) ) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}
			System.out.print("  ");
			// to print L	
			for(int j=0;j<n;j++){
				if(j==0 ||i==(n-1)) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}	
			// to print o
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0 && i!=(n-1)) || (i==0 && j!=0 && j<(n/2) ) || (j==(n/2) && i!=0 &&  i!=(n-1)) || j!=0 && i==(n-1) && j<(n/2) ) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}
			// to print v
			System.out.print("  ");
			for(int j=0 ;j<n;j++) {
				if( i==j&&i<=(n/2)|| j+i==(n-1)&&i<=(n/2)) {
					System.out.print("* ");}
				else {
					System.out.print("  ");		
				}
			}
			// to print E
			System.out.print("  ");
			for(int j=0;j<n ;j++){
				if(j==0||i==0||i==(n/2)||i==(n-1)){
					System.out.print("* ");}
				else {
					System.out.print("  ");		
				}
			}
			
			// to print M
			System.out.print("  ");
			for(int j=0;j<n;j++){
				if(j==0 || j==(n-1) || (i==j && i<=(n/2)) || (i+j==(n-1) && i<=(n/2)) ) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}	
			// to print Y
			System.out.print("  ");
			for(int j=0 ;j<n;j++) {
				if(i+j==(n-1) || (i==j && i<=(n/2))){
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}
			 
			// to print M
			System.out.print("  ");
			for(int j=0;j<n;j++){
				if(j==0 || j==(n-1) || (i==j && i<=(n/2)) || (i+j==(n-1) && i<=(n/2)) ) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}
			// to print o
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0 && i!=(n-1) )|| (i==0 && j!=0 && j<(n/2) ) || (j==(n/2) && i!=0 &&  i!=(n-1)) || j!=0 && i==(n-1) && j<(n/2) ) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}
			// TO PRINT T
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n/2) ) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}
			// to print H
			System.out.print("  ");
			for(int j =0 ;j<n;j++) {
				if(j==0 || j==(n-1) || i==(n/2)) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}
			// to print E
			System.out.print("  ");
			for(int j=0;j<n ;j++){
				if(j==0 || i==0||i==(n/2)||i==(n-1)){
					System.out.print("* ");}
				else {
					System.out.print("  ");		
				}
			}
			// to print R
			System.out.print("  ");
			for(int j=0;j<n;j++){
				if(j==0 || i==0 && j<(n/2)  || j==(n/2)&& i!=0 && i<(n/2) || i==(n/2) && j<(n/2) || i-j==(n/2) ){
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}		
			System.out.println();
		}
	}
}


