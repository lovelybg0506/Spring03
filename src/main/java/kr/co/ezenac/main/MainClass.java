package kr.co.ezenac.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.ezenac.beans.HelloWorld;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// beans.xml 파일을 로딩한다.
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/ezenac/config/beans.xml");
		HelloWorld hello1=(HelloWorld)ctx.getBean("hello"); // 위 객체에서 저장한 경로의 beans.xml 파일에 있는 id값
		callMethod(hello1);
		
		HelloWorld hello2=ctx.getBean("hello2",HelloWorld.class);
		callMethod(hello2);
		
		ctx.close();
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
