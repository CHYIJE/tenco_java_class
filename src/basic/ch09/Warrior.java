package basic.ch09;

public class Warrior {
	String name;
	int demege;
	int depense;
	int heal;
	
	public Warrior(String nick, int del, int cut, int strong) {
		name = nick;
		demege = del;
		depense = cut;
		heal = strong;
	}
	
	public void hit (int demege) {
		--demege;
	}
	
	
	
	public void showInfo() {
		System.out.println("전사 이름 : " + name);
		System.out.println("전사 공격력 : " + demege);
		System.out.println("전사 방어력 : " + depense);
		System.out.println("전사 체통 : " + heal);
	}
	
} // end of class
