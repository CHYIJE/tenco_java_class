package basic.ch03;

public class Operation2 {

	public static void main(String[] args) {
			
		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		// 고민해볼 사항
		// int result4 = 5 / 3;
		double result4 = 5.0 / 3;
		int result5 = 5 % 3;
		
		System.out.println("result1 " + result1);
		System.out.println("result2 " + result2);
		System.out.println("result3 " + result3);
		System.out.println("result4 " + result4);
		System.out.println("result5 " + result5);
		
		// 문제
		// 1. (12+3) / 3 값으 ㄹ화면에 출력해 보세요
		// 변수명, 데이터 유형 스스로 결정하고 식을 만들어보세요.
		double problemOne = (12 + 3)/ 3.0;
		System.out.println(problemOne);
		
		
		// 2. (25 % 2) 값을 화면에 출력해 보세요
		// 어떤 수를 2로 나누었을 때 나머지가 0이면 짝수 1이면 홀수
		int problemTwo = 25 % 2;
		System.out.println(problemTwo);
		
		 
		
		// 3. 15를 4로 나눈 후, 그 결과의 절대값을 출력하세요.
		int problemthird = 15 / 4;
		Math.abs(problemthird);
		System.out.println(problemthird);
		
		// 4. 문제 3개 도출
		//(15*8) -3 의 값을 화면에 출력하고 그 값 만큼 0 좌표에서 절댓값을 구하시오		
		double ha = (15*8) -3;
		final int ZERO_POINT = 0;
		int currentPoint = 0;
		
		System.out.println(ha);
		
	} // end of main

} // end of class
