package basic.ch09;

public class Magician {
	String name;
	int demege;
	int depense;
	int heal;
	
	public Magician(String nick, int del, int cut, int strong) {
		name = nick;
		demege = del;
		depense = cut;
		heal = strong;
	}
	
	
	public void hit (int demege) {
		heal -= demege;
	}
	
	public void depence(int block) {
		demege -= block;
	}
	public void hert(int holymoly) {
		heal -= demege;
	}
	
	public void showInfo() {
		System.out.println("법사 이름 : " + name);
		System.out.println("법사 공격력 : " + demege);
		System.out.println("법사 방어력 : " + depense);
		System.out.println("법사 체통 : " + heal);
	}
	
} // end of class

