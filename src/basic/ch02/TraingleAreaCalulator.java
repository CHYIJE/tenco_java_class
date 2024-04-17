package basic.ch02;

public class TraingleAreaCalulator {

	public static void main(String[] args) {
		// 삼각형의 밑변 BASE, 단 상수로 선언
		final double BASE = 50.0;
		// 삼각형의 높이 HGIGHT, 단 상수로 선언
		final double HGIGHT = 70.0;
		// 결과 값을 area 변수에 저장
		double area = (BASE * HGIGHT) / 2;
		// 결과 출력하기
		System.out.println(" 삼각형의 면적 : " + area );
	}

}
