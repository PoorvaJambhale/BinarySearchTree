import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Node {

	public int value;
	public Node leftLink;
	public Node rightLink;
	
	public Node (int val){
		
		this.value = val;
		this.leftLink = null;
		this.rightLink = null;
	}
	
	public void addNode(int n){
			
		if (n <= this.value){
			if (this.leftLink == null){
				//Node newNode = new Node(n);
				this.leftLink = new Node(n);
			} else {
				this.leftLink.addNode(n);
			}
		} else {
			if (this.rightLink == null){
				//Node newNode = new Node(n);
				this.rightLink = new Node(n);
			} else {
				this.rightLink.addNode(n);
			}
		}
	}
	
	
	public void inOrderTraversal(){
		
		if(this.leftLink != null){
			this.leftLink.inOrderTraversal();
		}
		System.out.println(this.value);
		if(this.rightLink != null){
			this.rightLink.inOrderTraversal();
		}
	}
	
	
	public void preOrderTraversal() {
		
		System.out.println(this.value);
		
		if(this.leftLink != null){
			this.leftLink.preOrderTraversal();
		}
		
		if(this.rightLink != null){
			this.rightLink.preOrderTraversal();
		}
	}
	
	
	public void postOrderTraversal() {

		if(this.leftLink != null){
			this.leftLink.postOrderTraversal();
		}
		
		if(this.rightLink != null){
			this.rightLink.postOrderTraversal();
		}
		
		System.out.println(this.value);
	}
	
	
	public void levelOrderTraversal() {
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(this);
		
		Node node;
		while (!queue.isEmpty()) {
			
			node = queue.remove();
			System.out.println(node.value);
			if(node.leftLink != null) {
				queue.add(node.leftLink);
			}
			if(node.rightLink != null) {
				queue.add(node.rightLink);				
			}
		}	
	}
	
	public Boolean binarySearchNode(int num) {
		
		Boolean found = false;
		if(this.value == num) {
			found = true;
		} else if (num < this.value) {
			if (this.leftLink != null) {
				return this.leftLink.binarySearchNode(num);
			}
		} else {
			if (this.rightLink != null) {
				return this.rightLink.binarySearchNode(num);
			}
		}
		return found;
	}
}
