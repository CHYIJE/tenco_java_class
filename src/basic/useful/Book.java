package basic.useful;

import java.lang.*;

/**
 * Object 클래스는 모든 클래스의 최상위 클래스이다. import java.long.*; 프로그래밍시 import 하지 않아도 자동으로
 * 가지고 온다. 자바는 단일 상속만 지원 합니다. 단, Object 클래스를 제외하고!!
 */
public class Book {

	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	// object -> toStirng();

	@Override
	public String toString() {

		return "[" + title + ", " + author + "]";
	}

	// 테스트 코드
	public static void main(String[] args) {
		Book book = new Book("데미안", "헤르만 헤세");
		System.out.println(book);
		System.out.println("------------------");

		String str1 = new String("안녕");
	}
	// 자리 이동 깃 확인용
}
