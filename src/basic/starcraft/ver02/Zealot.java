package basic.starcraft.ver02;

public class Zealot {

	private String name;
	private int power;
	private int hp;

	public Zealot(String name) {
		this.name = name;
		power = 5;
		hp = 80;
	}

	// getter
	public String getName() {
		return name;
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
	
	
	
	// 질럿이 저글링을 공격합니다.
	public void attack(Zergling z) {
		System.out.println(this.name + " 이 " + z.getName() + "을 공격합니다.");
		z.beAttacked(this.power);
	}
	// 질럿이 마린을 공격합니다.
	public void attack(Marine m) {
		System.out.println(this.name + "이" + m.getName() + "을 공격합니다.");
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
		if(hp <= 0) {
			System.out.println( "[" + this.name + "] 이(가) 아이어로 돌아갔습니다.");
			hp = 0;
			return;
		}
		hp -= power;
	}
}
