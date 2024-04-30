package basic.useful.ch04;

public class WarriorTest {

	public static void main(String[] args) {
		Warrior warrior1 = Warrior.getInstance();
		System.out.println(warrior1);
		
		Warrior warrior2 = Warrior.getInstance();
		System.out.println(warrior2);
	}

}
