import static org.junit.Assert.*;

import org.junit.Test;

public class maxNumberTest {
	maxNumber max= new maxNumber();
	@Test
	public void testSplitToArray() {
	assertArrayEquals(max.splitToArray("2,4,5,5,65,23,13,12"),new int[]{2,4,5,5,65,23,13,12});
	assertArrayEquals(max.splitToArray("3,5,76,23,1,34,14,35,3"),new int[]{3,5,76,23,1,34,14,35,3});
	}

	@Test
	public void testMax() {
		assertEquals(max.max(new int[]{2,4,5,5,65,23,13,12}),65);
		assertEquals(max.max(new int[]{3,5,76,23,1,34,14,35,3}),76);
	}

}
