package homework9.prob1;

public class Main {

	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		System.out.println("First time size: "+q.size());
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println("Size of queue: "+q.size());
		System.out.println("Peeking: " + q.peek());
		System.out.println("Ater peeking, the size: " + q.size());
		System.out.println("Dequeued: "+q.dequeue());
		System.out.println("After dequeue, size is: "+q.size());
		q.dequeue();
		q.dequeue();
		System.out.println("After 3 dequeues, the size is: " + q.size());
		System.out.println("Peeking: "+q.peek());
	}

}
