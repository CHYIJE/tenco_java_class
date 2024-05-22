package Io.file.ch08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyDataStream {

	public static void main(String[] args) {

		// 데이터 쓰기 - 바이트, 문자 기반이 아닌 기본 자료형 데이터 타입으로 보내기
		// 파일에 사용 -> FileOutputStream("대상 파일 이름") <--- 확장 (보조 스트림)
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.txt"))) {
			dos.writeInt(13548867); // 학번
			dos.writeUTF("이성계"); // 이름
			dos.writeDouble(3.6); // 학점   
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(">>> 데이터 쓰기 완료 (원시타입) <<<");
		
		// 기본 데이터 타입으로 데이터 읽기 
		try (DataInputStream dis = new DataInputStream(new FileInputStream("student.txt"))) {
			int id = dis.readInt();
			String name = dis.readUTF();
			double score = dis.readDouble();
			
			System.out.println("학번 : " + id);
			System.out.println("이름 : " + name);
			System.out.println("학점 : " + score);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(">>> 데이터 일기 완료(기본 데이터 타입) <<<");
	} // end of main

} // end of class
