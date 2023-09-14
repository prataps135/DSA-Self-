package DataStructure.Stack;

import java.util.Iterator;

public class Stack {

	private int arr[];
	private int top;
	private int capacity;

	// Creating a Stack
	Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int num) {
		if (isFull()) {
			System.out.println("OverFlow \nStack is full");
			System.exit(1);
		}
		System.out.println("Inserting " + num);
		arr[++top] = num;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("UnderFlow \nStack is empty");
			System.exit(1);
		}
//		System.out.println("Poping element");
		return arr[top--];
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int size() {
		return top + 1;
	}

	public void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		Stack stack = new Stack(5);

		stack.push(1);
		stack.push(5);
		stack.push(7);
		stack.pop();
		stack.printStack();
		
		java.util.Stack<Integer> newStack = new java.util.Stack<Integer>();
		
		newStack.push(10);
		;
	}

}
