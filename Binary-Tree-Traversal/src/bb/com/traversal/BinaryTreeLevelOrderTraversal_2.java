/*

Method - 2 (Using Queue)
-------------------------------------------------------------------

Algorithm:
For each node, first the node is visited and then it’s child nodes are put in a FIFO queue.

printLevelorder(tree)
1) Create an empty queue q
2) temp_node = root //start from root
3) Loop while temp_node is not NULL
    a) print temp_node->data.
    b) Enqueue temp_node’s children (first left then right children) to q
    c) Dequeue a node from q and assign it’s value to temp_node

*/

package bb.com.traversal;
import java.util.Queue;
import java.util.LinkedList;


class Node{
	int key;
	Node left, right;
	
	public Node(int key){
		this.key = key;
		left = null;
		right = null;
	}
	
}

public class BinaryTreeLevelOrderTraversal_2{
	Node root;
	
	public BinaryTreeLevelOrderTraversal_2(){
		root = null;
	}
	
	public void printLevelOrder(){
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			Node tempNode = queue.poll();
			System.out.print(tempNode.key + " ");
			
			if(tempNode.left != null)
				queue.add(tempNode.left);
			
			if(tempNode.right != null)
				queue.add(tempNode.right);
		}
		
	}
	
	public static void main(String args[]) 
    {
        
        BinaryTreeLevelOrderTraversal_2 btree = new BinaryTreeLevelOrderTraversal_2();
        btree.root = new Node(1);
        btree.root.left = new Node(2);
        btree.root.right = new Node(3);
        btree.root.left.left = new Node(4);
        btree.root.left.right = new Node(5);
 
        System.out.println("Level order traversal of binary tree is : ");
        btree.printLevelOrder();
    }
}