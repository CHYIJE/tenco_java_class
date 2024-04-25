package basic.starcraft.ver05;

public class Zergling extends Unit implements GrounAttack {

	public Zergling(String name) {
		super(name);
		super.name = name;
		super.power = 3;
		super.hp = 50;
	}

	@Override
	public void beAttacked() {
		if (hp <= 0) {
			System.out.println("[" + this.name + "] 이(가) 터졌습니다.");
			hp = 0;
			return;
		}
		hp -= power;
	}

	@Override
	public void attack() {
		System.out.println(this.name + " 이 " + getName() + "을 공격합니다.");
		beAttacked(this.power);
	}

	public void airattack() {
		System.out.println("공중몹은 공격을 못합니다.");
	}

}
