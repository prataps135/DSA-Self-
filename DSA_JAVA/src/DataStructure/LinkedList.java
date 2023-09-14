package DataStructure;

public class LinkedList {

	Node head;

	static class Node {
		int value;
		Node next;

		Node(int num) {
			value = num;
			next = null;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// Creating the nodes
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		// Connecting the nodes
		list.head.next = second;
		second.next = third;

		while (list.head != null) {
			System.out.print(list.head.value + " ");
			list.head = list.head.next;
		}
	}

}
