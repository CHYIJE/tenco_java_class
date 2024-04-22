package basic.ch15;

public class BookTest {

	public static void main(String[] args) {
		
		// 배열이란 = 연관된 데이터를 하나의 변수에 통으로 관리하고 싶다면 - 자료구조
		// 배열을 사용할 때 반드시 크기가 지정되어야 한다.
		Book[] books = new Book[10]; // 배열에 메모리 공간 선언
		
		books[0] = new Book("케인의 기록", "데커드 케인");
		books[1] = new Book("티리엘의 기록", "티리엘");
		books[2] = new Book("아드리아의 기록", "아드리아");
		books[3] = new Book("디아블로 1", "크리스 멧젠");
		books[4] = new Book("디아블로 2", "크리스 멧젠");
		books[9] = new Book("죄악의 전쟁", "리차드");
		
		
		// 배열은 반복문과 함께 많이 활용된다.
		// 배열에 크기와 요소에 크기는 꼭 동일한것은 아니다.
		
		// books[3] --> Book
		//System.out.println(books[3].getTitle());
		//System.out.println(books[3].getAuthor());
		
//		System.out.println(books[5].getTitle()); --> null pointer 에러
		
		for(int i = 0; i < books.length; i++) {
			if( books[i] != null) {
				System.out.println(books[i].getTitle());
				System.out.println(books[i].getAuthor());
				System.out.println("-------------------");				
			}
		}
		
		
	}	// end of main

}  // end of class
