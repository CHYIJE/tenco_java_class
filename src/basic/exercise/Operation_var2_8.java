package basic.exercise;

// 수입하다, 가지고 오다
import java.util.Scanner;
/**
 * 삼항 연산자 (조건 연산자)
 * int num = 조건식 ? 결과1 : 결과2
 */
public class Operation_var2_8 {

	public static void main(String[] args) {
		
		System.out.println("당신의 출생년도를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int manage = (2024)-(age);
		System.out.println("당신의 나이는 : " + manage + "입니다.");
		
	} // end of main

} // end of class
