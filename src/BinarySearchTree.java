
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
	
	public Node binarySearch(int num) {
		
		if(this.rootNode == null) {
			return null;
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
				this.rootNode.inOrderTraversal();
				break;
			case 2: 
				this.rootNode.preOrderTraversal();
				break;
			case 3:
				this.rootNode.postOrderTraversal();
				break;
			case 4:
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
	//	bst.rootNode.inOrderTraversal();
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
		
		Node n = bst.binarySearch(24);
		
		if (n != null) {
			System.out.println(n.value);
		}
		
	}	
}
