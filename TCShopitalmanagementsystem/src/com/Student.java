package com;
public class Student {

	int Rollno;
	String Name;
	String Collage="NSEC";
	//Non-parameterized constructor
	Student()
	{
		System.out.println("Non-parameterized constructor is created.......");
	}
	//parameterized constructor
	Student(int Rollno,String Name)
	{
		System.out.println("parameterized constructor is created.......");
		//this keyword is used to access the variable........
	this.Rollno=Rollno;
	this.Name=Name;
	}
	//changing the college name function.............
	void collegechange()
	{
		Collage="IIT";
	}
	//a function to display the student info....
	void display()
	{
		System.out.println("Rollno: "+this.Rollno+" Name: "+this.Name+" Collage: "+Collage);
	}
	//main method................
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object creation for student class...........
		Student s1=new Student(70,"Mayank");
		Student s2=new Student(121,"Meghna");
		Student s3=new Student(122,"Megha");
		Student s4=new Student(105,"Saurav");
		//call the object........
		s3.collegechange();
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}
}
