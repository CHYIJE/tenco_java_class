package basic.ch17;

public class HeroTest {

	public static void main(String[] args) {

		Warrior warrior1 = new Warrior("바바리안", 100);
		Archer archer1 = new Archer("아마존", 80);
		Wizard wizard1 = new Wizard("소서리스", 60);

		warrior1.attack();
		archer1.fireArrow();
	}

}
