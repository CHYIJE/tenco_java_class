package basic.exercise.toy;

import java.util.Random;
import java.util.Scanner;

public class ToyMachineTest {

	public static void main(String[] args) {
		ToyMachine machine = new ToyMachine();
		int select;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		machine.inputProduct();

		System.out.println("인형뽑기를 시작합니다.");
		System.out.println("1.뽑기 2.종료");
		while (flag) {
			select = sc.nextInt();
			if (select == 1) {
				System.out.println("코인을 몇개 넣으시겠습니까? (1당 1회)");
				int c = sc.nextInt();
				while (c > 0) {
					System.out.println(c + "번 뽑을 수 있습니다. 계속 하시겠습니까?");
					System.out.println("1. 계속 2. 그만");
					int c1 = sc.nextInt();
					if (c1 == 1) {
						int a = r.nextInt(10);
						machine.products[a].showInfo();
						c -= 1;
					} else if (c1 == 2) {
						System.out.println("기회를 포기합니다.");
						System.out.println("인형 뽑기를 종료합니다.");
						return;
					} else {
						System.out.println("잘못된 선택");
					}
				}
			} else if (select == 2) {
				System.out.println("종료합니다.");
				flag = false;
			} else {
				System.out.println("잘못된 선택");
			}
		}

	}

}
