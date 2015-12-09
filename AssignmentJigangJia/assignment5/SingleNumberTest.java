import static org.junit.Assert.*;

import org.junit.Test;


public class SingleNumberTest {
	SingleNumber sn= new SingleNumber();
	int [] nums1=new int[]{1,5,8,8,45,3,8,1,5,3,45};
	int [] nums2=new int[]{1,-1,8,8,45,3,8,-1,3,8,45};
	int [] nums3=new int[]{3,3,3,3,3,3,3,3,3,3,3,3,3};
	int [] nums4=new int[]{6,6,-8,-8,45,3,5,-1,5,3,45};
	int [] nums5=new int[]{};
	int [] nums6=new int[]{2,4,2,4,6,8,8,6};
	int [] nums7=new int[]{2,4,2,5,6,8,8,6,9};
	
	@Test
	public void testSingleNumber()  {
		try{
			assertEquals(sn.singleNumber(nums1),8);
			assertEquals(sn.singleNumber(nums2),1);
			assertEquals(sn.singleNumber(nums3),3);
			assertEquals(sn.singleNumber(nums4),-1);
			}
		
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		
			try
			{
				sn.singleNumber(nums5);
				fail("should get exception!");
			}
			catch(Exception e)
			{
				assertTrue(e.getMessage().equals("The Input Array is null!!"));
			}
			
			try
			{
				sn.singleNumber(nums6);
				fail("should get exception!");
			}
			catch(Exception e)
			{
				assertTrue(e.getMessage().equals("The Input Array has even quatity!!!"));
			}
			
			try
			{
				sn.singleNumber(nums7);
				fail("should get exception!");
			}
			catch(Exception e)
			{
				assertTrue(e.getMessage().equals("The Input Array has not only one single number!!"));
			}
	}

}
