package basic.ch13;

// 가지고 오다. 수입하다.
import java.util.Random;

public class LottoNumberMaker {
	
	// 멤버변수
	private String version = " 1.0.0";
	
	// main함수
	public static void main(String[] args) {
		
		
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		
		
	} // end of main
	
	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
	// static 함수안에 멤버 변수를 사용할 수 없다.(method area)
	// 메모리가 뜨는 순서 !!
	//	System.out.println("ver : " + version);
		
		// 자바 도구 -- 표준 API
		// 난수 발생기 --> 랜덤적인 번호를 생성
		Random random = new Random();
		int resultNum = random.nextInt(45) + 1;  // 0 ~ 45
		return resultNum;
		// return 0; <-- 코드 작성시 리턴을 해놔야 하기에 0으로 해두고 후에 위처럼 바꿔준다.
	}
	
}
