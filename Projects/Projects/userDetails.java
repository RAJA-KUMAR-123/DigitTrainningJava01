package com.digit.javaTraining.Projects;

import java.util.Scanner;

//public class userDetails {
//
//}

public class userDetails {
	public void user() {
		String name;
		int age;
		String gender;
		System.out.println("Enter your details");
		Scanner sc=new Scanner(System.in);
		System.out.println("Name :");
		name=sc.nextLine();
		System.out.println("age :");
		age=sc.nextInt();
		System.out.println("gender :");
		gender=sc.next();
		System.out.println("WELCOME "+name+" IN KBC NAME");
		System.out.println("Now you can start answering questions.");
		questions q=new questions();
		q.question1();

	}

}