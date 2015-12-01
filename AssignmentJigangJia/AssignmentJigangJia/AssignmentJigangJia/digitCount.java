import java.util.*;
public class digitCount 
{
	public static void main(String[] args) 
	{
		while (true)
		{
		
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		int temp=0;
			while (number!=0)
			{
			
				number=number/10;
				temp++;
			}
		
		
		System.out.println("the number you input have "+temp+ " digit!");
		}
	}
}
