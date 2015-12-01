import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testPrintFizzBuzz() {
		FizzBuzz fb= new FizzBuzz();
		assertEquals(fb.printFizzBuzz(15),"fizz buzz");
		assertEquals(fb.printFizzBuzz(25),"buzz");
		assertEquals(fb.printFizzBuzz(33),"fizz");
		assertEquals(fb.printFizzBuzz(13),null);
	}

}
