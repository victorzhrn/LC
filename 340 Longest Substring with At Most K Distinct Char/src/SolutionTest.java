import static org.junit.Assert.*;

import org.junit.Test;

//Given a string, find the length of the longest substring T that contains at most k distinct characters.
//
//For example, Given s = “eceba” and k = 2,
//
//T is "ece" which its length is 3.

public class SolutionTest {

	@Test
	public void simple_example() {
		String s = "eceba";
		int k = 2;
		assertEquals(3,Solution.lengthOfLongestSubstringKDistinct(s,k));
	}
	
	@Test
	public void complex_example() {
		String s = "abaccdgcba";
		int k = 3;
		assertEquals(5,Solution.lengthOfLongestSubstringKDistinct(s,k));
	}
	
	@Test
	public void complex_example2() {
		String s = "abaccc";
		int k = 2;
		assertEquals(4,Solution.lengthOfLongestSubstringKDistinct(s,k));
	}
	
	@Test
	public void k_1() {
		String s = "abbacccdgcba";
		int k = 1;
		assertEquals(3,Solution.lengthOfLongestSubstringKDistinct(s,k));
	}
	
	@Test
	public void k_0() {
		String s = "abbacccdgcba";
		int k = 0;
		assertEquals(0,Solution.lengthOfLongestSubstringKDistinct(s,k));
	}
	
	@Test
	public void k_2_abundant() {
		String s = "aaaaaa";
		int k = 2;
		assertEquals(6,Solution.lengthOfLongestSubstringKDistinct(s,k));
	}
	
	@Test
	public void char_1() {
		String s = "a";
		int k = 1;
		assertEquals(1,Solution.lengthOfLongestSubstringKDistinct(s,k));
	}
	
	
	
	

}
