package basic.ch20;

public class AnimalTset {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.move();
		animal.eating();
		System.out.println("----------");
		
		// 타이거는 애니멀이라는 데이터 타입으로 바라볼수 있다.
		Animal 주소2 = new Tiger();
		주소2.move();
		주소2.eating();
		System.out.println("----------");
		
		Animal 주소3 = new Human();
		주소3.move();
		주소3.eating();
		// 컴파일러는 애니멀이라는 데이터 타입만 알기 때문에 readBooks는 오류가 발생한다.
		// 주소3.readBooks();
		
		// 그렇다면 어떻게 해야 쓸 수 있을까?
		// 명시적 형변환과 비슷
		//int n1 = (int)10.5;
		// 다운 캐스팅
		((Human)주소3).readBooks();
		System.out.println("--------------");
		
		
		
	} // end of main
	
} // end of class
