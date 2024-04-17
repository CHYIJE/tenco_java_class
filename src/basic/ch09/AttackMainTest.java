package basic.ch09;

public class AttackMainTest {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("halbea", 5, 2, 15);
		Magician m1 = new Magician("lize", 6, 1, 8);
		w1.showInfo();
		System.out.println("==============");
		m1.showInfo();
		w1.hit(0);
		
	}

}
