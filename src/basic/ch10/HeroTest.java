package basic.ch10;

public class HeroTest {

	public static void main(String[] args) {
		String name;
		int hp;
		int power;
		double defense;
		boolean isDie;
		Hero hero1 = new Hero();
		
		hero1.setName("아이언맨");
		name = hero1.getName();
		System.out.println("영웅의 이름 : " + name);
		
		hero1.setHp(0);
		hp = hero1.getHp();
		System.out.println("체통 : " + hp);
		
		hero1.setPower(50);
		power = hero1.getPower();
		System.out.println("공격력 : " + power);
		
		hero1.setDefense(20);
		defense = hero1.getDefense();
		System.out.println("방어력 : " + defense);
		
		hero1.setIsDie(true);
		if(hp <= 0) {
			System.out.println("생존 여부 : 아임 아이언맨");	
		}else {
		System.out.println("생존 여부 : 생존");
		}
	}

}
