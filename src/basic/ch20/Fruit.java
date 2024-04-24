package basic.ch20;

public class Fruit {
	String name;
	int price;

	// 바나나와 복숭아의 공통 기능인 정보확인
	public void showInfo() {
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
	}

}
