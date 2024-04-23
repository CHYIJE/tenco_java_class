package basic.starcraft.ver02;

public class StarcraftTest1 {

	public static void main(String[] args) {
		Zealot zealot1 = new Zealot("병장 질럿");
		Zealot zealot2 = new Zealot("일병 질럿");
		
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");
		
		Marine marine1 = new Marine("병장 마린");
		Marine marine2 = new Marine("일병 마린");
		
		for(int i = 0; i < 15; i++) {
			zealot1.attack(marine2);
		}
		marine2.showInfo();
	}

}
