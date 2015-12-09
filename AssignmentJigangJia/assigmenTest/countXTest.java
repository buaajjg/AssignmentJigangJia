import static org.junit.Assert.*;

import org.junit.Test;

public class countXTest {

	@Test
	public void test() {
		countX X= new countX();
		assertEquals(X.count("ysajkdysdyaysd,y"),4);
		assertEquals(X.count("ysajkdysdyaysd,a"),2);
	}

}
