import static org.junit.Assert.*;

import org.junit.Test;

public class ZeroesTest {

	@Test
	public void testMoveZeroes() {

		Zeroes z= new Zeroes();
		int [] before=new int[]{1,0,2,0,0,3,0,0,0,4,5,0,6,0,0,7,8,9,0};
		int [] after=new int[]{1,2,3,4,5,6,7,8,9,0,0,0,0,0,0,0,0,0,0};
		assertArrayEquals(z.moveZeroes(before),after);
		assertArrayEquals(z.moveZeroes(new int[]{0,0,1,3,0}),new int[]{1,3,0,0,0});
		assertArrayEquals(z.moveZeroes(new int[]{0,0}),new int[]{0,0});
		assertArrayEquals(z.moveZeroes(new int[]{1,8,1,3,0}),new int[]{1,8,1,3,0});
		}

			

	}
