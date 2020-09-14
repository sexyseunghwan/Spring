package com.test.spring.di.four;

import java.util.ArrayList;

public class Service {

	
	public ArrayList<String> list() {
		
		//데이터 소스 : 텍스트 파일
		//Service -> (의존) -> MyFile or MyDB
		
		
		//*텍스트 파일을 읽는 업무객체
		//MyFile file = new MyFile();
		
		//*DB 에서 데이터를 가져와볼것이다.
		//MyDB db = new MyDB();
		
		//MyFile과 MyDB는 거시적으로 보면 동일한 업무를 하는놈이라고 볼 수 있다.
		//- 둘다 데이터 소스로부터 데이터를 가져와서 돌려주는 역할을 수행한다.
		
		
		//----인터페이스를 사용하는 경우
		
		//IData file = new MyFile();//참조변수를 인터페이스로 만드는것이 좋다.
		
		IData data = new MyDB();//여기서도 참조변수를 인터페이스로 만드는것이 좋다.
		
		//아직까지는 왜 인터페이슬를 참조하는지 이해할수 없지만....
		
		ArrayList<String> list = data.getList();
		
		
		return list;
	}

}
