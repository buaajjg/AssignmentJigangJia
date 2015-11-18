
public class FindZero extends BaseInput{

	public static void main(String[] args) {
		FindZero find0=new FindZero();
		String st=find0.StringInput();
		int [] numberArray=find0.splitToArray(st);
		find0.output(numberArray);

	}

	
	public int [] splitToArray(String st)
	{
		String [] split= st.split(",");
		int length=split.length;
		int [] numberArray=new int[length];
		for (int i=0; i<length;i++)
		{
			numberArray[i]=Integer.parseInt(split[i] );
			
		}
		return numberArray;
			
	}
	public void output(int[] numberArray)
	{
		int length=numberArray.length;
		int count=0;
		for (int k=0;k<length;k++)
		{
			if (numberArray[k]==0)
			{
				count++;
			}
			else if(numberArray[k]==1)
			{	if (count>1)
				{
					for(int i=0;i<count;i++)
					{
						System.out.print("0");					
					}
				
					System.out.println(" occurs @ index "+(k-count));
					count=0;
				}
				else
				{
					count=0;
				}
			}
		}
		
	}
	
}
