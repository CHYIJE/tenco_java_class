package Io.file.ch05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CityInfoApp2 {

	public static void main(String[] args) {

		System.out.println("도시 이름을 입력하세요. (예 : Seoul, NewYork)");

		try (Scanner scanner = new Scanner(System.in)) {

			String city = scanner.nextLine();
			String fileName = city + ".txt";

			// 1. FileReader 단점 보완 코드 
			try (
					// 데코레이터 기반 
					FileInputStream fis = new FileInputStream(fileName);
					InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
					BufferedReader br = new BufferedReader(isr)){
				
				System.out.println(city + " 에 대한 정보 : ");
				String line;
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
				
			} catch (Exception e) {
				System.out.println("해당 파일을 찾을 수 없습니다.");
			}


		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end of main
}
