import static org.junit.Assert.*;

import org.junit.Test;

public class TwoSumTest {

	@Test
	public void testTwoSum() {
		TwoSum ts= new TwoSum();
		assertFalse(ts.twoSum(new int[]{1,2,3,4,5}, 10));
		assertTrue(ts.twoSum(new int[]{1,2,3,4,5,6}, 10));
		assertTrue(ts.twoSum(new int[]{0,2,3,4,5,-1}, 2));
		assertFalse(ts.twoSum(new int[]{0,1,2,3,4,5}, 0));
	}

}
