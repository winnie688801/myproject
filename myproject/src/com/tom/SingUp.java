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
		
	}

}
