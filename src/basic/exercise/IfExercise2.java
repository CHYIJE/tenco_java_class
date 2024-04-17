package basic.exercise;

import java.util.Scanner;

public class IfExercise2 {

	public static void main(String[] args) {

		// 정수값 입력 받기

		System.out.println("성적을 입력하세요 (0-100): ");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt(); // 정수 입력받기

		char grade = 'X'; // 초기값을 'X'로 설정해 잘못된 입력을 쉽게 확인
		String message = "0부터 100까지의 성적을 입력하세요"; // 추가적인 피드백 메시지
		// message = "문자열을 담을 수 있다.";

		// 조건문을 완성 하세요
		// 힌트 - 비교 연산자와 논리 연산자를 활용
		if (point <= 100 && point >= 90) {
			grade = 'A';
			message = "우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.";
		} else if (point < 90 && point >= 80) {
			grade = 'B';
			message = "좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!";
		} else if (point < 80 && point >= 70) {
			grade = 'C';
			message = "괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.";
		} else if (point < 70 && point >= 60) {
			grade = 'D';
			message = "학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.";
		} else if (point < 60 && point >= 0) {
			grade = 'F';
			message = "불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.";
		} else {

		}
		System.out.println("당신의 학점은" + grade + "입니다.");
		System.out.println(message);

		sc.close();// 열여 있던 자원 닫기

	}
}
