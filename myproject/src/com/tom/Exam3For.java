package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Exam3For {
	public static void main(String[] args) {
		Random random = new Random();
		int secret = random.nextInt(10)+1;
		Scanner scanner = new Scanner(System.in);
		System.out.println(secret);
		int number = 0;
		int i =0;
		for(i=1; i<=4; i++){
			System.out.println("Please guess a number (" + i + "/4) :");
			number = scanner.nextInt();
			if(number < secret){
				System.out.println("Your guess: " + number);
				System.out.println("higher");
			}
			else if(number > secret){
				System.out.println("Your guess: " + number);
				System.out.println("lower");
			}
			else{
				break;
			}
		}
		if(number == secret && i >2){
			System.out.println("Great! The secret number is " + secret);
		}	
		if(number == secret && i <= 2){
			System.out.println("Excellent! The secret number is " + secret);
		}else if(i >= 5){
		System.out.println("Gameover");
		}
	}
}
