package basic.ch06;

import java.util.Scanner;

public class math1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt(); 
		System.out.println(square(result));
	}
	static int square (int a) {
		int result;
		result = a*a;
		return result;
		
	}
}
