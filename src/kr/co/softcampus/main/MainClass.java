package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorldEn;
import kr.co.softcampus.beans.HelloWorldKo;

/* 	�ڹٿ��� � ��ü�� ����� ���� 
	1. Ŭ������ ������ ��ü�� �����ϰ� 
	2. �ش� �ּҰ��� ���������� �־��ְ�	
	3. ���������� ���ؼ� � �۾��� �Ѵ�.	
	
	�ڹ� ������Ʈ�� ������
	������ ����ϴ� Ŭ������ �ٸ� Ŭ������ �����Ѵٸ� �ش� �ڹ� ������ ��� �ڵ带 �����ؾ��Ѵ�.

public class MainClass {
	public static void main(String[] args) {
		// ��ü�� ����Ϸ��� ��ü�� �ּҰ��� ������ �ִ� ���������� �������Ѵ�.
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

// �ڹ� ������Ʈ���� Ŭ������ �����ϴ� ��� �ڵ带 �� �ٲ���ϹǷ� ���������� ����������.
// ��ü �����κа� ���� ���� ���� �κ� ��� �����ؾ��Ѵ�.
public class MainClass {
	public static void main(String[] args) {
		// ��ü�� ����Ϸ��� ��ü�� �ּҰ��� ������ �ִ� ���������� �������Ѵ�.
		HelloWorldKo hello1 = new HelloWorldKo();
		callMethod(hello1);
		
		HelloWorldKo hello2 = new HelloWorldKo();
		callMethod(hello2);
	}
	
	public static void callMethod(HelloWorldKo hello) {
		hello.sayHello();
	}
}
