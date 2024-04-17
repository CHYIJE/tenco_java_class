package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {

	public static void main(String[] args) {

		// 만들어진 설계된 클레스를 가지고 본인이 의도한 대로 실행에 흐름을 만들어 보자

		// 스캐너를 활용해서 1번을 누르면 버스를 태워서 실해의 흐름을 만들고
		// 2번을 누르면 지하철을 태우는 실행의 흐름을 만들어 봅시다.
		Scanner sc = new Scanner(System.in);
		Bus bus1 = new Bus(100); // 선언만 했음
		Bus bus2 = new Bus(200); // 선언만 했음
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Student s1 = new Student("황정민", 100_000);
		Student s2 = new Student("최민식", 100_000);

		// 만약 1, 2번 어떻게
		while (true) {
			System.out.print("1.버스, 2.지하철, 3.돈 없을 때");
			int select = sc.nextInt();
			if (select == 1) {
				s1.takeBus(bus1);
				s1.showInfo();
				bus1.showInfo();
				bus1.take(1500);
				return;
			} else if (select == 2) {
				s2.takeBus(bus2);
				s2.showInfo();
				return;
			} else if (select == 3) {
				System.out.println("그냥 타지마라");
				break;
			}
		}
	} // end of main

} // end of class
