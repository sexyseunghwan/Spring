package com.test.spring.di.one;

import java.util.Scanner;

public class Util {
	
	public String getName() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		
		String name = scan.nextLine();
		
		return name;
		
		
		
	}
}
