package basic.ch12;

public class CardNumberPrinter {
	private int cardkey;
	private int newperson;
	
	private int cardNumber;
	
	
	public CardNumberPrinter (int cardNum) {
		this.cardkey = cardNum;
		cardNumber = 486; 
	}
	
		
	};
	
	// 고객 유치
	
	// 이건 근데 번호표랑 똑같은데? 
	public void printCardNumber() {
		System.out.println(cardkey + "의 발급된 카드 번호 : " + cardNumber);
		cardNumber++;
	}
}
