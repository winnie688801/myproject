package com.tom;

import java.util.Scanner;

public class SingUp {

	public static void main(String[] args) {
		System.out.println("Are you 18? (y/N)");
		Scanner scanner = new Scanner(System.in);
		String line  = scanner.nextLine();
		
		System.out.println("*"+line+"*");
		boolean adult = line.toUpperCase().equals("Y");
		System.out.println(adult);
		
		if(adult){
			System.out.println("How old are you?");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.println("What is your name?");
			String name = scanner.nextLine();
			System.out.println("What is your nickname?");
			String nickname = scanner.nextLine();
			System.out.println("Your information is: "+age+","+name+","+nickname);
			
			
		}else{
			System.out.println("Come back when you grow to adulthood , Bye");
			
		}
		
	}

}
