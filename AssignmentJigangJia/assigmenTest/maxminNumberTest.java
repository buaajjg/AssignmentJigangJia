import static org.junit.Assert.*;

import org.junit.Test;

public class maxminNumberTest {
	maxminNumber maxmin= new maxminNumber();
	@Test
	public void testSplitToArray() {
		assertArrayEquals(maxmin.splitToArray("2,4,5,5,65,23,13,12"),new int[]{2,4,5,5,65,23,13,12});
		assertArrayEquals(maxmin.splitToArray("3,5,76,23,1,34,14,35,3"),new int[]{3,5,76,23,1,34,14,35,3});
	}

	@Test
	public void testMin() {
		assertEquals(maxmin.min(new int[]{2,4,5,5,65,23,13,12}),2);
		assertEquals(maxmin.min(new int[]{3,5,76,23,1,34,14,35,3}),1);
	}

	@Test
	public void testMax() {
		assertEquals(maxmin.max(new int[]{2,4,5,5,65,23,13,12}),65);
		assertEquals(maxmin.max(new int[]{3,5,76,23,1,34,14,35,3}),76);
	}

}
