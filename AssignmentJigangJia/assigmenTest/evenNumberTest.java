import static org.junit.Assert.*;

import org.junit.Test;

public class evenNumberTest {

	@Test
	public void testOutput() {
		evenNumber even= new evenNumber();
		assertArrayEquals(even.output(12),new int[]{2,4,6,8,10,12});
		assertArrayEquals(even.output(19),new int[]{2,4,6,8,10,12,14,16,18});
	}

}
