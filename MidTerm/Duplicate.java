import java.util.HashSet;
public class Duplicate {

	public static void main(String[] args) {
		Duplicate d= new Duplicate();
		int [] aa= new int[]{1,2,3,4,5,6,7,8,9,0,9};
		System.out.println(d.containsDuplicate(aa));
	}
	public boolean containsDuplicate(int [] nums) {
		
		HashSet<Integer> hs= new HashSet<>();
		int length= nums.length;
		for (int i=0;i<length;i++)
		{
			if( hs.contains(nums[i]))
			{
				return true;
			}
			else
			{
				hs.add(nums[i]);
			}
		}
		
		return false;
		
		
	}
	
}
