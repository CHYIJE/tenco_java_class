package basic.ch07;

import java.util.Scanner;

public class User {
	
	// User라는 이름으로 묶음
	String id;
	String password;
	String nick;
	String gender;
	int age;
	
	// 패스워드 체크하는 기능을 만들어 보기
	// 동사로 시작하는 것이 권장사항
	
	public boolean checkPassword(String inputPwd) {
		// 만약 나의 멤버 변수에 들어가 있는 
		// password 값과 외부에서 넣을 inputpwd 값이
		// 같다면 true 반환 아니면 false 반환 하라
		// == 주소값, 산술식 사용한다.
		// 문자열 비교는 equals 라는 메서드를 사용한다.
		if(password.equals(inputPwd)) {
			System.out.println("비밀번호가 맞았습니다.");
			return true;
		}
		System.out.println("비밀번호가 틀렸습니다.");
		return false;
	}
	
	// 독립적인 함수로서 여기서 실행 시킬 수 있다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// User 클래스를 인스턴스화 시켜 주세요.
		User user1 = new User(); // 메모리에 올라간다.(heap)
		user1.password = "123";
		
		User user2 = new User();
		user2.password = "555";
		
		
		System.out.println("===============");
		
		// user1 pwd를 확인하고 싶다.
		// 1
		boolean userResult1 = user1.checkPassword("333");
		System.out.println("user1 : " + userResult1);
		// 2
		boolean userResult2 = user1.checkPassword("123");
		System.out.println("user1 두번째 결과 : " + userResult2);
		
		System.out.println("=======================");
		// 참조변수 user2 기능인 checkPassword 호출해서 결과를 확인 해주세요.
		// -- F   -- 1 
		
		boolean user2Result1 = user2.checkPassword("666");
		System.out.println();
		// -- T   -- 2
		
		boolean user2Result2 = user2.checkPassword("555");
		System.out.println();
		
		// 실행에 흐름 만드는 방법 연습이다.
		// if 구문을 활용해서
		// 콘솔창에 비밀번호가 틀렸습니다. 출력
		// 콘솔창에 비밀번호가 맞습니다. 출력
		 
		
		
	} // end of main
	
	
} // end of class
