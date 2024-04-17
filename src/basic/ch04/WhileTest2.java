package basic.ch04;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 특정 조건일 때 반복문을 종료 시켜보자.
		boolean flag = true; // 깃발
		int start = 1;
		int end = 3;
		
		while(flag) {
			
			if(start == end) {
				System.out.println("if 구문이 동작함");
				flag = false;
				return;
			}
			
			System.out.println("start : " + start);
			start++;
		} // end of while			
	}
}
// 식을 어찌 작성하느냐에 따라서 작동되는지 파악하고 
// 특정 조건 반복 종료는 if문과 같이 쓰게 된다 
// 중간에 종료하고 싶으면 return을 쓴다.