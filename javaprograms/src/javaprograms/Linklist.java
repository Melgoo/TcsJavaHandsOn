// collection java part-2 (LINKLIST)
package javaprograms;

import java.util.LinkedList;

public class Linklist {
	public static void main(String args[]) {
		// initialize and print the full linkedlist................
		LinkedList<String>job=new LinkedList<String>();
		job.add("hardware Enginneer");
		job.add("house wife");
		job.add("software Enginneer");
		job.add("Buiesness man");
		System.out.println(job);
		// add two items in first and last of the linkedlist and print it.................
		job.addFirst("collection officer");
		job.addLast("ACP");
		System.out.println(job);
		// remove two items in first and last from the linkedlist and print it.................
		job.removeFirst();
		job.removeLast();
		System.out.println(job);
}
}