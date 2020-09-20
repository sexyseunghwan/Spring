package com.test.spring.di.two;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//m1
		//Util util = new Util();
		//String name = util.getName();
		//System.out.printf("안녕 ~ %s\n",name);
		
		
		//m2
		Scanner scan = new Scanner(System.in);//의존주입을 위해 준비해놓는 셋팅
		
		
		//1.생성자로 의존주입 하는경우
		//Util 객체는 scan 객체를 의존한다.(scan 객체가 없으면 업무를 진행 못한다.)
		//- 외부에서(ex02) util 객체가 꼭 필요로 하는 scan  객체를 만들어서 전달(주입)
		//Util util = new Util(scan);//여기서 "의존주입"한다고 말해준다.(***)
		
		//String name = util.getName();
		
		//System.out.printf("안녕 ~ %s\n",name);
		
		//2.setter로 의존주입 하는경우
		Util util = new Util();
		
		util.setScan(scan);//여기서 "의존주입"한다고 말해준다.(***)
		
		String name = util.getName();
		
		System.out.printf("안녕 ~ %s\n",name);
		
		
		
	}
}
