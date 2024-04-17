package basic.ch06;

import java.util.Scanner;

public class signOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하시오");
		int input = sc.nextInt();
		// 입력값을 input에 넣음
		//           sign(10)
		String r =  sign(input);
		System.out.println("r : " + r);
	}

	static String sign(int signNum) {
		String result = "";
		if (signNum < 0) {
			result = "negative";
		} else if (signNum > 0) {
			result = "positive";
		} else {
			result = "zero";
		}
		
		return result;
	} // end of sign

}