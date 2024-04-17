package basic.ch08;

public class StudentMainTest {

	public static void main(String[] args) {
		
		// 기본 생성자가 아닌 정의 생성자 일 경우 
		// 정의 생성자와 모양은 맞춰줘야 한다.
		Student s1 = new Student("메피스토", 101, 6); // 객체
		
				
//		System.out.println(s1);  // 주소 값이 출력된다.
//		s1.showInfo();
		System.out.println("---------------------");
		
		// 연습문제 
		// s2 참조 변수에 이름으로 학생을 생성해
		Student s2 = new Student("바알", 102, 7);
		System.out.println(s2);
		s2.showInfo();
		System.out.println("-------------------");
		
		// 변수에 직접 접근해서 값을 초기화 해보세요.
		Student s3 = new Student(); // 기본 생성자로 메모리가 올림
		s3.name = "디아블로";
		s3.number = 103;
		s3.grade = 4;
		s3.showInfo();
		
		// 생성자를 여러개 만들어 줄 수 있다
		// 생성자 오버로딩이라고 한다.
		
		
	} // end of main

} // end of class
