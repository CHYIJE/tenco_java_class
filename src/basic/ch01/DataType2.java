package basic.ch01;

public class DataType2 {
	
/**
 * 문자 데이터 타입	
 * char 자료형의 크기는 2byte입니다.
 */
	// 코드시작
	public static void main(String[] args) {
		
		// 기본 자료형 중 - 문자 타입(사실은 정수형)
		// 문자를 저장하기 위한 변수를 선언할 때 사용.
		// char 타입은 단, 하나의 문자만을 저장할 수 있다.
		
		char charBox;
		charBox = 'A'; // char는 홑따옴표를 사용한다.
		System.out.println(charBox);
		
		// charBox = '가나'; // 대입 불가
		// 참고 ! 두개 이상에 문자가 연속된 형태를(String) 문자열 --> "안녕 반가워"
		
		System.out.println("------------------------------------------------");
		System.out.println((int)charBox);
		
		// 도전 문제
		// 소문자 a, b, c는 정수값으로 얼마일까?
		
		char a;
		a = 'a';
		System.out.println("a 값 : " + (int)a);
		
		char b;
		b = 'b';
		System.out.println("b 값 : " + (int)b);
		
		char c;
		c = 'c';
		System.out.println("c 값 : " + (int)c);
		
	} // end of main

} // end of class
