package basic.exercise.toy;

import java.util.Random;
import java.util.Scanner;

public class ToyMachineTest {

	public static void main(String[] args) {
		ToyMachine machine = new ToyMachine();
		int select;
		boolean flag = true;
		boolean flag2 = true;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		machine.inputProduct();

		System.out.println("인형뽑기를 시작합니다.");
		System.out.println("1.뽑기 2.종료");
		while (flag) {
			select = sc.nextInt();
			if (select == 1) {
				System.out.println("몇번 뽑으시겠습니까?");
				int chance;
				chance = sc.nextInt();
				int a = r.nextInt(10);
				machine.products[a].showInfo();
				chance -= 1;
				if (chance == 1) {
					System.out.println(chance + "만큼 기회가 남았습니다. 계속 하시겠습니까?");
					System.out.println("1. 계속 2. 그만");
					machine.products[a].showInfo();
				} else if (chance == 2) {
					break;

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
