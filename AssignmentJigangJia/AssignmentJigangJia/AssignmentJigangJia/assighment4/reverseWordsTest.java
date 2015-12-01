import static org.junit.Assert.*;

import org.junit.Test;

public class reverseWordsTest {
	reverseWords rw= new reverseWords();
	
	@Test
	public void testSplit() {
		String  st="Hello I miss you very much";
		String [] stringArray={"Hello","I","miss","you","very","much"};
		assertArrayEquals(rw.split(st),stringArray);
	}

	@Test
	public void testReverse() {
		String [] stringArray={"Hello","I","miss","you","very","much"};
		String[] reversed={"much","very","you","miss","I","Hello"};
		assertArrayEquals(rw.reverse(stringArray),reversed);
	}

}
