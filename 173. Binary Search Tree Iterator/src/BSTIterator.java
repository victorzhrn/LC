import java.util.Stack;

public class BSTIterator {
	
	private Stack<TreeNode> s;
 
    public BSTIterator(TreeNode root) {
    	s = new Stack<TreeNode>();
    	addLeft(root);
    }
    

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !s.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode n = s.pop();
        if (n.right!=null) addLeft(n.right);
        return n.val;
    }
    
    public void addLeft(TreeNode n){
    	if(n!=null){
    		s.push(n);
        	addLeft(n.left);
    	}
    	
    }
}