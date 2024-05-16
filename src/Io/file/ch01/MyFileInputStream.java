package Io.file.ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileInputStream {

	public static void main(String[] args) {
		
		// 외부에 있는 파일 데이터를 읽을려면 input
		// 스트림이라는 도구를 준비함
		FileInputStream in = null;
		
		// 대상 경로를 지정   예외지정
		try {
			in = new FileInputStream("a.txt");
			
			// 예외처리를 따로따로 분리
			
			// 1단계 
//			int readData = in.read();
			
			// 2단계
//			System.out.println((char)in.read());
//			System.out.println((char)in.read());
//			System.out.println((char)in.read());
			
			// 3단계
			// 읽을 데이터가 더이상 없다면 -1을 반환한다.
			int readData;
			while((readData = in.read()) != -1) {
				System.out.print((char)readData);
			}
			
			// 4단계 FileInputStream(기반 스트림) 대상에 접근해서 한 바이트씩 읽어 들이는 기능을 가진다.
			// 1byte -> 127 -128  : a --> 97, A --> 65, 한글은 --> 대(정수값 얼마야?) -->
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // end of main

} // end of class
