import java.util.*;
public class findZero {

	public static void main(String[] args) {
		findZero find0=new findZero();
		String st=find0.input();
		int [] numberArray=find0.splitToArray(st);
		find0.output(numberArray);

	}
	public String input()
	{
		Scanner sc= new Scanner(System.in);
		String st=sc.nextLine();
		sc.close();
		return st;
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
