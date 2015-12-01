import static org.junit.Assert.*;

import org.junit.Test;

public class DuplicateTest {

	@Test
	public void testContainsDuplicate() {
		Duplicate dup=new Duplicate();
		assertTrue(dup.containsDuplicate(new int[]{1,2,3,4,5,6,7,8,3}));
		assertFalse(dup.containsDuplicate(new int[]{1,2,3,4,5,6,7,8,9,0}));
		assertTrue(dup.containsDuplicate(new int[]{1,2,3,4,5,6,7,8,9,0,0}));
		assertFalse(dup.containsDuplicate(new int[]{0}));
	}

}
