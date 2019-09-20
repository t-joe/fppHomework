package homework9.prob2;

public class Main {

	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println("size of stack: " + s.size());
		System.out.println("poping: " + s.pop());
		s.push(new Node(10));
		s.push(new Node(20));
		s.push(new Node(30));
		s.push(new Node(40));
		s.push(new Node(50));
		System.out.println("after pushing 5 times, the size is: "+ s.size);
		System.out.println("Peeking: " + s.peek());
		System.out.println("Poping: "+ s.pop());
		System.out.println("After pop, the size is: " + s.size);
		s.pop();
		s.pop();
		System.out.println("After poping 3 times, the size is: " + s.size);
		System.out.println("Peeking: "+s.peek());
	}

}
