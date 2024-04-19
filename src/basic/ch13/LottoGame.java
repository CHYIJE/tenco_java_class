package basic.ch13;

public class LottoGame {
	
	public static void main(String[] args) {
		// static 변수 -> 클래스 변수라고도 불린다.
		
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
//		int gameNumber3 = LottoNumberMaker.makeNumber();
//		int gameNumber4 = LottoNumberMaker.makeNumber();
//		int gameNumber5 = LottoNumberMaker.makeNumber();
//		int gameNumber6 = LottoNumberMaker.makeNumber();
		
		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
//		System.out.print(gameNumber3 + "\t");
//		System.out.print(gameNumber4 + "\t");
//		System.out.print(gameNumber5 + "\t");
//		System.out.print(gameNumber6 + "\t");
		
		// 도전! 오름차순으로 정렬해보기
		// 만약 1싱자 2상자보다 크다면 어떤 행동을 해라
		
		// 예상 1box = 5, 2box = 3
		int tempBox = 0;
		if(gameNumber1 > gameNumber2) {
			// 0  =  3 --> temp == 3
			tempBox = gameNumber1;
			// 0  =  5 --> temp == 5			
			gameNumber1 = gameNumber2;
			// 3
			gameNumber2 = tempBox;
			// 5
		}
		// 정렬 --> 3, 5
		System.out.println("----------");
		System.out.println(gameNumber1);
		System.out.println(gameNumber2);
		
		
	}
	
}
