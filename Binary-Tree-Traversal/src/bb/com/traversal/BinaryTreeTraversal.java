/*
Depth first traversal inorder , preorder , postorder traversal
*/

package bb.com.traversal;

class Node{
	int key;
	Node left, right;
	
	public Node(int key){
		this.key = key;
		left = null;
		right = null;
	}
	
}

public class BinaryTreeTraversal{
	static Node root;
	
	public BinaryTreeTraversal(){
		root = null;
	}
	
	void inorderTraversal(Node node){
		if(node == null)
			return;
		inorderTraversal(node.left);
		System.out.print(node.key + " ");
		inorderTraversal(node.right);
	}
	
	void preorderTraversal(Node node){
		if(node == null)
			return;
		System.out.print(node.key + " ");
		preorderTraversal(node.left);
		preorderTraversal(node.right);
	}
	
	void postorderTraversal(Node node){
		if(node == null)
			return;
		postorderTraversal(node.left);
		postorderTraversal(node.right);
		System.out.print(node.key + " ");
	}
	
	/*void printPostorder(){     
	    printPostorder(root);  
	}
    void printInorder(){
		printInorder(root);   
	}
    void printPreorder(){     
	    printPreorder(root);  
	}*/
	
	public static void main(String[] args){
		BinaryTreeTraversal btree = new BinaryTreeTraversal();
		btree.root = new Node(10);
		btree.root.left = new Node(11);
		btree.root.right = new Node(12);
		btree.root.left.right = new Node(2);
		btree.root.left.left = new Node(6);
		btree.root.right.right = new Node(9);
		btree.root.right.left = new Node(20);
		btree.root.right.left.right = new Node(30);
		
		System.out.print("Inorder Traversal of our Binary btree is : ");
		btree.inorderTraversal(root); // error : non - static variables cannot be referenced from a static context;
		
		System.out.println();
		System.out.print("Preorder Traversal of our Binary btree is : ");
		btree.preorderTraversal(root);
		System.out.println();
		System.out.print("Postorder Traversal of our Binary btree is : ");
		btree.postorderTraversal(root);
		System.out.println();
	}
}