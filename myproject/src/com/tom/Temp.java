package com.tom;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		System.out.println("Please enter the temperature(Calsius):");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();
		Temperature temp = new Temperature(c);
		System.out.printf("%.1f c = %.1f F\n", c,temp.fahrenheit());
		
		
		

	}

}
