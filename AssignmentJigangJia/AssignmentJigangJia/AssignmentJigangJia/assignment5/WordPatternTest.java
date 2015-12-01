import static org.junit.Assert.*;

import org.junit.Test;

public class WordPatternTest {

	@Test
	public void testWordPattern() {
		WordPattern wp= new WordPattern();
		String[] pattern= new String[]{"abba","abba","aaaa","aaaa","ab","abcd"}; 
		String []str = new String[]{
			"dog cat cat dog","dog cat cat fish","dog cat cat dog","dog dog dog",
			"fish dog","dog cat pig bird"};
		
			assertTrue(wp.wordPattern(pattern[0],str[0]));
			assertFalse(wp.wordPattern(pattern[1],str[1]));
			assertFalse(wp.wordPattern(pattern[2],str[2]));
			assertFalse(wp.wordPattern(pattern[3],str[3]));
			assertTrue(wp.wordPattern(pattern[4],str[4]));
			assertTrue(wp.wordPattern(pattern[5],str[5]));
		
	}

}
