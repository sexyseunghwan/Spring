package com.test.spring.di.three;

import java.util.ArrayList;

public class Ex03 {
	
	public static void main(String[] args) {
		
		//[객체관계]
		//Ex02 -> (의존) -> Util -> (의존) -> Scanner
		//Ex03 -> (의존) -> Service -> (의존) -> MyFile or MyDB
		
		
		//업무
		// - 구성원 목록을 가져와서 화면에 출력하시오
		// - 데이터 소스 : 텍스트 파일
		
		
		//변동사항이 생김
		// - 데이터 소스 : 텍스트 파일 -> 오라클 전환 
		// - 수정된 소스 : service 객체를 고친것이다.
		// 그럼 메인에서는 고칠 코드가 존재하지 않는다. -> service 가 신경쓰면 되는 부분이다.
		
		
		Service service = new Service();
		
		ArrayList<String> list = service.list();
		
		for (String name : list) {
			System.out.println(name);
		}
		
		
		
	}
	
}
