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
				// 5 > 1 참
			if (gameNumber1 > gameNumber2) {
				// 0 <-- 5
				box = gameNumber1;
				// 0 = 5 | 5 <-- 5
				gameNumber1 = gameNumber2;
				// 5 = 1 | 5 <-- 1
				gameNumber2 = box;
			}
				//	5 > 9  삐빅 거짓 넘겨
			if (gameNumber2 > gameNumber3) {
				box = gameNumber2;
				gameNumber2 = gameNumber3;
				gameNumber3 = box;
			}
			 // 9 > 7 참 
			if (gameNumber3 > gameNumber4) {
				// 0 <-- 9  
				box = gameNumber3;
				// 9 = 7 | 9 <-- 7
				gameNumber3 = gameNumber4;
				// 7 = 9 | 7 <-- 9 
				gameNumber4 = box;
			}
			// 9 > 2 참
			if (gameNumber4 > gameNumber5) {
				// 0 <-- 9 
				box = gameNumber4;
				// 9 = 2 | 9 <-- 2
				gameNumber4 = gameNumber5;
				// 2 = 9 | 2 <-- 9
				gameNumber5 = box;
			}
				// 9 > 3 참
			if (gameNumber5 > gameNumber6) {
				// 0 <-- 9 
				box = gameNumber5;
				// 9 = 3 | 9 <-- 3
				gameNumber5 = gameNumber6;
				// 3 = 9  | 3 <-- 9  
				gameNumber6 = box;
			}
		}
		
		// 거짓이 되도록 계속 반복해서 수를 정렬한다.

		///////////////////////////////////////////////////////

		

		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");

	}

}
