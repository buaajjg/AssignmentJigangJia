import static org.junit.Assert.*;

import org.junit.Test;

public class capitalizeInitialTest {
	capitalizeInitial ci= new capitalizeInitial();
	@Test
	public void testSplit() {
		String  st="we love seattle and will live here for a long time.";
		String [] stringArray={"we","love","seattle","and","will","live","here","for","a","long","time."};
		assertArrayEquals(ci.split(st),stringArray);
	}
	@Test
	public void testInitial() {
		String [] stringArray={"we","love","seattle","and","will","live","here","for","a","long","time."};
		String [] capitalized={"We","Love","Seattle","And","Will","Live","Here","For","A","Long","Time."};
		assertArrayEquals(ci.initial(stringArray),capitalized);
	}


}
