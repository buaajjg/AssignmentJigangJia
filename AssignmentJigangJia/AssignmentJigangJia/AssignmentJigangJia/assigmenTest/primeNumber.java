import java.util.*;
public class primeNumber 
{	
	
		public static void main(String[] args) 
		{
			while (true)
			{
			primeNumber prime= new primeNumber();
			int number =prime.input();
			
			boolean result=prime.isPrime(number);				
			if (result==true)
				{
					System.out.println(number+" is Prime");
				}
				if (result==false)
				{
					System.out.println(number+" is not Prime");
				}
			}
		}
	
		public int input()
		{
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
				int number = sc.nextInt();
				return number;
				
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
