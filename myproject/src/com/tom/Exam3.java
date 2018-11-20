package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Random random = new Random();
		int secret = random.nextInt(10)+1;
		Scanner scanner = new Scanner(System.in);
		System.out.println(secret);
		int i = 0;
		int count = 1;
		
		while(i!=1 && count <= 4){
			System.out.println("Please guess a number (" + count + "/4) :");
			int number = scanner.nextInt();
			
			if(number < secret){
				System.out.println("Your guess: " + number);
				System.out.println("higher");
			}
			
			if(number > secret){
				System.out.println("Your guess: " + number);
				System.out.println("lower");
			}
			
			if(number == secret && count >2){
				System.out.println("Great! The secret number is " + secret);
				break;
			}	
			
			if(number == secret && count <= 2){
				System.out.println("Excellent! The secret number is " + secret);
				break;
			}
			count++;
		}
		
		if(count >= 5){
			System.out.println("Gameover");
		}
			
	}

}
