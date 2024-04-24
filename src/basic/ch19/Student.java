package basic.ch19;

public class Student {
	// 변수 설정
	private String name;
	private int age;
	
	// 생성자 : 이름과 나이를 받는다.
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	
	
	
} // end of class
