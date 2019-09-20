package homework9.prob2;

public class Stack {
	Node top;
	int size = 0;
	public Stack() {
		top = null;
	}

	public void push(Node n) {
		if (top == null)
			top = n;
		n.previous = top;
		top.next = n;
		top = n;
		size++;
	}

	public int pop() {
		Node tmp = top;
		if (tmp != null) {
			top = tmp.previous;
			size--;
			return tmp.getData();
		}
		return -1;
	}
	public int peek()
	{
		Node tmp = top;
		if(tmp != null)
			return tmp.getData();
		return -1;
	}
	public boolean isEmpty()
	{
		return top == null;
	}
	public int size()
	{
		return size;	
	}
}

class Node {
	private int data;
	Node previous;
	Node next;

	public Node(int data) {
		this.data = data;
		this.previous = null;
		this.next = null;
	}

	public int getData() {
		return this.data;
	}
}
