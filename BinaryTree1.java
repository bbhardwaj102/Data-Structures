class Node{
	int key;
	Node left, right;
	
	public Node(int key){
		this.key = key;
		left = right = null;
	}
}

public class BinaryTree{
	Node root;
	
	public BinaryTree(int key){
		root = new Node(key);
	}
	
	public BinaryTree(){
		root = null;
	}
}

public class BinaryTree1{
	public static void main(String [] args){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(5);
		tree.root.left = new Node(10);
		tree.root.right = new Node(1);
		tree.root.left.right = new Node(11);
		tree.root.left.left = new Node(16);
		tree.root.right.right = new Node(5);
		tree.root.right.left = new Node(11);
		
		System.out.println("Tree Created successfully with 7 nodes");
	}
}