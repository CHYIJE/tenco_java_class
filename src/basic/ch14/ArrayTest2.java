package basic.ch14;

public class ArrayTest2 {

	public static void main(String[] args) {

			String[] names = new String[5];  // 5칸 짜리 메모리 공간 할당
			
			// 생성 - Create
			names[0] = "고씨"; 
			names[1] = "박씨"; 
			names[2] = "김씨"; 
//			names[3] = null; 
//			names[4] = null; 
			
			// 조회 - 
			System.out.println(names);
			System.out.println(names[0]);
			System.out.println(names[1]);
			System.out.println(names[2]);
			System.out.println(names[3]);
			System.out.println(names[4]);
		//	System.out.println(names[5]);
						
			// 수정 - Update
			names[0] = "Mr. Go";
			names[1] = "Mr. Park";
			names[2] = "Mr. Kim";
			
			// 삭제 - Delete
			names[0] = null;
			names[1] = null;
			names[2] = null;
			// 자바에서 null값은 할당 되지 않은 상태를 의미합니다.
			// Object 타입에서 사용 가능 
			
			// 1단계
			// 배열의 길이와 인덱스 길이에 대한 이해 --> 인덱스의 길이는 n - 1 이다.
			System.out.println("배열의 크기 : " + names.length);
			System.out.println("인덱스의 크기(n - 1) : " + (names.length - 1));
			
			// 문제 2 
			// 배열의 크기가 50개이면 인덱스의 길이는 얼마인가 -> 49
			// 배열의 크기가 100개이면 인덱스의 길이는 얼마인가 -> 99
			// 배열의 크기가 375개이면 인덱스의 길이는 얼마인가 -> 374
			
			
			
			
	} // end of main

} // end of class
