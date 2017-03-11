import static org.junit.Assert.*;

import org.junit.Test;

public class BSTIteratorTest {

	@Test
	public void test() {
		TreeNode root = new TreeNode(5);
		root.insertLeft(3).insertRight(4);
		root.insertRight(7).insertLeft(6);
		BSTIterator i = new BSTIterator(root);
		assertEquals(3,i.next());
		assertEquals(4,i.next());
	}

}
