import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testGetNode() {
		  BST bst = new BST();
		  bst.addNode(1);
		  assertEquals(1, bst.getNode(1).key);
		  
		  bst.addNode(2);
	      assertEquals(2, bst.getNode(2).key);
	}

	 @Test
	    public void testAddNode() {
	        BST bst = new BST();
	        bst.addNode(23);
	        assertEquals(23, bst.getNode(23).key);
	    }
	 
	 @Test
	    public void testNodeChildren() {
	        BST bst = new BST();
	        bst.addNode(2);
	        bst.addNode(1);
	        bst.addNode(3);
	        assertEquals(bst.getNode(1), bst.getNode(2).left);
	        assertEquals(bst.getNode(3), bst.getNode(2).right);
	    }
	 
	 @Test
	    public void testlca() {
	        BST bst = new BST();
	        bst.addNode(2);
	        bst.addNode(1);
	        bst.addNode(3);

	        assertEquals(bst.getNode(2), bst.lca(1, 3));
	    }




}
