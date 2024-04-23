package basic.starcraft.ver02;

public class Zergling {
	private String name;
	private int power;
	private int hp;

	// get, set - 단축키
	// alt + shift + s
	
	public Zergling(String name) {
		this.name = name;
		power = 3;
		hp = 50;
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
	
	// 저글링이 질럿을 공격합니다. attackZealot
	public void attack(Zealot zl) {
		System.out.println(this.name + " 이 " + zl.getName() + "을 공격합니다.");
		zl.beAttacked(this.power);
	}
	// 저글링이 마린을 공격합니다. attackMarine
	public void attack(Marine m) {
		System.out.println(this.name + " 이 " + m.getName() + "을 공격합니다.");
		m.beAttacked(this.power);
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
}
