package basic.ch02;

public class Discount {

	public static void main(String[] args) {
		// 상수 선언 - 원가, 할인율
		final double PRODUCT = 59.99;
		final double DISCOUNTPERCENT = 0.3;
		
		// 할인된 가격 계산하기 (비지니스 로직)
		double discount = PRODUCT * DISCOUNTPERCENT;
		System.out.println("본 제품에서 할인 될 금액은 : " +discount);
		double real = PRODUCT - discount;
		// 최종된 가격을 정수형으로 형 변환 처리
		// 결과 출력
		System.out.println("본 제품의 할인된 가격은 : " + (int)real);
		
		
	}

}
