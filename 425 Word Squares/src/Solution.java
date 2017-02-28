import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {

	public static Trie trie;
	public static int strLength;

	public static List<List<String>> wordSquares(String[] words) {
		trie = new Trie(Arrays.asList(words));
		strLength = words[0].length();
		if (strLength==1){
			return Arrays.asList(Arrays.asList(words));
		}
		List<List<String>> allList = new ArrayList<List<String>>();
		search(allList, new ArrayList<String>(), "");
		
		return allList;
	}

	public static void search(List<List<String>> allList, ArrayList<String> sublist, String prefix) {
		for (int i = sublist.size(); i < strLength; i++){
			String subPrefix = "";
			for (String s : sublist){
				subPrefix += s.charAt(i);
			}
			if (!trie.checkStartWith(subPrefix)){
				return;
			}
		}
		if (trie.checkStartWith(prefix)) {
			HashSet<String> hs = trie.getAllPrefix(prefix);
			if (!hs.isEmpty()) {
				if (sublist.isEmpty()) {
					for (String s : hs) {
						ArrayList<String> newSublist = (ArrayList<String>) sublist.clone();
						newSublist.add(s);
						search(allList, newSublist, "" + s.charAt(1));
					}
				} else {
					for (String s : hs) {
						String newPrefix = "";
						ArrayList<String> newSublist = (ArrayList<String>) sublist.clone();
						newSublist.add(s);
						int filledSize = newSublist.size();
						if (filledSize == strLength) {
							String final_check = "";
							for (String word : newSublist) final_check = final_check+word.charAt(strLength-1);
							if (final_check.equals(s)){
								allList.add(newSublist);
							}
							continue;
						}
						for (String str : newSublist) {
							newPrefix = newPrefix + str.charAt(filledSize);
						}
						search(allList, newSublist, newPrefix);
						
					}
				}
			}

		}
	}
}