package basic.ch11;

public class PersonTest {

	public static void main(String[] args) {
		
		
		Person person1 = new Person("이방원", 500); 
		Person personBox = person1;
		Person personBox2 = person1.getPerson();
		Person personLee = new Person("이성계", 550);
		System.out.println("----------------------");
		// 위 코드까지는 Heap 메모리 영역에 객체가 2개 생성된 상태이다.
		// 지역변수인 person1, personBox, personBox2는 같은 객체를 가리킨다.
		
		// 연습 문제 =
		// setName 메서드를 만들어 주세요.
		
		personBox2.setName("정도전");
		person1.showInfo();
		personLee.showInfo();
		
	} // end of main

} // end of class
