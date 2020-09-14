package com.test.spring.di.one;



public class Ex01 {
	
	public static void main(String[] args) {
		
		//요구사항 ] 사용자에게 이름을 입력받아 인사하시오
		//util class 에 위임을 시켰음
		
		//Ex01 객체가 Util 객체를 의존한다.
		// -> Util 객체 -> 의존객체라고 부른다. Ex01 의 의존객체라고 부른다.
		
		Util util = new Util();
		
		String name = util.getName();//getName 메서드를 통해 이름을 얻어온다.
		
		System.out.printf("안녕하세요. %s 님\n",name);
		
		
		
	}
	
}
