package checkBlackSurrounded;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		char[][] board = {{'e','w','w','e'},
				{'w','b','b','w'},
				{'e','w','w','e'}};
		
		assertTrue(Solution.checkBlack(board));
  	}
	

	@Test
	public void test2() {
		char[][] board = {{'e','w','w','b'},
				{'w','b','e','w'},
				{'e','w','w','e'}};
		
		assertTrue(Solution.checkBlack(board));
  	}
	
	@Test
	public void test3() {
		char[][] board = {{'e','w','w','e'},
				{'w','b','e','w'},
				{'e','w','w','e'}};
		
		assertFalse(Solution.checkBlack(board));
  	}
	
	@Test
	public void test4() {
		char[][] board = {{'b','b','w','e'},
				{'w','b','e','w'},
				{'e','w','b','e'}};
		
		assertFalse(Solution.checkBlack(board));
  	}

}
