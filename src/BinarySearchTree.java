
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
		return this.rootNode.binarySearchNode(num);
	}
	
	public int findMax(){
		//Return -1 is tree is empty.
		if(this.rootNode == null){
			return -1;
		}
		Node tempNode = this.rootNode;
		while (tempNode.rightLink != null){
			tempNode = tempNode.rightLink;
		}
		return tempNode.value;
	}
	
	
	public int findMin(){
		//Return -1 is tree is empty.
		if(this.rootNode == null) {
			return -1;
		}
		Node tempNode = this.rootNode;
		while (tempNode.leftLink != null){
			tempNode = tempNode.leftLink;
		}
		return tempNode.value;
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
		int m = bst.findMax();
		System.out.println("The max is = "+ m);
		int n = bst.findMin();
		System.out.println("The min is = "+ n);
		
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
		int max = bst.findMax();
		System.out.println("The max is = "+max);
		System.out.println();
		int min = bst.findMin();
		System.out.println("The min is = "+min);
		System.out.println();
		System.out.println("Binary search for Node with value = 24");
		if(bst.binarySearch(24)){
			System.out.println("24 was found!");
		} else {
			System.out.println("24 was not found");
		}
		
		System.out.println("Binary search for Node with value = 3");
		if(bst.binarySearch(3)){
			System.out.println("3 was found!");
		} else {
			System.out.println("3 was not found.");
		}
		System.out.println("Binary search for Node with value = 30");
		if(bst.binarySearch(30)){
			System.out.println("30 was found!");
		} else {
			System.out.println("30 was not found.");
		}
	}	
}
