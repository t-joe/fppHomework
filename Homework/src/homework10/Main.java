package homework10;

public class Main {

	public static void main(String[] args) {
		MyBST bt = new MyBST();
		int[] arr = { 13, 3, 4, 12, 14, 10, 5, 1, 8, 2, 7, 9, 11, 6, 18, 17, 20, 19, 21, 0 };
		for (int i : arr)
			bt.add(i);
		System.out.println("size: " + bt.size());
		System.out.println("InOrder:");
		bt.inOrder();
		System.out.println("\nPreOrder: ");
		bt.preOrder();
		System.out.println("\nPostOrder: ");
		bt.postOrder();
		System.out.println("\nContains 17?: " + bt.contains(17));
		System.out.println("Contains 30?: " + bt.contains(30));
		System.out.println("Min value: " + bt.findMin());
		System.out.println("Max value: " + bt.findMax());
		System.out.println("Leaf nodes: " + bt.leafNodes());
	}

}
