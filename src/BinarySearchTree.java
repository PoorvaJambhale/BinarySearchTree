
public class BinarySearchTree {

	public Node rootNode;
	
	public BinarySearchTree() {
		this.rootNode = null;
	}
	
	
	public void add(int n){
		
		if(this.rootNode == null){
			this.rootNode = new Node(n);
		} else {
			this.rootNode.addNode(n);
		}		
	}
	
	public Boolean binarySearch(int num) {
		
		if(this.rootNode == null) {
			return false;
		}
		if(this.rootNode.value == num) {
			return true;
		} else {
			return this.rootNode.binarySearchNode(num);
		}
	}
	
	public void printTree(int i){
		if (this.rootNode == null){
			return;
		} 
		switch(i){
		case 1: 
			System.out.println("Printing In-order traversal.");
			this.rootNode.inOrderTraversal();
			break;
		case 2: 
			System.out.println("Printing pre-order traversal.");
			this.rootNode.preOrderTraversal();
			break;
		case 3:
			System.out.println("Printing post-order traversal.");
			this.rootNode.postOrderTraversal();
			break;
		case 4:
			System.out.println("Printing level-order traversal.");
			this.rootNode.levelOrderTraversal();
			break;
		}
	}
	
	
	public static void main(String[] args){
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.add(15);
		bst.add(20);
		bst.add(12);
		bst.add(8);
		bst.add(16);
		bst.add(24);
		bst.add(4);

		bst.printTree(1);
		System.out.println();
		bst.printTree(2);
		System.out.println();
		bst.printTree(3);
		System.out.println();
		bst.printTree(4);
		System.out.println();
		int max = bst.rootNode.findMax();
		System.out.println("The max is = "+max);
		System.out.println();
		int min = bst.rootNode.findMin();
		System.out.println("The min is = "+min);
		System.out.println();
		System.out.println("Binary search for Node with value = 24");
		if(bst.binarySearch(24)){
			System.out.println("24 was found!");
		} else {
			System.out.println("24 was not found");
		}
		
		System.out.println("Binary search for Node with value = 32");
		if(bst.binarySearch(32)){
			System.out.println("32 was found!");
		} else {
			System.out.println("32 was not found.");
		}
		
	}	
}
