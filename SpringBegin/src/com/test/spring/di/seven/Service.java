package com.test.spring.di.seven;

import java.util.ArrayList;

//******* 중심 클래스
public class Service {
	
	
	//의존객체 -> 멤버변수
	private  IData data;
	
	//의존 주입 도구 -> 생성자 or setter
	public Service(IData data) {
		this.data = data;
	}
	
	public ArrayList<String> getList() {
		return data.getList();
	}
	
	
}
