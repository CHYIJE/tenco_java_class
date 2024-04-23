package basic.ch18;

public class Computer {
	String name;
	int price;
	Cpu cpu;
	
	public Computer() {
		cpu = new Cpu();
	}
	public void computerStart() {
		System.out.println("컴퓨터를 부팅합니다.");
		cpu.start();
	}
	public void computerStop() {
		cpu.stop();
		System.out.println("컴퓨터를 끕니다.");
	}
	
	
	
}
