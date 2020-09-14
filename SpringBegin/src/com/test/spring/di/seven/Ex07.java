package com.test.spring.di.seven;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex07 {

	
	public static void main(String[] args) {
		
		//m1();
		m2();
	}

	private static void m2() {

		//1. 전체 설정 관리 : 자바 -> 스프링 XML
		//2. 의존주입 도구 : 자바 조작 -> XML에서 조작.
		
		
		//스프링 기반으로 생성해보자.
		//Spring DI 구현!
		ApplicationContext context = new ClassPathXmlApplicationContext("config07.xml");
	
		//IData data = new MyFile();
		//IData data = new MyDB();
		
		//위의 코드를 스프링으로 구현해보자
		//IData data = (IData)context.getBean("file");
		
		//Service service = new Service(data);//생성자를 통한 의존 주입
		//위의 코드도 스프링으로 생성해보자.
		Service service = (Service)context.getBean("service");//***애를 먼저 생성해주면 필요한 file 객체를 먼저 생성해준다(******)***
		//즉 여기서 객체가 두개가 만들어진거라고 보면 된다!..
		//file먼저 만들어지고 그 file을 가지고 와서 service 객체를 만들게 된다.
		
		
		ArrayList<String> list  = service.getList();
		
		for (String name : list) {
			
			System.out.println(name);
		}	
	}
	
	
	
	private static void m1() {
		
		//아까 했던 모델..
		//Ex07 -> (의존,위임) -> Service -> (의존,위임) -> IData(MyFile,MyDB)
		
		//IData data = new MyFile();
		IData data = new MyDB();
		Service service = new Service(data);//생성자를 통한 의존 주입
		
		ArrayList<String> list  = service.getList();
		
		for (String name : list) {
			
			System.out.println(name);
		}
		
		
	}
	
}