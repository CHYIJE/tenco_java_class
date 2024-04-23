package basic.ch17;

public class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp); // 부모 생성자 호출
	}

	@Override
	void attack() {
		System.out.println(name + "가 기본공격을 합니다.");
	}

	void fireArrow() {
		System.out.println(name + "가 불화살을 시전합니다.");
	}
}