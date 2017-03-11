import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ZigzagIteratorTest {

	@Test
	public void test() {
		List<Integer> v1= Arrays.asList(1,2);
		List<Integer> v2 = Arrays.asList(3,4,5,6);
		
		ZigzagIterator i = new ZigzagIterator(v1, v2);
		while (i.hasNext()){
			System.out.println(i.next());
		}
	}

}
