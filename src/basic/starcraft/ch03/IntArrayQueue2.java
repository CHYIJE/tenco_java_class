package basic.starcraft.ch03;

public class IntArrayQueue2 {

	private int[] array;
	private int front; // 큐의 시작점
	private int rear; // 큐의 끝지점
	private int capacity; // 큐의 용량
	private int size; // 요소의 개수

	public IntArrayQueue2(int capacity) {
		// 효율적으로 하기 위해
		this.capacity = capacity;
		array = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	// 편의 기능 만들어 보기

	// 가득 찼는지 안 찼는지 알 수 있는 기능
	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	// todo1 - 데이터 넣기 기능 구현
	public void enqueue(int item) {
		// 순환구조를 위한 코드수정
		// [10] [20] [30]
		// 나머지 연산자를 활용 한다. (순환구조)
		// 1 = 1 % 5; 몫 0, 나머지 1
		// 2 = 2 % 5; 몫 0, 나머지 2
		// 3 (임시값 3)
		// 0 = 0 % 3
		// 1 = 0 + 1 % 3
		// 2 = 1 + 1 % 3
		// 0 = 2 + 1 % 3
		// 1 = 0 + 1 % 3
		rear = (rear + 1) % capacity;
		array[rear] = item;

		size++;
	}

	// todo2 - 데이터 꺼내기 기능 구현
	public int dequeue() {
		// 순환 구조를 위한 코드 수정
		if (isEmpty()) {
			System.out.println("Queue is Empty.");
			return -9999;
		}

		int item = array[front];
		// [10] [20] [30]
		front = (front + 1) % capacity;
		return item;
	}

	// todo3 - 데이터 찾기 기능 구현 (peek)
	public int peek() {

		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없습니다.");
			return -9999;
		} else {
			// peek --> 맨 앞에 데이터를 리턴 시켜주는 기능일 뿐

			return array[front]; // - 수정
		}
	}

	public void printAll() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println();
	}

	// 코드 테스트
	public static void main(String[] args) {

		IntArrayQueue2 queue = new IntArrayQueue2(3);
		// 데이터 넣기
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400);
		queue.enqueue(500);

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

//		queue.printAll();

	} // end of main
}
