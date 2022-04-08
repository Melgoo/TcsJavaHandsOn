// Parameterized Constructor in java.........
package javaprograms;

import java.util.Scanner;

public class Constructor {
	public static void main(String args[]) {
		Constructor obj=new Constructor();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two nos=");
	int	x=sc.nextInt();
	int	y=sc.nextInt();
	int get_z=obj.sum(x,y);
	System.out.println(get_z);
	}
public int sum(int a , int b) {
	int z;
	z=a+b;
	return(z);
}
}