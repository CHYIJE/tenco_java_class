package Io.file.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {

	public static void main(String[] args) {
		// 기반 스트림 + 보조스트림을 활용해서 파일 복사 기능을 만들고
		// 소요 시간을 측정하시오.
		// 파일 경로 (복사할 대상)
		String sourceFilePath = "C:\\Users\\KDP\\Documents\\Lightshot\\a.zip";
		// 목적지 파일
		String destinationFilePath = "copy1.zip";

		// 소요시간 확인
		long startTime = System.nanoTime();

		try (FileInputStream in = new FileInputStream(sourceFilePath);
				FileOutputStream out = new FileOutputStream(destinationFilePath);

				BufferedInputStream buIn = new BufferedInputStream(in);
				BufferedOutputStream buOut = new BufferedOutputStream(out);) {

			int data;
			while ((data = buIn.read()) != -1) {
				// 파일에 출력
				buOut.write(data);
			}
			buOut.flush();

		} catch (Exception e) {
		}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("복사의 소요시간은 : " + duration);

		// 소요 시간을 초 단위로 변환 --> 포맷팅
		double seconds = duration / 1_000_000_000.0;
		// String 클래스에 format 메서드 사용해보기
		String resultFormat = String.format("소요시간은 : %.6f초 입니다. ", seconds);
		// % 는 포맷 지정자의 시작
		// f 지정자는 float, double 유형의 변수를 인자로 받아 처리하겠다.

		System.out.println(resultFormat);

	} // end of main

} // end of class
