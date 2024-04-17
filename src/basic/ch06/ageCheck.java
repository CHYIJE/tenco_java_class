package basic.ch06;

import java.util.Scanner;

public class ageCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		System.out.println(chectAdult(result));
	}
	

	static boolean chectAdult(int a) {
		boolean result;
		result = (a >= 18);
		return result;
	}
}
