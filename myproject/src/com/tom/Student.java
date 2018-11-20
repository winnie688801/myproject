package com.tom;

public class Student {
	String name ;
	int english;
	int math;
	
	public Student(){
	}
	
	public Student( String name, int english, int math){
		this.name = name;
		this.english = english;
		this.math = math ;
	}
	
	public void print(){
		System.out.print(name + "\t" + english + "\t" + math + "\t" + getAverage() + "\t" 
						+ highest() + "\t");
		if (getAverage() < 60){
			System.out.print("failed");
		}else {
			System.out.print("pass");
		}
		System.out.println("\t" + getGrading());
	}
	
	public char getGrading(){
		char grading = 'F';
		int average = getAverage();
		switch(average/10){
		case 10:
		case 9 :
			grading = 'A';
			break;
		case 8:
			grading = 'B';
			break;
		case 7:
			grading = 'C';
			break;
		case 6:
			grading = 'D';
		}
		return grading;
	}
	
	public int highest(){
		if (english > math){
			return english;
		}else{
			return math;
		}
	}
	
	public int getAverage(){
		return (english+math)/2;
	}
}