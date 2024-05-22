package Io.file.ch08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//ObjectOut.. ObjectInput... 연습 하기 
public class MyObjectStream {

	public static void main(String[] args) {

		// 객체 직렬화
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {

			Person person = new Person("홍길동", 30);
			oos.writeObject(person);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("--------------------");

		// 객체 역직렬화
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {
			
			// 문자 기반 데이터를 일긍면 <--- 스트링 값 추출해서 코드상에 활용할 수 있도록 Object
			// 만드는 코딩을 해야한다. naem:, 10 <---
			Person person = (Person)ois.readObject(); // 다운 케스팅
			System.out.println(person);
			
		} catch (Exception e) {
			e.printStackTrace(); // 예외 처리 흐름 생성 가능
		}

	} // end of main

}
