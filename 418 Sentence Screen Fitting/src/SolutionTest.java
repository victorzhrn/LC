import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test1() {
		int rows = 2, cols = 8;
		String[] sentence = {"hall","world"};
		assertEquals(1, Solution.wordsTyping(sentence,rows,cols));
	}
	
	@Test
	public void test2(){
		int rows = 3;
		int cols = 6;
		String[] sentence = {"a", "bcd", "e"};
		assertEquals(2, Solution.wordsTyping(sentence,rows,cols));
	}
	
	@Test
	public void test3(){
		int rows = 4; 
		int cols = 5; 
		String[] sentence = {"I", "had", "apple", "pie"};
		assertEquals(1,Solution.wordsTyping(sentence,rows,cols));

	}
	
	@Test
	public void test4(){
		int rows = 4; 
		int cols = 5; 
		String[] sentence = {"IIIIIIIII", "had", "apple", "pie"};
		assertEquals(0,Solution.wordsTyping(sentence,rows,cols));
	}
	
//	@Test
//	public void test5(){
//		int rows = 1000;
//		int cols = 900;
//		String[] sentence = {"try","to","be","better"};
//		assertEquals(0,Solution.wordsTyping(sentence,rows,cols));	
//	}

}
