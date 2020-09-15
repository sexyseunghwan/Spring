package com.test.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//컨트롤러 역할(전체 업무 제어하는 역할)
public class Main {
	
	public static void main(String[] args) {
		
		
		//<bean> 로딩, <aop> 로딩
		//일단 xml을 불러들여야 보조업무랑 주업무 엮는게 실행이된다.
		ApplicationContext context = new ClassPathXmlApplicationContext("memo.xml");
		
		//메모업무 구현
		
		//IMemo memo = new Memo();
		//memo.xxx();
		
		//주업무 객체 -> Spring 으로 생성해야한다.
		//IMemo memo = new Memo();
		IMemo memo = (IMemo)context.getBean("memo");
		
		//객체 만드는 방식을 전통적인 방식으로 하느냐 spring 으로 하느냐에 따라 
		
		
		//1. 주업무 - 글쓰기
		memo.add("메모입니다.");
		
		//2. 주업무 - 읽기
		try {
			memo.read(2);
			memo.read(5);//애는 예외를 발생시킨다.
		} catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		
		//3. 주업무 - 수정
		memo.edit("메모를 수정합니다.");
		
		//4. 주업무 - 삭제
		memo.delete(8);
		
		//5. 주업무 - 검색
		System.out.println(memo.search("길동"));
		System.out.println(memo.search("아무개"));
		
	}
}
