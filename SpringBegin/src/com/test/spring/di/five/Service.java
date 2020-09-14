package com.test.spring.di.five;

import java.util.ArrayList;

//Service 객체는 MyFile 객체를 의존한다.
//- MyFile 객체는 Service 객체의 "의존객체"이다.
//1. 본인이 직접 의존객체를 생성한 것이다.
//2. 의존 객체를 주입하는 형태로 수정
public class Service {

	//2. 의존객체를 멤버 변수로 선언한다.
	private IData data;//인터페이스객체 생성
	
	
	//3. 의존주입 도구를 선언한다 -> 생성자 or setter 로 만들면 된다.
	public Service(IData data) {
		this.data = data;
	}
	
	public ArrayList<String> list() {
		
		//1. 의존 객체 생성하는 코드를 삭제한다.
		//IData data = new MyFile();
		//IData data = new MyDB();//여기서도 참조변수를 인터페이스로 만드는것이 좋다.
		
		ArrayList<String> list = data.getList();
		
		return list;
	}

}
