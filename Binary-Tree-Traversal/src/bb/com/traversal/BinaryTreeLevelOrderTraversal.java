/*

Method - 1
-------------------------------------------------------------------

Algorithm:
There are basically two functions in this method. One is to print all nodes at a 
given level (printGivenLevel), and other is to print level order traversal of the tree 
(printLevelorder). printLevelorder makes use of printGivenLevel to print nodes at all levels 
one by one starting from root.

//Function to print level order traversal of tree
printLevelorder(tree)
for d = 1 to height(tree)
   printGivenLevel(tree, d);

//Function to print all nodes at a given level
printGivenLevel(tree, level)
if tree is NULL then return;
if level is 1, then
    print(tree->data);
else if level greater than 1, then
    printGivenLevel(tree->left, level-1);
    printGivenLevel(tree->right, level-1);

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

public class BinaryTreeLevelOrderTraversal{
	Node root;
	
	public BinaryTreeLevelOrderTraversal(){
		root = null;
	}
	
	public int max(int leftHeight, int rightHeight){
		return leftHeight >= rightHeight ? leftHeight:rightHeight;
	}
	
	public int height(Node root){
		if(root == null)
			return 0;
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return 1 + max(leftHeight, rightHeight);//finding max height out of  left subtree height and right subtree height
		
	}
	
	public void traverseLevel(){
		int h = height(root);
		
		for(int i = 1; i <= h; i++){
			printLevel(root, i);
			System.out.println();
		}
	}
	
	public void printLevel(Node root, int level){
		if(root == null)
			return;
		if(level == 1)
			System.out.print(root.key + " ");
		else if(level > 1){
			printLevel(root.left, level-1);
			printLevel(root.right, level-1);
		}
	}
	
	public static void main(String[] args){
		BinaryTreeLevelOrderTraversal btree = new BinaryTreeLevelOrderTraversal();
		btree.root = new Node(3);
		btree.root.left = new Node(10);
		btree.root.right = new Node(30);
		btree.root.right.right = new Node(4);
		btree.root.right.left = new Node(13);
		btree.root.left.right = new Node(8);
		btree.root.right.left.right = new Node(17);
		btree.root.right.left.left = new Node(19);
		
		System.out.println("Level order traversal of the given binary tree is : ");
		btree.traverseLevel();
	}
}