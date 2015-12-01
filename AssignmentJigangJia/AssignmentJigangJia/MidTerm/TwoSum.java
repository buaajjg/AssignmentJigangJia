import java.util.HashSet;

public class TwoSum {
	public static void main (String [] args){
		TwoSum ts= new TwoSum();
		int []nums= new int[]{};
		int target=10;
		System.out.println(ts.twoSum(nums, target));
	}
	public boolean twoSum(int[] nums,int target){
		HashSet<Integer> hs= new HashSet<>();
		for(int i=0;i<nums.length;i++){
			if (hs.contains(target-nums[i])){
				return true;
			}
			else{
				hs.add(nums[i]);
			}
		}
		
		return false;
	}
}
