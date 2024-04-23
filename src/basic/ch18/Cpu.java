package basic.ch18;

public class Cpu {
	
	String name;
	int price;
	
	void start () {
		System.out.println(name + " 가 연산을 시작합니다.");
	}
	
	void stop() {
		System.out.println(name + " 가 이제 그만 죽여달라고 화내며 꺼집니다.");
	}
}
