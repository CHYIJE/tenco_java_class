package basic.exercise;

import java.util.Scanner;



public class PoneBookManager {
	

	public static void main(String[] args) {
		// 스캐너 사용
		Scanner sc = new Scanner(System.in);
		// 배열 선언 100개
		PoneBook[] ponebooks = new PoneBook[100];
		
		
		// 샘플 데이터 만들어 놓기
			ponebooks[0] = new PoneBook("김씨", "101010");
			ponebooks[1] = new PoneBook("박씨", "2222222");
			ponebooks[2] = new PoneBook("최씨", "444444");
			ponebooks[3] = new PoneBook("정씨", "666666");
			ponebooks[4] = new PoneBook("무씨", "88888ㄴ");
			
		

		final String SEARCH = "1";
		final String SAVE = "2";
		final String FIX = "3";
		final String DELET = "4";
		final String SELECT_SEARCH = "5";
		final String END = "0";
		boolean flag = true;

		while (flag) {
			System.out.println("== 메뉴선택 ==");
			System.out.println("1.조회 2.저장하기 3.수정하기 4.삭제하기 5.선택조회 0.프로그램 종료");
			// 문자열 + 다음줄로 이동 처리
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(SAVE)) {
				System.out.println(">> 저장하기 <<");
				PoneBook.saveNum(sc, ponebooks);
			} else if (selectedNumber.equals(SEARCH)) {
				System.out.println(">> 전체 조회하기 <<");
				PoneBook.readAll(ponebooks);
			} else if (selectedNumber.equals(FIX)) { 
				System.out.println(">> 수정하기 <<");
				PoneBook.fix(sc, ponebooks);
			} else if (selectedNumber.equals(DELET)) {
				System.out.println(">> 삭제하기 <<");
				PoneBook.delet(ponebooks);
			}else if (selectedNumber.equals(SELECT_SEARCH)) { 
					System.out.println(">> 선택 조회하기 <<");
					PoneBook.selectNum(sc, ponebooks);
			} else if (selectedNumber.equals(END)) {
				System.out.println(">> 프로그램 종료 <<");
				flag = false;

			} else {
				System.out.println(">> 메뉴에 없는 선택지입니다. <<");
			}
		}

		// while()

	} // end of main

} // end of class
