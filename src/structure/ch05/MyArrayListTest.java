package structure.ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import basic.ch22.Student;

public class MyArrayListTest {

	// 메인 쓰레드
	public static void main(String[] args) {

		List mList; // 리스트 인터페이스 계열

		// ArrayList 클래스의 인스턴스화 처리
		ArrayList list = new ArrayList();
		// 제네릭은 추후 더 설명
		// 제네릭은 타입의 명시화이다.
		ArrayList<Integer> nums = new ArrayList<Integer>();
		// 변수의 선언과 동시에 초기화 ---> 값이 들어가 있는 상태인가?
		// 값을 동시에 추가 하고 싶다면
		ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<String> vocabulary = new ArrayList<String>();
		ArrayList<Student> members = new ArrayList<>();

		// 클래스의 정의된 기능을 알아봐야 한다.
		// 값 추가 방법
		list.add(3);
		list.add(null);
		list.add(1, 10); // index 1 위치에 요소(element) 10을 삽입, 기존 요소 있었다면 뒤로 자동 이동
		System.out.println("값 추가 확인 : " + list);
		Student student = new Student("박박사");
		// 보면 주소값이 나온다 즉 toString으로 오버라이딩 되어 있다.
		System.out.println(student);

		// 값 삭제
		list.remove(2);
		System.out.println("값 삭제 확인 : " + list);

		// 전체 삭제
//		list.clear();
		System.out.println("전체 삭제 확인 " + list);

		// 리스트 사이즈 확인 (요소의 갯수, 사이즈 개념)
		System.out.println(list.size());

		// 하나의 요소를 꺼내는 방법
		try {
			System.out.println(list.get(0)); // 꺼내는 방법 리스트 전체 삭제해서 널포인트 인셉션 예외처리

		} catch (Exception e) {
			System.out.println("프로그램이 종료 되지 않게 처리");
		}

		// ArrayList와 반복문에 활용
		nums = list; // 복사 개념 필!!!! 얕은 복사 개념!!
		System.out.println(list);
		System.out.println("------------------");

		list.add(1000); // 추가 기능
		System.out.println(nums);

//		for (Integer i : list) {} <-- list는 컴파일 시점에 Object 타입으로 인식
		for (Integer i : nums) {
			System.out.println("i : " + i);
		}
		
		// ArrayList 안에 값이 포함되어 있는가 확인
		// contatins 메서드 사용
		System.out.println("3이 nums 리스트에 존재하는가? --> " + nums.contains(3));
		System.out.println("500이 nums 리스트에 존재하는가? --> " + nums.contains(500));
		
		// 요소의 위치(index) 확인
		// 중복된 값이 있다면 앞에 있는 인덱스값이 출력된다. 중복이 허용되기 때문이다.
		// [1] [3] [3] -> 인덱스 번호 1이 추력된다. 
		System.out.println("요소 3이 몇 번째 index에 위치하니? -> " + nums.indexOf(3));
		System.out.println("요소 10이 몇 번째 index에 위치하니? -> " + nums.indexOf(10));
		System.out.println("요소 3이 몇 번째 index에 위치하니? -> " + nums.indexOf(500));
		
		// Iterator 요소 순회(반복자)
		Iterator<Integer> iter = nums.iterator();
		while(iter.hasNext()) {
			System.out.println("while 을 활용하는 방법 : " + iter.next());
		}
		
		// 배열, ArrayList 사용해야 할 때를 알자
		// 편한 ArrayList가 있는데 
		// 배열을 구성할 필요가 있는가? 
		// 배열은 크기가 고정되어 있고 빠른 검색에 유리하다.
		
	} // end of main

} // end of class
