package basic.ch06;

import java.util.Scanner;

public class Greet {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		greet(sc.nextLine());
	}
	static  void greet(String hello) {
		System.out.println( "안녕하세요 [" + hello + "]님!");
	}
}
