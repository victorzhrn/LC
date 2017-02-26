import java.util.Hashtable;

public class Solution {
	public static int lengthOfLongestSubstringKDistinct(String s, int k) {
		if (k==0) return 0;
		int start =0;
		int end = 0;
		int size = 0;
		int  maxlength=0;
		Hashtable<Character,Integer> ht = new Hashtable<Character,Integer>();
		while(end < s.length()){
			char newchar = s.charAt(end);
			if (size <k){
				if(ht.containsKey(newchar)){
					ht.replace(newchar, end);
				}else{
					ht.put(newchar, end);
					size++;
				}
				end++;
			}else if (size == k){
				if (ht.containsKey(newchar)){
					ht.replace(newchar, end);
				}else{
					int to_remove_index = ht.get(s.charAt(start));
					for (int value : ht.values()){
						if (value < to_remove_index) to_remove_index=value;
					}
					char toRemove = s.charAt(to_remove_index);
					start = ht.get(toRemove)+1;
					ht.remove(toRemove);
					ht.put(newchar, end);
				}
				end ++;
			}
			if (end-start > maxlength){
				maxlength=end-start;
			}	
		}
		return maxlength;
	}
}
