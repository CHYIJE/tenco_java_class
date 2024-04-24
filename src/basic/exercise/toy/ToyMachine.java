package basic.exercise.toy;

// 클래스 - 인형 뽑기
// 상품들이 존재 가능
// 사자인형, 곰인형, 에어팟
// 요구 조건
// 배열을 활용해서 객체들을 담아 주세요.
public class ToyMachine {

	int productCount;
	final int MAX_PRODUCT = 10;
	Product[] products = new Product[MAX_PRODUCT];

	Lion lion = new Lion();
	Bear bear = new Bear();
	Ipot ipot = new Ipot();

	// 기능
	public void inputProduct() {
		for (int i = 0; i < products.length; i++) {
			if (i == 0) {
				products[0] = ipot;
			} else if (i <= 4) {
				products[i] = bear;
			} else {
				products[i] = lion;
			}
		}
	}

}
