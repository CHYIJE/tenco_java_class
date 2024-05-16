package Io.file.ch01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MyBufferedInputStream {

	public static void main(String[] args) {

		// 보조 스트림에 사용 -> 기반 스트림이 필욯다.
		FileInputStream fin = null;
		BufferedInputStream bfin = null;

		try {
			// 기반 스트림
			fin = new FileInputStream("a.txt");

			// 보조 스트림 (기반 스트림)
			// 한번 읽을 때 담아서 한꺼번에 넘기는 것 속도가 빠르다
			// 읽는것이지 기능의 확장은 없다.
			bfin = new BufferedInputStream(fin);

			int data;

			while ((data = bfin.read()) != -1) {
				System.out.print((char) data);
			}

		} catch (Exception e) {
			// 메모리의 누수가 발생할 수 있다.
			// 자원을 정리하려면 열었던 자원의 순서를 반대로 닫아 주면 된다.
			// 리소스 자원 정리
			// 다른게 될 수 있기에 조건을 건다.
			if (bfin != null) {
				try {
					bfin.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		}

	} // end of main

} // end of class
