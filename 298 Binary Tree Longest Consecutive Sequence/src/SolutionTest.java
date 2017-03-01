import static org.junit.Assert.*;

import org.junit.Test;



public class SolutionTest {

	@Test
	public void testTreeNode() {
		
		TreeNode n = new TreeNode(1);
		TreeNode n1 = n.insertRight(3);
		n1.insertLeft(2);
		n1 = n1.insertRight(4);
		n1 = n1.insertRight(5);
		
		assertEquals(1, n.val);
		assertEquals(3,n.right.val);
		assertEquals(4,n.right.right.val);
		assertEquals(5,n.right.right.right.val);
	}
	
	@Test
	public void testSimple() {
		
		TreeNode n = new TreeNode(1);
		TreeNode n1 = n.insertRight(3);
		n1.insertLeft(2);
		n1 = n1.insertRight(4);
		n1 = n1.insertRight(5);
		
		assertEquals(3,Solution.longestConsecutive(n));
		
		assertEquals(1,Solution.longestConsecutive(n.right.left));
	}
	
	@Test
	public void testSimple2(){
		TreeNode n = new TreeNode(2);
		TreeNode n1 = n.insertRight(3);
		n1 = n1.insertLeft(2);
		n1 = n1.insertLeft(1);
		assertEquals(2,Solution.longestConsecutive(n));
	}
	
	@Test
	public void testSimple3(){
		TreeNode n = new TreeNode(1);
		n.insertLeft(-2);
		TreeNode n1 = n.insertRight(2);
		n1 = n1.insertRight(3);
		
		assertEquals(3,Solution.longestConsecutive(n));
	}
	@Test
	public void testSimple4(){
		TreeNode n = new TreeNode(1);
		TreeNode n1 = n.insertLeft(2);
		n.insertRight(3);
		n1.insertRight(5);
		n1.insertLeft(4);
		
		
		assertEquals(2,Solution.longestConsecutive(n));
	}
	
	

}
