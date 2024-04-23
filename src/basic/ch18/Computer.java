package basic.ch18;

public class Computer {
	private String name;
	private int price;
	private Cpu cpu;
	
	public Computer() {
		cpu = new Cpu();  // 컴포지션 관계
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Cpu getCpu() {
		return cpu;
	}


	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}


	void computerStart() {
		System.out.println("컴퓨터를 부팅합니다.");
		cpu.start();
	}
	void computerStop() {
		cpu.stop();
		System.out.println("컴퓨터를 끕니다.");
	}
	
	
	
}
