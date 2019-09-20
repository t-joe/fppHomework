package homework9.prob1;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() {
		if (front >= rear)
			return -1;
		else
			return arr[front+1];
	}

	public void enqueue(int obj) {
		if (rear > arr.length - 1)
			resize();
		else
			arr[rear++] = obj;
	}

	public int dequeue() {
		if (front + 1 > rear)
			return -1;
		else
			return arr[++front];
	}

	public boolean isEmpty() {
		if(rear == 0 || rear == front)
			return true;
		return false;
	}

	public int size() {
//		if(front < 0)
//			return rear;
//		else if(front == 0)
//			return rear - 1;
		return rear - front - 1;
	}

	private void resize() {
		int[] tmp = new int[arr.length * 2];
		System.arraycopy(arr, 0, tmp, 0, arr.length);
		arr = tmp;
	}
}
