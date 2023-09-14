package DataStructure;

public class Queue {

	private int arr[];
	private int size;
	private int front, rear;

	Queue(int size) {
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

			arr[++rear] = num;
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
			if (front >= rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}
			System.out.println("Deleted " + num);
			return num;
		}
	}

	public void display() {
		int i;
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("Front index -> " + front);
			System.out.println("Items -> ");
			for (i = front; i <= rear; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("Rear index -> " + rear);
		}
	}

	public static void main(String args[]) {
		Queue q = new Queue(5);

		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.deQueue();
		q.enQueue(50);

		q.display();
	}

}
