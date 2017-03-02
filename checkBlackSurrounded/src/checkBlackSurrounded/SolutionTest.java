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

}
