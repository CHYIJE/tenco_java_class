package basic.ch04;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do {
			input = sc.nextInt();
			sum += input;
		} while (input != 0);
		System.out.println(sum);
		
	}

}
