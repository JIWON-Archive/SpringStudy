package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorldEn;
import kr.co.softcampus.beans.HelloWorldKo;

/* 	자바에서 어떤 객체를 사용할 때는 
	1. 클래스를 가지고 객체를 생성하고 
	2. 해당 주소값을 참조변수에 넣어주고	
	3. 참조변수를 통해서 어떤 작업을 한다.	
	
	자바 프로젝트의 문제점
	기존에 사용하던 클래스를 다른 클래스로 변경한다면 해당 자바 파일의 모든 코드를 변경해야한다.

public class MainClass {
	public static void main(String[] args) {
		// 객체를 사용하려면 객체의 주소값을 가지고 있는 참조변수를 만들어야한다.
		HelloWorldEn hello1 = new HelloWorldEn();
		callMethod(hello1);
		
		HelloWorldEn hello2 = new HelloWorldEn();
		callMethod(hello2);
	}
	
	public static void callMethod(HelloWorldEn hello) {
		hello.sayHello();
	}
}

 */

// 자바 프로젝트에서 클래스를 변경하는 경우 코드를 다 바꿔야하므로 유지보수가 불편해진다.
// 객체 생성부분과 참조 변수 선언 부분 모두 수정해야한다.
public class MainClass {
	public static void main(String[] args) {
		// 객체를 사용하려면 객체의 주소값을 가지고 있는 참조변수를 만들어야한다.
		HelloWorldKo hello1 = new HelloWorldKo();
		callMethod(hello1);
		
		HelloWorldKo hello2 = new HelloWorldKo();
		callMethod(hello2);
	}
	
	public static void callMethod(HelloWorldKo hello) {
		hello.sayHello();
	}
}
