package com.test.spring.di.five;

import java.util.ArrayList;

public class Ex05 {
	
	public static void main(String[] args) {
		
		//IData data = new MyFile();//service 객체가 필요하는 의존 객체  -> 파일에서 가져온것
		IData data = new MyDB();//service 객체가 필요하는 의존 객체 -> DB 에서 가져온것.
		
		
		Service service = new Service(data);//의존 주입 -> Dependency Injection(*********************)
		
		ArrayList<String> list = service.list();
		
		for (String name : list) {
			System.out.println(name);
		}
		
		
		
	}
	
}
