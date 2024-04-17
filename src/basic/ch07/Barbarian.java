package basic.ch07;

public class Barbarian {

	String name;
	String weapon;
	String mode;
	String skill;
	int act;
	int demege;
	int depence;
	int level;
	
	public void weapone() {
		System.out.println(weapon + "장비를 장착했습니다.");
	}
	public void info() {
		System.out.println("----상태창----");
		System.out.println("닉네임 : " + name);
		System.out.println("LV : " + level);
		System.out.println("난이도 : " + mode);
		System.out.println("단계 : " + act);
		System.out.println("공격력 : " + demege);
		System.out.println("방어력 : " + depence);
	}
	public void skill() {
		System.out.println(skill + " 스킬만 사용할 줄 압니다.");
	}
	public void bug() {
		System.out.println(name + " (이)가 " + skill + "을 사용했지만 아무 일도 없었습니다.");
	}
	
	
}
