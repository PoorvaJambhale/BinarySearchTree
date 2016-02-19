import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BinarySearchTest {

	BinarySearchTree bst = new BinarySearchTree();

	@Test
	public void test1() {
		assertFalse("Binary search for null rootNode should fail", bst.binarySearch(24) );
	}
	
	@Test
	public void test2(){
		bst.add(24);
		assertTrue("Binary search with only rootNode with value 24", bst.binarySearch(24));
		
	}
	
	@Test
	public void tes3(){
		assertFalse("Binary search with only rootNode with value 24", bst.binarySearch(2));
		
	}
	

}
