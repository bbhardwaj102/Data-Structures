/*

Using Stack is the obvious way to traverse btree without recursion. Below is an algorithm for traversing binary btree using stack. See this for step wise step execution of the algorithm.

1) Create an empty stack S.
2) Initialize current node as root
3) Push the current node to S and set current = current->left until current is NULL
4) If current is NULL and stack is not empty then 
     a) Pop the top item from stack.
     b) Print the popped item, set current = popped_item->right 
     c) Go to step 3.
5) If current is NULL and stack is empty then we are done.

*/

package bb.com.traversal;
import java.util.Stack;

class Node{
	int key;
	Node left, right;
	
	public Node(int key){
		this.key = key;
		left = null;
		right = null;
	}
	
}

public class BinaryTreeInorderTraversalWithoutRecursion{
	Node root;
	
	public BinaryTreeInorderTraversalWithoutRecursion(){
		root = null;
	}
	
	public void InorderTraversal(){
		
		if(root == null)
			return;
		
		Stack<Node> stack = new Stack<Node>();
		
		Node node = root;
		
		while(node != null){
			stack.push(node);
			node = node.left;
		}
		
		while(stack.size() > 0){
			node = stack.pop();
			System.out.print(node.key + " ");
			
			if(node.right != null){
				node = node.right;
				
				while(node != null){
					stack.push(node);
					node = node.left;
				}
			}
		}
	}
	
	public static void main(String[] args){
		BinaryTreeInorderTraversalWithoutRecursion btree = new BinaryTreeInorderTraversalWithoutRecursion();
		btree.root = new Node(5);
		btree.root.left = new Node(2);
        btree.root.right = new Node(3);
        btree.root.left.left = new Node(4);
        btree.root.left.right = new Node(5);
        btree.InorderTraversal();
	}
}