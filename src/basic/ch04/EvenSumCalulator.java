package basic.ch04;

import java.util.Scanner;

public class EvenSumCalulator {

	public static void main(String[] args) {
		
		// ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값을 입력하세요 : ");
		int maxNumber = sc.nextInt();
		// 1 <-- 		10 ----> 2 + 4 + 6 + 8 + 10;
		int sum = 0;
		
		// 반복적인 패턴이 확인 된다
		// 1 2 3 4 5 6 7 8 9 10;
		
		
		// 1 2 3 4 5 6 7 8 9 10;
		// i = i + 2 --> i += 2;
		for(int i = 2; i <= maxNumber; i += 2) {
			// 1 = 0 + 1;
			// 3 = 1 + 2; 
			// 6 = 3 + 3;
			sum = sum + i;
			System.out.println("sum : " + sum + " \t");
			// \t : 탭(4칸정도 띄우기)
			// \n : 줄바꿈
		}
		System.out.println("sum : " + sum);
	}

}
