
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */

public class Solution {

	public static int longestConsecutive(TreeNode root) {
		if (root == null)
			return 0;
		int max = Math.max(helper(root, root.right, 1,1), helper(root, root.left, 1,1));
		return max;
	}

	public static int helper(TreeNode parrent, TreeNode n, int count, int global_max) {
		if (n == null) {
			return global_max;
		} else {
			
			if (n.val - parrent.val == 1) {
				count++;
				global_max= Math.max(global_max, count);
				return Math.max(helper(n, n.right, count,global_max), helper(n, n.left, count,global_max));
			}
			return Math.max(helper(n, n.right, 1,global_max), helper(n, n.left, 1,global_max));

		}
	}

}
