import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		int input = 5;
		int[] output = {0,1,1,2,1,2};
		assertEquals(output,Solution.countBits(input));
		
	}

}
