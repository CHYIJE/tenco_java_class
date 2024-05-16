package Io.file.ch02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class MyBufferedOutputStream {
// buffer를 쓰는 이유는 일일히 i/o 작업을 하기에는 너무 느리다 
	public static void main(String[] args) {
		
		// 현재 시간 (시점)
		long start = System.nanoTime(); // 더 정미한 현재 시간을 출력
		
		String data = "기반 스트림 + 보조 스트림을 활용해보자";

		// try-catch-resource 활용
		try (FileOutputStream fos = new FileOutputStream("output2.txt");
				// 데이터를 쓰는 것 : 기반 fos , 기반에 보조를 붙인것 bos
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			// 코드 수행부분
			byte[] bytes = data.getBytes();

			// 보조 스트림 (버퍼)
			bos.write(bytes);

			// 응용프로그램(자바)에 있는 자료를 버퍼에 다쓰고 버퍼에 있는 자료를 한번에 file로 넘김
			// ** 간혹 버퍼에 데이터가 남아 있다면 중복된 데이터를 쓸 수 있다.
			// ** 한번 사용한 다음에 flush를 사용해야한다. (비움)
			bos.flush(); // flush --> 물을 내리다.

			System.out.println("보조 스트림을 활용한 파일 출력 완료");
			// 시간 측정을 해보고 싶다.
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 현재 시간 (종료)
		long end = System.nanoTime();
		// 종료 - 시작 -> 소요시간
		long duration = end - start;
		System.out.println("소요시간 : " + duration);
		// 나노초는 10억 분에 1 -> 0.000498799초 
		
	} // end of main

} // end of class
