import static org.junit.Assert.*;

import org.junit.Test;

public class digitCountTest {

	@Test
	public void testCount() {
		digitCount count=new digitCount();
		assertEquals(count.count(12345),5);
		assertEquals(count.count(7654321),7);
	}

}
