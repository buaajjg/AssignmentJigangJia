import static org.junit.Assert.*;

import org.junit.Test;

public class primeNumberTest {

	@Test
	public void testIsPrime() {
		primeNumber prime= new primeNumber();
		assertTrue(prime.isPrime(13));
		assertFalse(prime.isPrime(25));
	}

}
