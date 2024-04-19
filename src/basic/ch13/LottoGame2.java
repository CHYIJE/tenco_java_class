package basic.ch13;

public class LottoGame2 {

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
		// 5 1 9 7 2 3
		
		// 5 > 1
		if (gameNumber1 > gameNumber2) {
			// 5
			box = gameNumber1;
			// 1 <- 1
			gameNumber1 = gameNumber2;
			// 1 <-- 5
			gameNumber2 = box;
		}
		// 1 5 9 7 2 3
		
		
		// 5   >  9
		if (gameNumber2 > gameNumber3) {
			box = gameNumber2;
			gameNumber2 = gameNumber3;
			gameNumber3 = box;
		}

		// 1 5 9 7 2 3
		
		// 9  >  7
		if (gameNumber3 > gameNumber4) {
			// 9  <-- 9
			box = gameNumber3;
			// 7 <-- 7
			gameNumber3 = gameNumber4;
			// 9  <-- 9
			gameNumber4 = box;
		}
		
		// 1 5 7 9 2 3
		
		
		// 9   >    2
		if (gameNumber4 > gameNumber5) {
			// 9 <--  9 
			box = gameNumber4;
			// 2 <-- 2 
			gameNumber4 = gameNumber5;
			// 2 < -- 9
			gameNumber5 = box;
		}
		
		// 1 5 9 2 9 3
		
		// 9  > 3 
		if (gameNumber5 > gameNumber6) {
			// 9 <-- 9
			box = gameNumber5;
			// 3 <-- 3
			gameNumber5 = gameNumber6;
			// 9  <-- 9
			gameNumber6 = box;
		}
		///////////////////////////////////////////////////////
		
			if (gameNumber1 > gameNumber2) {
				// 5
				box = gameNumber1;
				// 1 <- 1
				gameNumber1 = gameNumber2;
				// 1 <-- 5
				gameNumber2 = box;
			}
		// 1 5 9 7 2 3
		
		// 5   >  9
			if (gameNumber2 > gameNumber3) {
				box = gameNumber2;
				gameNumber2 = gameNumber3;
				gameNumber3 = box;
			}
	
			// 1 5 9 7 2 3
			
			// 9  >  7
			if (gameNumber3 > gameNumber4) {
				// 9  <-- 9
				box = gameNumber3;
				// 7 <-- 7
				gameNumber3 = gameNumber4;
				// 9  <-- 9
				gameNumber4 = box;
			}
			
			// 1 5 7 9 2 3
			
			
			// 9   >    2
			if (gameNumber4 > gameNumber5) {
				// 9 <--  9 
				box = gameNumber4;
				// 2 <-- 2 
				gameNumber4 = gameNumber5;
				// 2 < -- 9
				gameNumber5 = box;
			}
		
		///////////////////////////////////////////
				
				if (gameNumber1 > gameNumber2) {
					// 5
					box = gameNumber1;
					// 1 <- 1
					gameNumber1 = gameNumber2;
					// 1 <-- 5
					gameNumber2 = box;
				}
			// 1 5 9 7 2 3
			
			// 5   >  9
				if (gameNumber2 > gameNumber3) {
					box = gameNumber2;
					gameNumber2 = gameNumber3;
					gameNumber3 = box;
				}
				
				if (gameNumber3 > gameNumber4) {
					// 9  <-- 9
					box = gameNumber3;
					// 7 <-- 7
					gameNumber3 = gameNumber4;
					// 9  <-- 9
					gameNumber4 = box;
				}
				///////////////////////////////
				if (gameNumber1 > gameNumber2) {
					// 5
					box = gameNumber1;
					// 1 <- 1
					gameNumber1 = gameNumber2;
					// 1 <-- 5
					gameNumber2 = box;
				}
			// 1 5 9 7 2 3
			
			// 5   >  9
				if (gameNumber2 > gameNumber3) {
					box = gameNumber2;
					gameNumber2 = gameNumber3;
					gameNumber3 = box;
				}
				
					/////////////
					if (gameNumber1 > gameNumber2) {
						// 5
						box = gameNumber1;
						// 1 <- 1
						gameNumber1 = gameNumber2;
						// 1 <-- 5
						gameNumber2 = box;
					}
								
			
		
		
		
		
		
		// 1 5 7 2 3 9

		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");

	}

}
