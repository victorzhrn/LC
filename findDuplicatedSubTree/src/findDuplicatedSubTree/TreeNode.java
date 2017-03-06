package findDuplicatedSubTree;

import java.util.ArrayList;


public class TreeNode {
		public int val,size;
		public TreeNode left, right;
		public static final TreeNode Null_Node = new TreeNode();

		public TreeNode(){
			
		}
		public TreeNode(int x) {
			val = x;
			size=1;
			left = Null_Node;
			right = Null_Node;
		}

		public TreeNode insertLeft(int x) {
			left = new TreeNode(x);
			size++;
			return left;
		}
		
		public TreeNode insertRight(int x){
			right = new TreeNode(x);
			size++;
			return right;
		}
		
		public String preOrder(){
			ArrayList<Integer> al = new ArrayList<Integer>();
			this.preOrderHelper(al);
			return al.toString();
		}
		
		public void preOrderHelper(ArrayList<Integer> al){
			if (this==Null_Node){
				return;
			}else{
				al.add(this.val);
				this.left.preOrderHelper(al);
				this.right.preOrderHelper(al);
			}
		}

	}