import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

	@Test
	public void testIsAnagram() {
	Anagram ana= new Anagram();
	assertTrue(ana.isAnagram("car", "arc"));
	assertFalse(ana.isAnagram("car", "carc"));
	assertTrue(ana.isAnagram("abcdefghijklmn", "nmhlkjibcadefg"));
	assertFalse(ana.isAnagram("monk", "konn"));
	}

}
