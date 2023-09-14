package DataStructure.Queue;

public class CircularQueue {

	private int arr[];
	private int size;
	private int front, rear;

	CircularQueue(int size) {
		this.size = size;
		arr = new int[size];
		front = -1;
		rear = -1;
	}

	public boolean isEmpty() {
		if (front == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (front == 0 && rear == size - 1) {
			return true;
		}
		return false;
	}

	public void enQueue(int num) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (front == -1)
				front = 0;
			rear = (rear + 1) % size;
			arr[rear] = num;
			System.out.println("Inserted " + num);
		}
	}

	public int deQueue() {
		int num;
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			num = arr[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front = (front + 1) % size;
			}
			return num;
		}
	}

	public void display() {
		int i;
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("Front -> " + front);
			System.out.println("Items -> ");
			for (i = front; i != rear; i = (i + 1) % size)
				System.out.print(arr[i] + " ");
			System.out.println(arr[i]);
			System.out.println("Rear -> " + rear);
		}
	}

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);

		cq.enQueue(10);
		cq.enQueue(20);
		cq.enQueue(30);
		cq.deQueue();
		cq.enQueue(40);
		cq.display();
	}
}
