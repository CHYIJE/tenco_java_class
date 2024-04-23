package basic.ch17;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		super(name, hp);
	}

	@Override
	void attack() {
		System.out.println("전사가 기본공격을 합니다.");
	}

	void comboAttack() {
		System.out.println("전사가 이중타격을 시전합니다.");
	}

}
