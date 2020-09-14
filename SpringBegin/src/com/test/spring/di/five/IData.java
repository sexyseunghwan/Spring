package com.test.spring.di.five;

import java.util.ArrayList;

public interface IData {
	
	//MyFile + MyDB 의 부모역할 수행.
	//아래 메서드를 강제로 만들라고 시킬것.
	//데이터 소스 공급 규격을 만든것이다.
	ArrayList<String> getList();
	
}
