package basic.starcraft.ver04;

/**
 * public protected -- 상속관계 설정할 수 있다. default private
 */
public class Unit {

	protected String name;
	protected int power;
	protected int hp;

	public Unit(String name) {
		this.name = name;
		this.power = power;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void showInfo() {
		System.out.println("=== 상태창 ===");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}

	// 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		// 방어적 코드 작성
		// 80 - 75 == 5
		// 5 - 75 == -70
		if (hp <= 0) {
			System.out.println("[" + this.name + "] 이(가) 터졌습니다.");
			hp = 0;
			return;
		}
		hp -= power;
	}
	
	// 다형성으로
	public void attack(Unit zl) {
		System.out.println(this.name + " 이 " + zl.getName() + "을 공격합니다.");
		zl.beAttacked(this.power);
	}

}
