package homework10;

public class MyBST {
	Node root;

	public MyBST() {
		this.root = null;
	}

	public void preOrder() {
		preOrder(root);		
	}
	private void preOrder(Node n)
	{
		if(n == null)
			return;
		System.out.println(n.getData());
		preOrder(n.getLeft());
		preOrder(n.getRight());
	}

	public void inOrder() {
		inOrder(root);
	}
	public void inOrder(Node n)
	{
		if(n == null)
			return;
		inOrder(n.getLeft());
		System.out.println(n.getData());
		inOrder(n.getRight());
	}

	public void postOrder() {
		postOrder(root);
	}
	public void postOrder(Node n)
	{
		if(n== null)
			return;
		postOrder(n.getLeft());
		postOrder(n.getRight());
		System.out.println(n.getData());
	}

	public boolean contains(int value) {
		return contains(root, value);
	}
	private boolean contains(Node n, int value)
	{
		if(n == null)return false;
		if(n.getData() == value)return true;
		if(n.getData() <= value)
		{
			if(n.getRight() != null)
				return contains(n.getRight(), value);
			else return false;
		}
		else
		{
			if(n.getLeft() != null)
				return contains(n.getLeft(), value);
			else return false;
		}
		
	}

	public int size() {
		return 0;
	}

	public Node getRoot() {
		return root;
	}

	public int findMin() {
		Node n = findMin(root);
		if(n == null ) return -1;
		return n.getData();
	}
	private Node findMin(Node n)
	{
		if(n == null) return null ;
		if(n.getLeft() == null)
			return n;
		return findMin(n.getLeft());
	}

	public int findMax() {
		Node n = findMax(root);
		if(n == null ) return -1;
		return n.getData();
	}
	private Node findMax(Node n)
	{
		if(n == null) return null ;
		if(n.getRight() == null)
			return n;
		return findMin(n.getRight());
	}

	public int leafNodes() {
		return 0;
	}

	public void add(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
			return;
		}
		add(root, newNode);
	}

	private boolean add(Node root, Node node) {
		if (root.getData() <= node.getData()) {
			if (root.getRight() != null)
				return add(root.getRight(), node);
			else
			{
				root.setRight(node);
				return true;
			}
		} else
		{
			if(root.getLeft() != null)
			return add(root.getLeft(), node);
			else
			{
				root.setLeft(root);
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
