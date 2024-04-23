package basic.starcraft.ver02;

public class Barrack {
	private int barrackNumber;
	private int count;
	
	public Barrack(int barrackNumber) {
		this.barrackNumber = barrackNumber;
	}
	
	public int getCount() {
		return count;
	}
	
	public int getBarrackNumber() {
		return this.barrackNumber;
	}
	
	// 배럭 생산
	public Marine createMarrine(String name) {
		
		return new Marine(name);
	}
}
