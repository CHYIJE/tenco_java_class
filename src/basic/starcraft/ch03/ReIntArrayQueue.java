package basic.starcraft.ch03;

public class ReIntArrayQueue {
	private int[] array;
	private int front;
	private int rear;
	private int capacity;
	private int size;

	public ReIntArrayQueue(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	// 편의 기능 만들자

	// 존재 여부 확인
	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	// 데이터 삽입 일단 배열로
	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("데이터가 가득찼네");
		} else {
			rear++;
			array[rear] = item;
			size++;
		}
	}
	
	// 데이터 꺼내기
	public int dequeue () {
		int item1 = -9999;
		if(isEmpty()) {
			System.out.println("큐가 비었다");
			return -9999;
		} else {
			item1 = array[front];
			for (int i = rear; i < front; i++) {
				array[i] = array[i + 1];
			}
		}
		return -9999;
	} 

}
