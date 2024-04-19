package basic.ch12;

public class CardNumberPrinterMain {

	public static void main(String[] args) {
		CardNumberPrinter CNP1 = new CardNumberPrinter(1);
		CardNumberPrinter CNP2 = new CardNumberPrinter(2);
		CardNumberPrinter CNP3 = new CardNumberPrinter(3);
		
		CNP1.printCardNumber();
		CNP2.printCardNumber();
		CNP2.printCardNumber();
		CNP3.printCardNumber();
		CNP2.printCardNumber();
		CNP1.printCardNumber();
		CNP1.printCardNumber();
		CNP3.printCardNumber();
	}

}
