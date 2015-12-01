
public class Zeroes {

	public static void main(String[] args) {
		Zeroes z= new Zeroes();
		int [] a= new int[]{1,2,0,3,0,0,4,0,0,0,5,6,0,7,0};
		z.moveZeroes(a);
		for(int aa:a)
		{
			System.out.print(aa+"  ");
		}
	}
	
	public int[]  moveZeroes(int [] nums){
		    int count = 0;
	        for(int i = 0; i < nums.length; i++){
	            if(nums[i] != 0){
	                nums[count]= nums[i];
	                count++;
	            }
	        }
	       
	        for(;count<nums.length; count++){
	            nums[count] = 0;
	        }
	        return nums;
		 
	}
}

