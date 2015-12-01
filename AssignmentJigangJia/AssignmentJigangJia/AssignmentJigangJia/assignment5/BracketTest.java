import static org.junit.Assert.*;

import org.junit.Test;

public class BracketTest {

	@Test
	public void testValid() {
		Bracket bb= new Bracket();
		try{
		assertFalse(bb.valid(""));
		assertFalse(bb.valid("}()"));
		assertTrue(bb.valid("(({})[{}]()){}"));
		assertTrue(bb.valid("(){}"));

		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		try
		{
			bb.valid("{}(),{}]");
			fail("should get exception!");
		}
		catch(Exception e)
		{
			assertTrue(e.getMessage().equals("String '{}(),{}]' has other element except the bracket!"));
		}
	}

}
