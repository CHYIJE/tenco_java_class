package Io;

import java.io.IOException;

public class MySystemin2 {

	public static void main(String[] args) {

		// 키보드에서 데이터를 응용 프로글매 안으로 넣기
		System.out.println("알파벳 하나를 쓰고 Enter를 누르세요");

		// 바이트 동작 --> 0과1로 구성
		// 정수 -> byte, short, int, long

		int i;
		// 한 바이트씩 키보드에 값을 받아 읽어라

		try {
			// 100 != 13 --> true
			while ((i = System.in.read()) != '\n') {
				System.out.println("i : " + i);
				System.out.println("(char)i : " + (char) i);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end of main

} // end of class
