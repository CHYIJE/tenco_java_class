package basic.ch19;

public class ClassRoomTest {

	public static void main(String[] args) {
		
		// 메모리에 올려 실제로 쓰기 위해서 객체를 생성
		ClassRoom classroomA = new ClassRoom("C4");
		Student student1 = new Student("엄복동", 20);
		Student student2 = new Student("길복순", 25);
		
		classroomA.addStudent(student1);
		classroomA.addStudent(student2);
		
		// 앞에 ClassRoom의 showStudent기능을 쓸 때 방어적 코드를 작성하지 않았다면 여기서 
		// 널 포인트 인셉션 에러가 발생할 것이다.
		classroomA.showStudent();
		
	}

}
