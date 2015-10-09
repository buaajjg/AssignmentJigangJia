import static org.junit.Assert.*;

import org.junit.Test;

public class findLongWordTest {
	findLongWord flw= new findLongWord();
	@Test
			public void testSplit() {
			String  st="Java is a cool OOP. It doesnt have multiple inheritance";
			String [] stringArray={"Java","is","a","coll","OPP.","It","doednt","have","multiple","inheritance"};
			assertArrayEquals(flw.split(st),stringArray);
		
	}

	@Test
	public void testFilter() {
		String [] stringArray={"Java","is","a","coll","OPP","It","doesnt","have","multiple","inheritance"};
		String[] filtered={"Java","coll","doesnt","have","multiple","inheritance"};
		assertArrayEquals(flw.filter(stringArray),filtered);
	}

}
