package basic.ch06;

public class Function1 {

	public static void main(String[] args) {

		int n1;
		int n2;
		add(10, 10);
		calcSum(1, 10);
		int sum;
		// 함수의 호출은 모양 맞추기
		int result2 = calcSum(7, 200);
		System.out.println("result2 : " + result2);
	} // end of main

	static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}
	// 연습 문제
	// 함수를 수정 -- 파라메터 정수 2개를 받을 수 있도록 설계
	// s1, s2 -->
	// 1, 10 ---> 55
	// 7, 200 ---> 
	static int calcSum(int s1, int s2) {  //두개의 값을 받기위해 파라미터 설계 
		//  1 + 2 + 3 + 4
		int sum = 0;
		int i;
		for (i = s1; i <= s2; i++) {  // 같은 파라미터
			sum = sum + i;
		}
		return sum;
	}
}// end of class