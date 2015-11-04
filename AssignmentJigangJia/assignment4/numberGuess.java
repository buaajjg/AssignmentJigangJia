import java.util.Random;
import java.util.Scanner;

public class numberGuess {

	public static void main(String[] args) 
	throws Exception
	{
		numberGuess ng= new numberGuess();
		System.out.println("Please guess a number between 1 and 100");
		Random rand= new Random();
		int number=rand.nextInt(100);
		boolean flag=false;
		for (int i=0;i<=5;i++)
		{	if (flag==false)
			{
				flag=ng.guess(i,number);
			}
			if (i==4&&flag==false)
			{
				System.out.println("Game Over,You Loss");
				break;
			}
			if (flag==true)
			{
				break;
			}
			
		}

	}
	@SuppressWarnings("resource")
	public boolean guess(int round,int rand)
			throws Exception
	{	System.out.println("You have "+(5-round) +" chances to guess");
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		
		if (number==rand)
		{
			System.out.println("Congratulations! You've guessed it right and you guessed it in "+(round+1)+" chances.");
			sc.close();
			return true;
					
		}
		else if (number>rand)
		{
			System.out.println(number+" is greater than what I've guessed - ");
			return false;
		}
		else if (number<rand)
		{
			System.out.println(number+" is less than what I've guessed - ");
			return false;
		}
		else {
			return false;
			}
		}
	
}
