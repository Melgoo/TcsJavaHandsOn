package javaprograms;
import java.util.Scanner;

public class Reverse {
	   public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		      System.out.println("Enter a String value: ");
		      String str = sc.next();
	char ch[] = str.toCharArray();
    int n = ch.length;
    char result[] = new char[n];
    for(int i = 0; i<ch.length; i++) {
       result[n-1] = ch[i];
       n = n - 1;
    }
    System.out.println(result);
	   } 
}
