package basic.ch13;

import java.util.Arrays;
// 가지고 오다. 수입하다. 
import java.util.Random;

public class LottoNumberMaker {

	// 멤버 변수
	private String version = "1.0.0";

	// main 함수
	public static void main(String[] args) {

		int[] lottos = makeNumbers();
		Arrays.sort(lottos);
		for(int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + "\t");
		}
		
	} // end of main

	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		// static 함수안에 멤버 변수를 사용할 수 없다.
		// 메모리가 뜨는 순서 !!
		// System.out.println("ver : " + version);
		Random random = new Random();
		int resultNumber = random.nextInt(45) + 1; // 0 ~~~~ 44
		return resultNumber;
	}

	public static int[] makeNumbers() {
		int[] numbers = new int[6];
		Random random = new Random();
		// 중복된 랜덤 1 ~ 45 숫자가 나온다면
		for (int i = 0; i < 6; i++) {
			numbers[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (numbers[j] == numbers[i]) {
					i--;
					break;
				}
			}
		}
		return numbers;
	}

}
