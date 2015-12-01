import java.util.HashSet;

public class SingleNumber {

	public static void main(String[] args) {
		SingleNumber sn= new SingleNumber();
			//int [] nums=new int[]{1,5,8,23,45,3,8,1,5,23,45};
			int [] nums=new int[]{3,3,2,2,1,5,8};
			  //int [] nums=new int[]{1,5,8,8,45,3,8,1,5,3,45};
			try
			{
				System.out.println(sn.singleNumber(nums));	
			}
			catch(Exception e)
			{
				//e.printStackTrace();
				System.out.println(e);
			}
	}
	
	public int singleNumber(int[] nums) throws Exception {
		if (nums==null||nums.length==0)
		{
			throw new Exception("The Input Array is null!!") ;
		}
		if (nums.length %2==0)
		{
			throw new Exception("The Input Array has even quatity!!!") ;
		}
		HashSet<Integer> hs= new HashSet<>();
		int length= nums.length;
		for (int i=0;i<length;i++)
		{
			if( hs.contains(nums[i]))
			{
				hs.remove(nums[i]);
			}
			else
			{
				hs.add(nums[i]);
			}
		}
		
		Object [] output=hs.toArray();
		if (output.length>1)
		{
			throw new Exception("The Input Array has not one single number!!") ;
		}
		return (Integer)output[0];
	}

}
