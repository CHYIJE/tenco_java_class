package basic.ch18;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer1 = new Computer();
		computer1.getCpu().name = "i5 8400";
		computer1.getCpu().price = 50000;
		
		computer1.computerStart();
		computer1.computerStop();
		System.out.println(computer1.getCpu().price + "원 짜리 " + computer1.getCpu().name + "를 바꾸시는걸 추천드립니다.");
	}

}
