package Io.file.ch07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyHelper {

	// 클래스를 함수기반으로 나누는 연습을 많이 하자
	// 파일 복사
	public static void copyFile(String readFilePth, String WriterFilePath) {

		try (FileReader fr = new FileReader(readFilePth);
				FileWriter fw = new FileWriter(WriterFilePath)) {

			int c;
			while ((c = fr.read()) != -1) {
				fw.write(c);
			}
			System.out.println("파일 복사 완료 : " + WriterFilePath);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 복사 중 오류 발생");
		}

	}

	// 파일 복사 - 버퍼 활용
	public static void copyFileWithBuffer(String readFilePath, String writerFilePath) {
		
		try (	// 버퍼 주 스트림은 바로 접근이 안되어 생성해줘야한다.
				BufferedReader bufferedReader = new BufferedReader(new FileReader(readFilePath));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writerFilePath))){
			
			// 버퍼를 활용하는 버퍼의 크기를 지정할 수 있다.
			char[] buffer = new char[1024];
			int numCharsRead; // 읽은 문자 수 
			
			while((numCharsRead = bufferedReader.read(buffer)) != -1) {
				// 0번째 부터 numCharsRead 까지 써라
				bufferedWriter.write(buffer, 0, numCharsRead);
				System.out.println("numCharsRead : " + numCharsRead);
			}
			System.out.println("버퍼를 사용한 파일 복사 완료 : " + writerFilePath);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("버퍼를 사용한 파일 복사 중 오류 발생");
		}
		
	}

	// 메인 함수
	public static void main(String[] args) {
		FileCopyHelper.copyFile("Seoul.txt", "copySeoul.txt");
		System.out.println("]------'------'----[");
		FileCopyHelper.copyFileWithBuffer("NewYork.txt", "copyNewYork.txt");
		
	} // end of main

} // end of class
