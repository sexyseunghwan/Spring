package com.test.spring.di.six;

public class User {
	
	private String name;
	private int age;
	
	//기본생성자 생성. -> 기본생성자가 없으면 오류가 발생한다.
	public User() {
		this.name = "";
		this.age = 0;
	}
	
	//오버로딩 된 생성자.
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
