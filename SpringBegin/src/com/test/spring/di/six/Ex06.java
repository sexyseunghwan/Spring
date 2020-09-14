package com.test.spring.di.six;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex06 {
	
	public static void main(String[] args) {
		
		//의존 객체 -> DI 방식으로 전환 -> 스프링을 사용해서 전환.
		Service service = new Service();
		
		//m1();
		//m2();
		m3();
	}

	private static void m3() {
		
		User user1 = new User();
		user1.setName("홍길동");
		user1.setAge(20);
		
		System.out.println(user1.getName());
		System.out.println(user1.getAge());
		
		
		System.out.println("====스프링 방식====");
		//스프링 방식으로 생성
		//먼저 xml을 읽어오고
		ApplicationContext context = new ClassPathXmlApplicationContext("config06.xml");		
		
		User user2 = (User)context.getBean("user");
		user2.setName("성춘향");
		user2.setAge(30);
		
		System.out.println(user2.getName());
		System.out.println(user2.getAge());
		
		System.out.println("====스프링 프로퍼티====");
		
//		 <bean id = "user2" class="com.test.spring.di.six.User">
//		 	<property name="name" value = "하하하"></property>
//			<property name="age" value = "89"></property>
//		 </bean>
		User user3 = (User)context.getBean("user2");//여기서는 세터를 안정해줘도 이미다 들어있음.
		
		
		System.out.println(user3.getName());
		System.out.println(user3.getAge());
		
		
		System.out.println("====스프링 컨스트럭터====");
		
		
		User user4 = (User)context.getBean("user3");//여기서는 세터를 안정해줘도 이미다 들어있음. -> 생성자로 이미 넣어버렸으므로..
		
		System.out.println(user4.getName());
		System.out.println(user4.getAge());
		
		
		
	}

	private static void m2() {
		
		//Spring 으로 전환
		// 객체생성 -> spring 을 통한 객체생성을 자주 하게 될것이다.
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config06.xml");//스프링 경로참조하는놈
		//config06.xml의 설정을 읽어드려라 라는 표현이 된다.
		
		//Service service = new Service(); 이 객체를 만들어야 된다.
		
		Service service = (Service)context.getBean("s1");//object 객체라 형변환이 필요함. 다운캐스팅이 필요하다.
		
		String result = service.test();
		
		System.out.println(result);
		
	}

	private static void m1() {
		
		//Ex06 -> (의존) -> Service
		Service service = new Service();//의존 객체
		
		String result = service.test();
		System.out.println(result);
		
	}
	
}
