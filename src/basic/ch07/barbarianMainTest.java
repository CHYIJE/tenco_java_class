package basic.ch07;

import java.util.Scanner;

public class barbarianMainTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
//		System.out.println(sc + "캐릭터를 선택해주세요");
		
		Barbarian baba1 = new Barbarian();
		baba1.weapon = "sword";
		baba1.name = "an";
		baba1.mode = "nightmare";
		baba1.act = 3;
		baba1.demege = 20;
		baba1.depence = 10;
		baba1.level = 45;
		baba1.skill = "휠윈드";
		baba1.info();
		baba1.weapone();
		baba1.skill();
		System.out.println("====================");
		
		
		Barbarian baba2 = new Barbarian();
		baba2.weapon = "throw_axe";
		baba2.name = "hal";
		baba2.mode = "hell";
		baba2.act = 5;
		baba2.demege = 115;
		baba2.depence = 50;
		baba2.level = 85;
		baba2.skill = "프렌지";
		baba2.info();
		baba2.weapone();
		baba2.skill();
		baba2.bug();
		System.out.println("====================");
	}

}
