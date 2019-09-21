package homework10;

public class MyBST {
	private Node root;
	private int size = 0;

	public MyBST() {
		this.root = null;
		size = 0;
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node n) {
		if (n == null)
			return;
		System.out.printf("%3s", n.getData());
		preOrder(n.getLeft());
		preOrder(n.getRight());
	}

	public void inOrder() {
		inOrder(root);
	}

	public void inOrder(Node n) {
		if (n == null)
			return;
		inOrder(n.getLeft());
		System.out.printf("%3s", n.getData());
		inOrder(n.getRight());
	}

	public void postOrder() {
		postOrder(root);
	}

	public void postOrder(Node n) {
		if (n == null)
			return;
		postOrder(n.getLeft());
		postOrder(n.getRight());
		System.out.printf("%3s", n.getData());
	}

	public boolean contains(int value) {
		return contains(root, value);
	}

	private boolean contains(Node n, int value) {
		if (n == null)
			return false;
		if (n.getData() == value)
			return true;
		if (n.getData() <= value) {
			if (n.getRight() != null)
				return contains(n.getRight(), value);
			else
				return false;
		} else {
			if (n.getLeft() != null)
				return contains(n.getLeft(), value);
			else
				return false;
		}

	}

	public int size() {
		return size;
	}

	public Node getRoot() {
		return root;
	}

	public int findMin() {
		Node n = findMin(root);
		if (n == null)
			return -1;
		return n.getData();
	}

	private Node findMin(Node n) {
		if (n == null)
			return null;
		if (n.getLeft() == null)
			return n;
		return findMin(n.getLeft());
	}

	public int findMax() {
		Node n = findMax(root);
		if (n == null)
			return -1;
		return n.getData();
	}

	private Node findMax(Node n) {
		if (n == null)
			return null;
		if (n.getRight() == null)
			return n;
		return findMax(n.getRight());
	}

	public int leafNodes() {
		int leafNodes = 0;
		leafNodes = leafNodes(root);
		return leafNodes;
	}
	private int leafNodes(Node n)
	{
		int i = 0;
		if(n == null) return i;
		if(n.getLeft() == null && n.getRight() == null) i++;
		i += leafNodes(n.getLeft());
		i += leafNodes(n.getRight());
		return i;
	}

	public void add(int data) {
		Node newNode = new Node(data);
		boolean result = false;
		if (root == null) {
			root = newNode;
			return;
		}
		result = add(this.root, newNode);
		if(result)
			size++;
	}

	private boolean add(Node rNode, Node node) {
		if (rNode.getData() <= node.getData()) {
			if (rNode.getRight() != null)
				return add(rNode.getRight(), node);
			else {
				rNode.setRight(node);
				return true;
			}
		} else {
			if (rNode.getLeft() != null)
				return add(rNode.getLeft(), node);
			else {
				rNode.setLeft(node);
				return true;
			}
		}
	}
}

class Node {
	private int data;
	private Node right;
	private Node left;

	public Node(int data) {
		this.data = data;
		right = null;
		left = null;
	}

	public Node getRight() {
		return this.right;
	}

	public Node getLeft() {
		return this.left;
	}

	public int getData() {
		return this.data;
	}

	public void setRight(Node n) {
		this.right = n;
	}

	public void setLeft(Node n) {
		this.left = n;
	}
}
