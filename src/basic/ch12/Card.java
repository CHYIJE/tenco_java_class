package basic.ch12;

public class Card {

	// 멤버 변수, static 변수
	private static int f_CardNum = 1000;
	private static int s_CardNum = 1000;
	private static int t_CardNum = 1000;
	private int f_CardNumber;
	private int s_CardNumber;
	private int t_CardNumber;
	private String cardName;

	// 생성자
	public Card(String cardName) {
		System.out.println(cardName + "가 발급되었습니다.");
		f_CardNumber = f_CardNum++;
		s_CardNumber = s_CardNum++;
		t_CardNumber = t_CardNum++;
	}
	// 멤버 함수

	public void cardNumber() {
		System.out.println("카드번호는 " + f_CardNumber + "-" + s_CardNumber + "-" + t_CardNumber);
	}

	// get, set 작성

	public int getF_CardNumber() {
		return f_CardNumber;
	}

	public void setF_CardNumber(int f_CardNumber) {
		this.f_CardNumber = f_CardNumber;
	}

	public int getS_CardNumber() {
		return s_CardNumber;
	}

	public void setS_CardNumber(int s_CardNumber) {
		this.s_CardNumber = s_CardNumber;
	}

	public int getT_CardNumber() {
		return t_CardNumber;
	}

	public void setT_CardNumber(int t_CardNumber) {
		this.t_CardNumber = t_CardNumber;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	// 코드 테스트(메인함수)
	public static void main(String[] args) {
		Card card1 = new Card("신한카드");
		card1.cardNumber();

		System.out.println("-----------------------");
		Card card2 = new Card("신한카드");
		card2.cardNumber();

		System.out.println("-----------------------");
		Card card3 = new Card("신한카드");
		card3.cardNumber();
	}

}