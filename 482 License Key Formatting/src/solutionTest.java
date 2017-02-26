import static org.junit.Assert.*;

import org.junit.Test;

public class solutionTest {

	@Test
	public void example1() {
		String s = "2-4A0r7-4k";
		int k = 4;
		assertEquals("24A0-R74K",solution.licenseKeyFormatting(s,k));
	}
	
	@Test
	public void example2() {
		String s = "2-4A0r7-4k";
		int k = 3;
		assertEquals("24-A0R-74K",solution.licenseKeyFormatting(s,k));
	}
	
	@Test
	public void a_dashes() {
		String s = "a-a-a-a-";
		int k = 1;
		assertEquals("A-A-A-A",solution.licenseKeyFormatting(s,k));
	}
	
	@Test
	public void a_dashes2() {
		String s = "a-a-a-a";
		int k = 1;
		assertEquals("A-A-A-A",solution.licenseKeyFormatting(s,k));
	}
	
	@Test
	public void all_dashes() {
		String s = "----";
		int k = 1;
		assertEquals("",solution.licenseKeyFormatting(s,k));
	}

}
