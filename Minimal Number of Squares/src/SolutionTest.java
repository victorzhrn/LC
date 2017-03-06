import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		assertEquals(9,Solution.cutHelper(13,29));
		assertEquals(5,Solution.cutHelper(4,5));
	}

}
