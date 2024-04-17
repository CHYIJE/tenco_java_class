package basic.ch06;

public class FunctionMainTest2 {

	public static void main(String[] args) {
		
		// 함수를 언제든지 호출해서 사용할 수 있다.
		
		addNum(10, 10, 10);
		System.out.println(30);
		System.out.println(addNum(10, 10, 10));
		int result = addNum(10, 10, 10);
		System.out.println("resutl : " + result);
		
		System.out.println("---------------");
		sayHello("어서오시게"); // 함수에 호출을 모양 맞추기이다.
		int result2 = calcSum();
		System.out.println("resutl : " + result2);
		
	} // end of main
	
	// 함수 설계, 함수 사용
	
	// 세개의 정수값을 받아서 덧셈하는 기능을 만들어보자.
	static int addNum(int n1, int n2, int n3) {
		int result = 0;
		result = n1 + n2 + n3;
		return  result;
	}
	
	// 리턴 값이 없는 함수를 만들어보자.
	static void sayHello(String greeting) {
		System.out.println(greeting + " : 데커드 케인");
	}
	
	// 매개 변수가 없는 함수를 만들어보자.
	static int calcSum() {
		
		int sum = 0;
		int i;
		for(i = 1; i <= 100; i++) { // 회수 101번 동작하는 녀석
			// 0 = 0 + 1
			// 1 = 0 + 2
			// 3 = 3 + 3
			sum = sum + i; // 5050
		}
		return sum;
	}
	
} // end of class
