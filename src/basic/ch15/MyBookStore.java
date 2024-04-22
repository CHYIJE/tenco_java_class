package basic.ch15;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

/**
 * author - 최이제 모든 프로그램의 기본은 C R U D 이다.
 */
public class MyBookStore {

	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		// 준비물
		Scanner sc = new Scanner(System.in);

		// 배열 선언
		Book[] books = new Book[100];

		// 샘플 데이터 만들어 놓기
		books[0] = new Book("케인의 기록", "데커드 케인");
		books[1] = new Book("티리엘의 기록", "티리엘");
		books[2] = new Book("아드리아의 기록", "아드리아");
		books[3] = new Book("디아블로 1", "크리스 멧젠");
		books[4] = new Book("디아블로 2", "크리스 멧젠");
		books[9] = new Book("죄악의 전쟁", "리차드");
		LAST_INDEX_NUMBER = 6;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";
		boolean flag = true;

		while (flag) {
			System.out.println("== 메뉴선택 ==");
			System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 0.프로그램 종료");
			// 문자열 + 다음줄로 이동 처리
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(SAVE)) {
				System.out.println(">> 저장하기 <<");
				save(sc, books);

			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">> 전체 조회하기 <<");
				readAll(books);
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">> 선택 조회하기 <<");
				readByTitle(sc, books);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">> 전체 삭제하기 <<");
				deletAll(books);
			} else if (selectedNumber.equals(END)) {
				System.out.println(">> 프로그램 종료 <<");
				flag = false;

			} else {
				System.out.println(">> 잘못된 선택입니다.  <<");
			}

		}

	} // end of main

	// 함수의 활용

	// 전체 조회
	public static void readAll(Book[] books) {
		System.out.println("------ 전체 조회하기 -------");
		for (int i = 0; i < books.length; i++) {
			// 방어적 코드 작성
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
			}
		}
	}

	// 전체 삭제
	public static void deletAll(Book[] books) {
		System.out.println("전체 데이터를 삭제합니다.");
		for (int i = 0; i < books.length; i++) {
			books[i] = null;
		}
	}

	// 저장하기 (하나의 북 객체를 저장)
	public static void save(Scanner sc, Book[] books) {
		System.out.println("=== 저장하기 ===");
		System.out.println("책의 제목을 입력하세요.");
		String bookTitle = sc.nextLine();
		System.out.println("책의 저자를 입력하세요");
		String bookAuthor = sc.nextLine();

		Book book = new Book(bookTitle, bookAuthor);

		if (LAST_INDEX_NUMBER >= books.length) {
			System.out.println("더이상 책을 저장할 공간이 없습니다.");
			return;
		}

		// [0] <--
		// [1] <--
		// [2] <--
		// [3] <--
		// [4] <--
		// [5] <-- null new Book(bookTitle, bookAuthor);
		// [6] <-- null new Book(bookTitle, bookAuthor);
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				LAST_INDEX_NUMBER++; // 요소의 갯수로 사용해 보자
				break;
			}
		}
		System.out.println("책이 저장되었습니다.");
	}

	public static void readByTitle(Scanner sc, Book[] books) {
		System.out.println("--- 선택 조회하기 ---");
		System.out.println(">> 책 제목을 입력해 주세요 <<");
		String bookTitle = sc.nextLine();
		boolean isFind = false;

		
		// 사용자가 입력한 책 제목
		// books 전부 조사 books[0] --> 객체 --> 객체.getTitle()
		// 문자열 --> equals
		// books[0].getTitle().equals() // 배열안에 객체가 없다면 --> null pointer -> 방어적 코드

		// 만약 사용자가 입력한 책 제목과 배열 요소안에 title 값이 같다면
		// 화면에 책 제목, 책저자 이름을 출력하고
		// 아니라면
		// 해당 하는 책이 없습니다. 라는 문구를 출력하시오

		// 심화 -- 반복문을 전부 돌리면 안됩니다.

		for (int i = 0; i < books.length; i++) {
			// 방어적 코드 작성
			if (books[i] != null ) {
				if (books[i].getTitle().equals(bookTitle)) {
					System.out.println(books[i].getTitle() + " ," + books[i].getAuthor());
					isFind = true;
					break;
				}
			}
		}
		
		// 만약 선택된 값이 없다면
		// 해당 제목에 책은 존재하지 않습니다.
		if(isFind == false) {
			System.out.println("해당 제목의 책은 존재하지 않습니다.");
		}
	}

} // end of class
