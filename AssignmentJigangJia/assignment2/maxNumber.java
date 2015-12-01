import java.util.*;
public class  maxNumber
{
	public static void main(String[] args) 
	{
		
		System.out.println("Please Input series of number,seperated by','");
		Scanner sc= new Scanner(System.in);
		String st = sc.next();
		
		String [] input=st.split(",");
		int length=input.length;
		int [] number=new int[length];
		
		for (int i=0;i<length ;i++ )
		{	
			number[i]=Integer.parseInt(input[i]);
		}
		
		int maximum=new maxNumber().max(number);
		System.out.println("the maximum number in these numbers is: "+maximum);

		//int minimum=new maxNumber().min(number);
		//System.out.println("the minimum number in these numbers is: "+minimum);

		/*this is another way to get maximum and minimum
		Arrays.sort(number);
		System.out.println("the maximum number in these numbers is: "+number[length-1]);
		System.out.println("the minimum number in these numbers is: "+number[0]);
		*/
		
	}

	public int max(int [] number)
	{
	int length= number.length;
	int max=number[0];
		for (int i=0; i<length-1;i++ )
		{
			if (max<=number[i])
			{
				max=number[i];
			}
			else 
			{
				
			}

		}
	 return max;
	
	}
/*
	public int min(int [] number)
	{
	int length= number.length;
	int min=number[0];
		for (int i=0; i<(length-1);i++ )
		{	System.out.println(number[i]);
			if (min<=number[i])
			{
			}
			else 
			{	
				min=number[i];				
			}

		}
	 return min;
	
	}
*/
}
