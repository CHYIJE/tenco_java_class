package structure;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {

	private HashSet<String> userIDs;

	public UniqueUserIDSystem() {
		this.userIDs = new HashSet<String>();
	}

	// 사용자 ID 등록 기능
	// 정상적으로 들어가면 true
	// 중복 발생하면 false
	public boolean registerUserID(String userId) {

		return userIDs.add(userId);
	}

	// 시스템 실행
	public void run() {
		// 동작 - 스캐너 활용
		Scanner sc = new Scanner(System.in);
		// 실행 흐름 만들기 --> while, if
		while (true) {
			System.out.println("등록할 아이디를 입력하시오.");
			String newid = sc.nextLine();
			if ("exit".equals(newid)) {
				System.out.println("시스템 종료");
				break;
			}
			boolean isRegistered = registerUserID(newid);
			if (isRegistered) {
				System.out.println("새로운 사용자 등록 완료" + newid);
				// 결과 -> 정상 유저 등록
			} else {
				System.out.println("이미 등록된 사용자" + newid);
				// -> 이미 등록된 사용자 입니다.
			}
		}
		sc.close();
	}

	// 코드 테스트
	public static void main(String[] args) {
		UniqueUserIDSystem system = new UniqueUserIDSystem();
		system.run();

	} // end of main

} // end of class
