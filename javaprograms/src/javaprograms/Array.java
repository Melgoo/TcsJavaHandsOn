// single array program to add two arrays..............
package javaprograms;

import java.util.Scanner;

public class Array {
	public static void main(String args[]) {
		int m,n,p;
		Scanner sc=new Scanner(System.in);
		int a[]=new int [100];
		int b[]=new int[100];
		int c[]=new int[100];
		System.out.println("Enter 1st limit:");
		m=sc.nextInt();
		System.out.println("Enter 2nd  limit:");
		n=sc.nextInt();
		System.out.println("Enter 3rd limit:");
		p=sc.nextInt();
		System.out.println("A set of array:");
		for(int i=m;i<n;i++)
		{ 
			a[i]=i;
			System.out.println(a[i]);
		}
		System.out.println("B set of array:");
		for(int i=n;i<p;i++)
		{ 
			b[i]=i;
		
			System.out.println(b[i]);
			
		}
		System.out.println("addition of array no:");
		for(int i=0;i<n;i++)
		{
			c[i]=b[i+n]*a[i];
			System.out.println(c[i]);
			
		}
		}
}
