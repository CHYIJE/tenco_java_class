package basic.ch13;

public class LottoGame3 {

	public static void main(String[] args) {
		// static 변수 -> 클래스 변수라고도 불린다.

		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		// 전체 1~6 까지 나온 결과값을 오름 차순으로 정렬
		// 단 중복 값 제외

		// 수식을 작성해 주세요
		// 만약 if --> 반복문 사용 금지 if문 6개로 구성해주세요.
		int box = 0;
		
		// 테스트 값 : 5 1 9 7 2 3
		// 반복의 횟수 : 6
		for (int pass = 1; pass <= 6; pass++) {
			if (gameNumber1 > gameNumber2) {
				box = gameNumber1;
				gameNumber1 = gameNumber2;
				gameNumber2 = box;
			}
			if (gameNumber2 > gameNumber3) {
				box = gameNumber2;
				gameNumber2 = gameNumber3;
				gameNumber3 = box;
			}
			if (gameNumber3 > gameNumber4) {
				box = gameNumber3;
				gameNumber3 = gameNumber4;
				gameNumber4 = box;
			}
			if (gameNumber4 > gameNumber5) {
				box = gameNumber4;
				gameNumber4 = gameNumber5;
				gameNumber5 = box;
			}
			if (gameNumber5 > gameNumber6) {
				box = gameNumber5;
				gameNumber5 = gameNumber6;
				gameNumber6 = box;
			}
		}

		///////////////////////////////////////////////////////

		

		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");

	}

}
