package com.test.spring.di.three;

import java.util.ArrayList;

public class Service {

	
	public ArrayList<String> list() {
		
		//데이터 소스 : 텍스트 파일
		//Service -> (의존) -> MyFile or MyDB
		
		
		//텍스트 파일을 읽는 업무객체
		//MyFile file = new MyFile();
		
		//이번에는 DB 에서 데이터를 가져와볼것이다.
		MyDB db = new MyDB();
		
		ArrayList<String> list = db.list();
		
		
		return list;
	}

}
