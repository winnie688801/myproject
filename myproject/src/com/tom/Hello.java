package com.tom;

public class Hello {

	public static void main(String[] args) {
		String name = "Winnie" ;
		int english = 90;
		int math = 88;
		System.out.println(name + "\t" + english + "\t" + math +"\t" + (english+math)/2);
		
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
