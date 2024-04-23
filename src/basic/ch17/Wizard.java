package basic.ch17;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp); // 부모 생성자 호출
	}

	@Override
	void attack() {
		System.out.println(name + "가 기본공격을 했습니다.");
	}

	void fresszing() {
		System.out.println(name + "가 얼리기를 시전했습니다.");
	}

}
