package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		int i = 0;
		for(i=0; i<3 ; i++){
			System.out.println(i);
		}
		System.out.println(i);
		
//		int x = 3;
//		while(x >= 3){
//			System.out.println("wrong");
//			x = x - 3;
//		}
//		
//		Random random = new Random();
//		int secret = random.nextInt(100)+1;
//		System.out.println(secret);
//		System.out.println("1 to 100, Please guess the number:");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		while(number > secret){
//			System.out.printf("the number is in the range of 0 to %i, guess the number", number);
//		}
//		while(number < secret){
//			System.out.printf("the number is in the range of %i to 100, guess the number", number);
//		}
//		
//		
//		
//		float n = 18.5f;
//		String nick = "Winnie";
//		System.out.printf("Hello, %s, your age is %.1f \n", nick , n );
//		
	
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Your account:");
//		String name = scanner.nextLine();
//		System.out.println(name);
		

//		Student stu = new Student("Winnie" , 90, 80);
//		stu.print();
//		System.out.println(3 <= 6);
//		String s = new String ("abc");
//		System.out.println(s);
//		String s2 = "abc";
//		System.out.println(s == s2);
//		System.out.println(s.equals(s2));
//		int n = 5 / 3;
//		int m = 5 % 3;
//		int h = 6 % 8;
//		int x = 6 / 8;
//		System.out.println(n);
//		System.out.println(m);
//		System.out.println(h);
//		System.out.println(x);
		
		
		/*stu.name = "Winnie";
		stu.english = 90;
		stu.math = 85;*/
		
		
		Person p = new Person(50.5f , 1.55f);
		//p.weight = 50.5f;
		//p.height = 1.55f;
		System.out.println(p.bmi());
		p.hello();
		//Person hank = new Person();
		//Person winnie = null;
				//winnie.hello();
		
		/*System.out.println("Hello");
		int schoolyear = 107;
		String name = "Winnie";
		int age = 18;
		float height = 155.8f;
		float weight = 50.3f;
		System.out.println(schoolyear);
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);*/
			
			
			
	}

}
