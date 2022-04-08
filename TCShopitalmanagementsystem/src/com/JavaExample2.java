package com;

// main class
public class JavaExample2 {
	// assigning String value
	private static String str = "MEGMEY";

	// TODO Auto-generated method stub
	// nested class
	static class MyNestedClass {
		// display method
		public void display() {
			System.out.println(str);
		}
	}

	// main method
	public static void main(String[] args) {
		// nested class objected created

		// <Main class name>.<Nested class name> <object name>=new <Main class
		// name>.<Nested class name>();
		JavaExample2.MyNestedClass obj = new JavaExample2.MyNestedClass();
		obj.display(); // object calling
	}
}

// a class can be static.............
// a variable can be static.....................
// 