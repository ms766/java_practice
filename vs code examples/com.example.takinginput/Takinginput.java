package com.example.takinginput;
import java.util.Scanner;

import javax.xml.transform.Source;

class Takinginput {
	
	public static void main(String[] args) {
		in2();
	}

	public static void in(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name:");
		
		String name = input.nextLine();
		
		System.out.println(name);

		System.out.print("Enter age: ");
		String age = input.nextLine();
		System.out.println(age);

		input.close();

	}

	public static void in2(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter year:");
		//note the use of nextInt !!!
		int year = scanner.nextInt();
		//note the use of nextInt !!!

		scanner.nextLine();

		System.out.print("Enter name: ");
		String name = scanner.nextLine();
	
		System.out.println("age,name "+year+" "+name);

		scanner.close();
	}


}
