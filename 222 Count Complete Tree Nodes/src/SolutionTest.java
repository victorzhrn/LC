import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		TreeNode root = new TreeNode(4);
		TreeNode t1 = root.insertLeft(2);
		TreeNode t2 = root.insertRight(6);
		t1.insertLeft(1);
		//assertEquals(4,Solution.countNodes(root));
		t1.insertRight(3);
		
		assertEquals(5,Solution.countNodes(root));
		t2.insertLeft(5);
		assertEquals(6,Solution.countNodes(root));
		t2.insertLeft(7);
		assertEquals(7,Solution.countNodes(root));
		
		
	}

}
