import java.util.HashSet;
import java.util.Hashtable;

public class Trie {
	public TrieNode root;

	public Trie() {
		root = new TrieNode();
	}
	
	public void insert(String s){
		TrieNode n = root;
		for (int i = 0; i < s.length();i++){
			n.addChild(s.charAt(i));
			n = n.getChild(s.charAt(i));
		}
		n.isLeaf=true;
	}
	
	public boolean checkStartWith(String prefix){
		TrieNode n = root;
		for (int i=0; i<prefix.length();i++){
			if(!n.hasChild(prefix.charAt(i))) return false;
			n = n.getChild(prefix.charAt(i));
		}
		return true;
	}
	
	public HashSet<String> getAllPrefix(String prefix){
		HashSet<String> hs = new HashSet<String>();
		if (!checkStartWith(prefix)) return null;
		return hs;
	}
	
	public String toString(){
		return root.toString();
	}
	

}