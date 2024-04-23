package basic.starcraft.ver02;

public class Hatchery {
	private int hatcheryNumber;
	private int count;
	
	// 생성자로 해처리 너버를 넣는다
	public Hatchery (int hatcheryNumber) {
		this.hatcheryNumber = hatcheryNumber; 
	}
	
	// 해처리의 카운트를 get
	public int getCount() {
		return count;
	}
	
	// 해처리의 넘버를 get
	public int getHatcheryNumber() {
		return hatcheryNumber;
	}
	
	// 기능 저글링 생산
	public Zergling createZergling(String name) {
		return new Zergling(name);
	}
		
	
}
