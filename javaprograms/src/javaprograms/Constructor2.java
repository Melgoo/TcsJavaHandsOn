// Non-Parameterized Constructor in java.........
package javaprograms;

import java.util.Scanner;

public class Constructor2 {
	public static void main(String args[]) {
		
	sum();
	}
public static void sum() {
	int a,b,z;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any two nos=");
	a=sc.nextInt();
	b=sc.nextInt();
	z=a+b;
	System.out.println("Addition of "+a+" and "+b+" nos="+z);
	}
}
