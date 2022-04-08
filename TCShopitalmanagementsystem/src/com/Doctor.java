package com;

public class Doctor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a object of Doctor class......
		Doctor doc1=new Doctor();
		doc1.setId(111);
		doc1.setName("Aryan");
		// assign the value to the object......
		doc1.id=222;
		doc1.name="Aryan";
		//call and print the object.........
		System.out.println(doc1.getId()+"id "+" doctor name is : " + doc1.getName());
		Doctor doc2=new Doctor();
		doc2.id=111;
		doc2.name="Karan";
		System.out.println(doc2.id+"id "+" doctor name is : " + doc2.name);
		//calling parameterized constructor.........
		Doctor doc3=new Doctor(333,"Mayank"); 
		System.out.println(doc3.id+" = "+doc3.name);
		Doctor doc4=new Doctor("Meghna"); 
		System.out.println(doc4.id);
		System.out.println(doc4.name);
		Paitent p1=new Paitent("Meghna");
   System.out.println("Paitent "+p1.name+" admited under the "+doc1.getName()+" doctor");
	}

	// default constructor........
	Doctor() {
		System.out.println("inside Doctor constructor");
	}

//parameterized constructor................
	Doctor(int id, String name) {
		this.id = id;
		this.name = name;
	}

//constructor overloading..............
	Doctor(String name) {
		this.name = name;
	}
	//<access-Specifier><data type><get keyword><variable name>
	public int getId() {
		return id;
	}
	//<access-Specifier><data type><set keyword><variable name>
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int id;
	private String name;
}
