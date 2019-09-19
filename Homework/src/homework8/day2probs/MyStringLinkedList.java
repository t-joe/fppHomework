package homework8.day2probs;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addSort(String item) {
		if (header == null) {
			header = new Node(null, item, null);
		}
		else
		{
			Node newNode = new Node(null, item, null);
			Node tmp = header;
			if(tmp.value.compareTo(item) < 0)
			{
				newNode.next = header.next;
				header.next = newNode;
				newNode.previous = header;
				header = newNode;
			}
			else
			{
				while(tmp != null)
				{
					if(tmp.previous == null)
					{
						newNode.previous = tmp.previous;
						newNode.next = tmp;
						tmp.previous = newNode;
						return;
					}
					tmp = tmp.previous;
					if(tmp.value.compareTo(item) <= 0)
					{
						newNode.next = tmp.next;
						newNode.previous = tmp;
						tmp.next.previous = newNode;
						tmp.next = newNode;
						break;
					}
				}
			}
				
		}
	}

	public int size() {
		int size = 0;
		Node tmp = header;
		if (tmp != null)
			size++;
		while (tmp.previous != null) {
			tmp = tmp.previous;
			size++;
		}
		return size;
	}

	public boolean isEmpty() {
		return header == null;
	}

	public Node getFirst() {
		return header;
	}

	public Node getLast() {
		Node tmp = header;
		while (tmp.previous != null)
			tmp = tmp.previous;
		return tmp;
	}

	public boolean contains(String item) {
		Node tmp = header;
		while (tmp != null) {
			if (tmp.value.equalsIgnoreCase(item))
				return true;
			tmp = tmp.previous;
		}
		return false;
	}

	public void removeFirst() {
		if (header == null)
			return;
		header = header.previous;
	}

	void removeLast() {
		if (header == null)
			return;
		if(header.previous ==  null)
			header = null;
		Node tmp = header;
		while (tmp.previous != null)
			tmp = tmp.previous;
		tmp.next.previous = null;
		tmp = null;
	}

	public void print() {
		print(header);
	}

	// Write a recursive print method to display the elements in the list.
	void print(Node n) {
		System.out.println(n.toString());
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node temp = header;
		while (temp != null) {
			sb.append("-->[" + temp.value.toString() + "]");
			temp = temp.previous;
		}
		sb.append("-->[" + "NULL" + "]");
		return sb.toString();
	}

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mll = new MyStringLinkedList();
		// adding strings in the list in ordered
		mll.addSort("hello");
		mll.addSort("apple");
		mll.addSort("cinima");
		mll.addSort("carrot");
		mll.addSort("movies");
		mll.addSort("pen");
		mll.addSort("stall");
		System.out.println(mll.toString());
		System.out.println("Is containing movies? " + mll.contains("movies"));
		mll.print();
		mll.removeFirst();
		System.out.println("After removing first: ");
		System.out.println(mll.toString());
		System.out.println("First element: " + mll.getFirst().value);
		System.out.println("Last element: " + mll.getLast().value);
		mll.removeLast();
		System.out.println("After removing last: ");
		System.out.println(mll.toString());
		System.out.println("Last element: " + mll.getLast().value);
		System.out.println(mll.size());	
	}
}
