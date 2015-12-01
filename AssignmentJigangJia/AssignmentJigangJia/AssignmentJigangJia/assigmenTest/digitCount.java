import java.util.*;
public class digitCount 
{
	public static void main(String[] args) 
	{
		while (true)
		{
		digitCount count= new digitCount();
		int number =count.input();
		count.count(number);	
		
		}
	}
	
	public int input()
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	public int count(int number)
	{

		int temp=0;
			while (number!=0)
			{
			
				number=number/10;
				temp++;
			}
		System.out.println("the number you input have "+temp+ " digit!");
		return temp;		
	}
	
}
