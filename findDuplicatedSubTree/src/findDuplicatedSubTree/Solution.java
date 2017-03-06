package findDuplicatedSubTree;

import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;

public class Solution {
	public static ArrayList<ArrayList<Integer>> findDuplicatedSubtree(TreeNode root) {
		Hashtable<Integer, ArrayList<TreeNode>> ht = new Hashtable<Integer, ArrayList<TreeNode>>();
		findIdenticals(root, ht);
		ArrayList<ArrayList<Integer>> allList = new ArrayList<ArrayList<Integer>>();

		for (ArrayList<TreeNode> a : ht.values()) {
			if (a.size() >= 2) {
				getSubTree(allList, a, new ArrayList<Integer>());
			}
		}

		System.out.println("all list: " + allList.toString());

		return allList;
	}

	public static boolean getSubTree(ArrayList<ArrayList<Integer>> allList, ArrayList<TreeNode> NodeList,
			ArrayList<Integer> machedList) {
		int element = NodeList.get(0).val;
		boolean allSame = true;
		for (TreeNode tn : NodeList) {
			if (element != tn.val || tn == TreeNode.Null_Node) {
				allSame = false;
				break;
			}
		}
		if (allSame) {
			machedList.add(element);
			ArrayList<TreeNode> allLeft = replaceListNodeWithChildren(NodeList, true);
			ArrayList<TreeNode> allRight = replaceListNodeWithChildren(NodeList, false);
			boolean leftSame = getSubTree(allList, allLeft, machedList);
			boolean rightSame = getSubTree(allList, allRight, machedList);
			if (leftSame == false && rightSame == false) {
				allList.add(machedList);
				System.out.println(machedList);
			}
		}

		return allSame;
	}

	/**
	 * Given a list of nodes, return all nodes' left or right children if left==
	 * true; get all left; otherwise right;
	 * 
	 * @param NodeList
	 * @param left
	 * @return
	 */
	public static ArrayList<TreeNode> replaceListNodeWithChildren(ArrayList<TreeNode> NodeList, boolean left) {
		ArrayList<TreeNode> result = new ArrayList<TreeNode>();
		for (TreeNode tn : NodeList) {
			if (left) {
				result.add(tn.left);
			} else {
				result.add(tn.right);
			}

		}
		return result;
	}

	public static void findIdenticals(TreeNode n, Hashtable<Integer, ArrayList<TreeNode>> ht) {
		if (n == TreeNode.Null_Node) {
			return;
		} else {
			if (ht.containsKey(n.val)) {
				ht.get(n.val).add(n);
			} else {
				ArrayList<TreeNode> a = new ArrayList<TreeNode>();
				a.add(n);
				ht.put(n.val, a);
			}
			findIdenticals(n.left, ht);
			findIdenticals(n.right, ht);
		}
	}
}
