import java.util.Arrays;

public class Solution {

	public static int countNodes(TreeNode root) {
		if (root == null) return 0; 
		int maxDepth = getMaxDepth(root);
		boolean[] a = new boolean[maxDepth];
		
		System.out.println(getIndex(0,a,root));

		return 1;
	}
	
	private static int getIndex(int prev, boolean[] a, TreeNode n){
		int current = 0;
		for (int i = 0; i < a.length; i++){
			if (checkDepth(n,a)){
				a[i] = true;
			}
			if (a[i]) current += Math.pow(2, a.length-i-1);
		}
		System.out.println("current:"+current);
		
		return 0;
	}
	
	

	private static int getMaxDepth(TreeNode n){
		// TODO Auto-generated method stub
		int count=0;
		while(n.left!=null){
			count++;
			n=n.left;
		}
		return count;
	}
	
	public static boolean checkDepth(TreeNode n, boolean[] a){
		for (boolean check : a){
			n = (!check) ? n.left : n.right;
			if (n == null) return false;
		}
		return true;
	}
	
	
	
}