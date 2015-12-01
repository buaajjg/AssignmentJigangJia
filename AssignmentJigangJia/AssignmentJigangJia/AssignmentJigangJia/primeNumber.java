import java.util.*;
public class primeNumber 
{	
	
		public static void main(String[] args) 
		{
			while (true)
			{
			
			Scanner sc= new Scanner(System.in);
			int number= sc.nextInt();
			
			
			boolean aa=new primeNumber().isPrime(number);
				if (aa==true)
				{
					System.out.println(number+" is Prime");
				}
				if (aa==false)
				{
					System.out.println(number+" is not Prime");
				}
			}
		}
	
		
	 boolean isPrime(int p)
		{
				if (p<=1)
			{
				return false;
			}
			else if (p==2)
			{
				return true;
			}
			else if (p>=3)
			{	int temp=1;
				for (int i=2;i<p ;i++ )
				{
					
					temp=temp*(p%i);
				}

				if (temp==0)
				{
					return false;
				}
				else
				{
				return true;
				}
			}
		else
			return false;
		}
	
}
