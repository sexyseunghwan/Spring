package com.test.spring.di.three;

import java.io.BufferedReader;
import java.util.ArrayList;

public class MyFile {

	public ArrayList<String> list() {
		
		//BufferedReader 사용
		//읽었다 치고
		
		ArrayList<String> list = new ArrayList<String>();
		
		//텍스트 파일 내용 -> 배열 옮기기
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");
		
		return list;
	}

}
