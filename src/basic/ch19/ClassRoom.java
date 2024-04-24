package basic.ch19;

public class ClassRoom {
	private String className;
	// 선언만 함
	private Student[] students;
	private int studentCount;
	// 상수로 30을 정함.
	private final int MAX_STUDENT = 30;

	// 생성자 생성
	public ClassRoom(String className) {
		this.className = className;
		// 30개의 메모리 배열을 만들었다.
		students = new Student[MAX_STUDENT];
		// 카운트 값을 초기화 값을 안줘도 초기화 되긴함
		this.studentCount = 0;
	}

	// 학생을 추가하는 기능 만들기
	// 기능 이름은 동사로 시작하는게 좋다. -- 통으로 넣고 싶음 student
	public void addStudent(Student student) {
		// 만약 학생수가 학생 최대수 보다 작다면
		if (studentCount < MAX_STUDENT) {
			// 학생 배열의 학생 카운트를
			students[studentCount] = student;
			// 1증가 시켜라
			studentCount++;
			// 아니면 정원초과
		} else {
			System.out.println("정원 초과");
		}
	}

	// 학급에 속한 모든 학생 정보를 출력하는 기능을 만드시오.
	public void showStudent() {
		// 반복한다 i가 학생수 배열 만큼 i씩 증가 시켜라
		for (int i = 0; i < students.length; i++) {

			// (방어적 코드를 작성하는 이유 : 
			// -->> 널 포인트 익셉션 떳을때 객체를 생성 했는지 주소값을 넣었는지 부터 살펴라
			// 만약 i가 널이 아니라면 (방어적 코드)
			if (students[i] != null) {
				// students[i] --> [객체주소] --- heap 영역 객체를 참조
				System.out.println("name : " + students[i].getName() 
						+ " , age " + students[i].getAge());
			}
		}

	}

}
