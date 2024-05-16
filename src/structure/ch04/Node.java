package structure.ch04;

public class Node {

	private String data;
	// 자기 참조 관계
	// 정의 : 자기 참조는 객체가 자신과 같은 타입의 다른 객체를
	// 가르키는 경우를 말한다.
	// 용도 : 연결 리스트, 트리 구조에 많이 활용
	public Node next;

	// 기본 생성자
	public Node() {
		data = null;
		next = null;
	}

	// 생성자 오버로딩 1
	public Node(String data) {
		this.data = data;
		next = null;
	}

	// 생성자 오버로딩 2
	public Node(String data, Node link) {
		this.data = data;
		next = link;
	}
	
	public String getData() {
		return data;
	}
	

}
