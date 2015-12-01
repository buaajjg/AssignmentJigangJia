package countA;
import org.junit.Test;
import static org.junit.Assert.*;


public class countATest {
	
	@Test
	public void test() {
			countA A= new countA();
			assertEquals(A.count("aabbccaa"),4);	
			assertEquals(A.count("sdaadas"),3);
				}
	
	}
