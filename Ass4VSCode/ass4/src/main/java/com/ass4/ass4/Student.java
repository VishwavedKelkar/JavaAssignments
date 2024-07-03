package com.ass4.ass4;
//import java.io.*;
import java.util.*;
import java.io.Serializable;
//import java.time.LocalDate;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cglib.core.Local;

@SpringBootApplication
public class Student implements Serializable{
	transient Scanner sc = new Scanner(System.in);
	private int rollNo;
	private String name;
	//private LocalDate DoB;
	private Subject subject;
	private double gpa;
	private enum Subject{
		JAVA,
		DBT,
		ANGULAR,
		REACT,
		SE
	}
	
	//private LocalDate DoB = LocalDate.now();
	//Student student = new Student();

	public Student(int i, String string, String string2, double d) {}

	public Student(int rollNo, String name, Subject subject, double gpa) {
		this.rollNo = rollNo;
		this.name = name;
		//DoB = doB;
		this.subject = subject;
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", subject=" + subject + ", gpa=" + gpa
				+ "]";
	}
	public int getRollNo() {
		System.out.println("Enter your roll number : ");
		rollNo = sc.nextInt();
		return rollNo;
	}
	public String getName() {
		System.out.println("Enter your name : ");
		name = sc.next();
		return name;
	}
	//public void getDoB() {
	//	System.out.println("Enter your date of birth : "+ DoB);
	//}
	public Subject getSubject() {
		System.out.println("Enter your subject : ");
		System.out.println("1. JAVA");
		System.out.println("2. DBT");
		System.out.println("3. ANGULAR");
		System.out.println("4. REACT");
		System.out.println("5. SE");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1: System.out.println("Your choice is Java");
			break;
			case 2: System.out.println("Your choice is DBT");
			break;
			case 3: System.out.println("Your choice is ANGULAR");
			break;
			case 4: System.out.println("Your choice is REACT");
			break;
			case 5: System.out.println("Your choice is SE");
			break;
			default: System.out.println("Invalid choice");
			}
		return subject;
	}
	public double getGpa() {
		System.out.println("Enter your gpa : ");
		gpa = sc.nextDouble();
		return gpa;
	}
}
