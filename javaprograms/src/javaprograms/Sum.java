package javaprograms;
import java.util.Scanner;
public class Sum {
	public static void main(String args[]) {
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0)
		{
			n/=10;
			count++;
		}
		System.out.println("the total number is:"+count);
	}

}