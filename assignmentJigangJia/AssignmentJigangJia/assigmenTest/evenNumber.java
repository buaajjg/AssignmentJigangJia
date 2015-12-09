import java.util.*;
public class evenNumber 
{
	public static void main(String[] args) 
	{
		evenNumber even= new evenNumber();
		int number=even.input();
		int [] a=even.output(number);
		for(int aa: a)
		{
			System.out.println(aa);
		}
	}
	
	public int input()
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		return number;
	}
	
	public int[] output(int number)
	{
		int k=number/2;
		int [] a=new int[k];
		for (int i=1;i<=k ;i++ )
		{
		
			a[i-1]=2*i;
		}
		return a;
	}
}
