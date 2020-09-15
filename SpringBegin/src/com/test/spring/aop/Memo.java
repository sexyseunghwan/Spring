package com.test.spring.aop;


//Memo 이놈이   Service를 지칭한다.
public class Memo implements IMemo{

	@Override
	public void add(String memo) {
		
		System.out.printf("메모 쓰기 : %s\n",memo);
		
		//여기서 보조업무 실행하고 싶다!
		
	}

	@Override
	public void read(int seq) throws Exception {
		
		if (seq != 5) {
			System.out.printf("메모 읽기 : %d번\n",seq);
		} else {
			throw new Exception("존재하지 않는 메모입니다.");
			//System.out.println("존재하지 않는 메모입니다.");
		}
		
		//로그 기록
		
		
	}

	@Override
	public void edit(String memo) {
		
		System.out.printf("메모 수정 : %s\n",memo);
		//로그 기록
		
	}

	@Override
	public void delete(int seq) {
		
		System.out.printf("메모 삭제 : %d번\n",seq);
		//로그 기록
		
	}
	
	@Override
	public int search(String word) {
		
		if (word.contains("메모")) {
			return 3;
		} else if (word.contains("길동")) {
			return 10;
		}
		
		//로그 기록
		
		return 0;
	}
	
	
	
}
