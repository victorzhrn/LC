package findDuplicatedSubTree;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		TreeNode tn = new TreeNode(1);
		tn.insertLeft(2).insertLeft(4);
		TreeNode t1 = tn.insertRight(3);
		t1.insertLeft(2).insertLeft(4);
		t1.insertRight(4);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(2);
		a1.add(4);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(4);
		
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		a.add(a2);
		a.add(a1);
		
		assertEquals(a,Solution.findDuplicatedSubtree(tn));
		
		
	}

}