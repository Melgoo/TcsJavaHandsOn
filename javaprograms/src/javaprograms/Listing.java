// collection java part-1 (ARRAYLIST)
package javaprograms;

import java.util.ArrayList;

public class Listing {
	public static void main(String args[]) {
		// initialize and print the full arraylist................
		ArrayList<String>family=new ArrayList<String>();
		family.add("Meghna");
		family.add("Biswajit");
		family.add("Irina");
		family.add("Mayank");
		System.out.println(family);
		// Print only 0 index item from list.....................
		System.out.println(family.get(0));
		// change the index 0,1,2 items in list.......................
		family.set(0,"Biswajit");
		family.set(1,"Irina");
		family.set(2,"Meghna");
		System.out.println(family);
		// remove the index 3 item from list................... 
		family.remove(3);
		System.out.println(family);
	}
	}
