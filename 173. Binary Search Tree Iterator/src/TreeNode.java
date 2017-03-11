

public class TreeNode {
		public int val;
		public TreeNode left, right;

		public TreeNode(int x) {
			val = x;
			left = null;
			right = null;
		}

		public TreeNode insertLeft(int x) {
			left = new TreeNode(x);
			return left;
		}
		
		public TreeNode insertRight(int x){
			right = new TreeNode(x);
			return right;
		}

	}