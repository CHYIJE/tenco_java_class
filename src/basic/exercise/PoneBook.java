package basic.exercise;

import java.util.Scanner;

public class PoneBook {
	static int LAST_INDEX_NUMBER = 0;

	// 속성
	private String name;
	private String poneNumber;

	Scanner sc = new Scanner(System.in);
	PoneBook[] ponebooks = new PoneBook[100];

	public PoneBook(String name, String poneNumber) {
		this.name = name;
		this.poneNumber = poneNumber;

	}

	// getter
	public String getName() {
		return name;
	}

	public String getPoneNumber() {
		return poneNumber;
	}
	
	
	// 기능

	public void setName(String name) {
		this.name = name;
	}

	public void setPoneNumber(String poneNumber) {
		this.poneNumber = poneNumber;
	}

	// 폰 번호를 저장한다.
	public static void saveNum(Scanner sc, PoneBook[] poneBook) {
		System.out.println("=== 저장하기 ===");
		System.out.println("이름을 입력하세요.");
		String poneName = sc.nextLine();
		System.out.println("번호를 입력하세요");
		String PoneNum = sc.nextLine();

		PoneBook poneBooks = new PoneBook(poneName, PoneNum);

		if (LAST_INDEX_NUMBER >= poneBook.length) {
			System.out.println("더이상 책을 저장할 공간이 없습니다.");
			return;
		}

		for (int i = 0; i < poneBook.length; i++) {
			if (poneBook[i] == null) {
				poneBook[i] = poneBooks;
				LAST_INDEX_NUMBER++; // 요소의 갯수로 사용해 보자
				break;
			}
		}
		System.out.println("책이 저장되었습니다.");
	}

	// 폰 번호를 조회한다.
	public static void readAll(PoneBook[] ponebook) {
		System.out.println("------ 전체 조회하기 -------");
		for (int i = 0; i < ponebook.length; i++) {
			// 방어적 코드 작성
			if (ponebook[i] != null) {
				System.out.println(ponebook[i].getName() + "," + ponebook[i].getPoneNumber());
			}
		}
	}

	// 기존의 번호를 수정한다.
	public static void fix(Scanner sc, PoneBook[] ponebook) {
		System.out.println("--- 수정할 이름 조회하기 ---");
		System.out.println(">> 이름을 입력해 주세요 <<");
		String nameChange = sc.nextLine();
		System.out.println(">> 번호를 입력해 주세요 <<");
		String NumberChange = sc.nextLine();
		
		
		for (int i = 0; i < ponebook.length; i++) {
			ponebook[i].setName(nameChange);
			ponebook[i].setPoneNumber(NumberChange);
			System.out.println("변경 되었습니다.");
			break;	
	}

	}

	// 폰 번호를 삭제한다.
	public static void delet(PoneBook[] ponebook) {
		System.out.println("전체 데이터를 삭제합니다.");
		for (int i = 0; i < ponebook.length; i++) {
			ponebook[i] = null;
		}
	}

	// 폰 선택 조회
	public static void selectNum(Scanner sc, PoneBook[] ponebook) {
		System.out.println("--- 선택 조회하기 ---");
		System.out.println(">> 이름을 입력해 주세요 <<");
		String nameTitle = sc.nextLine();
		boolean isFind = false;

		for (int i = 0; i < ponebook.length; i++) {
			// 방어적 코드 작성
			if (ponebook[i] != null) {
				if (ponebook[i].getName().equals(nameTitle)) {
					System.out.println(ponebook[i].getName() + " ," + ponebook[i].getPoneNumber());
					isFind = true;
					break;
				}
			}
		}
		if (isFind == false) {
			System.out.println("해당 이름은 존재하지 않습니다.");
		}
	}
} // end of class
