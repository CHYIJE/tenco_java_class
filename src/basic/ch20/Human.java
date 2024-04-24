package basic.ch20;

public class Human extends Animal {
	// 하나의 클래스를 휴먼으로도 동물로도 볼 수 잇는 다형성이 형성되었다.
	
	
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	@Override
	public void eating() {
		System.out.println("밥을 먹습니다.");
	}
	
	public void readBooks() {
		System.out.println("책을 읽습니다.");
	}
	

} // end of class
